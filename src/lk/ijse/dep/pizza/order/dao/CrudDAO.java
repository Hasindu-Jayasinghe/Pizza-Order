package lk.ijse.dep.pizza.order.dao;

import lk.ijse.dep.pizza.order.entity.CustomerManage;
import lk.ijse.dep.pizza.order.entity.SuperEntity;

import java.util.List;
import java.util.Optional;

public interface CrudDAO <T extends SuperEntity, ID> extends SuperDAO  {
    T save (T entity) throws Exception;
    boolean update(T entity) throws  Exception;
    boolean delete(ID key) throws  Exception;
    T find(ID key)throws Exception;
    List<T> findAll() throws Exception;
}
