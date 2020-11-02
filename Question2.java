import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("'R'for rock,'S'for Scissor,'P'for paper");
int u=0,cp=0;
int i=1;
while(i!=0){
	if(i<=3) {
	System.out.println((i)+" round");

System.out.println("Enter the User's choice");
char ch=sc.next().charAt(0);
System.out.println("Computer's choice");
char[]c= {'R','P','S'};
Random random=new Random();
char co=c[random.nextInt(c.length)];
System.out.println(co);
if(ch=='R'&&co=='P'||ch=='R'&&co=='S') {
	System.out.println("User won the round");
	u++;
}
else if(ch=='S'&&co=='P') {
	System.out.println("User won the round");
	u++;
}
else if(ch=='S'&&co=='R'||ch=='P'&&co=='R') {
	System.out.println("Computer won the round");
cp++;
}
else if(ch=='P'&&co=='S') {
	System.out.println("Computer won the round");
	cp++;
}
else {
	System.out.println("Tie the round");
}
i++;
}
	else if(i>=4&&u==cp) {
		System.out.println((i)+" round");

		System.out.println("Enter the User's choice");
		char ch=sc.next().charAt(0);
		System.out.println("Computer's choice");
		char[]c= {'R','P','S'};
		Random random=new Random();
		char co=c[random.nextInt(c.length)];
		System.out.println(co);
		if(ch=='R'&&co=='P'||ch=='R'&&co=='S') {
			System.out.println("User won the round");
			u++;
		}
		else if(ch=='S'&&co=='P') {
			System.out.println("User won the round");
			u++;
		}
		else if(ch=='S'&&co=='R'||ch=='P'&&co=='R') {
			System.out.println("Computer won the round");
		cp++;
		}
		else if(ch=='P'&&co=='S') {
			System.out.println("Computer won the round");
			cp++;
		}
		else {
			System.out.println("Tie the round");
		}
		i++;
	}
	else if(i>=3&&u>cp||cp>u) {
if(u>cp) {
	System.out.println("3 Rounds over, user scored 2,user won the game");
}
else if(u<cp) {
	System.out.println("3 Rounds over, computer scored 2,computer won the game");
}
i=0;
}
	}
	}
}