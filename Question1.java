import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the input");
String s=sc.nextLine();
s=s.toUpperCase();
String st="";
if(s.length()<=103) {
	int c=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='G'||s.charAt(i)=='C'||s.charAt(i)=='T'||s.charAt(i)=='A') {
			c++;
		}}
		if(c==s.length()) {
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)=='G') {
				st=st+'C';
			}
			else if(s.charAt(j)=='C') {
				st=st+'G';
			}
			else if(s.charAt(j)=='T') {
				st=st+'A';
			}
			else if(s.charAt(j)=='A') {
				st=st+'U';
			}
			
		}
		System.out.println(st);
		}
		else {
			System.out.println("Invalid Input");
		}
	
}
	}

}
