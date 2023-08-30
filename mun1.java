import java.util.Scanner;

public class mun1{
    public static void main(String[] args)
    {
    
    Scanner sc = new Scanner(System.in);
     System.out.print("이름을 입력해주세요: ");
      String name = sc.nextLine();
      System.out.print("한국점수: ");
      int kor = sc.nextInt();
      System.out.print("영국점수: ");
      int eng = sc.nextInt();
      System.out.print("mat?점수: ");
      int mat = sc.nextInt();

      int hap=mat+kor+eng;
      double avr= hap/3.0;
System.out.printf("이름%s \n합계점수%d \n평균점수%.1f\n",name,hap,avr);
      
    }
}
