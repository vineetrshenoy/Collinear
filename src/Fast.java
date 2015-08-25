import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
public class Fast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);
       // StdDraw.show(0);
        StdDraw.setPenRadius(0.01);  // make the points a bit larger
		
		
		In in = new In(args[0]);
		int size = in.readInt();
		Point [] array = new Point[size];
		for (int i = 0; i < size; i++){
			int xCoordinate = in.readInt();
			int yCoordinate = in.readInt(); 
			Point p = new Point(xCoordinate,yCoordinate);
			array[i] = p;
			p.draw();
		}
		Arrays.sort(array);
		Point [] order = Arrays.copyOf(array,array.length);
		// Fast Algorithm
		// Outside for loop sorts by each point
		for (int j = 0; j < order.length; j++){
		Arrays.sort(array,order[j].SLOPE_ORDER);
		int N = array.length;	
		int count = 1;
		ArrayList<Point> slopes = new ArrayList<Point>();
		while (count < array.length){
				
				double currentSlope = array[0].slopeTo(array[count]);
				if (slopes.isEmpty()){
					slopes.add(array[0]);
					slopes.add(array[count]);
					count++;
					
				}
				else if (currentSlope == array[0].slopeTo(slopes.get(1))){
					slopes.add(array[count]);
					count++;
				}
				else {
					if (slopes.size() > 3){
						Collections.sort(slopes);
						int slopeSize = slopes.size();
						for (int i = 0; i < slopeSize; i++){
							if (i == slopeSize - 1){
								System.out.println(slopes.get(i));
							}
							else
								System.out.print(slopes.get(i)+ " -> ");
															
						}
						slopes = new ArrayList<Point>();
					}
				}
			}
		}	
	
	}

}
