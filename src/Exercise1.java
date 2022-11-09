import java.util.Scanner;
//משוואה ריבועית שמחזירה את מספר הפתרונות שקיימים ואת הפתרונות עצמם
public class Exercise1 {
    public static void main(String[] args) {
        float aValue;
        float bValue;
        float cValue;
        double delta;
        double result1;
        double result2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of A");
        aValue = scanner.nextFloat();
        System.out.println("Enter the value of B");
        bValue= scanner.nextFloat();
        System.out.println("Enter the value of C");
        cValue=scanner.nextFloat();
        delta=(bValue*bValue)-4*aValue*cValue;
        //delta=(Math.pow(bValue,2))-4*aValue*cValue; העלאה בחזקה שלמדנו עם נועה
        if (delta<0){
            System.out.println("There is no solution!");
        } else if (delta==0) {
            result1= (bValue*-1)/(2*aValue);
            System.out.println("There is only one solution: " + result1);
        } else {
            result1= ((bValue*-1)+(Math.sqrt(delta)))/(2*aValue);
            result2= ((bValue*-1)-(Math.sqrt(delta)))/(2*aValue);
            System.out.println("There are two solutions:");
            System.out.println("The first solution is: " + result1);
            System.out.println("The first solution is: " + result2);
        }


    }
}
