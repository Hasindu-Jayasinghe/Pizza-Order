package lk.ijse.dep.pizza.order.business.custom;

import lk.ijse.dep.pizza.order.business.SuperBO;
import lk.ijse.dep.pizza.order.dto.ManagePizzaDTO;

import java.sql.SQLException;
import java.util.List;

public interface ManagePizzaBO extends SuperBO {

    List<ManagePizzaDTO> getPizza() throws Exception;

    boolean createPizza(ManagePizzaDTO dto) throws Exception;

    boolean updatePizza(ManagePizzaDTO dto) throws Exception;

    boolean deletePizza(int pizza_id) throws Exception;

    ManagePizzaDTO findPizza(int pizza_id) throws Exception;
}
