package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private PasswordField eT_cont;
    @FXML
    private TextField eT_contV;
    @FXML
    private TextField eT_email;
    @FXML
    private Button button_continuar;

    @FXML
    public void onContinuarClicked(){
        button_continuar.setText("BOTON PULSADO");
    }

    @FXML
    public void onCancelarClicked(){
        eT_cont.setText("");
        eT_email.setText("");
        eT_contV.setText("");
    }
   @FXML
    public void  onMostrarContOver(){
        eT_cont.setVisible(false);
        eT_contV.setText(eT_cont.getText());
        eT_contV.setVisible(true);
    }
    @FXML
    public void  onMostrarContNotOver(){
        eT_cont.setVisible(true);
        eT_contV.setVisible(false);
    }
}
