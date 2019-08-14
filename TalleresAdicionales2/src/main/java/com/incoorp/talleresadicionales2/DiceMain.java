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
public class DiceMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PairOfDice pd = new PairOfDice(0, 0);
        pd.roll();
        pd.getPairOfDice();
    }
    
}
