package juhhj;

public class Xor {
	
	static int xorSum(int arr[], int n)
    {
         
        int bits = 0;

        for (int i = 0; i < n; ++i)
            bits |= arr[i];
     
        int ans = bits * (int)Math.pow(2, n-1);
     
        return ans;
    }

    public static void main(String[] args)
    {
         
        int arr[] = {5,1,6};
        int size = arr.length;
         
        System.out.print(xorSum(arr, size));
    }

}
