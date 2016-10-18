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
public class Test {
    public static void main(String[] args) {
        Clerk c1 = new Clerk();
        c1.setName("Ali");
        c1.setSalary(5414);
        
        Clerk c2 = new Clerk();
        c2.setName("Anas");
        c2.setSalary(20);
        
        Manager m = new Manager ("Mohammed", 1000);
        m.addEmployee(c1);
        m.addEmployee(c2);
        
        m.printEmployee();
        
        Manager m2 = new Manager ("Ahmed", 1201);
        Clerk e1 = new Clerk ();
        e1.setName("E1");
        e1.setSalary(554);
        
        Clerk e2 = new Clerk();
        e2.setName("E2");
        e2.setSalary(700);
        
        m2.addEmployee(e1);
        m2.addEmployee(e2);
        
        System.out.println();
        
        m.addEmployee(m2);
        m.printEmployee();
    }
}
