package p2;
import java.util.Scanner;
public class Main {
	private static Scanner aScanner = new Scanner (System.in);
	private static final int MAX_SIZE = 100;
	public static void main(String[] args) {
		int score;
		int[] scores = new int[MAX_SIZE];
		int numberOfStudents = 0;
		int total = 0;
		double classAverage;
		score = inputScore();
		while (score>=0) {
			if (score>100) {
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				scores[numberOfStudents]=score;
				numberOfStudents++;
				total = total + score;
			}
			score = inputScore();
		}
		classAverage = (double)total/(double)numberOfStudents;
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� "+numberOfStudents+"���� ������ �ԷµǾ����ϴ�.");
		System.out.println("����� "+classAverage+"�Դϴ�.");
		System.out.println();
		
		int aboveClassAverage = 0;
		int count = 0;
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		while(count<numberOfStudents) {
			if ((double)scores[count]>=classAverage) {
				System.out.println("["+count+"] "+scores[count]+" (��� �̻��Դϴ�)");
				aboveClassAverage++;
			}
			else {
				System.out.println("["+count+"] "+scores[count]+" (��� �̸��Դϴ�)");
			}
			count++;
		}
		System.out.println("��� �̻��� �л��� ���� "+aboveClassAverage+" �� �Դϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
	}
	private static int inputScore() {
		int n;
		System.out.print(">������ �Է��Ͻÿ�: ");
		n = aScanner.nextInt();
		return n;
	}
	

}

