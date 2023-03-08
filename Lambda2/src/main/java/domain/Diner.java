package domain;

public class Diner {
    String name;
    double amount;
    int numTable;

    public Diner() {
    }

    public Diner(String name, double amount, int numTable) {
        this.name = name;
        this.amount = amount;
        this.numTable = numTable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNumTable() {
        return numTable;
    }

    public void setNumTable(int numTable) {
        this.numTable = numTable;
    }
    
    
    
}
