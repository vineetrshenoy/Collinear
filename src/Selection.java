import java.util.*;
public class Selection {

	public static void selectionSort(Comparable [] a){
		int N = a.length;
		for (int i = 0; i < N; i++){
			int min = i;
			for (int j = i+1; j < N; j++){
				if (a[j].compareTo(a[min]) < 0)
					min = j;
			}
			exchange(a,i,min);
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
		Selection.selectionSort(a);
		System.out.println(Arrays.toString(a));
		
	}

}
