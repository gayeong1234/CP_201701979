import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������ Ǯ�ڽ��ϱ�? ");
		System.out.println("Ǯ������  'Y'�� ġ�ʽÿ�: ");
		char userAnswer = scanner.next().charAt(0);
		while (userAnswer == 'Y') {

			
		    System.out.println("a�� ���� �Է��Ͻÿ�.");
			double a = scanner.nextDouble();
			System.out.println("b�� ���� �Է��Ͻÿ�.");
			double b = scanner.nextDouble();
			System.out.println("c�� ���� �Է��Ͻÿ�.");
			double c = scanner.nextDouble();

			double determinant;
			double x1, x2;

			System.out.println("a=" + a + " b=" + b + " c=" + c);
			determinant = b*b - 4.0*a*c;
			x1 = (-b + Math.sqrt(determinant))/(2.0*a);
			x2 = (-b - Math.sqrt(determinant))/(2.0*a);

			if (a == 0) 
			{
				System.out.println("����: �������� ����� 0�̹Ƿ�, ������������ Ǯ �� �����ϴ�.");
			}
			else
			{
				if (determinant < 0)
				{ 
					System.out.println("����: �Ǳ��� �������� �����Ƿ�, ������������ Ǯ �� �����ϴ�.");

				}else 
				{ 
					System.out.println("The solution is either " + x1 + " or " + x2);
				}
			}
			System.out.println("������������ Ǯ�ڽ��ϱ�? ");
			System.out.println("Ǯ������ 'Y'�� ġ�ʽÿ�: ");
			userAnswer = scanner.next().charAt(0);
		}
	    scanner.close();
	}	
	
}