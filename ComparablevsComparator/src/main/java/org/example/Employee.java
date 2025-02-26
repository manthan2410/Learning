package org.example;

public class Employee implements Comparable<Employee>{
    private String name;
    private Integer id;
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Employee(String email,String name,Integer id){
        this.id =id;
        this.name=name;
        this.email=email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Employee o) {
        //for string compares below used compareTo else for int we can use -
        return this.name.compareTo(o.name);
    }
}
