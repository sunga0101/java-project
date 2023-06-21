module com.likelion.javaproject2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.likelion.javaproject2 to javafx.fxml;
    exports com.likelion.javaproject2;
    exports com.likelion.javaproject2.week1.previous;
    opens com.likelion.javaproject2.week1.previous to javafx.fxml;
    exports com.likelion.javaproject2.week1.day5;
    opens com.likelion.javaproject2.week1.day5 to javafx.fxml;
}