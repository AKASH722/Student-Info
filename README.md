# Student-Info

CREATE TABLE Students (
                          studentID char(9) NOT NULL,
                          firstName varchar (20) NOT NULL,
                          lastName varchar (20) NOT NULL,
                          address varchar (30) NOT NULL,
                          city varchar(30) NOT NULL,
                          province char(2) NOT NULL,
                          postalCode char(6) NOT NULL,
                          PRIMARY KEY (studentID)
);

INSERT INTO Students (studentID, firstName, lastName, address, city, province, postalCode)
VALUES
    ('300111222', 'Sam', 'Malone', '10 Somewhere Road', 'Toronto', 'ON', 'M1Y2H2'),
    ('400111333', 'John', 'Doe', '15 Anywhere Street', 'Vancouver', 'BC', 'V6B3R2'),
    ('500111444', 'Jane', 'Smith', '20 Nowhere Avenue', 'Calgary', 'AB', 'T2P4T1'),
    ('600111555', 'Michael', 'Johnson', '25 Everywhere Lane', 'Montreal', 'QC', 'H3B2Y5'),
    ('700111666', 'Emily', 'Williams', '30 Hereandthere Close', 'Ottawa', 'ON', 'K1P5T7'),
    ('800111777', 'David', 'Lee', '35 Anyplace Drive', 'Edmonton', 'AB', 'T5J1K1'),
    ('900111888', 'Sarah', 'Brown', '40 Noway Street', 'Halifax', 'NS', 'B3K5X5'),
    ('100111999', 'Alex', 'Martinez', '45 Anytown Road', 'Winnipeg', 'MB', 'R3B0T5'),
    ('110011000', 'Olivia', 'Garcia', '50 Nowhere Avenue', 'Victoria', 'BC', 'V8W1P6'),
    ('120011111', 'Daniel', 'Anderson', '55 Anyplace Close', 'Quebec City', 'QC', 'G1R4R7'),
    ('130011222', 'Alice', 'Johnson', '60 Hereandthere Close', 'Toronto', 'ON', 'M1Y2H2'),
    ('140011333', 'Robert', 'Smith', '65 Anywhere Street', 'Toronto', 'ON', 'M1Y2H2'),
    ('150011444', 'Sophia', 'Lee', '70 Nowhere Avenue', 'Toronto', 'ON', 'M1Y2H2'),
    ('160011555', 'William', 'Williams', '75 Everywhere Lane', 'Toronto', 'ON', 'M1Y2H2'),
    ('170011666', 'Ava', 'Davis', '80 Somewhere Road', 'Toronto', 'ON', 'M1Y2H2'),
    ('180011777', 'James', 'Brown', '85 Anywhere Street', 'Vancouver', 'BC', 'V6B3R2'),
    ('190011888', 'Emma', 'Martinez', '90 Nowhere Avenue', 'Vancouver', 'BC', 'V6B3R2'),
    ('200011999', 'Ethan', 'Garcia', '95 Everywhere Lane', 'Vancouver', 'BC', 'V6B3R2'),
    ('210022000', 'Mia', 'Anderson', '100 Somewhere Road', 'Vancouver', 'BC', 'V6B3R2'),
    ('220022111', 'Logan', 'Johnson', '105 Anywhere Street', 'Vancouver', 'BC', 'V6B3R2'),
    ('230033222', 'Grace', 'Garcia', '110 Hereandthere Close', 'Toronto', 'ON', 'M1Y2H2'),
    ('240044333', 'Lucas', 'Davis', '115 Anywhere Street', 'Toronto', 'ON', 'M1Y2H2'),
    ('250055444', 'Chloe', 'Anderson', '120 Nowhere Avenue', 'Vancouver', 'BC', 'V6B3R2'),
    ('260066555', 'Jackson', 'Johnson', '125 Everywhere Lane', 'Vancouver', 'BC', 'V6B3R2'),
    ('270077666', 'Liam', 'Smith', '130 Somewhere Road', 'Calgary', 'AB', 'T2P4T1'),
    ('280088777', 'Lily', 'Lee', '135 Anywhere Street', 'Calgary', 'AB', 'T2P4T1'),
    ('290099888', 'Benjamin', 'Williams', '140 Nowhere Avenue', 'Montreal', 'QC', 'H3B2Y5'),
    ('300001999', 'Ella', 'Brown', '145 Everywhere Lane', 'Montreal', 'QC', 'H3B2Y5'),
    ('310011000', 'Alexander', 'Martinez', '150 Hereandthere Close', 'Ottawa', 'ON', 'K1P5T7'),
    ('320022111', 'Nora', 'Davis', '155 Anywhere Street', 'Ottawa', 'ON', 'K1P5T7'),
    ('330033222', 'Carter', 'Johnson', '160 Nowhere Avenue', 'Edmonton', 'AB', 'T5J1K1'),
    ('340044333', 'Sofia', 'Anderson', '165 Everywhere Lane', 'Edmonton', 'AB', 'T5J1K1'),
    ('350055444', 'Henry', 'Smith', '170 Somewhere Road', 'Halifax', 'NS', 'B3K5X5'),
    ('360066555', 'Avery', 'Lee', '175 Anywhere Street', 'Halifax', 'NS', 'B3K5X5'),
    ('370077666', 'Owen', 'Williams', '180 Nowhere Avenue', 'Winnipeg', 'MB', 'R3B0T5'),
    ('380088777', 'Ellie', 'Brown', '185 Everywhere Lane', 'Winnipeg', 'MB', 'R3B0T5'),
    ('390099888', 'Caleb', 'Martinez', '190 Hereandthere Close', 'Victoria', 'BC', 'V8W1P6'),
    ('400001999', 'Aria', 'Davis', '195 Anywhere Street', 'Victoria', 'BC', 'V8W1P6'),
    ('410011000', 'Wyatt', 'Johnson', '200 Nowhere Avenue', 'Quebec City', 'QC', 'G1R4R7'),
    ('420022111', 'Scarlett', 'Anderson', '205 Everywhere Lane', 'Quebec City', 'QC', 'G1R4R7'),
    ('430011000', 'Scarlett', 'Anderson', '205 Everywhere Lane', 'Vancouver', 'BC', 'V6B3R2'),
    ('440011000', 'Grace', 'Garcia', '210 Hereandthere Close', 'Vancouver', 'BC', 'V6B3R2'),
    ('450011000', 'Lucas', 'Davis', '215 Anywhere Street', 'Vancouver', 'BC', 'V6B3R2'),
    ('460011222', 'Oliver', 'Smith', '220 Hereandthere Close', 'Calgary', 'AB', 'T2P4T1'),
    ('470011333', 'Amelia', 'Lee', '225 Anywhere Street', 'Calgary', 'AB', 'T2P4T1'),
    ('480011444', 'Elijah', 'Williams', '230 Nowhere Avenue', 'Calgary', 'AB', 'T2P4T1'),
    ('490011555', 'Mia', 'Brown', '235 Everywhere Lane', 'Calgary', 'AB', 'T2P4T1'),
    ('500011666', 'Harper', 'Martinez', '240 Somewhere Road', 'Calgary', 'AB', 'T2P4T1'),
    ('510011777', 'Evelyn', 'Johnson', '245 Anywhere Street', 'Calgary', 'AB', 'T2P4T1'),
    ('520011888', 'Alexander', 'Davis', '250 Nowhere Avenue', 'Calgary', 'AB', 'T2P4T1'),
    ('530011999', 'Sofia', 'Garcia', '255 Everywhere Lane', 'Calgary', 'AB', 'T2P4T1'),
    ('540011000', 'Logan', 'Smith', '260 Hereandthere Close', 'Calgary', 'AB', 'T2P4T1'),
    ('550011000', 'Isabella', 'Lee', '265 Anywhere Street', 'Calgary', 'AB', 'T2P4T1'),
    ('560022111', 'Mateo', 'Williams', '270 Hereandthere Close', 'Montreal', 'QC', 'H3B2Y5'),
    ('570022222', 'Luna', 'Brown', '275 Anywhere Street', 'Montreal', 'QC', 'H3B2Y5'),
    ('580022333', 'Jack', 'Martinez', '280 Nowhere Avenue', 'Montreal', 'QC', 'H3B2Y5'),
    ('590022444', 'Abigail', 'Johnson', '285 Everywhere Lane', 'Montreal', 'QC', 'H3B2Y5'),
    ('600022555', 'Ethan', 'Davis', '290 Somewhere Road', 'Montreal', 'QC', 'H3B2Y5'),
    ('610022666', 'Mila', 'Garcia', '295 Anywhere Street', 'Montreal', 'QC', 'H3B2Y5'),
    ('620022777', 'Leo', 'Smith', '300 Nowhere Avenue', 'Montreal', 'QC', 'H3B2Y5'),
    ('630022888', 'Emily', 'Lee', '305 Everywhere Lane', 'Montreal', 'QC', 'H3B2Y5'),
    ('640022999', 'Liam', 'Williams', '310 Hereandthere Close', 'Montreal', 'QC', 'H3B2Y5'),
    ('650033000', 'Avery', 'Brown', '315 Anywhere Street', 'Montreal', 'QC', 'H3B2Y5'),
    ('660033222', 'Emma', 'Martinez', '320 Hereandthere Close', 'Ottawa', 'ON', 'K1P5T7'),
    ('670033333', 'Noah', 'Johnson', '325 Anywhere Street', 'Ottawa', 'ON', 'K1P5T7'),
    ('680033444', 'Aria', 'Davis', '330 Nowhere Avenue', 'Ottawa', 'ON', 'K1P5T7'),
    ('690033555', 'Liam', 'Garcia', '335 Everywhere Lane', 'Ottawa', 'ON', 'K1P5T7'),
    ('700033666', 'Ella', 'Smith', '340 Somewhere Road', 'Ottawa', 'ON', 'K1P5T7'),
    ('710033777', 'Mason', 'Lee', '345 Anywhere Street', 'Ottawa', 'ON', 'K1P5T7'),
    ('720033888', 'Sophia', 'Williams', '350 Nowhere Avenue', 'Ottawa', 'ON', 'K1P5T7'),
    ('730033999', 'Liam', 'Brown', '355 Everywhere Lane', 'Ottawa', 'ON', 'K1P5T7'),
    ('740044000', 'Ava', 'Martinez', '360 Hereandthere Close', 'Ottawa', 'ON', 'K1P5T7'),
    ('750044111', 'Lucas', 'Johnson', '365 Anywhere Street', 'Ottawa', 'ON', 'K1P5T7'),
    ('760044222', 'Liam', 'Williams', '370 Hereandthere Close', 'Edmonton', 'AB', 'T5J1K1'),
    ('770044333', 'Olivia', 'Brown', '375 Anywhere Street', 'Edmonton', 'AB', 'T5J1K1'),
    ('780044444', 'Noah', 'Martinez', '380 Nowhere Avenue', 'Edmonton', 'AB', 'T5J1K1'),
    ('790044555', 'Ava', 'Johnson', '385 Everywhere Lane', 'Edmonton', 'AB', 'T5J1K1'),
    ('800044666', 'Lucas', 'Davis', '390 Somewhere Road', 'Edmonton', 'AB', 'T5J1K1'),
    ('810055777', 'Emma', 'Lee', '395 Hereandthere Close', 'Halifax', 'NS', 'B3K5X5'),
    ('820055888', 'Liam', 'Williams', '400 Anywhere Street', 'Halifax', 'NS', 'B3K5X5'),
    ('830055999', 'Olivia', 'Brown', '405 Nowhere Avenue', 'Halifax', 'NS', 'B3K5X5'),
    ('840066000', 'Noah', 'Martinez', '410 Everywhere Lane', 'Halifax', 'NS', 'B3K5X5'),
    ('850066111', 'Ava', 'Johnson', '415 Somewhere Road', 'Halifax', 'NS', 'B3K5X5'),
    ('860077222', 'Lucas', 'Davis', '420 Hereandthere Close', 'Winnipeg', 'MB', 'R3B0T5'),
    ('870077333', 'Emma', 'Lee', '425 Anywhere Street', 'Winnipeg', 'MB', 'R3B0T5'),
    ('880077444', 'Noah', 'Williams', '430 Nowhere Avenue', 'Winnipeg', 'MB', 'R3B0T5'),
    ('890077555', 'Olivia', 'Brown', '435 Everywhere Lane', 'Winnipeg', 'MB', 'R3B0T5'),
    ('900077666', 'Ava', 'Martinez', '440 Somewhere Road', 'Winnipeg', 'MB', 'R3B0T5'),
    ('910088777', 'Liam', 'Johnson', '445 Hereandthere Close', 'Victoria', 'BC', 'V8W1P6'),
    ('920088888', 'Olivia', 'Davis', '450 Anywhere Street', 'Victoria', 'BC', 'V8W1P6'),
    ('930088999', 'Noah', 'Lee', '455 Nowhere Avenue', 'Victoria', 'BC', 'V8W1P6'),
    ('940099000', 'Ava', 'Williams', '460 Everywhere Lane', 'Victoria', 'BC', 'V8W1P6'),
    ('950099111', 'Emma', 'Brown', '465 Somewhere Road', 'Victoria', 'BC', 'V8W1P6'),
    ('960110222', 'Lucas', 'Martinez', '470 Hereandthere Close', 'Quebec City', 'QC', 'G1R4R7'),
    ('970110333', 'Emma', 'Johnson', '475 Anywhere Street', 'Quebec City', 'QC', 'G1R4R7'),
    ('980110444', 'Noah', 'Davis', '480 Nowhere Avenue', 'Quebec City', 'QC', 'G1R4R7'),
    ('990110555', 'Olivia', 'Lee', '485 Everywhere Lane', 'Quebec City', 'QC', 'G1R4R7'),
    ('100011066', 'Ava', 'Williams', '490 Somewhere Road', 'Quebec City', 'QC', 'G1R4R7');

SELECT city, COUNT(*) as student_count
FROM Students
GROUP BY city;