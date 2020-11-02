import java.time.Month;
import java.util.*;
public class Question4 {
public static void leapyear(int year) {
	if(year%4==0||year%400==0&&year%100==0) {
		int dn=29;}
	else {
		int dn=28;}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the month");
int month=sc.nextInt();
System.out.println("enter the day");
int day=sc.nextInt();
System.out.println("enter the year");
int year=sc.nextInt();
int dn=0;
System.out.println(day+" "+Month.of(month).name()+" "+year);
if(month==1) {
	dn=dn+day;
	}
else {
	if(month==2) {
	 dn=dn+day+31;
	}
	if(month>=3) {
		if(year%4==0||year%400==0&&year%100==0) {
			dn=29;}
		else {
			dn=28;}
			if(month==3) {
				dn=dn+day+31;
			}
			else if(month==4){
				dn=dn+day+31+31;
			}
			else if(month==5) {
				dn=dn+day+31+31+30;
			}
			else if(month==6) {
				dn=dn+day+31+31+30+31;
			}
			else if(month==7) {
				dn=dn+day+31+31+30+31+30;
			}
			else if(month==8) {
				dn=dn+day+31+31+30+31+30+31;
			}
			else if(month==9) {
				dn=dn+day+31+31+30+31+30+31+31;
			}
			else if(month==10) {
				dn=dn+day+31+31+30+31+30+31+31+30;
			}
			else if(month==11) {
				dn=dn+day+31+31+30+31+30+31+31+30+31;
			}
			else if(month==12) {
				dn=dn+day+31+31+30+31+30+31+30+31+30+31;
			}
		}
	System.out.println("Day Number"+dn);
	}
}


}
