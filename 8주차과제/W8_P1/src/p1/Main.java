package p1;
import java.util.Scanner;
public class Main {
	private static final int MAX_SIZE = 100;
	private static Scanner aScanner = new Scanner(System.in); 
	public static void main(String[] args) {
		int score;
		int[] scores = new int[MAX_SIZE];
		int numberOfStudents;
		int count;
		numberOfStudents = 0;
		count = 0;
		score = inputScore();
		
		while (score>=0) {
			if (score>100) {
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				scores[numberOfStudents] = score;
				numberOfStudents++;
			}
			score = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� "+numberOfStudents+"���� ������ �ԷµǾ����ϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		while (count<numberOfStudents) {
			System.out.println("["+count+"] "+scores[count]);
			count++;
		}
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
		
		
	}
	private static int inputScore() {
		int scoreFromScanner;
		System.out.print(">������ �Է��Ͻÿ�: ");
		scoreFromScanner = aScanner.nextInt();
		return scoreFromScanner;
	}

}
