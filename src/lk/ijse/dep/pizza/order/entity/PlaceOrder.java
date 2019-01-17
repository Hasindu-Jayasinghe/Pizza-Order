package lk.ijse.dep.pizza.order.entity;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;

public class PlaceOrder extends SuperEntity {
    private int order_Id;
    private String pizza_size;
    private String flavor;
    private Date date;
    private Time time;
    private int Cus_Id;

    public PlaceOrder() {
    }

    public PlaceOrder(int order_Id, String pizza_size, String flavor, Date date, Time time, int cus_Id) {
        this.order_Id = order_Id;
        this.pizza_size = pizza_size;
        this.flavor = flavor;
        this.date = date;
        this.time = time;
        Cus_Id = cus_Id;
    }

    public int getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(int order_Id) {
        this.order_Id = order_Id;
    }

    public String getPizza_size() {
        return pizza_size;
    }

    public void setPizza_size(String pizza_size) {
        this.pizza_size = pizza_size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
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

    public int getCus_Id() {
        return Cus_Id;
    }

    public void setCus_Id(int cus_Id) {
        Cus_Id = cus_Id;
    }

    @Override
    public String toString() {
        return "PlaceOrder{" +
                "order_Id=" + order_Id +
                ", pizza_size='" + pizza_size + '\'' +
                ", flavor='" + flavor + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", Cus_Id=" + Cus_Id +
                '}';
    }
}
