import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int score;
		int count = 0;
		int sumOfScores = 0;
		char grade = 0 ;
		int Astudent = 0;
		int Bstudent = 0;
		int Cstudent = 0;
		int Dstudent = 0;
		int Fstudent = 0;

		System.out.print("������ �Է��Ͻÿ�: ");
		score = scanner.nextInt();
		while (score >= 0) {
			//���� ó��
			if (score > 100) {//�߸��� ����
				System.out.println("����: �ִ����� 100�� �Ѿ����ϴ�. ");
			}
			else { //�������� ����
				count = count + 1;
				sumOfScores = sumOfScores + score;
				if (score >= 90 && score <= 100) {
					grade = 'A';
					Astudent = Astudent + 1;
				}
				else if (score >= 80 && score <= 89) {
					Bstudent = Bstudent + 1;
					grade = 'B';
				}
				else if (score >= 70 && score <= 79) {
					Cstudent = Cstudent + 1;
					grade = 'C';
				}
				else if (score >= 60 && score <= 69) {
					Dstudent = Dstudent + 1;
					grade = 'D';
				}
				else if (score >= 0 && score <= 59){
					Fstudent = Fstudent + 1;
					grade = 'F';
				}
				System.out.println("����: " + score + ", ����:" + grade);

			}
			System.out.print("������ �Է��Ͻÿ�: ");
			score = scanner.nextInt();
		}

		System.out.println();
		System.out.println("�л����� " + count + "�� �Դϴ�.");
		System.out.println("A�� " + Astudent + " �� �Դϴ�." );
		System.out.println("B�� " + Bstudent + " �� �Դϴ�." );
		System.out.println("C�� " + Cstudent + " �� �Դϴ�." );
		System.out.println("D�� " + Dstudent + " �� �Դϴ�." );
		System.out.println("F�� " + Fstudent + " �� �Դϴ�." );

		double average = (double) sumOfScores / (double) count ;
		System.out.println("����� " + average + "�� �Դϴ�."); 
		scanner.close();
	}

}
