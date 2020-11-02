
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int t=10002;
		int c=0;
		boolean prime=true;
		while(c!=t) 
		{
			
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
			else {
				prime=true;
			}
		}
		if(prime==true) {
			
			c++;
			
			if(c==t) {
				break;
			}
			else {n++;
			continue;
		}
		}
		else {
			prime=false;
			n++;
			continue;
		}
		
		
	
		}
		System.out.println(n);
		
}}
