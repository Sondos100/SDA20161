/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator1;

/**
 *
 * @author aashgar
 */
public class Clerk implements Employee{
    protected Employee employee;
    
    public Clerk(Employee employee){
        this.employee = employee;
        
    }
    
    @Override
    public void view() {
        this.employee.view();
      //  System.out.println("Clerk");
    }
    
}
