package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextoEtiqueta extends Application {

    @Override
    public void start(Stage stage) {

        Label etiqueta = new Label("Aquí aparecerá tu texto. Escribe y dale al botón");

        // TextField es la caja de texto donde escribe el usuario
        TextField campo = new TextField();
        campo.setPromptText("Escribe algo..."); // texto de placeholder

        Button boton = new Button("Mostrar texto");
        boton.setMaxWidth(Double.MAX_VALUE);

        // Al pulsar, cogemos lo que hay en el campo y lo ponemos en la etiqueta
        boton.setOnAction(event -> etiqueta.setText(campo.getText()));

        VBox root = new VBox(10, etiqueta, campo, boton);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 300, 150);
        stage.setTitle("Ejercicio 8 - Texto y etiqueta");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}