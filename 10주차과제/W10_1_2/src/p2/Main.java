package p2;
import java.util.Scanner;
public class Main {
	private static Scanner aScanner = new Scanner (System.in);
	public static void main(String[] args) {
		Student student = null;
		student = new Student();
		int currentScore;
		char grade;
		double gradePoint;
		currentScore = inputScore();
		while (currentScore>=0) {
			if (currentScore>100) {
				System.out.println("오류: 100을 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				student.setScore(currentScore);
				grade = student.grade();
				gradePoint = student.gradePoint();
				System.out.println("점수: "+currentScore+", 학점: "+grade+", 평점: "+gradePoint);
			}
			currentScore = inputScore();
		}
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}
	private static int inputScore() {
		int n;
		System.out.print(">점수를 입력하시오: ");
		n = aScanner.nextInt();
		return n;
	}
}
