package domain;

public class Customer {

    private int ID = 45;
    private boolean isNew = true;
    private float total = 35.0F;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = 15;
    }

    public boolean isIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = false;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = 30.0F;
    } 

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Is he new: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}
