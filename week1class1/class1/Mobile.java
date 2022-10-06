package week1.class1;

import org.checkerframework.checker.units.qual.m;

public class Mobile {
	
	public static void makeCall() {
		String a="Redmi11";
		float b=20.11f;
		System.out.println("Mobile name is "+a+" "+"Mobile weight is "+b  );
		
	}
	public static void sendMsg() {
		boolean b=true;
		int a=11000;
		System.out.println("Mobile is fully charged"+" "+ b+" "+"cost of the mobile is "+a);
		
	}


	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.makeCall();
		mobile.sendMsg();
		System.out.println("This is my mobile");
	
	}

}
