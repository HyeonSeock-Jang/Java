import java.util.*;

import java.util.*;

public class proGramers{

	public static void main(String[] args) {
		int[] list = new int[5];
		for(int i = 0;i<10;i++) {
			try {
				list[i] = 4;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�ƿ����� �ٿ��");
			}
		}
		list[-1]= 4;
		
		
		
	}
		
}
