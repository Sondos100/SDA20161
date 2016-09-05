/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author aashgar
 */
public class Experiment {
    private static Experiment anExperiment;
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    private Experiment(){};
    public static Experiment getExperiment(){
        if(anExperiment == null)
            anExperiment = new Experiment();
        
        return anExperiment;
    }
    
    
    
    
}
