package Core;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Mummitrollet on 14.10.2016.
 */
public class FileHandler {

    @FXML TextField textField_xName;
    @FXML TextField textField_oName;

    public FileHandler(TextField textField_xName, TextField textField_oName){

        this.textField_xName = textField_xName;
        this.textField_oName = textField_oName;

    }

    public void saveScoreToFile(Rules rules){

        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showSaveDialog(null);
        if(file == null) {
            return;
        }

        try {

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Player1 Name: " + textField_xName.getText());
            printWriter.println("Player2 Name: " + textField_oName.getText());
            printWriter.println(textField_xName.getText() + "Score:  " + " " + String.valueOf(rules.getPlayer1Score()));
            printWriter.println(textField_oName.getText() + "Score:  " + " " + String.valueOf(rules.getPlayer2Score()));
            printWriter.close();

        }catch (Exception e) { //filenotfoundexception
            e.printStackTrace();
        }

    }
}
