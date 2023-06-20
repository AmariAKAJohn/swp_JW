package com.example.javafx_project_random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class ProjectController {

    @FXML
    private TextField first;

    @FXML
    private TextField second;
    @FXML
    Random rand = new Random();
    @FXML
    private Button gen;


    public void initialize() {
        gen.setOnAction(this::generate);
    }

    public void generate(ActionEvent actionEvent) {
        System.out.println("PRESSED!");
        BufferedReader reader1;
        BufferedReader reader2;
        try {
            reader1 = new BufferedReader(new FileReader("C:\\Users\\johnw\\Documents\\input1.txt"));
            reader2 = new BufferedReader(new FileReader("C:\\Users\\johnw\\Documents\\input2.txt"));
            String line = null;
            String line2 = null;
            ArrayList<String> w1 = new ArrayList<>();
            ArrayList<String> w2 = new ArrayList<>();

            while ((line = reader1.readLine()) != null) {
                line = reader1.readLine();
                w1.add(line);
            }
            int i1 = rand.nextInt(0, w1.size());
            first.setText(w1.get(i1));

            while ((line2 = reader2.readLine()) != null) {
                line2 = reader2.readLine();
                w2.add(line2);
            }
            int i2 = rand.nextInt(0, w2.size());
            second.setText(w2.get(i2));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}