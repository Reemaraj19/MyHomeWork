package HomeWork;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int num1 = 0, num2 = 1;
        
        System.out.println("The Fibonacci Series is: ");

        for (int i = 0; i <8; i++) {
            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }

	}

}
