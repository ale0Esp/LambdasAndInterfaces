package domain;

import java.util.Date;

public class Person implements Comparable<Person>{
    private int id;
    private String name;
    private Integer age;
    private Date birthdate;
    
    public Person(){}

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        //this.birthdate = date;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(id: ").append(id);
        sb.append(", name: ").append(name);
        sb.append(", age: ").append(age);
        sb.append(" )");
        return sb.toString();
    }

    @Override
    public int compareTo(Person o) {
        return (int)this.name.compareTo(o.name);
    }
    public int compareAge(Person o) {
        return (int)this.getAge().compareTo(o.getAge());
    }
  
}
