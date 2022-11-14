import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int amountOfPrimeNumber;
        int checkPrimeNumber=0;
        int firstNumberToCheck=3;     // The second number in the series.
        int sumOfPrimeNumbers=1;
        do{
            System.out.println("How much prime numbers you want to see? (Enter a number positive and grater than-0)");
            amountOfPrimeNumber=scanner.nextInt();
      }while(amountOfPrimeNumber<=0);
        System.out.println(2);
      while (sumOfPrimeNumbers!=amountOfPrimeNumber){
          for(int i=2;i<firstNumberToCheck;i++) { //The number one is not a prime number.
              if (firstNumberToCheck % i == 0) {
                  checkPrimeNumber = 1;
                  break;
              }
          }
              if (checkPrimeNumber==0){
                  System.out.println(firstNumberToCheck);
                  sumOfPrimeNumbers++;
              }
                else {
                  checkPrimeNumber=0;
              }

          firstNumberToCheck+=2; //An even number is never a prime number.
      }



    }
}
