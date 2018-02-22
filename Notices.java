package oWo_wus;

import java.util.Scanner;

public class Notices {

	public static void main(String[] args) {
		
		Dis Acc1 = new Dis("Jay",100134,100);
		Dis Acc2 = new Dis("Aileen",100190,1000);
		Dis Acc3 = new Dis("Josh",100153,3213);
		
		System.out.println("Lets create an account for you!");
		System.out.println("What is your name?");
		Scanner scanner = new Scanner (System.in);
		String UsrNmN = scanner.nextLine();
		System.out.println("What pin would you like to use?");
		int UsrPin = scanner.nextInt();
		System.out.println("What is your balance?");
		int UsrBln = scanner.nextInt();
		
		Dis UsrAcc = new Dis(UsrNmN, UsrPin, UsrBln);
		
		System.out.println("Lets create a Back-up Account for you!");
		System.out.println("What is your name?");
		scanner.next();
		String UsrNmN2 = scanner.nextLine();
		System.out.println("What pin would you like to use?");
		int UsrPin2 = scanner.nextInt();
		System.out.println("What is your balance?");
		int UsrBln2 = scanner.nextInt();
		
		Dis UsrAcc2 = new Dis(UsrNmN2, UsrPin2, UsrBln2);
		
		System.out.println("Lets make your first transaction!");
		System.out.println("What account would you like to access? Main(1), or Back-up(2)?");
		int Ans = scanner.nextInt();
		if (Ans == 1){
			
			System.out.println("Will you be depositting or withdrawing?");
			int AnsI = scanner.nextInt();
			if (AnsI == 1){
				System.out.println("how much would you like to depostit?");
				int Depo11 = scanner.nextInt();
				System.out.println(UsrAcc.Deposit(Depo11,UsrBln));
			}else if (AnsI == 2){
				System.out.println("how much would you like to Withdraw?");
				int With12 = scanner.nextInt();
				System.out.println(UsrAcc.Withdrawl(With12,UsrBln));
			}
			
		}else if(Ans == 2){
			
			System.out.println("Will you be depositting or withdrawing?");
			int AnsII = scanner.nextInt();
			if (AnsII == 1){
				System.out.println("how much would you like to depostit?");
				int Depo21 = scanner.nextInt();
				System.out.println(UsrAcc2.Deposit(Depo21,UsrBln2));
			}else if (AnsII == 2){
				System.out.println("how much would you like to Withdraw?");
				int With22 = scanner.nextInt();
				System.out.println(UsrAcc2.Withdrawl(With22,UsrBln2));
			}
scanner.close();
		}
		
		
	}

}
