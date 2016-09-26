/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator2;

/**
 *
 * @author aashgar
 */
public class RedShape extends ShapeDecorator{
    
    public RedShape(Shape shape) {
        super(shape);
    }
    
    public void draw(){
        super.draw();
        setBorder();
    }
    
    private void setBorder(){
        System.out.println("Red!");
    }
}
