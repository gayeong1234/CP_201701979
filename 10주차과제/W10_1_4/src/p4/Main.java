package p4;
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
		double gradePointKorean;
		double gradePointEnglish;
		double gradePointComputer;
		double gpa;
		int numberOfGPA3 = 0;
		int numberOfGPA2 = 0;
		int numberOfGPA1 = 0;
		int numberOfGPA0 = 0;
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
				gradePointKorean = student.gradePointKorean();
				gradePointEnglish = student.gradePointEnglish();
				gradePointComputer = student.gradeComputer();
				gpa = student.gpa();
				System.out.println("[����] ����: "+aScoreKorean+", ����: "+gradeKorean+", ����: "+gradePointKorean);
				System.out.println("[����] ����: "+aScoreEnglish+", ����: "+gradeEnglish+", ����: "+gradePointEnglish);
				System.out.println("[��ǻ��] ����: "+aScoreComputer+", ����: "+gradeComputer+", ����: "+gradePointComputer);
				System.out.println("�� �л��� ��������� "+gpa+"�Դϴ�.");
			}
			aScoreKorean = inputScore();
			aScoreEnglish = inputScore();
			aScoreComputer = inputScore();
		}
		GPACounter.count(numberOfGPA3);
		GPACounter.count(numberOfGPA2);
		GPACounter.count(numberOfGPA1);
		GPACounter.count(numberOfGPA0);
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��������� 3.0 �̻��� �л��� "+numberOfGPA3+" �� �Դϴ�.");
		System.out.println("��������� 2.0 �̻� 3.0 �̸��� �л��� "+numberOfGPA2+" �� �Դϴ�.");
		System.out.println("��������� 1.0 �̻� 2.0 �̸��� �л��� "+numberOfGPA1+" �� �Դϴ�.");
		System.out.println("��������� 1.0 �̸��� �л��� "+numberOfGPA0+" �� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
	}
	private static int inputScore() {
		int n;
		System.out.print(">�� ����(����, ����, ��ǻ��)�� ������ �Է��Ͻÿ�: ");
		n = aScanner.nextInt();
		return n;
	}
}
