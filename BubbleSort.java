public class BubbleSort implements SortingAlgorithm
{
	

	public void sort(int [] a){

        int n = a.length; //For size
        for (int i = 0; i < n-1; i++) 
            for (int x = 0; x < n-i-1; x++) 
                if (a[x] > a[x+1]) //to swap
                {
                    int temp = a[x]; 
                    a[x] = a[x+1]; 
                    a[x+1] = temp; 
                } 

}

	
}