import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact;
		int i;
		Scanner scanner = new Scanner(System.in);
		int givenN;
		char answer;
		System.out.println("Factorial�� ����ϰڽ��ϱ�?");
		System.out.println("����Ϸ��� 'Y'�� ġ�ʽÿ�.");
		answer = scanner.next().charAt(0);

		while(answer == 'Y') {

			System.out.println("N�� ���� �Է��Ͻÿ�.");
			givenN = scanner.nextInt();

			if(givenN==0) {
				fact=1;
				System.out.println("���: " + fact);
			}
			else if(givenN < 0) {
				System.out.println("�Է��� �����̹Ƿ�, Factorial ���� ����� �� �����ϴ�.");
			}
			else {
				fact = 1;
				i = 2;

				while(i<=givenN) {
					fact = fact*i;
					i = i + 1;
				}
				System.out.println("���: " + fact);
			}
			System.out.println("Factorial�� ����ϰڽ��ϱ�?");
			System.out.println("����Ϸ��� 'Y'�� ġ�ʽÿ�.");
			answer = scanner.next().charAt(0);
		}
		scanner.close();
	}
}
