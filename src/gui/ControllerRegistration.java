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
import java.sql.SQLException;

import static functions.Function.addNewAccount;

public class ControllerRegistration {
    @FXML
    private TextField textField_LoginReg;

    @FXML
    private ChoiceBox<String> choiceBox_Reg;

    private ObservableList<String> choiceBoxRegList = FXCollections.observableArrayList("Client", "Manager", "Provider");

    @FXML
    private void initialize(){
        choiceBox_Reg.setItems(choiceBoxRegList);
        choiceBox_Reg.setValue("Client");
    }

    public void registrationButtonClicked() throws IOException, SQLException {
        //System.out.println(textField_LoginReg.getText());
        addNewAccount(111, "112", "113");
        Stage secondaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../gui/login.fxml"));
        secondaryStage.setTitle("Registration");
        secondaryStage.setScene(new Scene(root, 500, 360));
        secondaryStage.show();
    }
}
