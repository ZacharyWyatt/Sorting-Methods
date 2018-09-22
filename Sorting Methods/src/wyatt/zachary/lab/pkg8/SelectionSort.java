package wyatt.zachary.lab.pkg8;

public class SelectionSort 
{
    public SelectionSort(int [] x) //The sort, from Data Structures and the Java Collections Framework 3rd Ed., page 462
    {
        printNumList(x,"Selection Sort test set");
        
        //Method from the textbook
        for (int i = 0; i < x.length -1; i++)
        {
            int pos = i;
            
            for (int k = i + 1; k < x.length; k++)
            if (x [k] < x [pos])
            pos = k;
            swap (x, i, pos);
        }
        
        printNumList(x, "Selection Sort Sorted");
    } // method selectionSort
    
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
