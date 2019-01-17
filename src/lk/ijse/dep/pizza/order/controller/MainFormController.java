package lk.ijse.dep.pizza.order.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public ImageView btn_Back;
    public ImageView img_Manage_Pizza;
    public ImageView img_Customer;
    public ImageView img_Place_Order;
    public ImageView img_View_Order;

    public void btn_back_Action(MouseEvent mouseEvent) {
    }

    public void img_Manage_Pizza_Action(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/lk/ijse/dep/pizza/order/view/ManagePizza.fxml"));
        Scene scene= new Scene(root);
        Stage primaryStage = (Stage) img_Manage_Pizza.getScene().getWindow();
        primaryStage.setScene(scene);
    }

    public void img_Customer_Action(MouseEvent mouseEvent) throws IOException {
        Parent root =  FXMLLoader.load(getClass().getResource("/lk/ijse/dep/pizza/order/view/CustomerManage.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = (Stage)img_Customer.getScene().getWindow();
        primaryStage.setScene(scene);
    }

    public void img_Place_Order_Action(MouseEvent mouseEvent) throws IOException {
        Parent root =  FXMLLoader.load(getClass().getResource("/lk/ijse/dep/pizza/order/view/PlaceOrder.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = (Stage)img_Place_Order.getScene().getWindow();
        primaryStage.setScene(scene);
    }

    public void img_View_Order_Action(MouseEvent mouseEvent) throws IOException {
        Parent root =  FXMLLoader.load(getClass().getResource("/lk/ijse/dep/pizza/order/view/ViewOrder.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = (Stage)img_View_Order.getScene().getWindow();
        primaryStage.setScene(scene);
    }
}
