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
				System.out.println("오류: 100을 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
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
				System.out.println("[국어] 점수: "+aScoreKorean+", 학점: "+gradeKorean+", 평점: "+gradePointKorean);
				System.out.println("[영어] 점수: "+aScoreEnglish+", 학점: "+gradeEnglish+", 평점: "+gradePointEnglish);
				System.out.println("[컴퓨터] 점수: "+aScoreComputer+", 학점: "+gradeComputer+", 평점: "+gradePointComputer);
				System.out.println("이 학생의 평균평점은 "+gpa+"입니다.");
			}
			aScoreKorean = inputScore();
			aScoreEnglish = inputScore();
			aScoreComputer = inputScore();
		}
		GPACounter.count(numberOfGPA3);
		GPACounter.count(numberOfGPA2);
		GPACounter.count(numberOfGPA1);
		GPACounter.count(numberOfGPA0);
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("평균평점이 3.0 이상인 학생은 "+numberOfGPA3+" 명 입니다.");
		System.out.println("평균평점이 2.0 이상 3.0 미만인 학생은 "+numberOfGPA2+" 명 입니다.");
		System.out.println("평균평점이 1.0 이상 2.0 미만인 학생은 "+numberOfGPA1+" 명 입니다.");
		System.out.println("평균평점이 1.0 미만인 학생은 "+numberOfGPA0+" 명 입니다.");
		System.out.println("프로그램을 종료합니다.");
	}
	private static int inputScore() {
		int n;
		System.out.print(">세 과목(국어, 영어, 컴퓨터)의 점수를 입력하시오: ");
		n = aScanner.nextInt();
		return n;
	}
}
