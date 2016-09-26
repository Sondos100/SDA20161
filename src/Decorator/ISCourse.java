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
public class ISCourse extends Course{

    public ISCourse(University aUniversity) {
        super(aUniversity);
    }
    @Override
    public void aggregator(){
        super.aggregator();
        System.out.println("Information Systems Course ...");
    }
    
}
