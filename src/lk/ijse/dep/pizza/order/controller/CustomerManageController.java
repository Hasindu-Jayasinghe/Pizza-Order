package lk.ijse.dep.pizza.order.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.dep.pizza.order.business.BOFactory;
import lk.ijse.dep.pizza.order.business.custom.CustomerManageBO;
import lk.ijse.dep.pizza.order.dto.CustomerManageDTO;
import lk.ijse.dep.pizza.order.view.util.CustomerTM;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class CustomerManageController {
    public ImageView btn_Back;
    public AnchorPane btnAdd;
    public JFXTextField txt_Customer_Id;
    public JFXTextField txt_Customer_Name;
    public JFXTextField txt_Address;
    public JFXTextField txt_Contac_Num;
    public TableView<CustomerTM> tbl_customer;
    public JFXButton btnDelete;
    public JFXButton btnNew;

    private CustomerManageBO customerManageBO = BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER_MANAGE);

    public void initialize() throws Exception {
        tbl_customer.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
        tbl_customer.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tbl_customer.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("address"));
        tbl_customer.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("contacNumber"));


        List<CustomerManageDTO> customersDB = customerManageBO.getCustomers();
        ObservableList<CustomerManageDTO> customerDTOS = FXCollections.observableArrayList(customersDB);
       ObservableList<CustomerTM> tblItems = FXCollections.observableArrayList();
        for(CustomerManageDTO customerDTO :customerDTOS)

    {
      tblItems.add(new CustomerTM(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getContacNumber()));
    }
     tbl_customer.setItems(tblItems);

        tbl_customer.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<CustomerTM>() {
            @Override
            public void changed(ObservableValue<? extends CustomerTM> observable, CustomerTM oldValue, CustomerTM selectedCustomer) {
                if (selectedCustomer == null) {

                    return;
                }
                txt_Customer_Id.(selectedCustomer.getId());
                txt_Customer_Name.setText(selectedCustomer.getName());
                txt_Address.setText(selectedCustomer.getAddress());
                txt_Contac_Num.setText(selectedCustomer.getContacNumber());


                txt_Customer_Id.setEditable(false);

                btnAdd.setDisable(false);
                btnDelete.setDisable(false);

            }
        });
}






    public void btn_Back_Action(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/lk/ijse/dep/pizza/order/view/MainForm.fxml"));
        Scene scene= new Scene(root);
        Stage primaryStage = (Stage) btn_Back.getScene().getWindow();
        primaryStage.setScene(scene);
    }

    public void btn_Add_Action(MouseEvent mouseEvent) {
        if (txt_Customer_Id.getText().trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Customer ID is empty", ButtonType.OK).showAndWait();
            txt_Customer_Id.requestFocus();
            return;
        } else if (txt_Customer_Name.getText().trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Customer Name is empty", ButtonType.OK).showAndWait();
            txt_Customer_Name.requestFocus();
            return;
        } else if (txt_Address.getText().trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Customer Address is empty", ButtonType.OK).showAndWait();
            txt_Address.requestFocus();
            return;
        } else if (txt_Contac_Num.getText().trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Customer Contac Number is empty", ButtonType.OK).showAndWait();
            txt_Contac_Num.requestFocus();
            return;
        }

        if (tbl_customer.getSelectionModel().isEmpty()) {
            // New

            ObservableList<CustomerTM> items = tbl_customer.getItems();
            for (CustomerTM customerTM : items) {
                if (customerTM.getId().equals(txt_Customer_Id.getText())) {
                    new Alert(Alert.AlertType.ERROR, "Duplicate Customer IDs are not allowed").showAndWait();
                    txt_Customer_Id.requestFocus();
                    return;
                }
            }

            CustomerTM customerTM = new CustomerTM(txt_Customer_Id);
            tbl_customer.getItems().add(customerTM);
            CustomerManageDTO customerDTO = new CustomerManageDTO(txt_Customer_Id.getText(), txt_Customer_Name.getText(), txt_Address.getText());
            boolean result = CustomerManageBO.createCustomer(customerDTO);

            if (result) {
                new Alert(Alert.AlertType.INFORMATION, "Customer has been saved successfully", ButtonType.OK).showAndWait();
                tbl_customer.scrollTo(customerTM);
            } else {
                new Alert(Alert.AlertType.ERROR, "Failed to save the customer", ButtonType.OK).showAndWait();
            }
         //   txt_Customer_Id.getText(), txt_Customer_Name.getText(), txt_Address.getText()
        }

        public void btn_Delete_Action (MouseEvent mouseEvent){
            Alert confirmMsg = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure to delete this customer?", ButtonType.YES, ButtonType.NO);
            Optional<ButtonType> buttonType = confirmMsg.showAndWait();

            if (buttonType.get() == ButtonType.YES) {
                String selectedCustomer = tbl_customer.getSelectionModel().getSelectedItem().getId();

                tbl_customer.getItems().remove(tbl_customer.getSelectionModel().getSelectedItem());
                boolean result = CustomerManageBO.deleteCustomer(selectedCustomer);
                if (!result) {
                    new Alert(Alert.AlertType.ERROR, "Failed to delete the customer", ButtonType.OK).showAndWait();
                } else {
                    reset();
                }
            }
        }

        public void btn_New_Action (MouseEvent mouseEvent){
            private void reset () {
                txt_Customer_Id.clear();
                txt_Customer_Name.clear();
                txt_Address.clear();
                txt_Customer_Id.requestFocus();
                txt_Customer_Id.setEditable(true);
                btnAdd.setDisable(false);
                btnDelete.setDisable(true);
                tbl_customer.getSelectionModel().clearSelection();
            }
      }

    }
}
