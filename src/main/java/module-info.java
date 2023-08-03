module src.searchbox {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens src to javafx.fxml;
    exports src;
}