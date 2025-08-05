package checkers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import piggybank.PiggyBankApplication;

import java.io.IOException;

/*
Author: Azarya Silaen
 */public class CheckersApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CheckersApplication.class.getResource("checkers-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),640 , 640);
        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
