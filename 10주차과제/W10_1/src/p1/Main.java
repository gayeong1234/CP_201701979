package p1;
import java.util.Scanner;
public class Main {
	private static Scanner aScanner = new Scanner (System.in);
	public static void main(String[] args) {
		Student student = null;
		student = new Student();
		int currentScore;
		char grade;
		currentScore = inputScore();
		while (currentScore>=0) {
			if (currentScore>100) {
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				student.setScore(currentScore);
				grade = student.grade();
				System.out.println("����: "+currentScore+", ����: "+grade);
			}
			currentScore = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
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
