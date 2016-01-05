public class Sorts{
    public static void printArray(int[] data){
	String s = "[";
	for(int x = 0; x < data.length - 1; x ++){
	    s += data[x] + ", ";
	}
	System.out.println(s + data[data.length-1] + "]");
    }
    
    public static void insertionSort(int[] data){
	int p;
	int k;
	for(int x = 0; x < data.length; x ++){
	    p = data[x];
	    k = x - 1;
	    while((0 <= k) && (p < data[k])){
		data[k+1] = data[k];
		k--;
	    }
	    data[k+1] = p;
	}
    }

    public static void selectionSort(int[] data){
	for(int i = 0; i < data.length - 1; i++){
	    int x = i;
	    for(int k = i + 1; k < data.length; k++){
		if(data[k] < data[x]){
		    x = k;
		}
	    }
	    int f = data[x];
	    data[x] = data[i];
	    data[i] = f;
	}
    }
}
