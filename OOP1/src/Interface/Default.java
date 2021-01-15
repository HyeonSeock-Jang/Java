package Interface;

public interface Default {
	public void Method1();
	default void Method2() {
		int b =0; 
		System.out.println("¾ßÈ£~2");
	}
}
