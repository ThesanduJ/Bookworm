package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.Bo.custom.Boimpl.UserBoImpl;
import lk.ijse.Bo.custom.UserBo;
import lk.ijse.dto.UserDto;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserLoginFormController {

    public AnchorPane root1;
    public JFXButton btnBack;
    @FXML
    private JFXButton btnLogIn;

    @FXML
    private JFXButton btnRegister;

    @FXML
    private CheckBox checkBoxPw;

    @FXML
    private PasswordField hiddenTxtPassword;

    @FXML
    private TextField showTextPw;

    @FXML
    private TextField txtUserName;
    public static int userId;
    private UserBo userBo = new UserBoImpl();

    @FXML
    void btnLogInOnAction(ActionEvent event) {

        login();

    }

    private void fillProfileData() {
       UserProfileFormController.setValue(txtUserName.getText());
    }

    @FXML
    void btnRegisterOnAction(ActionEvent event) {

        AnchorPane anchorPane = null;
        try {
            anchorPane = FXMLLoader.load(getClass().getResource("/view/User/User_register_form.fxml"));
            Scene scene = new Scene(anchorPane);
            Stage stage = (Stage) root1.getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void checkBoxPwOnAction(ActionEvent event) {
        if (checkBoxPw.isSelected()){
            showTextPw.setText(hiddenTxtPassword.getText());
            showTextPw.setVisible(true);
            hiddenTxtPassword.setVisible(false);
        }
        else{
            hiddenTxtPassword.setText(showTextPw.getText());
            hiddenTxtPassword.setVisible(true);
            showTextPw.setVisible(false);
        }

    }


    void login() {
        try {
            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/User/User_dashboard_form.fxml"));
            Scene scene = new Scene(anchorPane);
            Stage stage = (Stage) root1.getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            fillProfileData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void btnBackOnAction(ActionEvent actionEvent) {
        AnchorPane anchorPane = null;
        try {
            anchorPane = FXMLLoader.load(getClass().getResource("/view/loging_form.fxml"));
            Scene scene = new Scene(anchorPane);
            Stage stage = (Stage) root1.getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            fillProfileData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}


