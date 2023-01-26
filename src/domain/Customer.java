package domain;

public class Customer {

    private int ID = 45;
    private boolean isNew = true;
    private float total = 35.0F;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if (ID >= 0) {
            this.ID = ID;
            System.out.println("Customer ID: " + getID());
        } else {
            System.out.println("Error. ID can`t be negative");
        }
    }

    public boolean isIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        if (isNew == false) {
            System.out.println("We already have you");
        } else {
            this.isNew = isNew;
            System.out.println("Is he new: " + isIsNew());
        }

    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        if (total >= 0) {
            this.total = total;
             System.out.println("Total purchases are: " + getTotal());
       } else {
            System.out.println("Error. Total number can`t be negative");
        }
    }
}
