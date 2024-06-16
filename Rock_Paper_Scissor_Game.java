package myProjects;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_Game {
	public static void main(String args[]) {
		int count = 0;
		int comp_score = 0;
		int user_score = 0;
		int draw_score = 0;
		String res;
		do {
			System.out.println("\n****** Round"+(count+1)+" ******");
			res = game();
			switch(res) {
			case "Computer":
				comp_score += 1;
				break;
			case "User":
				user_score += 1;
				break;
			case "Draw":
				draw_score += 1;
				break;
			}
			count += 1;
			
		}while(count!=5);
		if (comp_score > user_score) {
			System.out.println("\nResult:- Computer wins the game!!");
		}else if (comp_score == user_score) {
			System.out.println("\nResult:- Match draw!!\nPlay again");
		}
		else System.out.println("\nResult:- User wins the game!!");
		System.out.println("\n******Score Card******");
		System.out.println("Computer Score "+ comp_score);
		System.out.println("User Score     "+ user_score);
		System.out.println("Draw rounds    "+ draw_score);
	}
	public static String game() {
		int comp_input,u;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		{
		comp_input = rand.nextInt(1,4);
		System.out.println("Press:\n\t 1 for Rock\n\t 2 for Paper\n\t 3 for Scissor");
		System.out.print("Your choice:");
		u = sc.nextInt();
		}
		if(comp_input == u) {
			System.out.println("Match Draw!");
			value(comp_input);
			return "Draw";
		}
		else if(comp_input == 1 && u == 3 || comp_input == 2 && u == 1 || comp_input == 3 && u == 2) {
			System.out.println("Computer wins the round!");
			value(comp_input);
			return "Computer";
		}
		else {
			System.out.println("User wins the round!");
			value(comp_input);
			return "User";
		}
	}
	public static void value(int data) {
		switch(data) {
		case 1:
			System.out.println("Computer choice: Rock");
			break;
		case 2:
			System.out.println("Computer choice: Paper");
			break;
		case 3:
			System.out.println("Computer choice: Scissors");
			break;
		}
	}
}
