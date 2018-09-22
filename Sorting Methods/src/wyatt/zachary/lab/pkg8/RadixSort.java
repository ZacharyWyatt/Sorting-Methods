package wyatt.zachary.lab.pkg8;

import java.util.LinkedList;

public class RadixSort 
{
    public RadixSort (int [] a) //The sort, from Data Structures and the Java Collections Framework 3rd Ed., page 492
    {
         printNumList(a,"Radix Sort test set");
         
        //Method from the book
        final int RADIX = a.length;
        int biggest = a [0],
        i;
        for (i = 1; i < a.length; i++)
        if (a [i] > biggest)
        biggest = a [i];
        int maxDigits = (int)Math.floor (Math.log (biggest) / Math.log (10)) + 1;
        long quotient = 1; // the type is long because the largest number may have
        // 10 digits; the successive quotients are 1, 10, 100, 1000,
        // and so on. 10 to the 10th is too large for an int value.
        LinkedList[ ] lists = new LinkedList [RADIX];
        for (int m = 0; m < RADIX; m++)
        lists [m] = new LinkedList<Integer>();
        // Loop once for each digit in the largest number:
        for (int k = 0; k < maxDigits; k++)
        {
        // Store each int in a as an Integer in lists at the index of a [i]’s kth-smallest digit:
        for (i = 0; i < a.length; i++)
        ((LinkedList<Integer>)lists [(int)(a [i] / quotient) % RADIX]).add (a [i]);
        i = 0;
        // Store each Integer in list [0], list [1], ..., as an int in a:
        for (int j = 0; j < RADIX; j++)
        {
        for (Integer anInt : (LinkedList<Integer>)lists [j])
        a [i++] = anInt; // unboxing
        lists [j].clear();
        } // for j
        quotient *= RADIX;
        } // for k
        
        printNumList(a, "Radix Sort Sorted");
    } // method radixSort
     
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