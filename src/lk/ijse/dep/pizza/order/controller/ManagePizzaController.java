package lk.ijse.dep.pizza.order.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagePizzaController {
    public ImageView btn_Back;
    public JFXTextField txt_Order_Id;
    public JFXTextField txt_Pizza_id;
    public JFXTextField txt_Flavor;
    public JFXButton btn_Add;
    public JFXButton btn_Update;
    public Label txt_Pizza_Size;
    public JFXTextField txt_Pizza_Flavor;
    public JFXTextField txt_Unit_Price;
    public TableView tbl_Mange_Pizza;

    public void btn_Back_Action(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/lk/ijse/dep/pizza/order/view/MainForm.fxml"));
        Scene scene= new Scene(root);
        Stage primaryStage = (Stage) btn_Back.getScene().getWindow();
        primaryStage.setScene(scene);
    }

    public void btn_Add_Action(MouseEvent mouseEvent) {
    }

    public void btn_Update_Action(MouseEvent mouseEvent) {
    }
}
