/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

/**
 *
 * @author marcelino
 */
public class Radix {
    public static void main (String [] arges){
        int numero [] = {55,4,43,44,2,10};
        System.out.println("Arreglo Original");
        mostrar(numero);
        Radix(numero);
        
    
    }
    
    
    public static void Radix(int [] arreglo){
    int x, i, j;
    for(x=Integer.SIZE-1; x>=0; x--){
        int Aux [] = new int [arreglo.length];
        j=0;
        for(i=0; i<arreglo.length; i++){
            boolean mover =arreglo[i]<<x >= 0;
            
            if(x==0 ? !mover : mover){
            Aux[j]= arreglo[i];
            j++;
            
            }else {
                arreglo [i -j]=arreglo[i];
            }
        }
        for(i=j; i<Aux.length; i++){
          Aux[i]=arreglo[i-j];
        }  
        arreglo=Aux;
        
    }
        System.out.println("El arreglo ordenado con Radix");
    mostrar(arreglo);
        
    }
    
     public static void mostrar(int [] arreglo){
        int k;
        for(k=0; k<arreglo.length; k++){
            System.out.print("[" + arreglo[k] + "]");
        }
        System.out.println();
    } 
}
