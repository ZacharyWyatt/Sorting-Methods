package wyatt.zachary.lab.pkg8;

import java.util.Random;

public class WyattZacharyLab8 
{
    public static void main(String[] args) 
    {
        //Bubble Sort
        int[] bubbleList = generateNumList(10, 100, 0);
        BubbleSort bubble = new BubbleSort(bubbleList);
        
        //Insertion Sort
        int[] insertionList = generateNumList(10, 100, 0);
        InsertionSort insertion = new InsertionSort(insertionList);
        
        //Selection Sort
        int[] selectionList = generateNumList(10, 100, 0);
        SelectionSort selection = new SelectionSort(selectionList);
        
        //Shell Sort
        int[] shellList = generateNumList(10, 100, 0);
        ShellSort shell = new ShellSort(shellList);
        
        //Quick Sort
        int[] quickList = generateNumList(10, 100, 0);
        QuickSort quick = new QuickSort();
        
            quick.printNumList(quickList, "Quick Sort test set");
            quick.sort(quickList, 0, quickList.length-1);
            quick.printNumList(quickList, "Quick Sort Sorted");
            
        //Merge Sort
        int[] mergeList = generateNumList(10, 100, 0);
        MergeSort merge = new MergeSort();
        
            merge.printNumList(mergeList, "Merge Sort test set");
            merge.sort(mergeList, 0, mergeList.length-1);
            merge.printNumList(mergeList, "Merge Sort Sorted");
        
        //Heap Sort
        int[] heapList = generateNumList(10, 100, 0);
        HeapSort heap = new HeapSort();
        
            heap.printNumList(heapList, "Heap Sort test set");
            heap.sort(heapList);
            heap.printNumList(heapList, "Heap Sort Sorted");
        
        //Radix Sort
        int[] radixList = generateNumList(10, 100, 0);
        RadixSort radix = new RadixSort(radixList);
        
    } // main
    
    public static void printNumList(int[] x, String arrayName)
    {
        System.out.println(arrayName+":");
        
        for(int ctr = 0; ctr<x.length; ctr++)
        {
            System.out.println((ctr+1)+") "+x[ctr]);
        }      
        
        System.out.println();
    } // method printNumList
    
    public static int[] generateNumList(int length, int max, int min)
    {
        Random rand = new Random();
        int[] numbersList = new int[length];
        
        for(int ctr = 0; ctr<numbersList.length; ctr++)
        {
            numbersList[ctr] = rand.nextInt((max - min) + 1) + min; 
        }   
        
        return numbersList;
    } // method generateNumList
}