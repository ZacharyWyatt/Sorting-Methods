package wyatt.zachary.lab.pkg8;

public class ShellSort 
{
    public ShellSort(int[] data) 
    {
        printNumList(data,"Shell Sort test set");
        
        //The sort, from Data Structures and the Java Collections Framework 3rd Ed.
        int inner, outer;
        int temp;
        //find initial value of h
        int h = 1;
        while (h <= data.length / 3)
          h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)

        while (h > 0) // decreasing h, until h=1
        {
          // h-sort the file
          for (outer = h; outer < data.length; outer++) {
            temp = data[outer];
            inner = outer;
            // one subpass (eg 0, 4, 8)
            while (inner > h - 1 && data[inner - h] >= temp) {
              data[inner] = data[inner - h];
              inner -= h;
            }
            data[inner] = temp;
          }
          h = (h - 1) / 3; // decrease h
        }
        
        printNumList(data, "Shell Sort Sorted");
    }
    
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
