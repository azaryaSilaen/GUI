package circle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import rectangle.RectangleApplication;

import java.io.IOException;

/*
Author: Azarya Silaen
 */public class CircleApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CircleApplication.class.getResource("circle-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),600 , 400);
        primaryStage.setTitle("Circle Area | Circumference");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
