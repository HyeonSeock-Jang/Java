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
		prof1.setName("���ƾƾ�");
		prof1.setGender("����");
		prof1.setPhone("919120-41");
		prof1.setDept("����");
		prof1.setLectures(new String[] {"���α׷��ֱ���","�����α׷���"});
		prof1.print();
		
		Professor prof2 = new Professor();
		prof2.setName("�ƿ��ƿ���");
		prof2.setGender("����");
		prof2.setPhone("OS201285-2");
		prof2.setDept("����");
		prof2.setLectures(new String[] {"�Ϻ���","�����α׷���"});
//		System.out.println(prof2);
		prof2.print();
		
		
	}

}
