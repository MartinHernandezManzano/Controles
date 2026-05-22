package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListaDesplegable extends Application {

    @Override
    public void start(Stage stage) {

        // ComboBox es la lista desplegable — el genérico indica el tipo de los elementos
        ComboBox<String> combo = new ComboBox<>();

        // Añadimos los elementos a la lista
        combo.getItems().addAll("Opción 1", "Opción 2", "Opción 3", "Opción 4");

        // Texto que aparece cuando no hay nada seleccionado
        combo.setPromptText("Selecciona una opción");
        combo.setMaxWidth(Double.MAX_VALUE);

        Label etiqueta = new Label("Aquí aparecerá la opción seleccionada");

        Button boton = new Button("Mostrar selección");
        boton.setMaxWidth(Double.MAX_VALUE);

        boton.setOnAction(event -> {
            // getValue() devuelve el elemento seleccionado — puede ser null si no hay nada
            String seleccion = combo.getValue();
            if (seleccion != null) {
                etiqueta.setText("Seleccionaste: " + seleccion);
            } else {
                etiqueta.setText("No has seleccionado nada");
            }
        });

        VBox root = new VBox(10, combo, boton, etiqueta);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 300, 150);
        stage.setTitle("Ejercicio 10 - Lista desplegable");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}