// Approch 3

import java.util.Scanner; 

public class program39j{   

    public static void main (String A[]){
        
        Scanner scanner = null;
        Arithamatic arithamatic = null;

        int iValue1 = 0, iValue2 = 0, iResult = 0;

          scanner = new Scanner(System.in);
          System.out.println("enter first number");
          iValue1 = scanner.nextInt();

          System.out.println("enter Second number");
          iValue2 = scanner.nextInt();

          arithamatic = new Arithamatic();

        iResult = arithamatic.Addition(iValue1, iValue2);

        System.out.println("Addition is :" + iResult);       
    }
}
class Arithamatic {
        public int Addition(int iNo1, int iNo2)
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }
}
