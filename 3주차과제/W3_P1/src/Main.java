import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p1 = new Scanner(System.in);
		System.out.println("a의 값을 입력하시오.");
		double a = p1.nextDouble();
		System.out.println("b의 값을 입력하시오.");
		double b = p1.nextDouble();
		System.out.println("c의 값을 입력하시오.");
		double c = p1.nextDouble();
		
		double determinant;
		double x1, x2;
		
		System.out.println("a=" + a + " b=" + b + " c=" + c);
		determinant = b*b - 4.0*a*c;
		x1 = (-b + Math.sqrt(determinant))/(2.0*a);
		x2 = (-b - Math.sqrt(determinant))/(2.0*a);
		
		if (a == 0) 
		{
			System.out.println("오류: 이차항의 계수가 0이므로, 이차방정식을 풀 수 없습니다.");
		}
		else
		{
			if (determinant < 0)
			{ 
				System.out.println("오류: 실근이 존재하지 않으므로, 이차방정식을 풀 수 없습니다.");
				
			}else 
			{ 
				System.out.println("The solution is either " + x1 + " or " + x2);
			}
		}
	}		
}
			
			
		
		


