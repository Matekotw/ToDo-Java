module com.tutorialseu.todoapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires MaterialFX;

    opens com.todoapp to javafx.fxml;
    opens com.todoapp.controller to javafx.fxml;
    exports com.todoapp;
}