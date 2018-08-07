

public class Point {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	/**
	 * Method finds what quadrant a point is in 
	 * @return
	 */
	int findQuadrant() {
		int quadrant=0;
		
		if(this.x>0 && this.y > 0) {
			quadrant = 1;
		}
		
		else if(this.x<0 && this.y>0) {
				quadrant = 2;
		}
		else if(this.x<0 && this.y < 0) {
			quadrant = 3;
		}
		else if(this.x<0 && this.y>0) {
			quadrant = 2;
		}
		else if(this.x>0 && this.y<0) {
			quadrant = 4;
		}
		return quadrant;
	}

	double findDistance(Point other) {
		double distance=0;
		distance=Math.sqrt(Math.pow((other.x - this.x),2)+ Math.pow((other.y - this.y),2));

			return distance;
	}
	
	void shiftPoint() {
		setX(getX()+1);
		setY(getY()+1);
	}
}
