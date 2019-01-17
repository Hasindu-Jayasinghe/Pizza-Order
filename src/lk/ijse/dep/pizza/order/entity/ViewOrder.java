package lk.ijse.dep.pizza.order.entity;

import java.text.DecimalFormat;

public class ViewOrder extends SuperEntity {
    private int order_Id;
    private int pizza_id;
    private String flavor;
    private int Qty;
    private Double unitPrice;
    private ViewOrderPK viewOrderPK;

    public ViewOrder() {
    }

    public ViewOrder(int order_Id, int pizza_id, String flavor, int qty, Double unitPrice, ViewOrderPK viewOrderPK) {
        this.order_Id = order_Id;
        this.pizza_id = pizza_id;
        this.flavor = flavor;
        Qty = qty;
        this.unitPrice = unitPrice;
        this.viewOrderPK = viewOrderPK;
    }

    public int getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(int order_Id) {
        this.order_Id = order_Id;
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
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public ViewOrderPK getViewOrderPK() {
        return viewOrderPK;
    }

    public void setViewOrderPK(ViewOrderPK viewOrderPK) {
        this.viewOrderPK = viewOrderPK;
    }

    @Override
    public String toString() {
        return "ViewOrder{" +
                "order_Id=" + order_Id +
                ", pizza_id=" + pizza_id +
                ", flavor='" + flavor + '\'' +
                ", Qty=" + Qty +
                ", unitPrice=" + unitPrice +
                ", viewOrderPK=" + viewOrderPK +
                '}';
    }
}