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
	int p = 0;
	int i = 0;
	while(p < data.length){
	    for(int x = 0; x < data.length; x++){
	        if(data[p+1] < data[p]){
		    i = p+1; 
		}
	    }
	    int u = data[p];
	    data[p] = data[p+1];
	    data[i] = u;
	    p++;
	}
    }
}
