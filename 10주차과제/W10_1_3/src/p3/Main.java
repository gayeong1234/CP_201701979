package p3;
import java.util.Scanner;
public class Main {
	private static Scanner aScanner = new Scanner (System.in);
	public static void main(String[] args) {
		Student student = null;
		student = new Student();
		int aScoreKorean;
		int aScoreEnglish;
		int aScoreComputer;
		char gradeKorean;
		char gradeEnglish;
		char gradeComputer;
		aScoreKorean = inputScore();
		aScoreEnglish = inputScore();
		aScoreComputer = inputScore();
		while (aScoreKorean>=0 && aScoreEnglish>=0 && aScoreComputer>=0) {
			if ((aScoreKorean> 100) || (aScoreEnglish> 100) || (aScoreComputer> 100 )) {
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			}
			else {
				student.setScoreKorean(aScoreKorean);
				student.setScoreEnglish(aScoreEnglish);
				student.setScoreComputer(aScoreComputer);
				gradeKorean = student.gradeKorean();
				gradeEnglish = student.gradeEnglish();
				gradeComputer = student.gradeComputer();
				System.out.println("[����] ����: "+aScoreKorean+", ����: "+gradeKorean);
				System.out.println("[����] ����: "+aScoreEnglish+", ����: "+gradeEnglish);
				System.out.println("[��ǻ��] ����: "+aScoreComputer+", ����: "+gradeComputer);
			}
			aScoreKorean = inputScore();
			aScoreEnglish = inputScore();
			aScoreComputer = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
	}
	private static int inputScore() {
		int n;
		System.out.print(">�� ����(����, ����, ��ǻ��)�� ������ �Է��Ͻÿ�: ");
		n = aScanner.nextInt();
		return n;
	}
}
