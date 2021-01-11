import java.util.Arrays;
import java.util.Random;

public class twoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[][] arr = new int[random.nextInt(10)+1][random.nextInt(10)+1];
		int min = 1000;
		int minCount = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j]=random.nextInt(100)+1;
				if(min>arr[i][j])min=arr[i][j];
			}
		}
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				if(min==arr[i][j])minCount++;
			}
		}
		int[][] minPosition=new int[2][minCount];
		int minPositionFindCount =0;
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				if(min==arr[i][j]) {
					minPosition[0][minPositionFindCount]=i;
					minPosition[1][minPositionFindCount]=j;
					minPositionFindCount++;
				}
			}
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("가장 작은 min값: "+min);
		System.out.println(min+"의 위치");
		for(int i = 0;i<minPosition.length;i++) {
			System.out.println(Arrays.toString(minPosition[i]));
		}
		for(int i = 0;i<minPositionFindCount;i++) {
			System.out.println("행: "+(minPosition[0][i]+1)+", 열: "+(minPosition[1][i]+1));
		}
	}
	
}
