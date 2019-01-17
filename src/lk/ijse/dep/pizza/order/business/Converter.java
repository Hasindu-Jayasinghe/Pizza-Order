package lk.ijse.dep.pizza.order.business;

import lk.ijse.dep.pizza.order.dto.CustomerManageDTO;
import lk.ijse.dep.pizza.order.dto.ManagePizzaDTO;
import lk.ijse.dep.pizza.order.dto.SuperDTO;
import lk.ijse.dep.pizza.order.entity.CustomerManage;
import lk.ijse.dep.pizza.order.entity.ManagePizza;
import lk.ijse.dep.pizza.order.entity.SuperEntity;

public class Converter {

//    public static <T extends SuperDTO> T getDTO(SuperEntity entity) {
//        if (entity instanceof CustomerManage) {
//            CustomerManage c = (CustomerManage) entity;
//            return (T) new CustomerManageDTO(c.getCus_id(), c.getName(), c.getAddress(), c.getContacNumber());
//        } else if (entity instanceof ManagePizza) {
//            ManagePizza i = (ManagePizza) entity;
//            return (T) new ManagePizzaDTO(i.getPizza_Id(), i.getFlavor(), i.getSize(), i.getOrder_Id(),);
//        } else {
//            throw new RuntimeException("This entity can't be converted to a DTO");
//        }
//    }

}
