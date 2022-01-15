import java.math.*;
public class large_factorial {
    public static String solve(int A) {

        if(A==1 || A==0)
        return "1";

        BigInteger fact = BigInteger.ONE;

        if(A >=1  && A <=100){
            for(int i=1; i<=A; i++)
            fact = fact.multiply(BigInteger.valueOf(i));

            return String.valueOf(fact);

        }else return "0";
    }

    public static void main(String[] java){
        int fact =5;
        System.out.print("factrorial of " + fact +": "+solve(fact));
    }
}
