package ex13interFace;

import ex13interFace.figure.Circle;
import ex13interFace.figure.IDrawable;
import ex13interFace.figure.IFigure;
import ex13interFace.figure.Rectangle;
import ex13interFace.figure.Triangle;

public class E05FigureDrawableMain {

	public static void main(String[] args) {
		IFigure figure = new Circle(30);
		figure.area("원");
		((Circle)figure).draw("나도 원");
		
		IFigure fig1 = new Rectangle(100, 90);
		fig1.area("사각형");
		((Rectangle)fig1).draw("나도사각형");
		
		IDrawable draw = new Triangle(100, 90);
		draw.draw("삼각형");
		((Triangle)draw).area("나도 삼각형");
		
		Circle circle = new Circle(40);
		circle.area("원");
		circle.draw("나도 원");

	}

}
