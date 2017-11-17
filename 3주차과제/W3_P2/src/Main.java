import java.util.Scanner ;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p1 = new Scanner(System.in);
		System.out.println("1부터 N까지 합계를 구하려고 합니다. N값을 입력하십시오:");
		int N = p1.nextInt();
		int count = 1;
		int sum = 0;
		while(count<=N) {
			sum = sum + count;
			
			count = count + 1;
			
		}
		System.out.println("합계: " + sum);
			
		

	} 

}
