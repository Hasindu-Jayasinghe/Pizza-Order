package lk.ijse.dep.pizza.order.entity;

public class ManagePizza extends SuperEntity {
    private int pizza_Id;
    private String flavor;
    private String size;
    private int order_Id;
    private Double unit_Price;

    public ManagePizza() {
    }

    public ManagePizza(int pizza_Id, String flavor, String size, int order_Id, Double unit_Price) {
        this.pizza_Id = pizza_Id;
        this.flavor = flavor;
        this.size = size;
        this.order_Id = order_Id;
        this.unit_Price = unit_Price;
    }

    public int getPizza_Id() {
        return pizza_Id;
    }

    public void setPizza_Id(int pizza_Id) {
        this.pizza_Id = pizza_Id;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(int order_Id) {
        this.order_Id = order_Id;
    }

    public Double getUnit_Price() {
        return unit_Price;
    }

    public void setUnit_Price(Double unit_Price) {
        this.unit_Price = unit_Price;
    }

    @Override
    public String toString() {
        return "ManagePizza{" +
                "pizza_Id=" + pizza_Id +
                ", flavor='" + flavor + '\'' +
                ", size='" + size + '\'' +
                ", order_Id=" + order_Id +
                ", unit_Price=" + unit_Price +
                '}';
    }
}