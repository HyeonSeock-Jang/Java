package ch09;

public interface Remote{
	void turnOn();
	void turnOff();
	double PI = 3.14;//static fianl
	
	default void volumeUp() {
		
	};
	default void volumeDown() {
		
	};
	//인터페이스의 변수는 static이기 때문에
	//생성없이 접근 가능
}
