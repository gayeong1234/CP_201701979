import java.util.Scanner ;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p1 = new Scanner(System.in);
		System.out.println("1���� N���� �հ踦 ���Ϸ��� �մϴ�. N���� �Է��Ͻʽÿ�:");
		int N = p1.nextInt();
		int count = 1;
		int sum = 0;
		while(count<=N) {
			sum = sum + count;
			
			count = count + 1;
			
		}
		System.out.println("�հ�: " + sum);
			
		

	} 

}
