package rectangle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import showhide.ShowHideApplication;

import java.io.IOException;

/*
Author: Azarya Silaen
 */public class RectangleApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RectangleApplication.class.getResource("rectangle-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),0 , 0);
        primaryStage.setTitle("Rectangle Area & Perimeter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
