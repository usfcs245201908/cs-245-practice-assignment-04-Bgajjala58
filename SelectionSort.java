import java.util.*;
public class SelectionSort implements SortingAlgorithm
{


public void sort(int [] a){

        int n = a.length; 
    
        
        for (int i = 0; i < n-1; i++) 
        { 
            
           int min = i; 
            for (int x = i+1; x < n; x++) 
                if (a[x] < a[min]) 
                    min = x; 
            
            int temp = a[min]; 
            a[min] = a[i]; 
            a[i] = temp; 
        } 

}
}