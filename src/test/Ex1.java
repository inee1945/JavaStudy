package test;

import java.lang.reflect.Executable;

import javax.lang.model.element.ExecutableElement;

interface GuGuDan{
	public void gugu(int a, int b);
}


public class Ex1 {
	
	static void execute(GuGuDan gugudan, int a, int b) {
		gugudan.gugu(a, b);
	}

	public static void main(String[] args) {
		GuGuDan gugudan = (a,b)->{
			for(int i=a;i<=b;i++) {
				for(int j=1;j<10;j++) {
					System.out.printf("%d * %d = %d ",i,j,i*j);
				}
				System.out.println();
			}
		};
		execute(gugudan,5,9);
		
	}

}
