package lk.ijse.dep.pizza.order.business.custom;

import lk.ijse.dep.pizza.order.business.SuperBO;

import java.util.ArrayList;

public interface ViewOrderBO extends SuperBO {

    public OrderDetailDTO findById(String id) throws Exception;

    public ArrayList<OrderDetailDTO> getAllOD() throws Exception;
}
