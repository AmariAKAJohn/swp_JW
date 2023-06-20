package com.example.javafx_project_random;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ProjectApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ProjectApplication.class.getResource("project.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        stage.setTitle("Random Sentence!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}