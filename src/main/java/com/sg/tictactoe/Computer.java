/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.tictactoe;

import java.util.Random;

/**
 *
 * @author josesosa
 */
public class Computer {
    Random rand = new Random();
    int counter=0;
    private int [] allCompMoves = new int[5];
    
    
    public int play(){
        
        int compChoice = rand.nextInt(App.possibleMoves.length);
        
  
        return App.possibleMoves[compChoice];
    }
    
    public void addPlay(int move) {
       allCompMoves[counter] = move;
       counter++;
   }

    public int[] getAllCompMoves() {
        return allCompMoves;
    }
    
   
}
