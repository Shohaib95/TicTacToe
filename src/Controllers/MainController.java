package Controllers;

import Core.AlertClass;
import Core.FileHandler;
import Core.Rules;
import Core.Visual;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    //objekter relatert til GUI
    @FXML Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    @FXML TextField textField_xName, textField_oName;
    @FXML Canvas canvas;
    @FXML Label player1_Label;
    @FXML Label player2_Label;

    //globale objectreferanser
    Rules rules;
    Visual visual;
    AlertClass alert;
    FileHandler fileHandler;

    private GraphicsContext gc;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        gc = canvas.getGraphicsContext2D();

        rules = new Rules(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        visual = new Visual(textField_xName, textField_oName, gc);
        alert = new AlertClass(textField_xName, textField_oName, player1_Label, player2_Label);
        fileHandler = new FileHandler(textField_xName, textField_oName);


        textField_xName.setOnKeyPressed(event->{

            if (event.getCode() == KeyCode.ENTER){

              //  visual.resetCanvas();
                visual.setTextField_xName(textField_xName);
            }
        });

        textField_oName.setOnKeyPressed(event->{

            if (event.getCode() == KeyCode.ENTER) {

               // visual.resetCanvas();
                visual.setTextField_oName(textField_oName);

            }
        });
    }

    public void onButton1Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button1, visual);

    }

    public void onButton2Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button2, visual);

    }

    public void onButton3Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button3, visual);
    }

    public void onButton4Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button4, visual);

    }

    public void onButton5Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button5, visual);

    }

    public void onButton6Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button6, visual);

    }

    public void onButton7Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button7, visual);

    }

    public void onButton8Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button8, visual);

    }

    public void onButton9Click(ActionEvent actionEvent) {

        rules.getTurns(alert, button9, visual);
    }

    public void onSaveClick(ActionEvent actionEvent) {

        fileHandler.saveScoreToFile(rules);
    }

    public void onCloseClick(ActionEvent actionEvent) {

        System.exit(0);
    }

    public void onRestartClick(ActionEvent actionEvent) {

        rules.getRefresh();
    }

    public void onAboutClick(ActionEvent actionEvent) {

        AlertClass.getAboutText();
    }
}
