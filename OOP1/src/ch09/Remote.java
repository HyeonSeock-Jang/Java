package ch09;

public interface Remote{
	void turnOn();
	void turnOff();
	double PI = 3.14;//static fianl
	
	default void volumeUp() {
		
	};
	default void volumeDown() {
		
	};
	//�������̽��� ������ static�̱� ������
	//�������� ���� ����
}
