import java.util.Arrays;


public class Insertion {

	public static void insertionSort(Comparable [] a){
		int N = a.length;
		for (int i = 1; i < N; i++){
			for (int j = i; j > 0; j--)
				if(a[j].compareTo(a[j-1]) < 0)
					exchange(a,j, j-1);
				else
					break;		
		}
		
	}
	
	
	
	public static void exchange(Comparable [] a, int i, int j){
		Comparable temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] a = {"S","O","R","T","E","X","A","M","P","L","E"};
		Insertion.insertionSort(a);
		System.out.println(Arrays.toString(a));

	}

}
