package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LimpiarCampo extends Application {

    @Override
    public void start(Stage stage) {

        Label etiqueta = new Label("Aquí aparecerá tu texto");
        TextField campo = new TextField();
        campo.setPromptText("Escribe algo...");

        Button boton = new Button("Mostrar y limpiar");
        boton.setMaxWidth(Double.MAX_VALUE);

        boton.setOnAction(event -> {
            // Primero mostramos el texto en la etiqueta
            etiqueta.setText(campo.getText());
            // Luego vaciamos el campo — setText("") es equivalente a clear()
            campo.setText("");
        });

        VBox root = new VBox(10, etiqueta, campo, boton);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 300, 150);
        stage.setTitle("Ejercicio 9 - Limpiar campo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}