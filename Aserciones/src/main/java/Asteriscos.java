
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String space = "";
        char car = '*';
        int i;
        int j,k;
        
        int max = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        
        //La figura estará bien construida con numeros impares
        
        if(max%2 == 0){
            max++;
        }
        
        for(i=1;i<=max+2;i=i+2){

            // Añadimos los espacios necesarios delante de cada linea

            for(k=max+2;k>i;k=k-2){
                System.out.print(" ");
            }

            // Mostramos los asteriscos

            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
            //Inferior
        
        for(i=max+2;i>=1;i=i-2){
            // Añadimos los espacios necesarios delante de cada linea
            for(k=i;k<=max+2;k=k+2){
                System.out.print(" ");
            }
            // Mostramos los asteriscos
            for(j=i-2;j>0;j--){
                System.out.print("*");
            }

            System.out.println();

        }

    }
    
    }

