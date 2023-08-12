package entities;

public class Customer {
    private String name;
    private int address;
    private static int autoId;
    private int id;

    public Customer(String name, int address) {
        this.id = ++ autoId;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

}
