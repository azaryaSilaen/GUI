package writingpad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import rectangle.RectangleApplication;

import java.io.IOException;

/*
Author: Azarya Silaen
 */public class WritingPadApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(WritingPadApplication.class.getResource("writingpad-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),600 , 400);
        primaryStage.setTitle("Writing Pad | Editor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
