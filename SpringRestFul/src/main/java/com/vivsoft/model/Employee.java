package com.vivsoft.model;

/**
 * Created with IntelliJ IDEA.
 * User: vivianvanzyl
 * Date: 6/16/14
 * Time: 5:01 PM
 */

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public Employee() {
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	StringBuilder sb = new StringBuilder();
    	sb.append("Id = ").append(id).append(" - ");
    	sb.append("Name = ").append(name).append(" - ");
    	sb.append("Salary = ").append(salary);
    	System.out.println("");
    	return sb.toString();
    }

}

