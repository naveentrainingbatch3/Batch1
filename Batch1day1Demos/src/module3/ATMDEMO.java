package module3;

public class ATMDEMO {
public static void main(String[] args) {
	BalanceCheck bc=new BalanceCheck(121);
	System.out.println("Deposite $1000");
	bc.deposite(1000.00);
	System.out.println("Withdraw $500");
	try
	{
	bc.withdraw(500);
	System.out.println("Withdraw $600");
	bc.withdraw(600);
	}catch(LowBalanceException ex)
	{
		System.out.println("Sorry Insufficient Balance You are short by $"+ex.getAmount());
	}
}
}
