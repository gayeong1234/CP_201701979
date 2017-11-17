import java.util.Scanner;
public class Main {
   private static Scanner aScanner;
   public static void main(String[] args) {
      aScanner = new Scanner(System.in);
      int koreanScore;
      int englishScore;
      int computerScore;
      
      System.out.println("> 세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다: ");
      System.out.print("-점수를 입력하시오: ");
      koreanScore = inputNumber();
      System.out.print("-점수를 입력하시오: ");
      englishScore = inputNumber();
      System.out.print("-점수를 입력하시오: ");
      computerScore = inputNumber();
      while ((koreanScore>=0)&&(englishScore>=0)&&(computerScore>=0)) {
         if (koreanScore>100||englishScore>100||computerScore>100) {
            System.out.println("오류: 100 이 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
         }
         else {
            char koreanGrade = score2Grade(koreanScore);
            char englishGrade = score2Grade(englishScore);
            char computerGrade = score2Grade(computerScore);
            double koreanPoint = grade2Point(koreanGrade);
            double englishPoint = grade2Point(englishGrade);
            double computerPoint = grade2Point(computerGrade);
            System.out.println("[국어] 점수 : "+ koreanScore+", 학점 : "+ koreanGrade+", 평점 : "+koreanPoint);
            System.out.println("[영어] 점수 : "+ englishScore+", 학점 : "+ englishGrade+", 평점 : "+englishPoint);
            System.out.println("[컴퓨터] 점수 : "+ computerScore+", 학점 : "+ computerGrade+", 평점 : "+computerPoint);
            
         }
         System.out.println("> 세 과목 (국어, 영어 컴퓨터)의 점수를 차례로 입력합니다: ");
         System.out.print("-점수를 입력하시오: ");
         koreanScore = inputNumber();
         System.out.print("-점수를 입력하시오: ");
         englishScore = inputNumber();
         System.out.print("-점수를 입력하시오: ");
         computerScore = inputNumber();
      }
      System.out.println("음의 정수가 입력되어 프로그램을 종료합니다.");
      System.out.println();
      System.out.println("프로그램을 종료합니다.");
      
   }
   private static int inputNumber() {
       aScanner = new Scanner(System.in);
      int n = aScanner.nextInt();
      return n;
      
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
   private static double grade2Point(int aGrade) {
      double point;
      if (aGrade == 'A') {
         point = 4.0;
      }
      else if (aGrade =='B') {
         point = 3.0;
      }
      else if (aGrade =='C') {
         point = 2.0;
      }
      else if (aGrade =='D') {
         point = 1.0;
      }
      else {
         point = 0.0;
      }
      return point;
   }

}