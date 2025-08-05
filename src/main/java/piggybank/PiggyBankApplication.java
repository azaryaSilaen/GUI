package piggybank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import writingpad.WritingPadApplication;

import java.io.IOException;

/*
Author: Azarya Silaen
 */public class PiggyBankApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PiggyBankApplication.class.getResource("piggybank-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),525 , 425);
        primaryStage.setTitle("Piggy Bank");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
