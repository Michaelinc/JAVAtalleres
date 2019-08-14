/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incoorp.talleresadicionales2;

/**
 *
 * @author michael
 */
public class PairOfDice implements Dice{

    private int dice1;
    private int dice2;

    public PairOfDice(int dice1, int dice2) {
        this.dice1 = dice1;
        this.dice2 = dice2;
    }
    
    
    
    @Override
    public void roll(){
        dice1 = (int) (Math.random()*(7-1));
        dice2 = (int) (Math.random()*(7-1));        
    }

    public int getDice1() {
        return dice1;
    }

    public int getDice2() {
        return dice2;
    }
    
    public void getPairOfDice(){
        System.out.println("Dice1 : "+getDice1()+"\n"
                            +"Dice2 : "+getDice2());
    }
    
}
