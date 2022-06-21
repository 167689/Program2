import java.util.Scanner;
class Main {
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) 
  {
    
        System.out.println("Witaj w programie przeliczającym minimalizującym funkcje cztero wartościowe");
    System.out.println("Podaj liczę jedynek");
        int liczba =scan.nextInt(); 
    int[] dane= new int[liczba];
    for(int i=0;i<liczba;i++)
    {
       System.out.println("Podaj liczbę :"+ (i+1));
      dane[i] =scan.nextInt();  
    }
    scan.close();
  }
  
  
 
  
  }
  

        