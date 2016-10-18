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
public interface Employee {
    void setName(String name);
    String getName();
    void setSalary(double sal);
    double getSalary();
    void setManager(Manager manager);
    Manager getManager();
}
