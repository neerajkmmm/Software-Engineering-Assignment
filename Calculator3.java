import java.util.Scanner;
class Calculator3{
public static void main(String[]args){
	Scanner ob=new Scanner(System.in);
	System.out.println("**************");
	System.out.println("1:Addition");
	System.out.println("2:Subtraction");
	System.out.println("3:Multiplication");
	System.out.println("4:Division");
	System.out.println("Choose any one: ");
	System.out.println("**************");
	       int sel=ob.nextInt();
		   
	if(sel>=1&&sel<=4){	 
		  
    System.out.print("Enter first number ");
	       int a=ob.nextInt();
    System.out.print("Enter second number ");
	       int b=ob.nextInt();
		   
		 if(sel==1)
			 System.out.println("Addition : "+(a+b));
		 if(sel==2)
			 System.out.println("Subtraction : "+(a-b));
		 if(sel==3)
			 System.out.println("Multiplication : "+(a*b));
		 if(sel==4){
			 if(b==0)
				 System.out.println("Division by zero not allowd ");
			 else
			 System.out.println("Division : "+(a/b));
		 }
	}
	else {
	System.out.println("invalid selection ");}

}
}
