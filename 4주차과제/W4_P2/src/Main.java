import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact;
		int i;
		Scanner scanner = new Scanner(System.in);
		int givenN;
		char answer;
		System.out.println("Factorial을 계산하겠습니까?");
		System.out.println("계산하려면 'Y'를 치십시오.");
		answer = scanner.next().charAt(0);

		while(answer == 'Y') {

			System.out.println("N의 값을 입력하시오.");
			givenN = scanner.nextInt();

			if(givenN==0) {
				fact=1;
				System.out.println("결과: " + fact);
			}
			else if(givenN < 0) {
				System.out.println("입력이 음수이므로, Factorial 값을 계산할 수 없습니다.");
			}
			else {
				fact = 1;
				i = 2;

				while(i<=givenN) {
					fact = fact*i;
					i = i + 1;
				}
				System.out.println("결과: " + fact);
			}
			System.out.println("Factorial을 계산하겠습니까?");
			System.out.println("계산하려면 'Y'를 치십시오.");
			answer = scanner.next().charAt(0);
		}
		scanner.close();
	}
}
