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
public class Player {
   private int counter = 0;
   private int [] allPlayerMoves = new int[5];
   
   public void play(){
       
   }
   
   public void addPlay(int move) {
       allPlayerMoves[counter] = move;
       counter++;
   }

    public int[] getAllPlayerMoves() {
        return allPlayerMoves;
    }
   
   
}
