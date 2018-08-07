

public class Graph {

	public static void main(String[] args) {
		Point point1 = new Point(5,6);
		Point point2 = new Point(1,2);
		Point point3 = new Point(-6,-1);
		Point point4 = new Point(-1,6);
		
		point1.shiftPoint();
		System.out.println(point1.getY());
		System.out.println(point1.findDistance(point2));
		System.out.println(point3.findQuadrant());
	}

}

