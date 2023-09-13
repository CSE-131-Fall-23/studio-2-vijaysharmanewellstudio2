package studio2;
import java.util.Scanner;
public class ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter amount of money you wanna start with;");
		double startAmount = in.nextDouble();

		System.out.println("Win Probability?");
		double winChance= in.nextDouble();

		System.out.println("What is the win limit?");
		double winLimit= in.nextDouble();

		double currentAmount = startAmount;

		while ( 0 < currentAmount && currentAmount < winLimit){


			if (Math.random()<winChance) {
				currentAmount=currentAmount+1;
			}


			else (Math.random()>winChance) {
				currentAmount=currentAmount-1;
			}

		}
	
