package edu.guilford;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class IndividualDisplay extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Individual Pane
        IndividualPane pane = new IndividualPane();

        scene = new Scene(pane, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(IndividualDisplay.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
 
    public static void main(String[] args) {
        launch();
    }

}