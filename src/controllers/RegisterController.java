/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author melan
 */
public class RegisterController implements Initializable {

    @FXML
    private VBox Inicio;
    @FXML
    private TextField tf_nombre;
    @FXML
    private TextField tf_apellidos;
    @FXML
    private TextField tf_username;
    @FXML
    private TextField tf_email;
    @FXML
    private PasswordField tf_password;
    @FXML
    private PasswordField tf_repassword;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onRegistrar(ActionEvent event) {
    }

    @FXML
    private void onAlreadyRegister(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));
        Parent root = loader.load();
        LoginController ac = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(e -> {
        });

        Stage myStage = (Stage) this.Inicio.getScene().getWindow();
        myStage.close();
    }
    
}
