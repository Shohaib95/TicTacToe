package Core;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/**
 * Created by Mummitrollet on 13.10.2016.
 */
public class AlertClass {

    @FXML
    TextField textField_xName, textField_oName;

    public AlertClass(TextField textField_xName, TextField textField_oName){

        this.textField_xName = textField_xName;
        this.textField_oName = textField_oName;
    }

    public void player_X_Won(){

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("You win!");
        alert.setContentText(textField_xName.getText() + " is the winner!");

    }

    public void player_O_Won(){

    }

}
