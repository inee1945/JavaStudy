package ex12inheritance;

class Rectangle {
	int horizon;
	int vertical;

	Rectangle(int horizon) {
		this.horizon = horizon;
	}

	Rectangle(int horizon, int vertical) {
		this.horizon = horizon;
		this.vertical = vertical;
	}

	public void showAreaInfo() {
		System.out.println("직사각형 면적은 : " + horizon * vertical);
	}
	
}

//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle {
	Square(int horizon) {
		super(horizon);
	}

	Square(int horizon, int vertical) {
		super(horizon, vertical);
	}
	
	public void showAreaInfo(int horizon) {
		System.out.println("정사각형 면적은 : " + horizon * horizon);
	}
}

public class QuRectangleMain {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(4, 3);
		rectangle.showAreaInfo();

		//예문의 sqr.showAreaInfo()로 하려니 더 구분이 어려워 매개변수를 조정해서 오버로딩으로 하는게 맞는거같아서 이렇게 합니다. 
		Square square = new Square(11);
		square.showAreaInfo(square.horizon);

	}
}
