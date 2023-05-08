package string;

public class Properties {

	//Interesting facts about Strings in java
	public static void main (String[] args) {
		String s = "ajay";
		String a = "ajay";
		//both the Strings a and s are pointing to the same reference location
		//compiler does not creats different memory location for same contents
		if(a==s) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
/*
you can creat String array in four ways
by using character array
by using String class that is immutable and thread safe
by using StringBuffer class that is mutable and thread safe
by using StrindBuilder class that is also mutable but not thread safe



*/