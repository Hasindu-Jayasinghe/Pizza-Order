package lk.ijse.dep.pizza.order.dao.custom.impl;

import lk.ijse.dep.pizza.order.dao.CrudUtil;
import lk.ijse.dep.pizza.order.dao.custom.CustomerManageDAO;
import lk.ijse.dep.pizza.order.entity.CustomerManage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public  class CustomerManageDAOImpl implements CustomerManageDAO {


    @Override
    public CustomerManage save(CustomerManage entity) throws Exception {
        PreparedStatement pstm = CrudUtil.getPreparedStatement("INSERT INTO customer(customer_name,address,contac_no) VALUES (?,?,?)",
                entity.getName(), entity.getAddress(),entity.getContacNumber());
        int affectedRows = pstm.executeUpdate();

        if (affectedRows> 0){
            ResultSet rst = pstm.getGeneratedKeys();
            if (rst.next()){
                int id = rst.getInt(1);
                return new CustomerManage(id,entity.getName(), entity.getAddress(),entity.getContacNumber());
            }else{
                throw new RuntimeException("ID can't be generated");
            }
        }
        return null;

    }

    @Override
    public boolean update(CustomerManage entity) throws Exception {
        PreparedStatement pstm = CrudUtil.getPreparedStatement("UPDATE customer SET customer_name=?, address=?, contac_no=? WHERE id=?",
                entity.getName(), entity.getAddress(), entity.getContacNumber());

        return pstm.executeUpdate() > 0;

    }

    @Override
    public boolean delete(Integer key) throws Exception {
        PreparedStatement pstm = CrudUtil.getPreparedStatement("DELETE FROM customer WHERE cus_id=?", key);
        return pstm.executeUpdate() > 0;

    }

    @Override
    public CustomerManage find(Integer key) throws Exception {
        PreparedStatement pstm = CrudUtil.getPreparedStatement("SELECT * FROM customer WHERE cus_id=?", key);
        ResultSet rst = pstm.executeQuery();
        CustomerManage c = null;
        if (rst.next()) {
            int id = rst.getInt("cus_id");
            String name = rst.getString("name");
            String address = rst.getString("address");
            String contacNumber = rst.getString("contac_no");
            c = new CustomerManage(id, name, address,contacNumber);
        }
        return c;
    }

    @Override
    public List<CustomerManage> findAll() throws Exception {

        PreparedStatement pstm = CrudUtil.getPreparedStatement("SELECT * FROM customer");
        ResultSet rst = pstm.executeQuery();
        List<CustomerManage> alCustomer = new ArrayList<>();
        while (rst.next()) {
            int id = rst.getInt("cus_id");
            String name = rst.getString("name");
            String address = rst.getString("address");
            String contacNumber = rst.getString("contac_no");
            alCustomer.add(new CustomerManage(id, name,address, contacNumber));
        }
        return alCustomer;



    }
}
