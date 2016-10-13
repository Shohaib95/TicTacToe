package Controllers;

import Core.AlertClass;
import Core.Rules;
import Core.Visual;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    //objekter relatert til GUI
    @FXML Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    @FXML TextField textField_xName, textField_oName;
    @FXML Canvas canvas;

    //globale objectreferanser
    Rules rules;
    Visual visual;
    AlertClass alert;

    private GraphicsContext gc;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        gc = canvas.getGraphicsContext2D();

        rules = new Rules(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        visual = new Visual();
        alert = new AlertClass(textField_xName, textField_oName);
    }

    public void onButton1Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button1);
        System.out.println("1");
    }

    public void onButton2Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button2);
        System.out.println("2");
    }

    public void onButton3Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button3);
        System.out.println("3");
    }

    public void onButton4Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button4);
        System.out.println("4");
    }

    public void onButton5Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button5);
        System.out.println("5");
    }

    public void onButton6Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button6);
        System.out.println("6");
    }

    public void onButton7Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button7);
        System.out.println("7");
    }

    public void onButton8Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button8);
        System.out.println("8");
    }

    public void onButton9Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button9);
        System.out.println("9");
    }
}
