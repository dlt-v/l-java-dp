/**
 * Przykładowa klasa pochodna
 * @author Łukasz
 *
 */
public class B extends A {
	int y;
	public B(int x, int y) {
		super(x);
		this.y=y;
	}
	
	public void show() {
		System.out.println("SHOW B");
	}
}
