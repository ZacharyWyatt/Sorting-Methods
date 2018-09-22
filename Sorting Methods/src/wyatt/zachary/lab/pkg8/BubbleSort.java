package wyatt.zachary.lab.pkg8;

public class BubbleSort
{
   public BubbleSort(int[] x)
   {
       printNumList(x,"Bubble Sort test set");
       int ctr = 0;
       
       //The sort, from Data Structures and the Java Collections Framework 3rd Ed., page 463
        int finalSwapPos = x.length - 1,
        swapPos;
        while (finalSwapPos > 0)
        {
            swapPos = 0;
            for (int i = 0; i < finalSwapPos; i++)
            {
                ctr++; //for keeping track of how many times this loop was run
                
                if (x [i] > x [i + 1])
                {
                    swap (x, i, i + 1);
                    swapPos = i;
                } // if
            } // for
            finalSwapPos = swapPos;
        } // while
        
        System.out.println("\nBubble sort took "+ctr+" iterations, with an array"
                + " length of "+x.length+".");
        printNumList(x,"Bubble Sort Sorted");
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