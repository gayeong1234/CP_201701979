package p3;
import java.util.Scanner;
public class Main {
	private static Scanner aScanner = new Scanner(System.in);
	private static final int MAX_SIZE = 100;
	public static void main(String[] args) {
		int scoreKorean;
		int scoreComputer;
		int[] scoresKorean = new int[MAX_SIZE];
		int[] scoresComputer = new int[MAX_SIZE];
		int numberOfStudents = 0;
		double[] average = new double[MAX_SIZE];
		double totalAverage = 0;
		System.out.print(">�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�: ");
		scoreKorean = inputScore();
		scoreComputer = inputScore();
		while ((scoreKorean>=0)&&(scoreComputer>=0)) {
			if ((scoreKorean>100)||(scoreComputer>100)) {
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				scoresKorean[numberOfStudents] = scoreKorean;
				scoresComputer[numberOfStudents] = scoreComputer;
				average[numberOfStudents] = (double)(scoreKorean+scoreComputer)/2;
				numberOfStudents++;
			}
			System.out.print(">�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�: ");
			scoreKorean = inputScore();
			scoreComputer = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� "+numberOfStudents+" ���� ������ �ԷµǾ����ϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ���� ����� ������ �����ϴ�.");
		int count = 0;
		while (count<numberOfStudents) {
			System.out.println("["+count+"] "+scoresKorean[count]+" "+scoresComputer[count]+" (���  "+average[count]+")");
			totalAverage+=average[count];
			count++;
		}
		totalAverage = totalAverage/numberOfStudents;
		count = 0;
		int i = 0;
		while(i<numberOfStudents) {
			if (totalAverage<=average[i]) {
				count++;
			}
			i++;
		}
		System.out.println();
		System.out.println("�б� ����� "+totalAverage+" �Դϴ�.");
		System.out.println("��� �̻��� �л��� ���� "+count+" �� �Դϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
	}
	private static int inputScore() {
		int n;
		n = aScanner.nextInt();
		return n;
	}
}