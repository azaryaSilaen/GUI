package piggybank;/*
Author: Azarya Silaen
 */

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PiggyBankController {

    public TextField penniesTxt;
    public TextField nicklesTxt;
    public TextField dimesTxt;
    public TextField quartersTxt;
    public Label lbTotalAmount;
    private double pennies = 0;
    private double nickles = 0;
    private double dimes = 0;
    private double quarters = 0;
    private boolean checker;
    private int penniesNum = 0;
    private int nicklesNum = 0;
    private int dimesNum = 0;
    private int quartersNum = 0;

    public void NumberChecker() {

        //pennies

        checker = false;
        for (int j = 0; j < penniesTxt.getText().length(); j++) {
            checker = false;
            for (int i = 0; i <= 9; i++) {
                if (penniesTxt.getText().equals("")) {
                    break;
                } else if (penniesTxt.getText().substring(j, j+1).equals(String.valueOf(i))) {
                    checker = true;
                    break;
                }
            }
            if (!checker) {
                penniesTxt.setText((penniesTxt.getText().substring(0,j) + penniesTxt.getText().substring(j+1)));
                break;
            }
        }
        if (checker) {
            pennies = Integer.parseInt(penniesTxt.getText())*0.01;
            penniesNum = Integer.parseInt(penniesTxt.getText());
        }

        checker = false;
        //nickles
        for (int j = 0; j < nicklesTxt.getText().length(); j++) {
            checker = false;
            for (int i = 0; i <= 9; i++) {
                if (nicklesTxt.getText().equals("")) {
                    break;
                } else if (nicklesTxt.getText().substring(j, j+1).equals(String.valueOf(i))) {
                    checker = true;
                    break;
                }
            }
            if (!checker) {
                nicklesTxt.setText((nicklesTxt.getText().substring(0,j) + nicklesTxt.getText().substring(j+1)));
                break;
            }
        }
        if (checker) {
            nickles = Integer.parseInt(nicklesTxt.getText())*0.05;
            checker = false;
            nicklesNum = Integer.parseInt(nicklesTxt.getText());
        }


        //dimes
        for (int j = 0; j < dimesTxt.getText().length(); j++) {
            checker = false;
            for (int i = 0; i <= 9; i++) {
                if (dimesTxt.getText().equals("")) {
                    break;
                } else if (dimesTxt.getText().substring(j,j+1).equals(String.valueOf(i))) {
                    checker = true;
                    break;
                }
            }
            if (!checker) {
                dimesTxt.setText((dimesTxt.getText().substring(0,j) + dimesTxt.getText().substring(j+1)));
                break;
            }
        }
        if (checker) {
            dimes = Integer.parseInt(dimesTxt.getText())*0.1;
            dimesNum = Integer.parseInt(dimesTxt.getText());
            checker = false;
        }

        //quarters
        for (int j = 0; j < quartersTxt.getText().length(); j++) {
            checker = false;
        for (int i = 0; i <= 9; i++) {
            if (quartersTxt.getText().equals("")) {
                break;
            } else if (quartersTxt.getText().substring(j, j + 1).equals(String.valueOf(i))) {
                checker = true;
                break;
            }
        }
            if (!checker) {
               quartersTxt.setText((quartersTxt.getText().substring(0,j) + quartersTxt.getText().substring(j+1)));
                break;
            }
        }
        if (checker) {
                quarters = Integer.parseInt(quartersTxt.getText())*0.25;
                quartersNum = Integer.parseInt(quartersTxt.getText());
            }
            checker = false;
        }
    public void ClickOnAddCoinsButton() {
        pennies = 0;
        nickles = 0;
        dimes = 0;
        quarters = 0;

        NumberChecker();
        lbTotalAmount.setText("$" + String.format("%.2f",(pennies + nickles + dimes + quarters)));
        pennies = 0;
        nickles = 0;
        dimes = 0;
        quarters = 0;
    }

    public void ClickOnResetButton() {
        penniesTxt.setText("");
        nicklesTxt.setText("");
        dimesTxt.setText("");
        quartersTxt.setText("");
        pennies = 0;
        nickles = 0;
        dimes = 0;
        quarters = 0;
        penniesNum = 0;
        nicklesNum = 0;
        dimesNum = 0;
        quartersNum = 0;

        lbTotalAmount.setText("$");
    }

    public void ClickOnPennyVisual() {
        NumberChecker();
        pennies += 0.01;
        penniesNum++;
        penniesTxt.setText(String.valueOf(penniesNum));
        lbTotalAmount.setText("$" + String.format("%.2f",(pennies + nickles + dimes + quarters)));
    }

    public void ClickOnNickleVisual() {
        NumberChecker();
        nickles += 0.05;
        nicklesNum++;
        nicklesTxt.setText(String.valueOf(nicklesNum));
        lbTotalAmount.setText("$" + String.format("%.2f",(pennies + nickles + dimes + quarters)));
    }

    public void ClickOnDimeVisual(MouseEvent mouseEvent) {
        NumberChecker();
        dimes += 0.1;
        dimesNum++;
        dimesTxt.setText(String.valueOf(dimesNum));
        lbTotalAmount.setText("$" + String.format("%.2f",(pennies + nickles + dimes + quarters)));
    }

    public void ClickOnQuarterVisual(MouseEvent mouseEvent) {
        NumberChecker();
        quarters += 0.25;
        quartersNum++;
        quartersTxt.setText(String.valueOf(quartersNum));
        lbTotalAmount.setText("$" + String.format("%.2f",(pennies + nickles + dimes + quarters)));
    }
}
