package rectangle;/*
Author: Azarya Silaen
 */


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RectangleController {

    public TextField lengthText;
    public TextField widthText;
    private double length;
    private double width;

    @FXML
    private Label lbArea;
    @FXML
    private Label lbPerimeter;

    public RectangleController() {
    }


    @FXML
    protected void onAreaButtonClick(){
        length = Double.parseDouble(lengthText.getText());
        width  = Double.parseDouble(widthText.getText());
        lbArea.setText(String.valueOf(length*width));
    }

    @FXML
    protected void onPerimeterButtonClick(){
        length = Double.parseDouble(lengthText.getText());
        width  = Double.parseDouble(widthText.getText());
        lbPerimeter.setText(String.valueOf((length+width)*2));
    }

}
