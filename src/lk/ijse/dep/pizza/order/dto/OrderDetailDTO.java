package lk.ijse.dep.pizza.order.dto;

public class OrderDetailDTO {
    private int pizza_id;
    private String flavor;
    private int pizza_size;
    private Double unit_price;
    private int qty;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(int pizza_id, String flavor, int pizza_size, Double unit_price, int qty) {
        this.pizza_id = pizza_id;
        this.flavor = flavor;
        this.pizza_size = pizza_size;
        this.unit_price = unit_price;
        this.qty = qty;
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

    public int getPizza_size() {
        return pizza_size;
    }

    public void setPizza_size(int pizza_size) {
        this.pizza_size = pizza_size;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "OrderDetailDTO{" +
                "pizza_id=" + pizza_id +
                ", flavor='" + flavor + '\'' +
                ", pizza_size=" + pizza_size +
                ", unit_price=" + unit_price +
                ", qty=" + qty +
                '}';
    }
}
