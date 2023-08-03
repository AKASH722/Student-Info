package src;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.sql.*;

import static javafx.scene.text.Font.font;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Info");

        Label label = new Label("Select students by city:");
        TextField textField = new TextField();
        textField.setPromptText("Enter city name");
        Button button = new Button("Display");
        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setFont(font("monospaced"));
        button.setOnAction(event -> {
            String city = textField.getText();
            ObservableList<Student> students = getStudents(city);
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%-13s %-12s %-12s %-30s %-15s %-10s %s\n",
                "Student ID", "First Name", "Last Name", "Address", "City", "Province", "Postal Code"));
            for (Student student : students) {
                sb.append(String.format("%-13s %-12s %-12s %-30s %-15s %-10s %s\n",
                    student.studentID(), student.firstName(), student.lastName(),
                    student.address(), student.city(), student.province(), student.postalCode()));
            }
            textArea.setText(sb.toString());

        });

        ScrollPane scrollPane = new ScrollPane(textArea);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(label, 0, 0);
        gridPane.add(textField, 2, 0);
        gridPane.add(button, 3, 0);
        gridPane.add(scrollPane, 0, 1, 4, 1);

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    ObservableList<Student> getStudents(String city) {
        ObservableList<Student> students = FXCollections.observableArrayList();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info", "root", "root");
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Students WHERE city = ?");
            stmt.setString(1, city);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String studentID = rs.getString("studentID");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String address = rs.getString("address");
                String province = rs.getString("province");
                String postalCode = rs.getString("postalCode");
                Student student = new Student(studentID, firstName, lastName, address, city, province, postalCode);
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
