/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.tictactoe;

/**
 *
 * @author josesosa
 */
public class Box {
    private String display;
    private int id;

    public Box(int tempId) {
        this.id = tempId;
        this.display= "" + tempId;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getID() {
        return id;
    }

    
    
    
    
    
    
    
}
