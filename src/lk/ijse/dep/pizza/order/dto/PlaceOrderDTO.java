package lk.ijse.dep.pizza.order.dto;

public class PlaceOrderDTO {

    private int pizza_id;
    private String flavor;
    private int qty;
    private Double unit_price;
    private Double total;

    public PlaceOrderDTO() {
    }

    public PlaceOrderDTO(int pizza_id, String flavor, int qty, Double unit_price, Double total) {
        this.pizza_id = pizza_id;
        this.flavor = flavor;
        this.qty = qty;
        this.unit_price = unit_price;
        this.total = total;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
