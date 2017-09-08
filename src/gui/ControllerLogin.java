package gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static functions.Function.connectionDB;


public class ControllerLogin {
    @FXML
    private TextField textFieldLogin;

    @FXML
    private ChoiceBox<String> choiceBoxLogin;


    @FXML
    private void initialize(){
        choiceBoxLogin.setItems(choiceBoxLoginList);
        choiceBoxLogin.setValue("Client");
    }

    private ObservableList<String> choiceBoxLoginList = FXCollections.observableArrayList("Client", "Manager", "Provider");

    public void loginButtonClicked() throws IOException, SQLException {
        connectionDB();

        //Stage secondaryStage = new Stage();
        //Parent root = FXMLLoader.load(getClass().getResource("../gui/client.fxml"));
        //secondaryStage.setTitle("Client");
        //secondaryStage.setScene(new Scene(root, 500, 360));
        //secondaryStage.show();

    }



    public void createNewAccButtonClicked() throws IOException {
        Stage secondaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../gui/registration.fxml"));
        secondaryStage.setTitle("Registration");
        secondaryStage.setScene(new Scene(root, 600, 211));
        secondaryStage.show();
    }



}
