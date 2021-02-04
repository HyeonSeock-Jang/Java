package ch09;

public class Lamda4 {
	public static void main(String[] args) {
		LamdaCal lc = (n1,n2)-> {
			System.out.println(n1);
			System.out.println(n2);
			return n1+n2;
		};
		System.out.println(lc.calcul(15, 37));
	}
}
