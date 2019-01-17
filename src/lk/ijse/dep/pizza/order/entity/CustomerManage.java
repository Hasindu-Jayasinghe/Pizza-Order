package lk.ijse.dep.pizza.order.entity;

public class CustomerManage extends SuperEntity {
    private int Cus_id;
    private String name;
    private String address;
    private String contacNumber;

    public CustomerManage() {
    }

    public CustomerManage(int cus_id, String name, String address, String contacNumber) {
        Cus_id = cus_id;
        this.name = name;
        this.address = address;
        this.contacNumber = contacNumber;
    }

    public int getCus_id() {
        return Cus_id;
    }

    public void setCus_id(int cus_id) {
        Cus_id = cus_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContacNumber() {
        return contacNumber;
    }

    public void setContacNumber(String contacNumber) {
        this.contacNumber = contacNumber;
    }

    @Override
    public String toString() {
        return "CustomerManage{" +
                "Cus_id=" + Cus_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contacNumber='" + contacNumber + '\'' +
                '}';
    }
}
