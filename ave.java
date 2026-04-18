import java.util.Scanner;

public class ave {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 4 grades");
        double grade1 = input.nextDouble();
        double grade2 = input.nextDouble();
        double grade3 = input.nextDouble();
        double grade4 = input.nextDouble();

        double sum = grade1 + grade2 + grade3 + grade4 ;
        double average = sum/4;

        System.out.print("average: " + average);
        input.close();
    }


}