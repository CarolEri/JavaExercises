/*  Simple coded by Caroline Eri Sato Ushirobira - IBM Software Developer, March 2023.
    04. Java Interface
*/

public class Exercise4implementingInterface implements Exercise4AdvancedArithmetic{

    public int divisorSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        System.out.println("The sum is: " + sum);
        return sum;      
    }
}