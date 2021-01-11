package ch06;

public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date() {
		this(1900,1,1);
	}
	
	public Date(int year) {
		this(year,1,1);
		if(year<1900)year=1900;
		
	}
	
	public Date(int year, int month) {
		this(year,month,1);
		if(year<1900)year=1900;
		if(month<1)month=1;
		if(month>12)month=12;
	}
	
	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		if(year<1900)year=1900;
		if(month<1)month=1;
		if(month>12)month=12;
		if(day<0)day=1;
		if((month==4||month==6||month==9||month==11)&&day>30) 
			day=30;
		else if(month==28&&day>28){
			day=28;
		}else if(day>31){
			day=31;
		}
	}
	
	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

	public static void main(String[] args) {
		Date date1 = new Date();
		Date date2 = new Date(2021, 1, 5);
		Date date3 = new Date(2021);
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}
}
