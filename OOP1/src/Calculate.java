import java.util.*;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner�� �̿��Ͽ� String������ ���� �޴´�.
		 * String ���� ����Ͽ� ����ϴ� �˰����� ����ÿ�
		 * JavaScript���� ����Ͽ� eval�Ἥ ����ϱ� ����...
		 * �̰� ���� 3�ٸ��� ����...
		 * 
		 * ex1) String str = "135+513";...>int answer = 648;
		 * ex2) String str = "842*41/7+15";...>int answer = 648;
		 */
		
		/*
		 * scan���� str�� �޴´� ex) 123+456
//		 * 1. ó�� ���� ���� �̿��� +,-,*,/�� ���� �� ���� �ʱⰪ����
//		 * �����ָ鼭 +,-,*,/�� ������ whileŻ�� �� �����ȣ�� �߰�
//		 * �� ��ġ ����
		 * 2. for�� ���鼭 str�� ���ڸ� ���� �����ٰ� �߰�
		 * 	���� ���߿� +,-,*,/�� ������ for�� �ϳ� �߰��ϰ�
		 * 	���� �����Ŵ
		 * 3.�� �����Ű�� �ش� ���� ��ȣ�� �����ȣ�� ����
		 * 
		 * for(){
		 * 	if(i=="+"||"-",*,/�̰Ÿ�{
		 * 		switch(���� ��ȣ)
		 * 		case "+":
		 * 			�ʱⰪ �����ȣ= ���� ��;
		 * 			break;
		 * 		�����ȣ = str.charAt(i);
		 * 		���Ұ� = 0;
		 * }
		 */
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();//��
		int proto = 0; //�ʱ� ��
		int valueCal = 0; //��� ��
		char mark = '+'; //��ȣ
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==str.length()-1) {
				if(i==str.length()-1)
					valueCal = valueCal*10 + (str.charAt(i)-'0');
				switch(mark) {
				case'+':
					proto+=valueCal;
					break;
				case'-':
					proto-=valueCal;
					break;
				case'*':
					proto*=valueCal;
					break;
				case'/':
					if(valueCal==0) {
						System.out.println("�߸� �Է��Ͽ����ϴ�");
						i += str.length();
						break;
					}
					proto/=valueCal;
					break;
				}
				valueCal=0;
				mark = str.charAt(i);
			}else {
				valueCal = valueCal*10 + (str.charAt(i)-'0');
			}
		}
		System.out.println(proto);
	}

}
