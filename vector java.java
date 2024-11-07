import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Vector<String> vec = new Vector<String>();
	vec.add("gopi");
	vec.add("gokul");
	vec.add("tamil nadu");
	
	System.out.println("vector size is : "+vec.size());
	System.out.println("defalut capacity is : "+vec.capacity());
	
	vec.addElement("hariharan");
	vec.addElement("gokul9999");
	vec.addElement("gowtham bro");
		
	System.out.println("vector size is : "+vec.size());
	System.out.println("defalut capacity is : "+vec.capacity());
	
	System.out.println(vec);
	
	if(vec.contains("gowtham bro")){
	    System.out.println("gopi will be present here , the index value is "+vec.indexOf("gopi"));
	}
	else{
	    System.out.println("gopi will be not present here...");
	}
	
	System.out.println("the first element is : "+vec.firstElement());
	System.out.println("the last element is : "+vec.lastElement());
	
}}
