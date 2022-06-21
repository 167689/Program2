import java.util.Scanner;

class Main {
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) 
  {
    
        System.out.println("Witaj w programie rysującym tablice funkcji cztero wartościowych");
    System.out.println("Podaj liczbę jedynek");
        int liczba =scan.nextInt(); 
    int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,r;
    if (liczba<16)
    {
    int[] dane= new int[liczba];
    for(int z=0;z<liczba;z++)
    {
       System.out.println("Podaj liczbę :"+ (z+1));
      r =scan.nextInt();  
     if (r<16)
     {
       dane[z]=r;
     }
     else{
       System.out.println("Zła liczba");
     }
    }
    scan.close();
    for(int z=0;z<liczba;z++)
    {
      if(dane[z]==1)
       {
        b=1;
       }
      else if((dane[z]==2))
       {
        c=1;
       }
      else if((dane[z]==3))
       {
        d=1;
       }
      else if((dane[z]==4))
       {
        e=1;
       }
      else if((dane[z]==5))
       {
        f=1;
       }
      else if((dane[z]==6))
       {
        g=1;
       }
      else if((dane[z]==7))
       {
        h=1;
       }
      else if((dane[z]==8))
       {
        i=1;
       }
      else if((dane[z]==9))
       {
        j=1;
       }
      else if((dane[z]==10))
      {
        k=1;
      }
      else if((dane[z]==11))
      {
        l=1;
      }
      else if((dane[z]==12))
      {
         m=1;
      }
      else if((dane[z]==13))
      {
         n=1;
      }
      else if((dane[z]==14))
      {
         o=1;
      }
      else if((dane[z]==15))
      {
         p=1;
      }
                                  
      else 
      {
        a=1;
      }
    }
    System.out.println("Wykres");
      System.out.println("X2X1/X4X3  00  01  11  10");
      System.out.println("    00     "+ a+ "   " + b+"   " + d+"   " + c+"   " );
      System.out.println("    01     "+ e+ "   " + f+"   " + h+"   " + g+"   " );                        System.out.println("    11     "+ m+ "   " + n+"   " + p+"   " + o+"   " );
      System.out.println("    10     "+ i+ "   " + j+"   " + l+"   " + k+"   " );
      
    }
  else
    {
    System.out.println("Zła liczba");
  }
  
  
 
  
  }
}

        