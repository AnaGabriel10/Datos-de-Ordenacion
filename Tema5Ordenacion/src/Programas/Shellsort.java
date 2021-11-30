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
public class Shellsort {
    
    public static void main(String [] arges){
       int numero [] = {5,2,1,8,3,9,7};
        System.out.println("Arreglo Original");
        mostrar(numero);
        Shellsort(numero);
        
    }
    
    
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
