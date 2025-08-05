package showhide;/*
Author: Azarya Silaen
 */

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public class ShowHideController {
    public AnchorPane AnchorPaneScene;
    public Button btnHide;
    public Button btnShow;
    @FXML
    private Label llbShowHide;

    @FXML
    protected void onShowButtonClick(){
        llbShowHide.setText("pick-a-boo");

    }

    @FXML
    protected void onHideButtonClick(){
        llbShowHide.setText("");
    }


    public void resizing() {
        AutomaticResizing.anchorW = AnchorPaneScene.getWidth();
        AutomaticResizing.anchorH = AnchorPaneScene.getHeight();

        AutomaticResizing buttonHide = new AutomaticResizing(600,400,370,100,130,65, 20);

        btnHide.setLayoutX(buttonHide.getLayoutX());
        btnHide.setLayoutY(buttonHide.getLayoutY());
        btnHide.setPrefWidth(buttonHide.getWidth());
        btnHide.setPrefHeight(buttonHide.getHeight());
        btnHide.setFont(Font.font(buttonHide.getFont()));

        AutomaticResizing buttonShow = new AutomaticResizing(600,400,100,100,130,65, 20);

        btnShow.setLayoutX(buttonShow.getLayoutX());
        btnShow.setLayoutY(buttonShow.getLayoutY());
        btnShow.setPrefWidth(buttonShow.getWidth());
        btnShow.setPrefHeight(buttonShow.getHeight());
        btnShow.setFont(Font.font(buttonShow.getFont()));

        AutomaticResizing label = new AutomaticResizing(600,400,175,225,250,80, 50);

        llbShowHide.setLayoutX(label.getLayoutX());
        llbShowHide.setLayoutY(label.getLayoutY());
        llbShowHide.setPrefWidth(label.getWidth());
        llbShowHide.setPrefHeight(label.getHeight());
        llbShowHide.setFont(Font.font(label.getFont()));
        llbShowHide.setAlignment(Pos.CENTER);
    }
}
