package src.Restaurant.Employees;
import src.Restaurant.Utilities.WorkingHours;

public abstract class Employees {

    private String name;
    private String ID;
    private WorkingHours wh;
    private int salary;

   public abstract int salary();

    public int getSalary() {
        return salary;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public WorkingHours getWh() {
        return wh;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWh(WorkingHours wh) {
        this.wh = wh;
    }

    @Override
    public String toString() {
        return String.format("%20s%20s%5s%d", ID, name, wh.toString(), salary);
    }
}