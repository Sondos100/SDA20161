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
public class Main {
    public static void main(String[] args) {
        Employee clerk = new Clerk(
                new FullTime(new PartTime(new FullTime(new PartTime(
                new PartTime(new Manager()))))));
        
        clerk.view();
    }
  
}
