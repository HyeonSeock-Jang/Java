import java.util.*;

public class mineSweeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		
//		String[][] mine = new String[random.nextInt(10)+1][random.nextInt(10)+1];
		String[][] mine = new String[10][10];
		int mineCount=0;
		for(int i = 0;i<mine.length;i++) {
			for(int j = 0;j<mine[i].length;j++) {
				mine[i][j]=".";
			}
//			System.out.println(Arrays.toString(mine[i]));
		}
		
		while(mineCount >=(double)(mine.length*mine[0].length)*4/10) {
			for(int i = 0;i<mine.length;i++) {
				for(int j = 0;j<mine[i].length;j++) {
					if(((double)Math.random()*10+1)<=3&&mine[i][j].equals(".")) {
						mine[i][j]="X";
						mineCount++;
					}
					if(mineCount >=(double)(mine.length*mine[0].length)*4/10)
						break;
				}
				if(mineCount >=(double)(mine.length*mine[0].length)*4/10)
					break;
			}
		}

		
		int xCount = 0;
		for(int i = 0;i<mine.length;i++) {
			for(int j = 0;j<mine[0].length;j++) {
				if(mine[i][j].equals("X"))xCount++;
			}
		}
		
		for(int i = 0;i<mine.length;i++) {
			System.out.println(Arrays.toString(mine[i]));
		}
		System.out.println();
		System.out.println();
		for(int i = 0;i<mine.length;i++) {
			for(int j = 0;j<mine.length;j++) {
				System.out.print(" "+mine[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(mine.length);
		System.out.println(mine[0].length);
		System.out.println(xCount);
	}

}
