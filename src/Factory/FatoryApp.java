/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author aashgar
 */
public class FatoryApp {
    public static void main(String[] args) {
        Student s1 = FactoryDP.getStudent("it");
        s1.view();
        Student s2 = FactoryDP.getStudent("eng");
        s2.view();
        s1 = FactoryDP.getStudent("art");
        s1.view();
    }
    
}
