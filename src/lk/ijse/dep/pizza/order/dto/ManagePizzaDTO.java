package lk.ijse.dep.pizza.order.dto;

public class ManagePizzaDTO {
    private int pizza_id;
    private String flavor;
    private String pizza_size;
    private int order_id;
    private double unit_price;

    public ManagePizzaDTO() {
    }

    public ManagePizzaDTO(int pizza_id, String flavor, String pizza_size, int order_id, double unit_price) {
        this.pizza_id = pizza_id;
        this.flavor = flavor;
        this.pizza_size = pizza_size;
        this.order_id = order_id;
        this.unit_price = unit_price;
    }

    public int getPizza_id() {
        return pizza_id;
    }

    public void setPizza_id(int pizza_id) {
        this.pizza_id = pizza_id;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getPizza_size() {
        return pizza_size;
    }

    public void setPizza_size(String pizza_size) {
        this.pizza_size = pizza_size;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    @Override
    public String toString() {
        return "ManagePizzaDTO{" +
                "pizza_id=" + pizza_id +
                ", flavor='" + flavor + '\'' +
                ", pizza_size='" + pizza_size + '\'' +
                ", order_id=" + order_id +
                ", unit_price=" + unit_price +
                '}';
    }
}
