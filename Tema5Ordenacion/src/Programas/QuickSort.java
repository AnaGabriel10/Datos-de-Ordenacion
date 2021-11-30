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
public class QuickSort  {
    
    public static void main(String []  args){
        int numero [] = {5,2,1,8,3,9,7};
        System.out.println("Arreglo Original");
            mostrar(numero);
            System.out.println("Arreglo Ordenado con QuickSort ");
            QuickSort(numero, 0, numero.length-1);
            mostrar(numero);
    }
    
   
    public static void  QuickSort(int A[], int izq, int der){
        int pivote= A[(izq + der)/2];
        int i= izq;
        int j = der;
        int aux;
        do{
            while(A[i] < pivote ){
                i++; } 
            while (A[j] > pivote ) {
                j--; }
            
            if(i<=j){
                aux = A[i];
                A[i]= A[j];
                A[j]= aux;
                i++;
                j--;
            }
        } while(i<=j);
               
        if(izq < j)
            QuickSort(A, izq, j);
        if(i< der)
            QuickSort(A, i, der);
    }
    public static void mostrar(int [] arreglo){
        int k;
        for(k=0; k<arreglo.length; k++){
            System.out.print("[" + arreglo[k] + "]");
        }
        System.out.println();
    } 
  
 }
    

