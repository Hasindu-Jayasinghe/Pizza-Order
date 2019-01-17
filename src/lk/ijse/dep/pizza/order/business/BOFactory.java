package lk.ijse.dep.pizza.order.business;

import lk.ijse.dep.pizza.order.business.custom.impl.CustomerManageBOImpl;
import lk.ijse.dep.pizza.order.business.custom.impl.ManagePizzaBOImpl;
import lk.ijse.dep.pizza.order.business.custom.impl.PlaceOrderBOImpl;

public class BOFactory {

    private static BOFactory boFactory;

    public enum BOTypes{
        CUSTOMER_MANAGE,MANAGE_PIZZA,PLACE_ORDER;
    }

    private BOFactory(){

    }

    public static BOFactory getInstance(){
        if (boFactory == null){
            boFactory = new BOFactory();
        }
        return boFactory;
    }

    public <T extends SuperBO> T getBO(BOTypes boType){
        switch (boType){
            case CUSTOMER_MANAGE:
                return (T) new CustomerManageBOImpl();
            case MANAGE_PIZZA:
                return (T) new ManagePizzaBOImpl();
            case PLACE_ORDER:
                return (T) new PlaceOrderBOImpl();
            default:
                return null;
        }
    }


}