# Collinear

Finding collinear points on a grid using sorting algorithms. This assignment was created for Coursera's "Algorithms I" hosted by Princeton University. The official assignment specification can be found here:http://coursera.cs.princeton.edu/algs4/assignments/collinear.html

Using Comparators, points were sorted by slopes they make with an invoking point p, as well as their coordinates. This improved the speed at which collinear points (4 or more points on the same line) could be identified.

The APIs are as follows:

  public class Point implements Comparable<Point> {
   public final Comparator<Point> SLOPE_ORDER;        // compare points by slope to this point

   public Point(int x, int y)                         // construct the point (x, y)

   public   void draw()                               // draw this point
   public   void drawTo(Point that)                   // draw the line segment from this point to that point
   public String toString()                           // string representation

   public    int compareTo(Point that)                // is this point lexicographically smaller than that point?
   public double slopeTo(Point that)                  // the slope between this point and that point
  }

   public class Brute {
   public static void main(String[] args)
  }

  public class Fast {
     public static void main(String[] args)
  }


Brute.java is the Brute force algorithm to solve the problem, while Fast.java is the sorting-based algorithm to solve the problem.

This assignment is in progress

   
