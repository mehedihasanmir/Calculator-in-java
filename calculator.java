import java.util.Scanner;

public class calculator {
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please, Enter your name: ");
            String urname = input.nextLine();
            System.out.println("Hey, "+ urname + " Wellcome!!\nYou are using our calculator."
            		+ "\nWhat kind of calculatot you want?\nPlease select 1 or 2."
            		+ "\n1.  Normal\n2.  Geometric");
            int option = input.nextInt();
            if (option==1) {
            	System.out.println("Select the operator that you want \n1. for addition "
            			+ "\n2. for subtration \n3. for multiplication\n4. for divition"
            			+ "\n5. for modulo");
            	int operation = input.nextInt();
            	System.out.println("Enter the first number: ");
            	float num1 = input.nextFloat();
            	System.out.println("Enter the second number: ");
            	float num2 = input.nextFloat();
            	if (operation == 1) {
            		double result = num1 + num2;
            		System.out.println("The addition value is: "+result);
            	}
            	else if (operation == 2) {
            		double result = num1- num2;
            		System.out.println("The subtruction value is: "+result);
            	}
            	else if (operation == 3) {
            		double result = num1*num2;
            		System.out.println("The multiplication value is: "+result);
            	}
            	else if (operation==4) {
            		double result = num1/num2;
            		System.out.println("The divition value is: "+result);
            	}
            	else if (operation == 5) {
            		float result = num1%num2;
            		System.out.println("The modulo value is: "+result);
            	}
            	else {
            		System.out.println("Invalid number or symble");
            	}	
            }
            else if(option == 2) {
            	System.out.println("What do you want?\n1. Area of Triangle\n2. Area of Rectangle"
            			+ "\n3. Area of Square,\n4. Area of circle");
            	int area = input.nextInt();
            	if (area == 1) {
            		System.out.println("Enter the land of Traingle: ");
            		int l = input.nextInt();
            		System.out.println("Enter the hight of Triangle: ");
            		int h = input.nextInt();
            		double result = 0.5*(l*h);
            		System.out.println("The area of Triangle is: "+result);
            	}
            	else if (area == 2) {
            		System.out.println("Enter the hight of Rectangle: ");
            		int h = input.nextInt();
            		System.out.println("Enter the weight of Rectangle: ");
            		int w = input.nextInt();
            		float result = h*w;
            		System.out.println("The area of Rectangle: "+result);
            	}
            	else if (area == 3) {
            		System.out.println("Ente the value of one side of square: ");
            		int a = input.nextInt();
            		int result = a*a;
            		System.out.println("The area of square is: "+result);
            	}
            	else if (area == 4) {
            		System.out.println("Enter the valu of radius of circle: ");
            		int r = input.nextInt();
            		float result = (float) ((r*r)*3.1416);
            		System.out.println("The area of circle is: "+result);
            	}
            	else {
            		System.out.println("Invalid");
            	}
            	
            }
            else {
            	System.out.println("invalid");
            }
        }		
	}
}
