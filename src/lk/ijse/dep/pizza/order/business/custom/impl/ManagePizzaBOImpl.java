package lk.ijse.dep.pizza.order.business.custom.impl;

import lk.ijse.dep.pizza.order.business.Converter;
import lk.ijse.dep.pizza.order.business.custom.ManagePizzaBO;
import lk.ijse.dep.pizza.order.dao.DAOFactory;
import lk.ijse.dep.pizza.order.dao.custom.ManagePizzaDAO;
import lk.ijse.dep.pizza.order.dto.CustomerManageDTO;
import lk.ijse.dep.pizza.order.dto.ManagePizzaDTO;
import lk.ijse.dep.pizza.order.entity.CustomerManage;
import lk.ijse.dep.pizza.order.entity.ManagePizza;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManagePizzaBOImpl implements ManagePizzaBO {

    private ManagePizzaDAO PizzaDAO;
    public ManagePizzaBOImpl(){
        PizzaDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    }

    @Override
    public List<ManagePizzaDTO> getPizza() throws Exception {
        ArrayList<ManagePizzaDTO> array = new ArrayList<>();
        List<ManagePizza> pizzas = null;
        pizzas = PizzaDAO.findAll();
        for (ManagePizza pizza : pizzas) {
            ManagePizzaDTO p = new ManagePizzaDTO(pizza.getPizza_Id(), pizza.getFlavor(), pizza.getSize(), pizza.getOrder_Id(),pizza.getUnit_Price());
            array.add(p);
        }
        return array;
    }

    @Override
    public boolean createPizza(ManagePizzaDTO dto) throws Exception {
        ManagePizza pizza = new ManagePizza(dto.getPizza_id(), dto.getFlavor(), dto.getPizza_size(), dto.getOrder_id(),dto.getUnit_price());
        ManagePizza save = PizzaDAO.save(pizza);
        if (save==null){
            return false;
        }return true;
    }

    @Override
    public boolean updatePizza(ManagePizzaDTO dto) throws Exception {
        ManagePizza pizza = new ManagePizza(dto.getPizza_id(),dto.getFlavor(),dto.getPizza_size(),dto.getOrder_id(),dto.getUnit_price());

        return PizzaDAO.update(pizza);
    }

    @Override
    public boolean deletePizza(int pizza_id) throws Exception {
        return  PizzaDAO.delete(pizza_id);
    }

    @Override
    public ManagePizzaDTO findPizza(int pizza_id) throws Exception {
        ManagePizza pizza = PizzaDAO.find(pizza_id);
        ManagePizzaDTO pizzaDTO = new ManagePizzaDTO(pizza.getPizza_Id(), pizza.getFlavor(), pizza.getSize(), pizza.getOrder_Id(), pizza.getUnit_Price());
        return pizzaDTO;
    }
}
