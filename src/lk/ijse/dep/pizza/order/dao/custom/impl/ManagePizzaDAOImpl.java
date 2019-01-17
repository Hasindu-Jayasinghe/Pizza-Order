package lk.ijse.dep.pizza.order.dao.custom.impl;

import lk.ijse.dep.pizza.order.dao.CrudUtil;
import lk.ijse.dep.pizza.order.dao.custom.ManagePizzaDAO;
import lk.ijse.dep.pizza.order.entity.CustomerManage;
import lk.ijse.dep.pizza.order.entity.ManagePizza;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ManagePizzaDAOImpl implements ManagePizzaDAO {


    @Override
    public ManagePizza save(ManagePizza entity) throws Exception {

        PreparedStatement pstm = CrudUtil.getPreparedStatement("INSERT INTO pizza(flavor,pizza_size,order_id,unit_price) VALUES (?,?,?,?)",
                entity.getFlavor(), entity.getSize(),entity.getOrder_Id(),entity.getUnit_Price());
        int affectedRows = pstm.executeUpdate();

        if (affectedRows> 0){
            ResultSet rst = pstm.getGeneratedKeys();
            if (rst.next()){
                int id = rst.getInt(1);
                return new ManagePizza(id,entity.getFlavor(), entity.getSize(),entity.getOrder_Id(),entity.getUnit_Price());
            }else{
                throw new RuntimeException("ID can't be generated");
            }
        }
        return null;
    }

    @Override
    public boolean update(ManagePizza entity) throws Exception {

        PreparedStatement pstm = CrudUtil.getPreparedStatement("UPDATE pizza SET flavor=?, pizza_size=?, order_id=?, unit_price=? WHERE id=?",
                entity.getFlavor(), entity.getSize(), entity.getOrder_Id(), entity.getUnit_Price());

        return pstm.executeUpdate() > 0;
    }

    @Override
    public boolean delete(Integer key) throws Exception {
        PreparedStatement pstm = CrudUtil.getPreparedStatement("DELETE FROM pizza WHERE pizza_id=?", key);
        return pstm.executeUpdate() > 0;

    }

    @Override
    public ManagePizza find(Integer key) throws Exception {
        PreparedStatement pstm = CrudUtil.getPreparedStatement("SELECT * FROM pizza WHERE pizza_id=?", key);
        ResultSet rst = pstm.executeQuery();
        ManagePizza p = null;
        if (rst.next()) {
            int id = rst.getInt("id");
            String flavor = rst.getString("flavor");
            String pizza_size = rst.getString("pizza_size");
            int order_id = rst.getInt("order_id");
            Double unit_price = rst.getDouble("unit_price");
            p = new ManagePizza(id, flavor, pizza_size,order_id,unit_price);
        }
        return p;
    }

    @Override
    public List<ManagePizza> findAll() throws Exception {

        PreparedStatement pstm = CrudUtil.getPreparedStatement("SELECT * FROM pizza");
        ResultSet rst = pstm.executeQuery();
        List<ManagePizza> alPizza = new ArrayList<>();
        while (rst.next()) {
            int id = rst.getInt("pizza_id");
            String flavor = rst.getString("flavor");
            String pizza_size = rst.getString("pizza_size");
            int order_id = rst.getInt("order_id");
            Double unit_price = rst.getDouble("unit_price");
            alPizza.add(new ManagePizza(id, flavor,pizza_size, order_id,unit_price));
        }
        return alPizza;

    }
}

