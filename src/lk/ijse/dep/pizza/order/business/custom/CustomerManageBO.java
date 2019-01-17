package lk.ijse.dep.pizza.order.business.custom;

import lk.ijse.dep.pizza.order.business.SuperBO;
import lk.ijse.dep.pizza.order.dto.CustomerManageDTO;
import lk.ijse.dep.pizza.order.entity.CustomerManage;

import java.sql.SQLException;
import java.util.List;

public interface CustomerManageBO extends SuperBO {

    List<CustomerManageDTO> getCustomers() throws Exception;

    boolean createCustomer(CustomerManageDTO dto) throws Exception;

    boolean updateCustomer(CustomerManageDTO dto) throws Exception;

    boolean deleteCustomer(int customerID) throws Exception;

    CustomerManageDTO findCustomer(int id) throws Exception;
}
