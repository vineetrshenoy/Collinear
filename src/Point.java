/*************************************************************************
 * Name:
 * Email:
 *
 * Compilation:  javac Point.java
 * Execution:
 * Dependencies: StdDraw.java
 *
 * Description: An immutable data type for points in the plane.
 *
 *************************************************************************/

import java.util.Arrays;
import java.util.Comparator;

public class Point implements Comparable<Point> {

    // compare points by slope
    public final Comparator<Point> SLOPE_ORDER = new SlopeComparator();       // YOUR DEFINITION HERE

  private class SlopeComparator implements Comparator<Point>{
	   public int compare(Point one, Point two){
		   	double slopeOne = slopeTo(one);
		   	double slopeTwo = slopeTo(two);
		   	
		   	if (slopeOne > slopeTwo)
		   		return 1;
		   	else if (slopeOne < slopeTwo)
		   		return -1;
		   	return 0;
	   }
   }
    
    private final int x;                              // x coordinate
    private final int y;                              // y coordinate

    // create the point (x, y)
    public Point(int x, int y) {
        /* DO NOT MODIFY */
        this.x = x;
        this.y = y;
    }

    // plot this point to standard drawing
    public void draw() {
        /* DO NOT MODIFY */
        StdDraw.point(x, y);
    }

    // draw line between this point and that point to standard drawing
    public void drawTo(Point that) {
        /* DO NOT MODIFY */
        StdDraw.line(this.x, this.y, that.x, that.y);
    }

    // slope between this point and that point
    public double slopeTo(Point that) {
        if (that == null)
        	throw new NullPointerException();
        
        double slope = 0;
        double y = that.y - this.y;
        double x = that.x - this.x;
      
        if (x == 0) {
        	if (this.y == that.y)
        		slope = Double.NEGATIVE_INFINITY;
        	else
        		slope = Double.POSITIVE_INFINITY;
        }
        
        else {
        	slope = y/x;
        }
        
        /**
        try{
        	slope = y/x;
        }
        catch (ArithmeticException e){
        	if (this.y == that.y)
        		slope = Double.NEGATIVE_INFINITY;
        	else
        		slope = Double.POSITIVE_INFINITY;
        }
        */
        return slope;
    }

    // is this point lexicographically smaller than that one?
    // comparing y-coordinates and breaking ties by x-coordinates
    public int compareTo(Point that) {
        if (that == null)
        	throw new NullPointerException();
    	if (!(this.y == that.y)){
    		if (this.y > that.y)
    			return 1;
    		else 
    			return -1;
    	}
        else
        	if (this.x > that.x)
        		return 1;
        	else if (this.x < that.x)
        		return -1;
        return 0;
             
    }

    // return string representation of this point
    public String toString() {
        /* DO NOT MODIFY */
        return "(" + x + ", " + y + ")";
    }

    // unit test
    public static void main(String[] args) {
        
    	
    	In in = new In(args[0]);
		int size = in.readInt();
		Point [] array = new Point[size];
		for (int i = 0; i < size; i++){
			int xCoordinate = in.readInt();
			int yCoordinate = in.readInt(); 
			Point p = new Point(xCoordinate,yCoordinate);
			array[i] = p;
		}
		System.out.println();
		Arrays.sort(array,array[2].SLOPE_ORDER);
		System.out.println();
    	/**
    	Point point = new Point (1,1);
        //Testing compareTo(Point other)
        System.out.println(point.compareTo(new Point(1,1)));
        
        
        System.out.println(point.slopeTo(new Point (3,0)));
        // Horizontal Line Segment
        
        System.out.println(point.slopeTo(new Point(5,1)));
        
        //Vertical Line Segment
        System.out.println(point.slopeTo(new Point(1,-6)));
        System.out.println(point.slopeTo(new Point(1,-6)));
        
        //Degenerate Line Segment
        System.out.println(point.slopeTo(new Point(1,1)));
    	
    	*/
    }
}