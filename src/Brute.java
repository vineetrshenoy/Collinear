import java.util.Arrays;

	
public class Brute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// rescale coordinates and turn on animation mode
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);
        StdDraw.show(0);
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
		
		
			
		// Brute force algorithm
		Arrays.sort(array);
		for (int i = 0; i < size; i++){
			for (int j = i+1; j < size; j++){
				double oneTwo = array[i].slopeTo(array[j]);
				for (int k = j+1; k < size; k++){
					double oneThree = array[i].slopeTo(array[k]);
					if (oneTwo == oneThree){
						for (int m = k+1; m < size; m++){
							double oneFour = array[i].slopeTo(array[m]);
							if (oneThree == oneFour){
								StdOut.println(array[i] + " -> " + array[j] + " -> " + array[k] + " -> " + array[m]);
								array[i].drawTo(array[m]);
							}
						}
							
					}
				}
					
			}
				
				
		}
		
		
		// display to screen all at once
        StdDraw.show(0);

        // reset the pen radius
        StdDraw.setPenRadius();
	}

}
