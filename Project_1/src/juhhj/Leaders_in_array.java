package juhhj;

public class Leaders_in_array {
	
	void printLeaders(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == size ) 
                System.out.print(arr[i] + " ");
        }
    }
 
    
    public static void main(String[] args)
    {
    	Leaders_in_array lead = new Leaders_in_array();
        int arr[] = new int[]{7, 10, 4, 10, 6, 5, 2};
        int n = arr.length;
        lead.printLeaders(arr, n);
    }

}
