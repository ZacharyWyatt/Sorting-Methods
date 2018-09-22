package wyatt.zachary.lab.pkg8;

public class InsertionSort 
{
    public InsertionSort(int[] x)
    {
        printNumList(x,"Insertion Sort test set");
        
        //The sort, from Data Structures and the Java Collections Framework 3rd Ed., page 460
        for (int i = 1; i < x.length; i++)
            for (int k = i; k > 0 && x [k -1] > x [k]; k--)
        swap (x, k, k -1);    
        
        printNumList(x, "Insertion Sort Sorted");
    }
    
    private static void swap (int [] x, int a, int b) //Page 460
    {
        int t = x[a];
        x[a] = x[b];
        x[b] = t;
    } // method swap
    
    private static void printNumList(int[] x, String arrayName)
    {
        System.out.println("\n"+arrayName+":");
        
        for(int ctr = 0; ctr<x.length; ctr++)
        {
            System.out.print(x[ctr]+"  ");
        }      
        
        System.out.println();
    } // Method printNumList
            
}