package ex13interFace.figure;

public class Rectangle extends FigureData implements IFigure, IDrawable {
	public Rectangle(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw(String figureName) {
		System.out.println(figureName+"을 그립니다.");
		
	}
	@Override
	public void area(String figureName) {
		System.out.println(figureName+"의 면적 : "+width*height);
		
	}
}
