import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 시작합니다>>");
		System.out.println();
		System.out.println("양의 정수(종료하려면 음수)를 입력하시오: ");
		n = inputNumber();
		while (n >= 0) {
			printAsterisks (n);
			System.out.println("양의 정수(종료하려면 음수)를 입력하시오: ");
			n = scanner.nextInt();
			}
		scanner.close();
	}
	private static void printAsterisks(int n)
	{
		int a;
		a = 0;
		while (a < n) {
			System.out.print("*");
			a++;
		}
		System.out.println();
	}
	private static int inputNumber() {
		Scanner scanner = new Scanner(System.in);
		int n;
		n = scanner.nextInt();
		return n;
	}

}
