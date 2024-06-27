package com.oop.tableviewyamahaservicecenter;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
public class YamahaSceneController
{
    @javafx.fxml.FXML
    private TextField chasisnumberTextField;
    @javafx.fxml.FXML
    private TableColumn nameColumn;
    @javafx.fxml.FXML
    private TextField phonenumberTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TableColumn chasisnumberColumn;
    @javafx.fxml.FXML
    private TableColumn totalkmrunColumn;
    @javafx.fxml.FXML
    private TableColumn phonenumberColumn;
    @javafx.fxml.FXML
    private TextField totalkmrunTextField;
    @javafx.fxml.FXML
    private TextField searchTextField;
    @javafx.fxml.FXML
    private Label resultLabel;

    ArrayList<Client>ClientArrayList=new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<Client,String>("name"));
        chasisnumberColumn.setCellValueFactory(new PropertyValueFactory<Client,String>("chasisnumber"));
        phonenumberColumn.setCellValueFactory(new PropertyValueFactory<Client,String>("phonenumber"));
        totalkmrunColumn.setCellValueFactory(new PropertyValueFactory<Client,String>("totalkmrun"));


    }

    @javafx.fxml.FXML
    public void loadOnAction(ActionEvent actionEvent) {
        tableView.getItems().setAll(ClientArrayList);
    }

    @javafx.fxml.FXML
    public void saveOnAction(ActionEvent actionEvent) {
        String name= nameTextField.getText();
        String chasisnumber = chasisnumberTextField.getText();
        String phonenumber = phonenumberTextField.getText();
        int totalkmrun = Integer.parseInt(totalkmrunTextField.getText());

        if (phonenumber.length() != 11) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Phone Number");
            alert.setHeaderText(null);
            alert.setContentText("Phone number cannot be greater or less than 11 digits.");
            alert.showAndWait();
            return;
        }

        Client newClient=new Client(name,chasisnumber,phonenumber,totalkmrun);

     ClientArrayList.add(newClient);

    }

    @javafx.fxml.FXML
    public void searchOnAction(ActionEvent actionEvent) {
        String searchName = searchTextField.getText();
        for (Client client : ClientArrayList) {
            if (client.getName().equalsIgnoreCase(searchName)) {
                resultLabel.setText("Name: " + client.getName() + "\n" +
                        "Chasis Number: " + client.getChasisnumber() + "\n" +
                        "Phone Number: " + client.getPhonenumber() + "\n" +
                        "Total KM Run: " + client.getTotalkmrun());
                return;
            }
        }
        resultLabel.setText("No client found with the name: " + searchName);
    }
    }
