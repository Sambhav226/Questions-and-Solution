package juhhj;

public class gyf {
	
	void printLeaders(int arr[], int size)
    {
        for (int i = 0; i < size -1 ; i++)
        {
          
            for (int j = i ++; j < size; j++)
            {
                if (arr[i] > arr[j])
                	System.out.println(arr[i]);
                
                else if (j == size - 1) 
                    System.out.print(arr[j] + " ");
                
                else {
                	break;
                }
                	
            }
            
        }
    }
 
    public static void main(String[] args)
    {
        gyf lead = new gyf();
        int arr[] = new int[]{7, 10, 4, 10, 6, 5, 2};
        int n = arr.length;
        lead.printLeaders(arr, n);
    }

}
