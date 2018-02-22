package oWo_wus;

public class Dis {
	
	String UsrNm;
	int pin;
	double Balance;

	public Dis(String UsrNm2, int pin2, int Balance2) {
		
		UsrNm = UsrNm2;
		pin = pin2;
		Balance = Balance2;
		
	}
	
	public int Deposit(int num, int num2){
		return num+num2;
	}
	public int Withdrawl(int num, int num2){
		return num-num2;

}
}
