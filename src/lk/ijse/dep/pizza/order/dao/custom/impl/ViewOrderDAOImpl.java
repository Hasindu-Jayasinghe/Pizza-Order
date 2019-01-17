package lk.ijse.dep.pizza.order.dao.custom.impl;

import lk.ijse.dep.pizza.order.dao.CrudUtil;
import lk.ijse.dep.pizza.order.dao.custom.ViewOrderDAO;
import lk.ijse.dep.pizza.order.entity.PlaceOrder;
import lk.ijse.dep.pizza.order.entity.ViewOrder;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViewOrderDAOImpl implements ViewOrderDAO {

    @Override
    public ViewOrder save(ViewOrder entity) throws Exception {
        return null;
    }

    @Override
    public boolean update(ViewOrder entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Integer key) throws Exception {
        return false;
    }

    @Override
    public ViewOrder find(Integer key) throws Exception {
        return null;
    }

    @Override
    public List<ViewOrder> findAll() throws Exception {
        PreparedStatement pstm = CrudUtil.getPreparedStatement("SELECT * FROM view_order");
        ResultSet rst = pstm.executeQuery();
        List<ViewOrder> alViewOrder = new ArrayList<>();
        while (rst.next()) {
            int id = rst.getInt("order_id");
            String pizza_size = rst.getString("pizza_size");
            String flavor = rst.getString("flavor");
            Date date = rst.getDate("date");
            Time time = rst.getTime("time");
            int cus_id = rst.getInt("cus_id");
            alViewOrder.add(new PlaceOrder(id, pizza_size,flavor, date,time,cus_id));
        }
        return alViewOrder;
    }
}
