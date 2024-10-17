package HomeWork;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		int check=0;
        for (int i = 2; i < n/2; i++)
        {
            if (n % i == 0)
            {
            	check++;
            	//System.out.println("The given number is not a prime");
            }
        }
        
        if (check>1)
        {
        	System.out.println("The given number is not a prime");      
        }
            else
            {
            	System.out.println("The given number is a Prime number");
            }


	

}}
