
public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int quatity=3;
		double priceperitem=9.5;
		double totalprice= quatity*priceperitem;
		
		//narrowing
		
		double discount=1.5;
		int roundedDiscount =  (int)discount;
		
		double finalAmount =totalprice-roundedDiscount;
		
		System.out.println("Online Shopping summary");
		System.out.println("final amount "+finalAmount);
	}

}
