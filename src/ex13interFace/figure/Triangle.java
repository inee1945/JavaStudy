package ex13interFace.figure;

public class Triangle extends FigureData implements IFigure,IDrawable{
	
	public Triangle(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw(String figureName) {
		System.out.println(figureName+"을 그립니다.");
		
	}
	@Override
	public void area(String figureName) {
		System.out.println(figureName+"의 면적 : "+width*height*0.5);
		
	}
}
