package com.pixelduke.samples.transit;

import com.pixelduke.transit.JMetro;
import com.pixelduke.transit.Style;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OverridingStylesheetSample extends Application {
    private static final String SLIDER_RESOURCE = "JMetro Slider.fxml";
    static final private Style STYLE = Style.LIGHT;

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.setProperty("prism.lcdtext", "false");

        Parent root = FXMLLoader.load(getClass().getResource(SLIDER_RESOURCE));
        primaryStage.setTitle("JMetro");

        JMetro jMetro = new JMetro(root, STYLE);
        jMetro.getOverridingStylesheets().add(OverridingStylesheetSample.class.getResource("overriding-sample.css").toExternalForm());

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

}

