/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author aashgar
 */
public class Clerk implements Employee{
    private String name;
    private double sal;
    private Manager manager;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return sal;
    }

    public void setSalary(double sal) {
        this.sal = sal;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        String manName;
        if(manager == null) manName = "No manager";
        else manName = manager.getName();
        return "Clark{" + "name=" + name + ", sal=" + sal + ", manager=" + manName + '}';
    }
    
    
}
