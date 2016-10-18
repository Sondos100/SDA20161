/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aashgar
 */
class Manager implements Employee{
    private String name;
    private double sal;
    private Manager manager;
    List<Employee> emps;

    public Manager(String name, double sal) {
        this.name = name;
        this.sal = sal;
        emps = new ArrayList();
    }

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
    
    public void addEmployee(Employee emp){
        emp.setManager(this);
        emps.add(emp);
    }
    
    public void removeEmployee(Employee emp){
        emp.setManager(null);
        emps.remove(emp);
    }
    
    public void printEmployee(){
        System.out.println("Employees of manager " + name);
        for(Employee emp : emps){
            System.out.println(emp);
            if(emp instanceof Manager){
                ((Manager) emp).printEmployee();
            }
        }
    }

    @Override
    public String toString() {
        String manName;
        if(manager == null) manName = "No manager";
        else manName = manager.getName();
        return "Manager{" + "name=" + name + ", sal=" + sal + ", manager=" + manName + '}';
    }

}
