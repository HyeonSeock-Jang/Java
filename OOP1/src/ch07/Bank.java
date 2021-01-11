package ch07;

class Bank {
	double getInterestRate(){
		return 7;
	}
}
class BadBank extends Bank{
	double getInterestRate(){
		return 3;
	}
}

class GoodBank extends Bank{
	double getInterestRate(){
		return 10;
	}
}
class NormalBank extends Bank{
	double getInterestRate(){
		return 5;
	}
}