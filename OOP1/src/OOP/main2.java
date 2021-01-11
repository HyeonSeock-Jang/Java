package OOP;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor prof1 = new Professor();
		
//		private String name;
//		private String sid;
//		private String gender;
//		private String phone;
//		private String dept;
//		private String[] lectures;
		prof1.setName("으아아아");
		prof1.setGender("남성");
		prof1.setPhone("919120-41");
		prof1.setDept("컴정");
		prof1.setLectures(new String[] {"프로그래밍기초","웹프로그래밍"});
		prof1.print();
		
		Professor prof2 = new Professor();
		prof2.setName("아오아우윽");
		prof2.setGender("여성");
		prof2.setPhone("OS201285-2");
		prof2.setDept("컴정");
		prof2.setLectures(new String[] {"일본어","웹프로그래밍"});
//		System.out.println(prof2);
		prof2.print();
		
		
	}

}
