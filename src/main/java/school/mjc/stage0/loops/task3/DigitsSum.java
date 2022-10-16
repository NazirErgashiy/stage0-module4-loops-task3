package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {

        int sum = 0, digit = 0;
        for (; t != 0; ) {
            digit = t % 10;
            sum += digit;
            t /= 10;
        }
        if(sum<0)sum=-sum;
        System.out.println(sum);
    }
}
