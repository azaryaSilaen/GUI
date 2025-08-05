package writingpad;/*
Author: Azarya Silaen
 */

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class WritingPadController {

    @FXML
    private TextArea txtAreaPad;

    WritingPadApplication app = new WritingPadApplication();

    @FXML
    protected void onCloseItemClick() {
        Platform.exit();
    }

    @FXML
    protected void onDeleteItemClick() {
        txtAreaPad.setText("");
    }

    @FXML
    protected void onCitationItemClick() {
        app.getHostServices().showDocument("https://www.easybib.com/mla/source");
    }

    @FXML
    protected void onSearchItemClick() {
        app.getHostServices().showDocument("https://www.google.com/");
    }
}
