
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=101;
int n2=101;
int p=n1*n2;
int t=p;
int rem=0;
int rev=0;
while(p!=0) {
	rem=p%10;
	rev=rev*10+rem;
	p=p/10;
}
System.out.println(rev);
	if(t==rev) {
		System.out.println("palindrom");
	}
	else {
		System.out.println("not");
	}
}

}
