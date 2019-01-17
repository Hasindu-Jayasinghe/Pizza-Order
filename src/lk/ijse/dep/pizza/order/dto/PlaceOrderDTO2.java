package lk.ijse.dep.pizza.order.dto;

import java.sql.Time;
import java.util.Date;

public class PlaceOrderDTO2 {
    private int order_id;
    private int pizza_id;
    private int cus_id;
    private String customer_name;
    private String flavor;
    private String pizza_size;
    private Double unit_price;
    private int qty;
    private Date date;
    private Time time;

    public PlaceOrderDTO2() {
    }

    public PlaceOrderDTO2(int order_id, int pizza_id, int cus_id, String customer_name, String flavor, String pizza_size, Double unit_price, int qty, Date date, Time time) {
        this.order_id = order_id;
        this.pizza_id = pizza_id;
        this.cus_id = cus_id;
        this.customer_name = customer_name;
        this.flavor = flavor;
        this.pizza_size = pizza_size;
        this.unit_price = unit_price;
        this.qty = qty;
        this.date = date;
        this.time = time;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getPizza_id() {
        return pizza_id;
    }

    public void setPizza_id(int pizza_id) {
        this.pizza_id = pizza_id;
    }

    public int getCus_id() {
        return cus_id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PlaceOrderDTO2{" +
                "order_id=" + order_id +
                ", pizza_id=" + pizza_id +
                ", cus_id=" + cus_id +
                ", customer_name='" + customer_name + '\'' +
                ", flavor='" + flavor + '\'' +
                ", pizza_size='" + pizza_size + '\'' +
                ", unit_price=" + unit_price +
                ", qty=" + qty +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}
