import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        float firstNumber;
        float difference;
        int numberOfObjects;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number you want to start with ");
        firstNumber=scanner.nextFloat();
        System.out.println("Enter the difference between the following objects ");
        difference=scanner.nextFloat();
        System.out.println("Enter the amount of objects in the series ");
        numberOfObjects=scanner.nextInt();
        System.out.print("the series is: "+firstNumber+"\t");
        for (int i=0;i<numberOfObjects;i++){
            System.out.print((firstNumber+=difference)+"\t");
        }


    }
}
