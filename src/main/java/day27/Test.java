package day27;

import java.util.Scanner;

public class Test {
	//static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == j || j == rows - i + 1) { //(checks whether the current position corresponds to the main diagonal or the anti-diagonal)
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}

}
