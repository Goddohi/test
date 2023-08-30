public class mun3 {
  public static void main(String[] args)
  {
  
      int money = (int)(1500000*0.9) + 55000; //오차피 강제형변환이되서 소수점사라짐
      System.out.printf("[급여 명세서]\n");
      System.out.printf("기본급: 1,500,000\n");
      System.out.printf("시간 수당:55,000입니다\n");
      System.out.println("세금은 기본금의 10%\n");
      System.out.println("받으실 돈! "+ money +"원 입니다");
} 
  }
