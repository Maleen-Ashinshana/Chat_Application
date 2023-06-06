package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public AnchorPane mainPane;
    public JFXTextField txtuserName;
    public static String userName;
    public static String host;
    public JFXTextField txtPassword;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        if(!txtuserName.getText().equals("")){
            userName = txtuserName.getText();
            if(!txtPassword.getText().equals("")){
                Stage log = (Stage) mainPane.getScene().getWindow();
                log.close();
                host = txtPassword.getText();
                Stage stage = new Stage();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/chatForm.fxml"))));
                stage.setResizable(false);
                stage.centerOnScreen();
                stage.show();
            }else{
                Stage log = (Stage) mainPane.getScene().getWindow();
                log.close();
                host = "localhost";
                Stage stage = new Stage();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/chatForm.fxml"))));
                stage.setResizable(false);
                stage.centerOnScreen();
                stage.show();
            }
        }else{
            txtuserName.setUnFocusColor(Paint.valueOf("#ff0000"));
        }
    }
}
