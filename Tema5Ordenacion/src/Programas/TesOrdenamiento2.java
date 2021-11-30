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
public class TesOrdenamiento2 {
    
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
    
    //METODO DE ORENAMIENTO RADIX
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
    
    //METODO DE ORDENAMIENTO SHELLSORT
    public static void Shellsort (int arreglo[]){
        int salto, aux, i,j,k;
           salto=arreglo.length/2;
              while (salto > 0 ){
                for(i= salto; i<arreglo.length; i++){
                    j=i-salto;
                    while(j>=0){
                        k=j + salto;
                        if(arreglo[j]<= arreglo[k]){
                            j=-1;
                        }else{
                            aux=arreglo[j];
                            arreglo[j]=arreglo[k];
                            arreglo[k]=aux;
                            j-=salto;
                        }
                            
                }
            }
                salto=salto/2;
        }
              System.out.println("Arreglo ordenado con shellsort");
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
