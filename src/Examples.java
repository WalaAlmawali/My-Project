import java.util.*;
public class Examples {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :" );
        int UserInput = Integer.parseInt(sc.nextLine().trim());
        System.out.println(factorialNum(UserInput));

    }
    public  static int factorialNum(int num ){
        int result = 1;

        for(int i = 1; i<=num;i++){

            result*= i;
        }
        return result;
    }

    public static int SumOfNumbers(int [] arr){
        int total = 0;

    }


}
