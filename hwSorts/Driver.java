import java.util.*;
public class Driver{
    public static void main(String[]args){

	/*
	System.out.println("Too" + 2 + "Too");
        int[] ary = {4, 4, 3, 2, 1, 1, 0, 5};
	Sorts.printArray(ary);
	Sorts.insertionSort(ary);
	Sorts.printArray(ary);

	System.out.println("Roo" + 3 + "Roo");
	int[] ary1 = {5, 2, 3, 1, 9, 9, 1, 2, 1, 10, 7, 4};
	Sorts.printArray(ary1);
	Sorts.selectionSort(ary1);
	Sorts.printArray(ary1);
	*/

	Random rand = new Random();
	int[] ary  = new int[5];
	for(int k = 0; k < ary.length; k++){
	    ary[k] = rand.nextInt(101);
	}

	Sorts.printArray(ary);
	int[] aryI = ary.clone();
	Sorts.insertionSort(aryI);
	int[] aryS = ary.clone();
	Sorts.selectionSort(aryS);
	int[] aryB = ary.clone();
	Sorts.bubbleSort(aryB);
	int[] aryR = ary.clone();
	Arrays.sort(aryR);

	//Sorts.printArray(aryI);
	//Sorts.printArray(aryS);
	//Sorts.printArray(aryB);
	Sorts.printArray(aryR);
    }
}
