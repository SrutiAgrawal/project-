
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=41;
int i=0;
System.out.print(n);
while(n!=1) {
	if(n%2==0) {
		n=n/2;
		i++;
	}
	else {
		n=3*n+1;
		i++;
	}
	System.out.print("-"+n+"-");
}
System.out.println();
System.out.println("the"+i);
	}

}
