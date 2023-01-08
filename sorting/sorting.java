/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tryf;

public class sorting {
   
    
    //Selection sort
    public void selection_sort(int[] array)
    {
        
        for(int i=0; i<array.length; i++)
        {
            int minindex=i;
            for(int j=i+1; j<array.length; j++)
            {
                if(array[j]<array[minindex]){
                    minindex=j;
                }
                    
            }
            int temp=array[i];
            array[i]=array[minindex];
            array[minindex]=temp;
        }
    }
    
    //Bubble sort
    
    public void bubble_Sort(int[]array){
        boolean switched= true;
        int last=array.length;
        while(switched){
            switched=false;
            for(int i=1;i<last; i++)
            {
                if(i > 0 && array[i]<array[i-1])
                {
                    int temp=array[i-1];
                    array[i-1]=array[i];
                    array[i]=temp;
                    switched=true;
                }
            }
            last--;
        }
                
        
    }
    
    
    
    
    
    
    
    
    
    
}
