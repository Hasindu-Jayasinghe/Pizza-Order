package lk.ijse.dep.pizza.order.entity;

public class ViewOrderPK {
    private int pizza_id;
    private int order_id;

    public ViewOrderPK() {
    }

    public ViewOrderPK(int pizza_id, int order_id) {
        this.pizza_id = pizza_id;
        this.order_id = order_id;
    }

    public int getPizza_id() {
        return pizza_id;
    }

    public void setPizza_id(int pizza_id) {
        this.pizza_id = pizza_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    @Override
    public String toString() {
        return "ViewOrderPK{" +
                "pizza_id=" + pizza_id +
                ", order_id=" + order_id +
                '}';
    }
}
