package javaoops;

class Human{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj =new Human();
		obj.setAge(12);
		obj.setName("hema");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		obj.setAge(11);
		obj.setName("ema");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
	}

}
