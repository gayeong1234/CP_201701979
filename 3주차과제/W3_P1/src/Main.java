import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p1 = new Scanner(System.in);
		System.out.println("a�� ���� �Է��Ͻÿ�.");
		double a = p1.nextDouble();
		System.out.println("b�� ���� �Է��Ͻÿ�.");
		double b = p1.nextDouble();
		System.out.println("c�� ���� �Է��Ͻÿ�.");
		double c = p1.nextDouble();
		
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
	}		
}
			
			
		
		


