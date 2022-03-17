package string;

public class ModifyString {
	public static void main(String args[]) {
		
		String str="JAVA is Simple";
		System.out.println("give string is :" +str);
		System.out.println("string converted to upper case :"+str.toUpperCase());
		System.out.println("string converted to lower case :"+str.toLowerCase());
		String[] firstwords=str.split("\\s");
		for(String w:firstwords) {
			System.out.println("first letter of all word :"+w.charAt(0));
			System.out.println(" ");
		}
		System.out.println("length of string :"+str.length());
		StringBuilder str1 = new StringBuilder("JAVA is simple");
	
		System.out.println("String = "+str1.toString());
		StringBuilder reversestr = str1.reverse();
		System.out.println("Reversing the string :"+reversestr.toString());
		
		
	}

}
