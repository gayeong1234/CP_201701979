import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("이차방정식을 풀겠습니까? ");
		System.out.println("풀겠으면  'Y'를 치십시오: ");
		char userAnswer = scanner.next().charAt(0);
		while (userAnswer == 'Y') {

			
		    System.out.println("a의 값을 입력하시오.");
			double a = scanner.nextDouble();
			System.out.println("b의 값을 입력하시오.");
			double b = scanner.nextDouble();
			System.out.println("c의 값을 입력하시오.");
			double c = scanner.nextDouble();

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
			System.out.println("이차방정식을 풀겠습니까? ");
			System.out.println("풀겠으면 'Y'를 치십시오: ");
			userAnswer = scanner.next().charAt(0);
		}
	    scanner.close();
	}	
	
}