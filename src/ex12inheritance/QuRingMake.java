package ex12inheritance;

class Point {
	int xDot, yDot;

	public Point(int x, int y) {
		xDot = x;
		yDot = y;
	}

	public void showPointInfo() {
		System.out.println("[x좌표:" + xDot + ", y좌표" + yDot + "]");
	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle {
	// 멤버변수
	int radian;// 반지름
	Point center;

	public Circle(Point center, int radian) {
		this.radian = radian;
		this.center = center;
	}
	public void innerInfo() {
		System.out.println("반지름:"+radian);
	}
	
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring {
	// 멤버변수
	int radian2;
	Point center2;
	Circle innerCircle;// 안쪽의 원

	Ring(Circle innerCircle, Point center, int radian2) {
		this.radian2 = radian2;
		this.center2 = center;
		this.innerCircle = innerCircle;
	}
	public void outerInfo() {
		System.out.println("반지름:"+radian2);
	}
	
	public void showRingInfo() {
		System.out.println("안쪽원의 정보 :");
		innerCircle.innerInfo();
		innerCircle.center.showPointInfo();
		
		System.out.println("바깥쪽원의 정보 :");
		outerInfo();
		center2.showPointInfo();
	}
}

class QuRingMake {
	public static void main(String[] args) {
		Point point = new Point(1, 1);
		Point point2 = new Point(2, 2);

		Circle circle = new Circle(point, 3);

		Ring ring = new Ring(circle, point2, 9);

		ring.showRingInfo();
	}
}
