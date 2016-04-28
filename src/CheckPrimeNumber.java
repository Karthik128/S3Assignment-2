import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime NUmber Checker");
		System.out.println("");
		System.out.println("Please Eneter a Number:");
		
		Scanner pn=new Scanner(System.in);
		
		Integer randomnumber;
		
		Integer j=2;
		
		
		
		randomnumber = pn.nextInt();
		
		if (randomnumber%j ==0){
			
			System.out.println(randomnumber+" is not a prime number");
			
		} else{
			
			System.out.println(randomnumber+" is a Prime number");
		}
	}

}
