import java.util.*;
public class Examples {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

       /* System.out.print("Enter a number :" );
        int UserInput = Integer.parseInt(sc.nextLine().trim());
        System.out.println(factorialNum(UserInput));*/

        System.out.print("Enter the number of numbers you want to add :" );
        int arrSize = Integer.parseInt(sc.nextLine());

        int [] arr = new int[arrSize];

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
        for(int i = 0 ; i< arr.length;i++){
            total+=arr[i];

        }
        return total;
    }

}
