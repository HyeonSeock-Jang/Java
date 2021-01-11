package OOP;
import java.util.*;

public class oopTest {

	private String name;
	private int Sid;
	private int[] grade = new int[10];
	private int idx = 0;
	private int max = 0;
	// Properties, attributes, data, fields, member variables, state

	
//	int max = grade[0];
//	for (int i =0; i<grade.length;i++) {
//		if (max<grade[i]) {
//			max=grade[i];
//		}
//	}

	//member methods, behavior, functions
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public double add(double a, int b) {
		return a+b;
	}
	public int getAverage() {
		int min = 0;
		for (int i =0; i<idx;i++) {
				min+=grade[i];
		}
		return min/grade.length;
	}
	public int getMin() {
		int min = grade[0];
		for (int i =0; i<idx;i++) {
			if (min>grade[i]) {
				min=grade[i];
			}
		}
		return min;
	}
	public int getMax() {
		int max = grade[0];
		for (int i =0; i<idx;i++) {
			if (max<grade[i]) {
				max=grade[i];
			}
		}
		return max;
	}
	public void addGrade(int jumsu) {
		grade[idx]=jumsu;
		idx++;
	}
	public int[] getGrades() {
//		return grade;
		int[] copy = Arrays.copyOf(grade, idx);
		return copy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	
}