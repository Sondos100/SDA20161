/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.Applogic;

import java.util.Observable;

/**
 *
 * @author aashgar
 */
public class studentModel extends Observable{
    private Student aStudent;

    public Student getaStudent() {
        return aStudent;
    }

    public void setaStudent(Student aStudent) {
        this.aStudent = aStudent;
        setChanged();
        notifyObservers();
    }
    
}
