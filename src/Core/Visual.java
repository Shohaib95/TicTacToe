package Core;

import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Lighting;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * Created by Mummitrollet on 13.10.2016.
 */
public class Visual {

    @FXML TextField textField_xName;
    @FXML TextField textField_oName;
    private GraphicsContext gc;

    public Visual(TextField textField_xName, TextField textField_oName, GraphicsContext gc){

        this.textField_xName = textField_xName;
        this.textField_oName = textField_oName;
        this.gc = gc;
    }

    public void setTextField_xName(TextField textField_xName){
        this.textField_xName = textField_xName;
    }

    public void setTextField_oName(TextField textField_oName) {
        this.textField_oName = textField_oName;
    }


    public void resetCanvas(){

        gc.setEffect(null);
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());

    }


    public void getEffect(){

            gc.setFill(Color.AQUA);
            gc.setEffect(new DropShadow());
            gc.setEffect(new Lighting());
            gc.setFont(new Font("SERIF", 35));

    }

    public void showPlayer1Turn(){

        resetCanvas();
        getEffect();
        gc.fillText(textField_xName.getText() + "\n" + " Turn", 50, 50, 300);
    }

    public void showPlayer2Turn(){

        resetCanvas();
        getEffect();
        gc.fillText(textField_oName.getText() + "\n" + " Turn", 790, 50, 300);



    }
}
