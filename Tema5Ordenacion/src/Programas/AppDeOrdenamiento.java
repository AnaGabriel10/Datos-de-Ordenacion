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
public class AppDeOrdenamiento {
    public static void main(String [] arges){
     
        TesOrdenamiento2 ordenar = new TesOrdenamiento2();
        int numero [] = {5,2,1,8,3,9,7};
        System.out.println("Arreglo Original");
            ordenar.mostrar(numero);
            System.out.println("Arreglo Ordenado con QuickSort ");
            ordenar.QuickSort(numero, 0, numero.length-1);
            ordenar.mostrar(numero);
            
            System.out.println("Arreglo Original");
        ordenar.mostrar(numero);
        ordenar.Radix(numero);
        
        System.out.println("Arreglo Original");
        ordenar.mostrar(numero);
        ordenar.Shellsort(numero);
        
    }
    }
   
    
    

