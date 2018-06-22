/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.tictactoe;

import java.util.Scanner;

/**
 *
 * @author josesosa
 */
public class App {
    static Box[] allBoxes = new Box[9];
    static int[] possibleMoves = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int a;
    static boolean noWinnerYet = true;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        Player human = new Player();
        Computer computer = new Computer();
        int firstOrSecond=0;
      
        for (int i = 1; i<10;i++){
            Box box = new Box(i); 
            allBoxes[i-1] = box;  
        }
        
        System.out.println("Would you like to play first or second?");
        firstOrSecond= Integer.parseInt(scan.nextLine());
        
        while(noWinnerYet){
            if (firstOrSecond == 1){
                showDisplay();
                System.out.println("What is your selection?");
                a = Integer.parseInt(scan.nextLine());
                clearScreen();
                human.addPlay(a);
                allBoxes[a-1].setDisplay("X");
                removeElement(a);
                showDisplay();
                if (possibleMoves.length <4){
                    checkForWinner();
                }   
                if (noWinnerYet){
                    int computerChoice = computer.play();
                    computer.addPlay(computerChoice);
                    allBoxes[computerChoice-1].setDisplay("B");
                    removeElement(computerChoice);
                    showDisplay();
                    if (possibleMoves.length <4  ){
                        checkForWinner();
                    }  
                }
                

            }else if (firstOrSecond == 2){
                showDisplay();
                int computerChoice = computer.play();
                allBoxes[computerChoice-1].setDisplay("B");
                removeElement(computerChoice);
                if (possibleMoves.length <4){
                    checkForWinner();
                }   
                System.out.println("");
                showDisplay();
                if(noWinnerYet){
                    System.out.println("What is your selection?");
                    a = Integer.parseInt(scan.nextLine());
                    allBoxes[a-1].setDisplay("X");
                    removeElement(a);
                    if (possibleMoves.length <4){
                        checkForWinner();
                    }   
                    showDisplay();
                }

            }else{
                System.out.println("You've entered an invalid response!");
                return;
            }
        }
        
    }
    public static void showDisplay(){
        System.out.println("*************************");
        System.out.println(allBoxes[0].getDisplay()  + "    " + allBoxes[1].getDisplay()  + "    " + allBoxes[2].getDisplay() );
        System.out.println(allBoxes[3].getDisplay()  + "    " + allBoxes[4].getDisplay()  + "    " + allBoxes[5].getDisplay() );
        System.out.println(allBoxes[6].getDisplay()  + "    " + allBoxes[7].getDisplay()  + "    " + allBoxes[8].getDisplay() );
    }

    public static void removeElement(int id) {
        int[] tempArr = new int[possibleMoves.length - 1];
        int counter = 0;
        
        for(int i = 0; i < possibleMoves.length; i++) {
            if(possibleMoves[i] != id) {
                tempArr[counter] = possibleMoves[i];
                counter++;
            }   
        }
        
        possibleMoves = tempArr; 
        
    } 
    
    public static void checkForWinner() {
        if (allBoxes[0].getDisplay() == allBoxes[1].getDisplay() && allBoxes[0].getDisplay() == allBoxes[2].getDisplay() ){
            System.out.println(allBoxes[0].getDisplay() + " has won!");
            noWinnerYet = false;
            return;
        }
        
        if (allBoxes[0].getDisplay() == allBoxes[3].getDisplay() && allBoxes[0].getDisplay() == allBoxes[6].getDisplay() ){
            System.out.println(allBoxes[0].getDisplay() + " has won!");
            noWinnerYet = false;
            return;
        }
        
        if (allBoxes[0].getDisplay() == allBoxes[4].getDisplay() && allBoxes[0].getDisplay() == allBoxes[8].getDisplay() ){
            System.out.println(allBoxes[0].getDisplay() + " has won!");
            noWinnerYet = false;
            return;
        }
        
        if (allBoxes[1].getDisplay() == allBoxes[4].getDisplay() && allBoxes[1].getDisplay() == allBoxes[7].getDisplay() ){
            System.out.println(allBoxes[1].getDisplay() + " has won!");
            noWinnerYet = false;
            return;
        }
        
        if (allBoxes[2].getDisplay() == allBoxes[4].getDisplay() && allBoxes[2].getDisplay() == allBoxes[6].getDisplay() ){
            System.out.println(allBoxes[2].getDisplay() + " has won!");
            noWinnerYet = false;
            return;
        }
        
        if (allBoxes[2].getDisplay() == allBoxes[5].getDisplay() && allBoxes[2].getDisplay() == allBoxes[8].getDisplay() ){
            System.out.println(allBoxes[2].getDisplay() + " has won!");
            noWinnerYet = false;
            return;
        }
        
        if (allBoxes[3].getDisplay() == allBoxes[4].getDisplay() && allBoxes[3].getDisplay() == allBoxes[5].getDisplay() ){
            System.out.println(allBoxes[3].getDisplay() + " has won!");
            noWinnerYet = false;
            return;
        }
        
        if (allBoxes[6].getDisplay() == allBoxes[7].getDisplay() && allBoxes[6].getDisplay() == allBoxes[8].getDisplay() ){
            System.out.println(allBoxes[6].getDisplay() + " has won!");
            noWinnerYet = false;
            return;
        }
      
        
    }
    
    /*public static void clearScreen(){
        for(int i = 0; i<40; i ++){
            System.out.println("");
        }
    } */
    
    public final static void clearScreen()
{
    try
    {
        final String os = System.getProperty("os.name");

        if (os.contains("Windows"))
        {
            Runtime.getRuntime().exec("cls");
        }
        else
        {
            Runtime.getRuntime().exec("clear");
        }
    }
    catch (final Exception e)
    {
        //  Handle any exceptions.
    }
}
    
   
    /*
    
    public static void initialMove(){
     int initialMove=1;
        if(player.first){
            if (player.id == 1,3,7,9){
                comp.id = 5;

            } else if (player.id= 2,4,6,8){
                comp.id = rand()

            }else{
                 
            }
        }else {
            comp.id = random[1,3,7,9];
        }    
        
        return initialMove;
    }
    
    
    
    public static int optimizeCompChoice(){
        
        if(player.first){
            if(isPlayerAboutToWin){
                comp.id = isPlayerAboutToWin.location;
                
            }else{
                comp.id = threatenToWin.location;
            }
            
        }else{
            if (winningMoveAvailable){
                comp.id = winningMoveAvailable.location;
            }else{
                if (doubleWinningThreat){
                    comp.id = doubleWinningThreat.location;
                } else{
                    comp.id = threatenToWin.location; // you have to take into account that some threatenToWin locations can lose
                }
            }
            
        }
        
        
        */
        
        
    
    
    
    
}

