package Core;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Created by Mummitrollet on 13.10.2016.
 */
public class Rules {

    @FXML Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private int player1_Score;
    private int player2_Score;
    private boolean player_Turn = false;

    @Deprecated
    private boolean player1_win = false;

    @Deprecated
    private boolean player2_win = false;

    public Rules(Button button1, Button button2, Button button3, Button button4, Button button5, Button button6,
                    Button button7, Button button8, Button button9){
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
        this.button4 = button4;
        this.button5 = button5;
        this.button6 = button6;
        this.button7 = button7;
        this.button8 = button8;
        this.button9 = button9;

    }

    public int getPlayer1_Score(){
        return player1_Score;
    }

    public int getPlayer2_Score(){
        return player2_Score;
    }

    public void gameRules(AlertClass alert){

        //if player = (X)
        //horisontal retning
        if (button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")){
            player1_win = true;
            player1_Score++;
            player2_win = false;
            alert.player_X_Won();
        }

        if (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")){
            player1_win = true;
            player1_Score++;
            player2_win = false;
            alert.player_X_Won();
        }

        if (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")){
            player1_win = true;
            player1_Score++;
            player2_win = false;
            alert.player_X_Won();
        }//horisontal retning slutter her

        //vertikal retning starter her
        if (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")){
            player1_win = true;
            player1_Score++;
            player2_win = false;
            alert.player_X_Won();
        }

        if (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")){
            player1_win = true;
            player1_Score++;
            player2_win = false;
            alert.player_X_Won();
        }

        if (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")){
            player1_win = true;
            player1_Score++;
            player2_win = false;
            alert.player_X_Won();
        }//vertikal retning slutter her

        //skrå retninger starter her
        if (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")){
            player1_win = true;
            player1_Score++;
            player2_win = false;
            alert.player_X_Won();
        }

        if (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")) {
            player1_win = true;
            player1_Score++;
            player2_win = false;
            alert.player_X_Won();
        }//skrå retning slutter her

        //if player = (O)----------------------------------------------------------------------------------------------

        //horisontal retning
        if (button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")){
            player2_win = true;
            player2_Score++;
            player1_win = false;
            alert.player_O_Won();
        }

        if (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")){
            player2_win = true;
            player2_Score++;
            player1_win = false;
            alert.player_O_Won();
        }

        if (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")){
            player2_win = true;
            player2_Score++;
            player1_win = false;
            alert.player_O_Won();
        }//horisontal retning slutter her

        //vertikal retning starter her
        if (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")){
            player2_win = true;
            player2_Score++;
            player1_win = false;
            alert.player_O_Won();
        }

        if (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")){
            player2_win = true;
            player2_Score++;
            player1_win = false;
            alert.player_O_Won();
        }

        if (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")){
            player2_win = true;
            player2_Score++;
            player1_win = false;
            alert.player_O_Won();
        }//vertikal retning slutter her

        //skrå retninger starter her
        if (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")){
            player2_win = true;
            player2_Score++;
            player1_win = false;
            alert.player_O_Won();
        }

        if (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")) {
            player2_win = true;
            player2_Score++;
            player1_win = false;
            alert.player_O_Won();
        }//skrå retning slutter her
    }


    public void getRefresh(){

        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }


    public void getTurns(AlertClass alert, Button button){

        if(!player_Turn){
            player_Turn = true;
            button.setText("X");
            gameRules(alert);
        }else {
            player_Turn = false;
            button.setText("O");
            gameRules(alert);
        }
    }
}
