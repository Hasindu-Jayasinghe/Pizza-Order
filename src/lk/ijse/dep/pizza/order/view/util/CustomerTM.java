package lk.ijse.dep.pizza.order.view.util;

public class CustomerTM {
    private int id;
    private String name;
    private String address;
    private String contacNumber;

    public CustomerTM() {
    }

    public CustomerTM(int id, String name, String address, String contacNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contacNumber = contacNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "CustomerTM{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contacNumber='" + contacNumber + '\'' +
                '}';
    }
}