package checkers;/*
Author: Azarya Silaen
 */

import javafx.animation.*;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class CheckersController implements Initializable {

    public AnchorPane checkerboard;
    public Group squaresBlackWhite;

    //white pieces
    public Group whitePieces;
    public Circle manWhite1;
    public Circle manWhite2;
    public Circle manWhite3;
    public Circle manWhite4;
    public Circle manWhite5;
    public Circle manWhite6;
    public Circle manWhite7;
    public Circle manWhite8;
    public Circle manWhite9;
    public Circle manWhite10;
    public Circle manWhite11;
    public Circle manWhite12;

    //white king
    public ImageView kingWhite1;
    public ImageView kingWhite2;
    public ImageView kingWhite3;
    public ImageView kingWhite4;
    public ImageView kingWhite5;
    public ImageView kingWhite6;
    public ImageView kingWhite7;
    public ImageView kingWhite8;
    public ImageView kingWhite9;
    public ImageView kingWhite10;
    public ImageView kingWhite11;
    public ImageView kingWhite12;

    //white capture
    public ImageView captureWhite1;
    public ImageView captureWhite2;
    public ImageView captureWhite3;
    public ImageView captureWhite4;
    public ImageView captureWhite5;
    public ImageView captureWhite6;
    public ImageView captureWhite7;
    public ImageView captureWhite8;
    public ImageView captureWhite9;
    public ImageView captureWhite10;
    public ImageView captureWhite11;
    public ImageView captureWhite12;

    //red pieces
    public Group redPieces;
    public Circle manRed1;
    public Circle manRed2;
    public Circle manRed3;
    public Circle manRed4;
    public Circle manRed5;
    public Circle manRed6;
    public Circle manRed7;
    public Circle manRed8;
    public Circle manRed9;
    public Circle manRed10;
    public Circle manRed11;
    public Circle manRed12;

    //red king
    public ImageView kingRed1;
    public ImageView kingRed2;
    public ImageView kingRed3;
    public ImageView kingRed4;
    public ImageView kingRed5;
    public ImageView kingRed6;
    public ImageView kingRed7;
    public ImageView kingRed8;
    public ImageView kingRed9;
    public ImageView kingRed10;
    public ImageView kingRed11;
    public ImageView kingRed12;

    //red capture
    public ImageView captureRed1;
    public ImageView captureRed2;
    public ImageView captureRed3;
    public ImageView captureRed4;
    public ImageView captureRed5;
    public ImageView captureRed6;
    public ImageView captureRed7;
    public ImageView captureRed8;
    public ImageView captureRed9;
    public ImageView captureRed10;
    public ImageView captureRed11;
    public ImageView captureRed12;

    //moves options
    public Circle move1;
    public Circle move2;
    public Circle move3;
    public Circle move4;
    public Circle move5;
    public Circle move6;
    public Circle move7;
    public Circle move8;
    public Circle move9;
    public Circle move10;
    public Circle move11;
    public Circle move12;
    public Circle move13;
    public Circle move14;
    public Circle move15;
    public Circle move16;
    public Circle move17;
    public Circle move18;
    public Circle move19;
    public Circle move20;
    public Circle move21;
    public Circle move22;
    public Circle move23;
    public Circle move24;
    public Circle move25;
    public Circle move26;
    public Circle move27;
    public Circle move28;
    public Circle move29;
    public Circle move30;
    public Circle move31;
    public Circle move32;

    public Group winningGroup;
    public Label winningText;

    //white rotation
    public RotateTransition rotateWhite1 = new RotateTransition();
    public RotateTransition rotateWhite2 = new RotateTransition();
    public RotateTransition rotateWhite3 = new RotateTransition();
    public RotateTransition rotateWhite4 = new RotateTransition();
    public RotateTransition rotateWhite5 = new RotateTransition();
    public RotateTransition rotateWhite6 = new RotateTransition();
    public RotateTransition rotateWhite7 = new RotateTransition();
    public RotateTransition rotateWhite8 = new RotateTransition();
    public RotateTransition rotateWhite9 = new RotateTransition();
    public RotateTransition rotateWhite10 = new RotateTransition();
    public RotateTransition rotateWhite11 = new RotateTransition();
    public RotateTransition rotateWhite12 = new RotateTransition();

    //red rotation
    public RotateTransition rotateRed1 = new RotateTransition();
    public RotateTransition rotateRed2 = new RotateTransition();
    public RotateTransition rotateRed3 = new RotateTransition();
    public RotateTransition rotateRed4 = new RotateTransition();
    public RotateTransition rotateRed5 = new RotateTransition();
    public RotateTransition rotateRed6 = new RotateTransition();
    public RotateTransition rotateRed7 = new RotateTransition();
    public RotateTransition rotateRed8 = new RotateTransition();
    public RotateTransition rotateRed9 = new RotateTransition();
    public RotateTransition rotateRed10 = new RotateTransition();
    public RotateTransition rotateRed11 = new RotateTransition();
    public RotateTransition rotateRed12 = new RotateTransition();

    //white location
    int[] whiteLocation = new int[13];

    //red location
    int[] redLocation = new int[13];

    //arrays move
    Circle[] choice = new Circle[33];

    //arrays WHITE (pieces, clicked, king, capture, and isKing)
    Circle[] arrayWhitePieces = new Circle[13];
    boolean[] whiteClicked = new boolean[13];
    ImageView[] whiteKings = new ImageView[13];
    ImageView[] whiteCapture = new ImageView[13];
    boolean[] whiteIsKing = new boolean[13];

    //arrays RED (pieces, clicked, king, capture and isKing)
    Circle[] arrayRedPieces = new Circle[13];
    boolean[] redClicked = new boolean[13];
    ImageView[] redKings = new ImageView[13];
    ImageView[] redCapture = new ImageView[13];
    boolean[] redIsKing = new boolean[13];

    //piece number that are clicked
    public int pieceClicked;

    //checked if move option = (any pieces location)
    public boolean moveClear3;
    public boolean moveClear4;
    public boolean moveClear5;

    //checked for capture
    public boolean captureAvailableGlobal;

    public boolean capture3;
    public boolean capture4;
    public boolean capture5;
    public boolean captureNormal3;
    public boolean captureNormal4;
    public boolean captureNormal5;
    public boolean captureAvailable;
    public boolean clickedToCapture;
    public boolean continuousCapture = false;
    public int[] capturePieces = new int[13];
    public int counter = 1;

    public RotateTransition[] whiteRotate = new RotateTransition[13];
    public RotateTransition[] redRotate = new RotateTransition[13];

    public TranslateTransition movingPiece = new TranslateTransition();

    //winning transition
    public FadeTransition fadingSquare = new FadeTransition();
    public FadeTransition fadingWhite = new FadeTransition();
    public FadeTransition fadingRed = new FadeTransition();
    public ScaleTransition scaleWhite = new ScaleTransition();
    public ScaleTransition scaleRed = new ScaleTransition();
    public ScaleTransition[] winningTextScale = new ScaleTransition[3];
    public FadeTransition[] winningTransition = new FadeTransition[5];
    public boolean winning = false;

    //things to do
    //check why when testing, capture was not recognized (tested with red pieces) ???? (most likely cleared)
    //making animation for the saw (cleared) XXXX
    //making the piece actually able to capture things XXXX
    //make sure king also able to capture backward XXXX
    //make end game scene (winner and loser) xxxx

    //bugs
    //why doing double kills (capturing two pieces in a row) makes captureAvailableGlobal become true and make all the pieces afterward to be disable xxxx


    //setting up array and anything else at the start of the game
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //white pieces
        arrayWhitePieces[1] = manWhite1;
        arrayWhitePieces[2] = manWhite2;
        arrayWhitePieces[3] = manWhite3;
        arrayWhitePieces[4] = manWhite4;
        arrayWhitePieces[5] = manWhite5;
        arrayWhitePieces[6] = manWhite6;
        arrayWhitePieces[7] = manWhite7;
        arrayWhitePieces[8] = manWhite8;
        arrayWhitePieces[9] = manWhite9;
        arrayWhitePieces[10] = manWhite10;
        arrayWhitePieces[11] = manWhite11;
        arrayWhitePieces[12] = manWhite12;

        //white location and white is king?
        for (int i = 1; i <= 12; i++) {
            whiteLocation[i] = i;
            whiteIsKing[i] = false;
        }

        //white kings
        whiteKings[1] = kingWhite1;
        whiteKings[2] = kingWhite2;
        whiteKings[3] = kingWhite3;
        whiteKings[4] = kingWhite4;
        whiteKings[5] = kingWhite5;
        whiteKings[6] = kingWhite6;
        whiteKings[7] = kingWhite7;
        whiteKings[8] = kingWhite8;
        whiteKings[9] = kingWhite9;
        whiteKings[10] = kingWhite10;
        whiteKings[11] = kingWhite11;
        whiteKings[12] = kingWhite12;

        //white capture
        whiteCapture[1] = captureWhite1;
        whiteCapture[2] = captureWhite2;
        whiteCapture[3] = captureWhite3;
        whiteCapture[4] = captureWhite4;
        whiteCapture[5] = captureWhite5;
        whiteCapture[6] = captureWhite6;
        whiteCapture[7] = captureWhite7;
        whiteCapture[8] = captureWhite8;
        whiteCapture[9] = captureWhite9;
        whiteCapture[10] = captureWhite10;
        whiteCapture[11] = captureWhite11;
        whiteCapture[12] = captureWhite12;

        //white rotate
        whiteRotate[1] = rotateWhite1;
        whiteRotate[2] = rotateWhite2;
        whiteRotate[3] = rotateWhite3;
        whiteRotate[4] = rotateWhite4;
        whiteRotate[5] = rotateWhite5;
        whiteRotate[6] = rotateWhite6;
        whiteRotate[7] = rotateWhite7;
        whiteRotate[8] = rotateWhite8;
        whiteRotate[9] = rotateWhite9;
        whiteRotate[10] = rotateWhite10;
        whiteRotate[11] = rotateWhite11;
        whiteRotate[12] = rotateWhite12;

        //red pieces
        arrayRedPieces[1] = manRed1;
        arrayRedPieces[2] = manRed2;
        arrayRedPieces[3] = manRed3;
        arrayRedPieces[4] = manRed4;
        arrayRedPieces[5] = manRed5;
        arrayRedPieces[6] = manRed6;
        arrayRedPieces[7] = manRed7;
        arrayRedPieces[8] = manRed8;
        arrayRedPieces[9] = manRed9;
        arrayRedPieces[10] = manRed10;
        arrayRedPieces[11] = manRed11;
        arrayRedPieces[12] = manRed12;

        //red kings
        redKings[1] = kingRed1;
        redKings[2] = kingRed2;
        redKings[3] = kingRed3;
        redKings[4] = kingRed4;
        redKings[5] = kingRed5;
        redKings[6] = kingRed6;
        redKings[7] = kingRed7;
        redKings[8] = kingRed8;
        redKings[9] = kingRed9;
        redKings[10] = kingRed10;
        redKings[11] = kingRed11;
        redKings[12] = kingRed12;

        //red capture
        redCapture[1] = captureRed1;
        redCapture[2] = captureRed2;
        redCapture[3] = captureRed3;
        redCapture[4] = captureRed4;
        redCapture[5] = captureRed5;
        redCapture[6] = captureRed6;
        redCapture[7] = captureRed7;
        redCapture[8] = captureRed8;
        redCapture[9] = captureRed9;
        redCapture[10] = captureRed10;
        redCapture[11] = captureRed11;
        redCapture[12] = captureRed12;

        //red rotate
        redRotate[1] = rotateRed1;
        redRotate[2] = rotateRed2;
        redRotate[3] = rotateRed3;
        redRotate[4] = rotateRed4;
        redRotate[5] = rotateRed5;
        redRotate[6] = rotateRed6;
        redRotate[7] = rotateRed7;
        redRotate[8] = rotateRed8;
        redRotate[9] = rotateRed9;
        redRotate[10] = rotateRed10;
        redRotate[11] = rotateRed11;
        redRotate[12] = rotateRed12;


        //red location and red is king?
        for (int i = 1; i <= 12; i++) {
            redLocation[i] = 33-i;
            redIsKing[i] = false;
        }

        //making moves into array
        choice[1] = move1;
        choice[2] = move2;
        choice[3] = move3;
        choice[4] = move4;
        choice[5] = move5;
        choice[6] = move6;
        choice[7] = move7;
        choice[8] = move8;
        choice[9] = move9;
        choice[10] = move10;
        choice[11] = move11;
        choice[12] = move12;
        choice[13] = move13;
        choice[14] = move14;
        choice[15] = move15;
        choice[16] = move16;
        choice[17] = move17;
        choice[18] = move18;
        choice[19] = move19;
        choice[20] = move20;
        choice[21] = move21;
        choice[22] = move22;
        choice[23] = move23;
        choice[24] = move24;
        choice[25] = move25;
        choice[26] = move26;
        choice[27] = move27;
        choice[28] = move28;
        choice[29] = move29;
        choice[30] = move30;
        choice[31] = move31;
        choice[32] = move32;

        winningTransition[1] = fadingSquare;
        winningTransition[2] = fadingWhite;
        winningTransition[3] = fadingRed;

        winningTransition[1].setNode(squaresBlackWhite);
        winningTransition[1].setDuration(Duration.millis(2500));
        winningTransition[1].setInterpolator(Interpolator.LINEAR);
        winningTransition[1].setFromValue(1);
        winningTransition[1].setToValue(0.2);

        winningTransition[2].setNode(whitePieces);
        winningTransition[2].setDuration(Duration.millis(2500));
        winningTransition[2].setInterpolator(Interpolator.LINEAR);
        winningTransition[2].setFromValue(1);
        winningTransition[2].setToValue(0.2);

        winningTransition[3].setNode(redPieces);
        winningTransition[3].setDuration(Duration.millis(2500));
        winningTransition[3].setInterpolator(Interpolator.LINEAR);
        winningTransition[3].setFromValue(1);
        winningTransition[3].setToValue(0.2);

        winningTextScale[1] = scaleWhite;
        winningTextScale[2] = scaleRed;

        winningTextScale[1].setNode(winningGroup);
        winningTextScale[1].setDuration(Duration.millis(3000));
        winningTextScale[1].setInterpolator(Interpolator.LINEAR);
        winningTextScale[1].setByX(10.0);
        winningTextScale[1].setByY(10.0);

        winningTextScale[2].setNode(winningGroup);
        winningTextScale[2].setDuration(Duration.millis(3000));
        winningTextScale[2].setInterpolator(Interpolator.LINEAR);
        winningTextScale[2].setByX(-10.0);
        winningTextScale[2].setByY(-10.0);
    }

    //resetting move option to be disabled
    public void resetMove () {
        for (int i = 1; i <= 32; i++) {
            choice[i].setVisible(false);
            choice[i].setDisable(true);
        }
    }

    //reseting piece clicked
    public void clickedBoolean () {

        //white clicked
        for (int i = 1; i <= 12; i++) {
            whiteClicked[i] = false;
        }

        //red clicked
        for (int i = 1; i <= 12; i++) {
            redClicked[i] = false;
        }

        //resetting move clear
        moveClear3 = true;
        moveClear4 = true;
        moveClear5 = true;

    }

    // summary/repeated code for all the move clicked action
    public void moveSummary (int moveNumber) {
        if (redPieces.isDisable()) {
                for (int i = 1; i <= 12; i++) {
                    if (whiteClicked[i]) {
                        pieceClicked = i;
                        break;
                    }
                }
            if (captureAvailableGlobal) {
                continuousCapture = false;
                for (int i = 1; i <= 12; i++) {
                    whiteCapture[i].setVisible(false);
                    whiteCapture[i].setDisable(true);
                    whiteRotate[i].stop();
                }
                //king capture
                if (moveNumber < whiteLocation[pieceClicked]) {
                    if (capture3 & moveNumber == whiteLocation[pieceClicked]-7) {
                        for (int i = 1; i <= 12; i++) {
                            if (moveNumber+4 == redLocation[i]) {
                                arrayRedPieces[i].setDisable(true);
                                arrayRedPieces[i].setVisible(false);
                                redKings[i].setDisable(true);
                                redKings[i].setVisible(false);
                                redLocation[i] = 0;
                                break;
                            }
                        }
                    }
                    if (capture5 & moveNumber == whiteLocation[pieceClicked]-9) {
                        for (int i = 1; i <= 12; i++) {
                            if (moveNumber+4 == redLocation[i]) {
                                arrayRedPieces[i].setDisable(true);
                                arrayRedPieces[i].setVisible(false);
                                redKings[i].setDisable(true);
                                redKings[i].setVisible(false);
                                redLocation[i] = 0;
                                break;
                            }
                        }
                    }
                    if (capture4) {
                        if (whiteLocation[pieceClicked]%8 == 0 | whiteLocation[pieceClicked]%8 == 6 | whiteLocation[pieceClicked]%8 == 7) {
                            if (moveNumber == whiteLocation[pieceClicked]-9) {
                                for (int i = 1; i <= 12; i++) {
                                    if (moveNumber+5 == redLocation[i]) {
                                        arrayRedPieces[i].setDisable(true);
                                        arrayRedPieces[i].setVisible(false);
                                        redKings[i].setDisable(true);
                                        redKings[i].setVisible(false);
                                        redLocation[i] = 0;
                                        break;
                                    }
                                }
                            }
                        }
                        if (whiteLocation[pieceClicked]%8 == 1 | whiteLocation[pieceClicked]%8 == 2 | whiteLocation[pieceClicked]%8 == 3) {
                            if (moveNumber == whiteLocation[pieceClicked]-7) {
                                for (int i = 1; i <= 12; i++) {
                                    if (moveNumber+3 == redLocation[i]) {
                                        arrayRedPieces[i].setDisable(true);
                                        arrayRedPieces[i].setVisible(false);
                                        redKings[i].setDisable(true);
                                        redKings[i].setVisible(false);
                                        redLocation[i] = 0;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                //normal capture
                if (captureNormal3 & moveNumber == whiteLocation[pieceClicked]+7) {
                    for (int i = 1; i <= 12; i++) {
                        if (moveNumber-4 == redLocation[i]) {
                            arrayRedPieces[i].setDisable(true);
                            arrayRedPieces[i].setVisible(false);
                            redKings[i].setDisable(true);
                            redKings[i].setVisible(false);
                            redLocation[i] = 0;
                            break;
                        }
                    }
                    }
                if (captureNormal5 & moveNumber == whiteLocation[pieceClicked]+9) {
                    for (int i = 1; i <= 12; i++) {
                        if (moveNumber-4 == redLocation[i]) {
                            arrayRedPieces[i].setDisable(true);
                            arrayRedPieces[i].setVisible(false);
                            redKings[i].setDisable(true);
                            redKings[i].setVisible(false);
                            redLocation[i] = 0;
                            break;
                        }
                    }
                }
                if (captureNormal4) {
                    if (whiteLocation[pieceClicked] % 8 == 0 | whiteLocation[pieceClicked] % 8 == 6 | whiteLocation[pieceClicked] % 8 == 7) {
                        if (moveNumber == whiteLocation[pieceClicked] + 7) {
                            for (int i = 1; i <= 12; i++) {
                                if (moveNumber - 3 == redLocation[i]) {
                                    arrayRedPieces[i].setDisable(true);
                                    arrayRedPieces[i].setVisible(false);
                                    redKings[i].setDisable(true);
                                    redKings[i].setVisible(false);
                                    redLocation[i] = 0;
                                    break;
                                }
                            }
                        }
                    }
                    if (whiteLocation[pieceClicked] % 8 == 1 | whiteLocation[pieceClicked] % 8 == 2 | whiteLocation[pieceClicked] % 8 == 3) {
                        if (moveNumber == whiteLocation[pieceClicked] + 9) {
                            for (int i = 1; i <= 12; i++) {
                                if (moveNumber - 5 == redLocation[i]) {
                                    arrayRedPieces[i].setDisable(true);
                                    arrayRedPieces[i].setVisible(false);
                                    redKings[i].setDisable(true);
                                    redKings[i].setVisible(false);
                                    redLocation[i] = 0;
                                    break;
                                }
                            }
                        }
                    }
                }
                }
                captureAvailableGlobal = false;
                captureAvailable = false;
                whiteLocation[pieceClicked] = moveNumber;
                checkingWhiteCapture(whiteLocation[pieceClicked], pieceClicked);
                checkingWhiteKingCapture(whiteLocation[pieceClicked], pieceClicked);
                if (captureAvailable) {
                    clickedToCapture = true;
                    captureAvailableGlobal = true;
                    continuousCapture = true;
                    for (int i = 1; i <= 12; i++) {
                        if (i != pieceClicked) {
                            arrayWhitePieces[i].setDisable(true);
                        }
                    }
                }



            }
            for (int i = 1; i <= 12; i++) {
                arrayRedPieces[i].setDisable(false);
            }

            CheckingWinningScene();

            if (moveNumber == 29 | moveNumber == 30 | moveNumber == 31 | moveNumber == 32 ) {
                whiteIsKing[pieceClicked] = true;
                whiteKings[pieceClicked].setVisible(true);
            }
            arrayWhitePieces[pieceClicked].setCenterX(choice[moveNumber].getCenterX());
            arrayWhitePieces[pieceClicked].setCenterY(choice[moveNumber].getCenterY());
            whiteKings[pieceClicked].setLayoutX(choice[moveNumber].getCenterX()-20);
            whiteKings[pieceClicked].setLayoutY(choice[moveNumber].getCenterY()-20);
            whiteCapture[pieceClicked].setLayoutX(choice[moveNumber].getCenterX()-40);
            whiteCapture[pieceClicked].setLayoutY(choice[moveNumber].getCenterY()-40);
            whiteLocation[pieceClicked] = moveNumber;



            if (!captureAvailable) {
                whitePieces.setDisable(true);
                redPieces.setDisable(false);

                if (!winning) {
                    checkerboard.setScaleX(-1);
                    checkerboard.setScaleY(-1);
                captureAvailableGlobal = false;
                for (int i = 1; i <= 12; i++) {
                    checkingRedCapture(redLocation[i], i);
                    if (redIsKing[i]) {
                        checkingRedKingCapture(redLocation[i], i);
                    }
                    if (captureAvailable) {
                        capturePieces[counter] = i;
                        counter++;
                    }
                }
                if (captureAvailableGlobal) {
                    continuousCapture = false;
                    for (int i = 1; i <= 12; i++) {
                        for (int j = 1; j <= 12; j++) {
                            if (i == capturePieces[j]) {
                                arrayRedPieces[i].setDisable(false);
                                break;
                            } else {
                                arrayRedPieces[i].setDisable(true);
                            }
                        }
                    }
                }
            }
            }
        }
        else {
            for (int i = 1; i <= 12; i++) {
                if (redClicked[i]) {
                    pieceClicked = i;
                    break;
                }
            }
            if (captureAvailableGlobal) {
                for (int i = 1; i <= 12; i++) {
                    redCapture[i].setVisible(false);
                    redCapture[i].setDisable(true);
                    redRotate[i].stop();
                }
                //king capture
                if (moveNumber > redLocation[pieceClicked]) {
                    if (capture3 & moveNumber == redLocation[pieceClicked] + 7) {
                        for (int i = 1; i <= 12; i++) {
                            if (moveNumber - 4 == whiteLocation[i]) {
                                arrayWhitePieces[i].setDisable(true);
                                arrayWhitePieces[i].setVisible(false);
                                whiteKings[i].setDisable(true);
                                whiteKings[i].setVisible(false);
                                whiteLocation[i] = 0;
                                break;
                            }
                        }
                    }
                    if (capture5 & moveNumber == redLocation[pieceClicked] + 9) {
                        for (int i = 1; i <= 12; i++) {
                            if (moveNumber - 4 == whiteLocation[i]) {
                                arrayWhitePieces[i].setDisable(true);
                                arrayWhitePieces[i].setVisible(false);
                                whiteKings[i].setDisable(true);
                                whiteKings[i].setVisible(false);
                                whiteLocation[i] = 0;
                                break;
                            }
                        }
                    }
                    if (capture4) {
                        if (redLocation[pieceClicked] % 8 == 0 | redLocation[pieceClicked] % 8 == 6 | redLocation[pieceClicked] % 8 == 7) {
                            if (moveNumber == redLocation[pieceClicked] + 7 ) {
                                for (int i = 1; i <= 12; i++) {
                                    if (redLocation[pieceClicked] + 4 == whiteLocation[i]) {
                                        arrayWhitePieces[i].setDisable(true);
                                        arrayWhitePieces[i].setVisible(false);
                                        whiteKings[i].setDisable(true);
                                        whiteKings[i].setVisible(false);
                                        whiteLocation[i] = 0;
                                        break;
                                    }
                                }
                            }
                        }
                        if (redLocation[pieceClicked] % 8 == 1 | redLocation[pieceClicked] % 8 == 2 | redLocation[pieceClicked] % 8 == 3) {
                            if (moveNumber == redLocation[pieceClicked] + 9) {
                                for (int i = 1; i <= 12; i++) {
                                    if (redLocation[pieceClicked] + 4 == whiteLocation[i]) {
                                        arrayWhitePieces[i].setDisable(true);
                                        arrayWhitePieces[i].setVisible(false);
                                        whiteKings[i].setDisable(true);
                                        whiteKings[i].setVisible(false);
                                        whiteLocation[i] = 0;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    if (captureNormal3 & moveNumber == redLocation[pieceClicked] - 7) {
                        for (int i = 1; i <= 12; i++) {
                            if (moveNumber + 4 == whiteLocation[i]) {
                                arrayWhitePieces[i].setDisable(true);
                                arrayWhitePieces[i].setVisible(false);
                                whiteKings[i].setDisable(true);
                                whiteKings[i].setVisible(false);
                                whiteLocation[i] = 0;
                                break;
                            }
                        }
                    }
                    if (captureNormal5 & moveNumber == redLocation[pieceClicked] - 9) {
                        for (int i = 1; i <= 12; i++) {
                            if (moveNumber + 4 == whiteLocation[i]) {
                                arrayWhitePieces[i].setDisable(true);
                                arrayWhitePieces[i].setVisible(false);
                                whiteKings[i].setDisable(true);
                                whiteKings[i].setVisible(false);
                                whiteLocation[i] = 0;
                                break;
                            }
                        }
                    }
                    if (captureNormal4) {
                        if (redLocation[pieceClicked] % 8 == 0 | redLocation[pieceClicked] % 8 == 6 | redLocation[pieceClicked] % 8 == 7) {
                            if (moveNumber == redLocation[pieceClicked] - 9) {
                                for (int i = 1; i <= 12; i++) {
                                    if (redLocation[pieceClicked] - 4 == whiteLocation[i]) {
                                        arrayWhitePieces[i].setDisable(true);
                                        arrayWhitePieces[i].setVisible(false);
                                        whiteKings[i].setDisable(true);
                                        whiteKings[i].setVisible(false);
                                        whiteLocation[i] = 0;
                                        break;
                                    }
                                }
                            }
                        }
                        if (redLocation[pieceClicked] % 8 == 1 | redLocation[pieceClicked] % 8 == 2 | redLocation[pieceClicked] % 8 == 3) {
                            if (moveNumber == redLocation[pieceClicked] - 7) {
                                for (int i = 1; i <= 12; i++) {
                                    if (redLocation[pieceClicked] - 4 == whiteLocation[i]) {
                                        arrayWhitePieces[i].setDisable(true);
                                        arrayWhitePieces[i].setVisible(false);
                                        whiteKings[i].setDisable(true);
                                        whiteKings[i].setVisible(false);
                                        whiteLocation[i] = 0;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                redLocation[pieceClicked] = moveNumber;
                checkingRedCapture(redLocation[pieceClicked], pieceClicked);
                checkingRedKingCapture(redLocation[pieceClicked], pieceClicked);
                if (captureAvailable) {
                    continuousCapture = true;
                    for (int i = 1; i <= 12; i++) {
                        if (i != pieceClicked) {
                            arrayRedPieces[i].setDisable(true);
                        }
                    }
                }



            }
            for (int i = 1; i <= 12; i++) {
                arrayWhitePieces[i].setDisable(false);
            }
            CheckingWinningScene();
            if (moveNumber == 1 | moveNumber == 2 | moveNumber == 3 | moveNumber == 4) {
                redIsKing[pieceClicked] = true;
                redKings[pieceClicked].setVisible(true);
            }
            arrayRedPieces[pieceClicked].setCenterX(choice[moveNumber].getCenterX());
            arrayRedPieces[pieceClicked].setCenterY(choice[moveNumber].getCenterY());
            redKings[pieceClicked].setLayoutX(choice[moveNumber].getCenterX() - 20);
            redKings[pieceClicked].setLayoutY(choice[moveNumber].getCenterY() - 20);
            redCapture[pieceClicked].setLayoutX(choice[moveNumber].getCenterX() - 40);
            redCapture[pieceClicked].setLayoutY(choice[moveNumber].getCenterY() - 40);
            redLocation[pieceClicked] = moveNumber;
            if (!captureAvailable) {
                whitePieces.setDisable(false);
                redPieces.setDisable(true);

                if (!winning) {
                    checkerboard.setScaleX(1);
                checkerboard.setScaleY(1);

                captureAvailableGlobal = false;
                for (int i = 1; i <= 12; i++) {
                    checkingWhiteCapture(whiteLocation[i], i);
                    if (whiteIsKing[i]) {
                        checkingWhiteKingCapture(whiteLocation[i], i);
                    }
                    if (captureAvailable) {
                        capturePieces[counter] = i;
                        counter++;
                    }
                }
                if (captureAvailableGlobal) {
                    for (int i = 1; i <= 12; i++) {
                        for (int j = 1; j <= 12; j++) {
                            if (i == capturePieces[j]) {
                                arrayWhitePieces[i].setDisable(false);
                                break;
                            } else {
                                arrayWhitePieces[i].setDisable(true);
                            }
                        }
                    }
                }
            }
        }
        }
        counter = 1;
        Arrays.fill(capturePieces, 0);
        resetMove();
    }

    // summary/repeated code for all the white pieces clicked action
    public void pieceWhiteSummary (int pieceNumber) {
        resetMove();
        clickedBoolean();
        whiteClicked[pieceNumber] = true;
        if (captureAvailableGlobal) {
            clickedToCapture = true;
            checkingWhiteCapture(whiteLocation[pieceNumber], pieceNumber);
            if (whiteIsKing[pieceNumber] | continuousCapture) {
                clickedToCapture = true;
                checkingWhiteKingCapture(whiteLocation[pieceNumber], pieceNumber);
            }
        }
        else {
            movingWhite(whiteLocation[pieceNumber]);
            //piece already become King
            if (whiteIsKing[pieceNumber]) {
                movingRed(whiteLocation[pieceNumber]);
            }
        }
    }

    // summary/repeated code for all the red pieces clicked action
    public void pieceRedSummary (int pieceNumber) {
        resetMove();
        clickedBoolean();
        redClicked[pieceNumber] = true;
        if (captureAvailableGlobal) {
            clickedToCapture = true;
            checkingRedCapture(redLocation[pieceNumber], pieceNumber);
            if (redIsKing[pieceNumber] | continuousCapture) {
                clickedToCapture = true;
                checkingRedKingCapture(redLocation[pieceNumber], pieceNumber);
            }
        }
        else {
            movingRed(redLocation[pieceNumber]);
            //piece already become King
            if (redIsKing[pieceNumber]) {
                movingWhite(redLocation[pieceNumber]);
            }
        }
    }

    //checking ability to capture for White
    public void checkingWhiteKingCapture (int pieceLocation, int pieceNumber) {
        capture3 = false;
        capture4 = false;
        capture5 = false;
        for (int i = 1; i <= 12; i++) {
            if (redLocation[i] == pieceLocation - 3) {
                capture3 = true;
                for (int j = 1; j <= 12; j++) {
                    if (redLocation[j] == pieceLocation - 3 - 4) {
                        capture3 = false;
                        break;
                    }
                    if (whiteLocation[j] == pieceLocation - 3 - 4) {
                        capture3 = false;
                        break;
                    }
                }
            }
            if (redLocation[i] == pieceLocation - 4) {
                capture4 = true;
            }
            if (redLocation[i] == pieceLocation - 5) {
                capture5 = true;
                for (int j = 1; j <= 12; j++) {
                    if (redLocation[j] == pieceLocation - 5 - 4) {
                        capture5 = false;
                        break;
                    }
                    if (whiteLocation[j] == pieceLocation - 5 - 4) {
                        capture5 = false;
                        break;
                    }
                }
            }
        }
        if (capture3 | capture4 | capture5) {
            redCapture(pieceLocation, pieceNumber);
        }
    }
    public void checkingWhiteCapture (int pieceLocation, int pieceNumber) {
        captureAvailable = false;
        capture3 = false;
        capture4 = false;
        capture5 = false;
        captureNormal3 = false;
        captureNormal4 = false;
        captureNormal5 = false;

        for (int i = 1; i <= 12; i++) {
            if (redLocation[i] == pieceLocation + 3) {
                capture3 = true;
                for (int j = 1; j <= 12; j++) {
                    if (redLocation[j] == pieceLocation + 3 + 4) {
                        capture3 = false;
                        break;
                    }
                    if (whiteLocation[j] == pieceLocation + 3 + 4) {
                        capture3 = false;
                        break;
                    }
                }
            }
            if (redLocation[i] == pieceLocation + 4) {
                capture4 = true;
            }
            if (redLocation[i] == pieceLocation + 5) {
                capture5 = true;
                for (int j = 1; j <= 12; j++) {
                    if (redLocation[j] == pieceLocation + 5 + 4) {
                        capture5 = false;
                        break;
                    }
                    if (whiteLocation[j] == pieceLocation + 5 + 4) {
                        capture5 = false;
                        break;
                    }
                }
            }
        }
        if (capture3 | capture4 | capture5) {
            whiteCapture(pieceLocation, pieceNumber);
        }
    }
    public void whiteCapture (int pieceLocation, int pieceNumber) {


        if (pieceLocation == 0 | pieceLocation == 25 | pieceLocation == 26 | pieceLocation == 27 | pieceLocation == 28
        | pieceLocation == 29 | pieceLocation == 30 | pieceLocation == 31 | pieceLocation == 32) {
            //skip
        }
        else {

            //piece on the edge that can't be captured
            if (pieceLocation % 8 == 4 | pieceLocation % 8 == 5) {
                capture4 = false;
            }

            if (capture3) {
                if (pieceLocation % 8 == 2 | pieceLocation % 8 == 3 | pieceLocation % 8 == 4) {
                    //use animation timer
                    sawAnimation(pieceNumber);
                    if (clickedToCapture) {
                        choice[pieceLocation + 3 + 4].setVisible(true);
                        choice[pieceLocation + 3 + 4].setDisable(false);
                    }
                    captureAvailable = true;
                    captureAvailableGlobal = true;
                    captureNormal3 = true;
                } else {
                    capture3 = false;
                }
            }
            if (capture5) {
                if (pieceLocation % 8 == 5 | pieceLocation % 8 == 6 | pieceLocation % 8 == 7) {
                    //use animation timer
                    sawAnimation(pieceNumber);
                    if (clickedToCapture) {
                        choice[pieceLocation + 5 + 4].setVisible(true);
                        choice[pieceLocation + 5 + 4].setDisable(false);
                    }
                    captureAvailable = true;
                    captureAvailableGlobal = true;
                    captureNormal5 = true;
                }
                else {
                    capture5 = false;
                }
            }
            if (capture4) {
                if (pieceLocation % 8 == 0 | pieceLocation % 8 == 6 | pieceLocation % 8 == 7) {
                    for (int j = 1; j <= 12; j++) {
                        if (redLocation[j] == pieceLocation + 4 + 3) {
                            capture4 = false;
                            break;
                        }
                        if (whiteLocation[j] == pieceLocation + 4 + 3) {
                            capture4 = false;
                            break;
                        }
                    }
                    if (capture4) {
                        sawAnimation(pieceNumber);
                        if (clickedToCapture) {
                            choice[pieceLocation + 4 + 3].setVisible(true);
                            choice[pieceLocation + 4 + 3].setDisable(false);
                        }
                        captureAvailable = true;
                        captureAvailableGlobal = true;
                        captureNormal4 = true;
                    }
                }
                if (pieceLocation % 8 == 1 | pieceLocation % 8 == 2 | pieceLocation % 8 == 3) {
                    for (int j = 1; j <= 12; j++) {
                        if (redLocation[j] == pieceLocation + 4 + 5) {
                            capture4 = false;
                            break;
                        }
                        if (whiteLocation[j] == pieceLocation + 4 + 5) {
                            capture4 = false;
                            break;
                        }
                    }
                    if (capture4) {
                        sawAnimation(pieceNumber);
                        if (clickedToCapture) {
                            choice[pieceLocation + 4 + 5].setVisible(true);
                            choice[pieceLocation + 4 + 5].setDisable(false);
                        }
                        captureAvailable = true;
                        captureAvailableGlobal = true;
                        captureNormal4 = true;
                    }
                }
            }
        }
        if (whiteIsKing[pieceNumber]) {

        }
           clickedToCapture = false;
        }

    //checking ability to capture for Red
    public void checkingRedKingCapture (int pieceLocation, int pieceNumber) {
        capture3 = false;
        capture4 = false;
        capture5 = false;

        for (int i = 1; i <= 12; i++) {
            if (whiteLocation[i] == pieceLocation + 3) {
                capture3 = true;
                for (int j = 1; j <= 12; j++) {
                    if (whiteLocation[j] == pieceLocation + 3 + 4) {
                        capture3 = false;
                        break;
                    }
                    if (redLocation[j] == pieceLocation + 3 + 4) {
                        capture3 = false;
                        break;
                    }
                }
            }
            if (whiteLocation[i] == pieceLocation + 4) {
                capture4 = true;
            }
            if (whiteLocation[i] == pieceLocation + 5) {
                capture5 = true;
                for (int j = 1; j <= 12; j++) {
                    if (whiteLocation[j] == pieceLocation + 5 + 4) {
                        capture5 = false;
                        break;
                    }
                    if (redLocation[j] == pieceLocation + 5 + 4) {
                        capture5 = false;
                        break;
                    }
                }
            }
        }
        if (capture3 | capture4 | capture5) {
            whiteCapture(pieceLocation, pieceNumber);
        }
    }
    public void checkingRedCapture (int pieceLocation, int pieceNumber) {
        captureAvailable = false;
        capture3 = false;
        capture4 = false;
        capture5 = false;
        captureNormal3 = false;
        captureNormal4 = false;
        captureNormal5 = false;

        for (int i = 1; i <= 12; i++) {
            if (whiteLocation[i] == pieceLocation - 3) {
                capture3 = true;
                for (int j = 1; j <= 12; j++) {
                    if (whiteLocation[j] == pieceLocation - 3 - 4) {
                        capture3 = false;
                        break;
                    }
                    if (redLocation[j] == pieceLocation - 3 - 4) {
                        capture3 = false;
                        break;
                    }
                }
            }
            if (whiteLocation[i] == pieceLocation - 4) {
                capture4 = true;
            }
            if (whiteLocation[i] == pieceLocation - 5) {
                capture5 = true;
                for (int j = 1; j <= 12; j++) {
                    if (whiteLocation[j] == pieceLocation - 5 - 4) {
                        capture5 = false;
                        break;
                    }
                    if (redLocation[j] == pieceLocation - 5 - 4) {
                        capture5 = false;
                        break;
                    }
                }
            }
        }
        if (capture3 | capture4 | capture5) {
            redCapture(pieceLocation, pieceNumber);
        }
    }
    public void redCapture (int pieceLocation, int pieceNumber) {

        if (pieceLocation == 0 | pieceLocation == 1 | pieceLocation == 2 | pieceLocation == 3 | pieceLocation == 4
        | pieceLocation == 5 | pieceLocation == 6 | pieceLocation == 7 | pieceLocation == 8) {
            //skip
        }
        else {

            //piece on the edge that can't be captured
            if (pieceLocation % 8 == 4 | pieceLocation % 8 == 5) {
                capture4 = false;
            }

            if (capture5) {
                if (pieceLocation % 8 == 2 | pieceLocation % 8 == 3 | pieceLocation % 8 == 4) {
                    //use animation timer
                    sawAnimation(pieceNumber);
                    if (clickedToCapture) {
                        choice[pieceLocation - 5 - 4].setVisible(true);
                        choice[pieceLocation - 5 - 4].setDisable(false);
                    }
                    captureAvailable = true;
                    captureAvailableGlobal = true;
                    captureNormal5 = true;
                }
                else {
                    capture5 = false;
                }
            }
            if (capture3) {
                if (pieceLocation % 8 == 5 | pieceLocation % 8 == 6 | pieceLocation % 8 == 7) {
                    //use animation timer
                    sawAnimation(pieceNumber);
                    if (clickedToCapture) {
                        choice[pieceLocation - 3 - 4].setVisible(true);
                        choice[pieceLocation - 3 - 4].setDisable(false);
                    }
                    captureAvailable = true;
                    captureAvailableGlobal = true;
                    captureNormal3 = true;
                }
                else {
                    capture3 = false;
                }
            }
            if (capture4) {
                if (pieceLocation % 8 == 0 | pieceLocation % 8 == 6 | pieceLocation % 8 == 7) {
                    for (int j = 1; j <= 12; j++) {
                        if (redLocation[j] == pieceLocation - 4 - 5) {
                            capture4 = false;
                            break;
                        }
                        if (whiteLocation[j] == pieceLocation - 4 - 5) {
                            capture4 = false;
                            break;
                        }
                    }
                    if (capture4) {
                        //use animation timer
                        sawAnimation(pieceNumber);
                        if (clickedToCapture) {
                            choice[pieceLocation - 4 - 5].setVisible(true);
                            choice[pieceLocation - 4 - 5].setDisable(false);
                        }
                        captureAvailable = true;
                        captureAvailableGlobal = true;
                        captureNormal4 = true;
                    }
                }
                if (pieceLocation % 8 == 1 | pieceLocation % 8 == 2 | pieceLocation % 8 == 3) {
                    for (int j = 1; j <= 12; j++) {
                        if (redLocation[j] == pieceLocation - 4 - 3) {
                            capture4 = false;
                            break;
                        }
                        if (whiteLocation[j] == pieceLocation - 4 - 3) {
                            capture4 = false;
                            break;
                        }
                    }
                    if (capture4) {
                        //use animation timer
                        sawAnimation(pieceNumber);
                        if (clickedToCapture) {
                            choice[pieceLocation - 4 - 3].setVisible(true);
                            choice[pieceLocation - 4 - 3].setDisable(false);
                        }
                        captureAvailable = true;
                        captureAvailableGlobal = true;
                        captureNormal4 = true;
                    }
                }
            }
        }
        clickedToCapture = false;
    }

    //saw animation
    public void sawAnimation (int pieceNumber) {
        if (redPieces.isDisable()) {
            whiteCapture[pieceNumber].setVisible(true);
            whiteRotate[pieceNumber].setNode(whiteCapture[pieceNumber]);
            whiteRotate[pieceNumber].setDuration(Duration.millis(2000));
            whiteRotate[pieceNumber].setCycleCount(TranslateTransition.INDEFINITE);
            whiteRotate[pieceNumber].setInterpolator(Interpolator.LINEAR);
            whiteRotate[pieceNumber].setByAngle(360);
            whiteRotate[pieceNumber].setAxis(Rotate.Z_AXIS);
            whiteRotate[pieceNumber].play();
        } else {
            redCapture[pieceNumber].setVisible(true);
            redRotate[pieceNumber].setNode(redCapture[pieceNumber]);
            redRotate[pieceNumber].setDuration(Duration.millis(2000));
            redRotate[pieceNumber].setCycleCount(TranslateTransition.INDEFINITE);
            redRotate[pieceNumber].setInterpolator(Interpolator.LINEAR);
            redRotate[pieceNumber].setByAngle(360);
            redRotate[pieceNumber].setAxis(Rotate.Z_AXIS);
            redRotate[pieceNumber].play();
        }

    }

    //endgame scene
    public void CheckingWinningScene () {

        if (redPieces.isDisable()) {
            for (int i = 1; i <= 12; i++) {
                if (arrayRedPieces[i].isVisible()) {
                    break;
                }
                else if (i == 12) {
                    winningTransition[1].play();
                    winningTransition[2].play();
                    winningTransition[3].play();
                    winningGroup.setVisible(true);
                    winningTextScale[1].play();
                    winning = true;
                }
            }
        }
        else {
            for (int i = 1; i <= 12; i++) {
                if (arrayWhitePieces[i].isVisible()) {
                    break;
                }
                else if (i == 12) {
                    winningTransition[1].play();
                    winningTransition[2].play();
                    winningTransition[3].play();
                    winningText.setText("Red");
                    winningGroup.setScaleX(-1);
                    winningGroup.setScaleY(-1);
                    winningGroup.setVisible(true);
                    winningTextScale[2].play();
                    winning = true;
                }
            }
        }
    }

    //moves option
        //White
    public void movingWhite (int pieceLocation) {
        moveClear3 = true;
        moveClear4 = true;
        moveClear5 = true;

        //checking if move option are overlapping with any pieces
        for (int i = 1; i <= 12; i++) {
            if (whiteLocation[i] == pieceLocation+3 | redLocation[i] == pieceLocation+3) {
                moveClear3 = false;
            }
            if (whiteLocation[i] == pieceLocation+4 | redLocation[i] == pieceLocation+4) {
                moveClear4 = false;
            }
            if (whiteLocation[i] == pieceLocation+5 | redLocation[i] == pieceLocation+5) {
                moveClear5 = false;
            }
        }

        //make sure move option are not out of bounds
        if (pieceLocation == 29 | pieceLocation == 30 | pieceLocation == 31 | pieceLocation == 32 ) {

        }

        else if (pieceLocation % 8 == 0 | pieceLocation % 8 == 1) {
            if (moveClear4) {
                choice[pieceLocation + 4].setVisible(true);
                choice[pieceLocation + 4].setDisable(false);
            }
        }
        else if (pieceLocation % 8 == 5 | pieceLocation % 8 == 6 |
                pieceLocation % 8 == 7 ) {
            if (moveClear5) {
                choice[pieceLocation + 5].setVisible(true);
                choice[pieceLocation + 5].setDisable(false);
            }
            if (moveClear4) {
                choice[pieceLocation + 4].setVisible(true);
                choice[pieceLocation + 4].setDisable(false);
            }
        }

        else {
            if (moveClear3) {
                choice[pieceLocation + 3].setVisible(true);
                choice[pieceLocation + 3].setDisable(false);
            }
            if (moveClear4) {
                choice[pieceLocation + 4].setVisible(true);
                choice[pieceLocation + 4].setDisable(false);
            }
        }



    }
        //red
    public void movingRed (int pieceLocation) {
        moveClear3 = true;
        moveClear4 = true;
        moveClear5 = true;

        //checking if move option are overlapping with any pieces
        for (int i = 1; i <= 12; i++) {
            if (redLocation[i] == pieceLocation-3 | whiteLocation[i] == pieceLocation-3) {
                moveClear3 = false;
            }
            if (redLocation[i] == pieceLocation-4 | whiteLocation[i] == pieceLocation-4) {
                moveClear4 = false;
            }
            if (redLocation[i] == pieceLocation-5 | whiteLocation[i] == pieceLocation-5) {
                moveClear5 = false;
            }
        }

        //make sure move option are not out of bounds
        if (pieceLocation == 1 | pieceLocation == 2 | pieceLocation == 3 | pieceLocation == 4 ) {

        }
        else if (pieceLocation % 8 == 0 | pieceLocation % 8 == 1) {

            if (moveClear4) {
                choice[pieceLocation - 4].setVisible(true);
                choice[pieceLocation - 4].setDisable(false);
            }

        }
        else if (pieceLocation % 8 == 5 | pieceLocation % 8 == 6 |
                pieceLocation % 8 == 7 ) {
            if (moveClear3) {
                choice[pieceLocation - 3].setVisible(true);
                choice[pieceLocation - 3].setDisable(false);
            }
            if (moveClear4) {
                choice[pieceLocation - 4].setVisible(true);
                choice[pieceLocation - 4].setDisable(false);
            }
        }
        else {
            if (moveClear5) {
                choice[pieceLocation - 5].setVisible(true);
                choice[pieceLocation - 5].setDisable(false);
            }
            if (moveClear4) {
                choice[pieceLocation - 4].setVisible(true);
                choice[pieceLocation - 4].setDisable(false);
            }
        }

    }

    //action method
        //white pieces clicked
    public void manWhiteClicked1() {
        pieceWhiteSummary(1);
    }

    public void manWhiteClicked2() {
        pieceWhiteSummary(2);
    }

    public void manWhiteClicked3() {
        pieceWhiteSummary(3);
    }

    public void manWhiteClicked4() {
        pieceWhiteSummary(4);
    }

    public void manWhiteClicked5() {
        pieceWhiteSummary(5);
    }

    public void manWhiteClicked6() {
        pieceWhiteSummary(6);
    }

    public void manWhiteClicked7() {
        pieceWhiteSummary(7);
    }

    public void manWhiteClicked8() {
        pieceWhiteSummary(8);
    }

    public void manWhiteClicked9() {
        pieceWhiteSummary(9);
    }

    public void manWhiteClicked10() {
        pieceWhiteSummary(10);
    }

    public void manWhiteClicked11() {
        pieceWhiteSummary(11);
    }

    public void manWhiteClicked12() {
        pieceWhiteSummary(12);
    }

        //red pieces clicked
    public void manRedClicked1() {
        pieceRedSummary(1);
    }

    public void manRedClicked2() {
        pieceRedSummary(2);
    }

    public void manRedClicked3() {
        pieceRedSummary(3);
    }

    public void manRedClicked4() {
        pieceRedSummary(4);
    }

    public void manRedClicked5() {
        pieceRedSummary(5);
    }

    public void manRedClicked6() {
        pieceRedSummary(6);
    }

    public void manRedClicked7() {
        pieceRedSummary(7);
    }

    public void manRedClicked8() {
        pieceRedSummary(8);
    }

    public void manRedClicked9() {
        pieceRedSummary(9);
    }

    public void manRedClicked10() {
        pieceRedSummary(10);
    }

    public void manRedClicked11() {
        pieceRedSummary(11);
    }

    public void manRedClicked12() {
        pieceRedSummary(12);
    }

        //moves clicked
    public void moveClicked1() {

        moveSummary(1);
    }

    public void moveClicked2() {

        moveSummary(2);
    }

    public void moveClicked3() {

        moveSummary(3);
    }

    public void moveClicked4() {

        moveSummary(4);
    }

    public void moveClicked5() {

        moveSummary(5);
    }

    public void moveClicked6() {

        moveSummary(6);
    }

    public void moveClicked7() {

        moveSummary(7);
    }

    public void moveClicked8() {

        moveSummary(8);
    }

    public void moveClicked9() {

        moveSummary(9);
    }

    public void moveClicked10() {

        moveSummary(10);
    }

    public void moveClicked11() {

        moveSummary(11);
    }

    public void moveClicked12() {

        moveSummary(12);
    }

    public void moveClicked13() {

        moveSummary(13);
    }

    public void moveClicked14() {

        moveSummary(14);
    }

    public void moveClicked15() {

        moveSummary(15);
    }

    public void moveClicked16() {

        moveSummary(16);
    }

    public void moveClicked17() {

        moveSummary(17);
    }

    public void moveClicked18() {

        moveSummary(18);
    }

    public void moveClicked19() {

        moveSummary(19);
    }

    public void moveClicked20() {

        moveSummary(20);
    }

    public void moveClicked21() {

        moveSummary(21);
    }

    public void moveClicked22() {

        moveSummary(22);
    }

    public void moveClicked23() {

        moveSummary(23);
    }

    public void moveClicked24() {

        moveSummary(24);
    }

    public void moveClicked25() {

        moveSummary(25);
    }

    public void moveClicked26() {

        moveSummary(26);
    }

    public void moveClicked27() {

        moveSummary(27);
    }

    public void moveClicked28() {

        moveSummary(28);
    }

    public void moveClicked29() {

        moveSummary(29);
    }

    public void moveClicked30() {

        moveSummary(30);
    }

    public void moveClicked31() {

        moveSummary(31);
    }

    public void moveClicked32() {

        moveSummary(32);
    }


}
