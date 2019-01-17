package lk.ijse.dep.pizza.order.dao.custom.impl;

import lk.ijse.dep.pizza.order.dao.CrudUtil;
import lk.ijse.dep.pizza.order.dao.custom.PlaceOrderDAO;
import lk.ijse.dep.pizza.order.entity.ManagePizza;
import lk.ijse.dep.pizza.order.entity.PlaceOrder;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlaceOrderDAOImpl implements PlaceOrderDAO {


    @Override
    public PlaceOrder save(PlaceOrder entity) throws Exception {

        PreparedStatement pstm = CrudUtil.getPreparedStatement("INSERT INTO place_order(pizza_size,flavor,date,time,cus_id) VALUES (?,?,?,?,?)",
                entity.getPizza_size(), entity.getFlavor(),entity.getDate(),entity.getTime(),entity.getCus_Id());
        int affectedRows = pstm.executeUpdate();

        if (affectedRows> 0){
            ResultSet rst = pstm.getGeneratedKeys();
            if (rst.next()){
                int id = rst.getInt(1);
                return new PlaceOrder(id,entity.getPizza_size(), entity.getFlavor(),entity.getDate(),entity.getTime(),entity.getCus_Id());
            }else{
                throw new RuntimeException("ID can't be generated");
            }
        }
        return null;
    }

    @Override
    public boolean update(PlaceOrder entity) throws Exception {
//
//        PreparedStatement pstm = CrudUtil.getPreparedStatement("UPDATE place_order SET pizza_size=?, flavor=?, order_id=?, unit_price=? WHERE id=?",
//                entity.getFlavor(), entity.getSize(), entity.getOrder_Id(), entity.getUnit_Price());
//
//        return pstm.executeUpdate() > 0;
        return true;
    }

    @Override
    public boolean delete(Integer key) throws Exception {
        PreparedStatement pstm = CrudUtil.getPreparedStatement("DELETE FROM place_order WHERE pizza_id=?", key);
        return pstm.executeUpdate() > 0;
    }

    @Override
    public PlaceOrder find(Integer key) throws Exception {
        PreparedStatement pstm = CrudUtil.getPreparedStatement("SELECT * FROM place_order WHERE pizza_id=?", key);
        ResultSet rst = pstm.executeQuery();
        PlaceOrder o = null;
        if (rst.next()) {
            int id = rst.getInt("order_id");
            String pizza_size = rst.getString("pizza_size");
            String flavor = rst.getString("flavor");
            Date date = rst.getDate("date");
            Time time = rst.getTime("time");
            int cus_id = rst.getInt("cus_id");

            o = new PlaceOrder(id,pizza_size,flavor, (java.sql.Date) date,time,cus_id);
        }
        return o;
    }

    @Override
    public List<PlaceOrder> findAll() throws Exception {
        PreparedStatement pstm = CrudUtil.getPreparedStatement("SELECT * FROM place_order");
        ResultSet rst = pstm.executeQuery();
        List<PlaceOrder> alPlaceOrder = new ArrayList<>();
        while (rst.next()) {
            int id = rst.getInt("order_id");
            String pizza_size = rst.getString("pizza_size");
            String flavor = rst.getString("flavor");
            java.sql.Date date = rst.getDate("date");
            Time time = rst.getTime("time");
            int cus_id = rst.getInt("cus_id");
            alPlaceOrder.add(new PlaceOrder(id, pizza_size,flavor, date,time,cus_id));
        }
        return alPlaceOrder;
    }
}


















