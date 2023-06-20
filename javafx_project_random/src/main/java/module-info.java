module com.example.javafx_project_random {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.javafx_project_random to javafx.fxml;
    exports com.example.javafx_project_random;
}