
public class Datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive datatype

				int orderId=101;
				double price=299.99;
				boolean isdelivered =false;
				char rating='A';
				float deliveryDistance=5.3f;
				long deliveryBoyPhone=9832234567l;
				byte deliverytime=45;
				short restaurantid=12;
				
				//non primitive datatype
				
				String customerName="Kusumitha";
				String fooditems[]= {"DBC","pasta","waffle"};
				
				
				//oder summary
				
				System.out.println("Oder Summary");
				System.out.println("Customer Name :"+customerName);
				System.out.println("Order id : "+orderId);
				System.out.println("Restaurant id : "+restaurantid);
				System.out.println("DeliverBoy Number : "+deliveryBoyPhone);
				System.out.println("Food items : ");
				for (String item:fooditems)
				{
					System.out.println("-  "+item);
				}
				System.out.println("Total price :"+price);
				System.out.println("Deliver distance : "+deliveryDistance);
				System.out.println("is Delivered : "+isdelivered);
				System.out.println("Rating :"+rating);
	}

}
