import java.util.*;
import java.util.Comparator;

public class proGramers{
	public static void main(String[] args) {
		int alpha = 0;
		int count = 10;
		int increase = 10;
		for(int i = 1; i<56; i++){
			alpha+=count;
			count+=increase;
			if((i+1)%5==0) {
				if(i>=50)
					increase+=20;
				else
					increase+=10;
			}
		}//3530
		System.out.println(alpha);
	}
}