/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author aashgar
 */
public class SECourse extends Course{

    public SECourse(University aUniversity) {
        super(aUniversity);
    }
    @Override
    public void aggregator(){
        super.aggregator();
        System.out.println("Software Engineering ...");
    }
    
}
