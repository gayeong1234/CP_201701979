import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�>>");
		System.out.println();
		System.out.println("���� ����(�����Ϸ��� ����)�� �Է��Ͻÿ�: ");
		n = scanner.nextInt();
		while (n >= 0) {
			printAsterisks (n);
			System.out.println("���� ����(�����Ϸ��� ����)�� �Է��Ͻÿ�: ");
			n = scanner.nextInt();
		}

		scanner.close();
	}
	
	private static void printAsterisks(int n) {
		int a;
		a = 0;
		while (a < n) {
			System.out.print("*");
			a++;
		}
		System.out.println();
	}



}
