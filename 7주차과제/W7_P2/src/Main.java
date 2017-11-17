import java.util.Scanner;
public class Main {
   private static Scanner aScanner;
   public static void main(String[] args) {
       aScanner = new Scanner(System.in);
      int score;
      int aNumber =0, bNumber=0, cNumber=0, dNumber=0, fNumber=0;
      System.out.print("- 점수를 입력하시오. : ");
      score = aScanner.nextInt();
      while (score>=0) {
         if (score>100) {
            System.out.println("오류 : 최대점수 100을 넘었습니다.");
         }
         else {
            
            char grade = score2Grade(score);
            double point = grade2Point(grade);
            System.out.println("점수 : "+score+" 학점 : "+grade+ " 평점 : "+point);
            if ((90<=score)&&(score<=100)) {
               aNumber++;
            }
            else if ((80<=score)&&(score<90)) {
               bNumber++;
            }
            else if ((70<=score)&&(score<80)) {
               cNumber++;
            }
            else if ((60<=score)&&(score<70)) {
               dNumber++;
            }
            else {
               fNumber++;
            }
         }
         System.out.print("- 점수를 입력하시오. : ");
         score = aScanner.nextInt();
      }
      
      System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
      System.out.println();
      System.out.println("A는 "+aNumber+"명 입니다.");
      System.out.println("B는 "+bNumber+"명 입니다.");
      System.out.println("C는 "+cNumber+"명 입니다.");
      System.out.println("D는 "+dNumber+"명 입니다.");
      System.out.println("F는 "+fNumber+"명 입니다.");
      System.out.println("프로그램을 종료합니다.");
      
   }
   private static char score2Grade(int aScore) {
      char aGrade;
      if ((90<=aScore)&&(aScore<=100)) {
         aGrade = 'A';
      }
      else if ((80<=aScore)&&(aScore<90)) {
         aGrade = 'B';
      }
      else if ((70<=aScore)&&(aScore<80)) {
         aGrade = 'C';
      }
      else if ((60<=aScore)&&(aScore<70)) {
         aGrade = 'D';
      }
      else {
         aGrade = 'F';
      }
      return aGrade;
      
   }
   private static double grade2Point(int grade) {
      double point;
      if (grade == 'A') {
         point = 4.0;
      }
      else if (grade == 'B') {
         point = 3.0;
      }
      else if (grade == 'C') {
         point = 2.0;
      }
      else if (grade == 'D') {
         point = 1.0;
      }
      else {
         point = 0.0;
      }
      return point;
   }

}