import java.math.*;
public class Solution {
    public String solve(int A) {

        if(A==1 || A==0)
        return "1";

        BigInteger fact = BigInteger.ONE;

        if(A >=1  && A <=100){
            for(int i=1; i<=A; i++)
            fact = fact.multiply(BigInteger.valueOf(i));

            return String.valueOf(fact);

        }else return "0";
    }
}
