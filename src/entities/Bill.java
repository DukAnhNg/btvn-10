package entities;

public class Bill extends Customer{
    private double oldStatic;
    private double newStatic;
    private double total;

    public Bill(String name, int address, double oldStatic, double newStatic, double total) {
        super(name, address);
        this.newStatic=newStatic;
        this.oldStatic=oldStatic;
        this.total=total;
    }

    public double getOldStatic() {
        return oldStatic;
    }

    public void setOldStatic(double oldStatic) {
        this.oldStatic = oldStatic;
    }

    public double getNewStatic() {
        return newStatic;
    }

    public void setNewStatic(double newStatic) {
        this.newStatic = newStatic;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "tên: " + getName() +
                ", số nhà: " + getAddress() +
                ", mã số công tơ: " + getId() +
                ", chỉ số cũ: " + oldStatic +
                ", chỉ số mới: " + newStatic +
                ", tổng tiền: " + total +
                '}';
    }
}
