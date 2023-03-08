package domain;

public class Employeer {
    private String name;
    private int age;
    private double salary;
    private String department;
    
    public Employeer(){}

    public Employeer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employeer(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: ").append(name);
        sb.append(", age: ").append(age);
        sb.append(", salary: ").append(salary);
        sb.append(", department: ").append(department);
        return sb.toString();
    }
    
    
}
