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
public class Course implements University{
    protected University aUniversity;
    public Course(University aUniversity){
        this.aUniversity = aUniversity;
    }
    @Override
    public void aggregator() {
        this.aUniversity.aggregator();
    }
    
}
