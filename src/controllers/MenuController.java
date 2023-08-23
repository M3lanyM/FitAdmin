/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author melan
 */
public class MenuController implements Initializable {

    @FXML
    private AnchorPane slider;
    @FXML
    private StackPane containerMenu;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Dashboard(MouseEvent event) throws IOException {
        System.out.println("clicked me!");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/.fxml"));
        containerMenu.getChildren().clear(); //limpiar
        containerMenu.getChildren().add(root);
    }

    @FXML
    private void Client(MouseEvent event) throws IOException {
        System.out.println("clicked me!");
        Parent root = FXMLLoader.load(getClass().getResource("/menuOptions/Client.fxml"));
        containerMenu.getChildren().clear(); //limpiar
        containerMenu.getChildren().add(root);
    }
}
