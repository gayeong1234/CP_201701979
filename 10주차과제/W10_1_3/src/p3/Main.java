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
				System.out.println("오류: 100을 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
			}
			else {
				student.setScoreKorean(aScoreKorean);
				student.setScoreEnglish(aScoreEnglish);
				student.setScoreComputer(aScoreComputer);
				gradeKorean = student.gradeKorean();
				gradeEnglish = student.gradeEnglish();
				gradeComputer = student.gradeComputer();
				System.out.println("[국어] 점수: "+aScoreKorean+", 학점: "+gradeKorean);
				System.out.println("[영어] 점수: "+aScoreEnglish+", 학점: "+gradeEnglish);
				System.out.println("[컴퓨터] 점수: "+aScoreComputer+", 학점: "+gradeComputer);
			}
			aScoreKorean = inputScore();
			aScoreEnglish = inputScore();
			aScoreComputer = inputScore();
		}
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}
	private static int inputScore() {
		int n;
		System.out.print(">세 과목(국어, 영어, 컴퓨터)의 점수를 입력하시오: ");
		n = aScanner.nextInt();
		return n;
	}
}
