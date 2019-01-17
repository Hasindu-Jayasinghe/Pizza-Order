package lk.ijse.dep.pizza.order.business.custom.impl;

import lk.ijse.dep.pizza.order.business.Converter;
import lk.ijse.dep.pizza.order.business.custom.CustomerManageBO;
import lk.ijse.dep.pizza.order.dao.DAOFactory;
import lk.ijse.dep.pizza.order.dao.custom.CustomerManageDAO;
import lk.ijse.dep.pizza.order.dto.CustomerManageDTO;
import lk.ijse.dep.pizza.order.entity.CustomerManage;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerManageBOImpl implements CustomerManageBO {

    private CustomerManageDAO customerManageDAO;
    public CustomerManageBOImpl(){
        customerManageDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    }


    @Override
    public List<CustomerManageDTO> getCustomers() throws Exception {
        ArrayList<CustomerManageDTO> array = new ArrayList<>();
        List<CustomerManage> ecustomers = null;
            ecustomers = customerManageDAO.findAll();
        for (CustomerManage customer : ecustomers) {
            CustomerManageDTO cust = new CustomerManageDTO(customer.getCus_id(), customer.getName(), customer.getAddress(), customer.getContacNumber());
            array.add(cust);
        }
        return array;
    }

    @Override
    public boolean createCustomer(CustomerManageDTO dto) throws Exception {
        CustomerManage cust = new CustomerManage(dto.getId(), dto.getName(), dto.getAddress(), dto.getContacNumber());
        CustomerManage save = customerManageDAO.save(cust);
        if (save==null){
            return false;
        }return true;
    }

    @Override
    public boolean updateCustomer(CustomerManageDTO dto) throws Exception {
        CustomerManage cust = new CustomerManage(dto.getId(),dto.getName(),dto.getAddress(),dto.getContacNumber());

        return customerManageDAO.update(cust);
    }

    @Override
    public boolean deleteCustomer(int id) throws Exception {
       return  customerManageDAO.delete(id);

    }

    @Override
    public CustomerManageDTO findCustomer(int id) throws Exception {
        CustomerManage customer = customerManageDAO.find(id);
        CustomerManageDTO customerDTO = new CustomerManageDTO(customer.getCus_id(), customer.getName(), customer.getAddress(), customer.getContacNumber());
        return customerDTO;

    }
}