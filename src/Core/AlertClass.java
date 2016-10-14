package Core;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Created by Mummitrollet on 13.10.2016.
 */
public class AlertClass {

    @FXML TextField textField_xName, textField_oName;
    @FXML Label player1_Label, player2_Label;

    public AlertClass(TextField textField_xName, TextField textField_oName, Label player1_Label
                            ,Label player2_Label){

        this.textField_xName = textField_xName;
        this.textField_oName = textField_oName;
        this.player1_Label = player1_Label;
        this.player2_Label = player2_Label;
    }

    public void player_X_Won(Rules rules){

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("You win!");
        alert.setContentText(textField_xName.getText() + " is the winner!");
        rules.getRefresh();
        player1_Label.setText("Wins: " + String.valueOf(rules.getPlayer1Score()));
        alert.showAndWait();

    }

    public void player_O_Won(Rules rules){

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("You win!");
        alert.setContentText(textField_oName.getText() + " is the winner!");
        rules.getRefresh();
        player2_Label.setText("Wins: " + String.valueOf(rules.getPlayer2Score()));
        alert.showAndWait();
    }

    public static void getAboutText(){

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setContentText("This TicTacToe is made by Shohaib");
        alert.show();
    }

}
