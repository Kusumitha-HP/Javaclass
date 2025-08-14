package javaoops;

class notification{
	
	String message = "default Notification";
}

class pushnotification extends notification{
	String message = "push notification from whatsapp";
	
	void shownotification()
	{
		System.out.println("child messege:"+message);
		
	}
}