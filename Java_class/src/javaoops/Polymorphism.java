package javaoops;
class Payment
{
	void makePayment()
	{
		System.out.println("pay by upi");
	}
}


class CardPayment extends Payment
{
	void makePayment() {
		System.out.println("pay by CARD");
	}
}


class UPIPayment extends Payment
{
	void makePayment() {
		System.out.println("pay by upi");
	}
}

class WalletPayment extends Payment
{
	void makePayment() {
		System.out.println("pay by upi");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment payment;
		
		payment = new UPIPayment();
		payment.makePayment();
		
		payment = new CardPayment();
		payment.makePayment();
		
		payment = new WalletPayment();
		payment.makePayment();
		
		
	}

}
