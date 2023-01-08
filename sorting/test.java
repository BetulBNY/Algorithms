/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tryf;

public class test {
    
    public static void main(String[] args) {
        
        int[] array= new int[12];
        for(int i=0;i<array.length; i++)
        {
           array[i]=(int)Math.floor(Math.random()*100);
        }
        
        System.out.println("Unsorted array:");
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println("");
        
        ////////////////
        //Selection sort 
        /*
        sorting selectsort= new sorting();
        selectsort.selection_sort( array );
        
        System.out.println("After sorted");
        for(int i=0;i<array.length; i++)
        {
            System.out.print(array[i]+"\t");
        }
        */
        
        ////////////////
        //bubble sort
        
        sorting bubbles=new sorting();
        bubbles.bubble_Sort(array);
          System.out.println("After bubbled:");
      
        for(int i=0;i<array.length; i++)
        {
            System.out.print(array[i]+ "\t");
        }
        
        

        
    }
    
    
    
    
    
    
    
    
    
    
}
