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
public class Main {
    
    public static void main(String[] args) {
        //Shape cir = new Circle();
        //Shape redCir = new RedShape(new Circle());
        
        //cir.draw();
       // redCir.draw();
       Shape sh = new RedShape(new BlueShape(               
               new BlueShape(new RedShape(
                       new RedShape(new RedShape(new Circle()))))));
       
       sh.draw();
        
      
    }
    
}
