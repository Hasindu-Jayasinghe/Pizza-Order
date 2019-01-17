package lk.ijse.dep.pizza.order.dao;

import lk.ijse.dep.pizza.order.dao.custom.impl.CustomerManageDAOImpl;
import lk.ijse.dep.pizza.order.dao.custom.impl.ManagePizzaDAOImpl;
import lk.ijse.dep.pizza.order.dao.custom.impl.PlaceOrderDAOImpl;
import lk.ijse.dep.pizza.order.dao.custom.impl.ViewOrderDAOImpl;

public class DAOFactory {
    public enum  DAOTypes{
        CUSTOMER,PIZZA,PLACE_ORDER,VIEW_ORDER;
    }


    private static DAOFactory daoFactory;
    private DAOFactory(){


    }
    public static DAOFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    public<T> T getDAO(DAOTypes daoTypes){
        switch (daoTypes){
            case CUSTOMER:
                return (T) new CustomerManageDAOImpl();
            case PIZZA:
                return (T)new ManagePizzaDAOImpl();
            case PLACE_ORDER:
                return (T)new PlaceOrderDAOImpl();
            case VIEW_ORDER:
                return (T)new ViewOrderDAOImpl();
            default:
                return null;
        }

    }
}
