package com.pixelduke.samples.transit;

import com.pixelduke.transit.JMetro;
import com.pixelduke.transit.JMetroStyleClass;
import com.pixelduke.transit.Style;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SplitPaneSimpleSample extends Application {

    private static final Style STYLE = Style.DARK;

    public static void main(String[] args) {
        launch(args);
    }

    public SplitPaneSimpleSample() {
    }

    @Override
    public void start(Stage stage) {
        System.setProperty("prism.lcdtext", "false");

        SplitPane mainSplitPane = new SplitPane();
        mainSplitPane.setOrientation(Orientation.VERTICAL);
        mainSplitPane.setDividerPosition(0, 0.7);

        SplitPane horizontalSplitPane = new SplitPane();
        horizontalSplitPane.setDividerPosition(0, 0.3);

        ScrollPane scrollPane = new ScrollPane();

        BorderPane borderPane = new BorderPane();
        borderPane.getStyleClass().add(JMetroStyleClass.BACKGROUND);
        BorderPane borderPane2 = new BorderPane();
        borderPane2.getStyleClass().add(JMetroStyleClass.BACKGROUND);

        horizontalSplitPane.getItems().addAll(borderPane, scrollPane);
        mainSplitPane.getItems().addAll(horizontalSplitPane, borderPane2);

        BorderPane root = new BorderPane(mainSplitPane);
        root.getStyleClass().add(JMetroStyleClass.BACKGROUND);
        Scene scene = new Scene(root, 800, 600);

        new JMetro(scene, STYLE);

        stage.setTitle("SplitPane Simple Sample");
        stage.setScene(scene);
        stage.show();
    }
}
