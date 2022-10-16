package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {


        if (lengthOfLastNumber < 1){
            System.out.println("0");
            return;
        }
            int n1 = 9;
        int n2 = 0;
        int sum = 9;

        for (int i = 1; i < lengthOfLastNumber; i++) {
            n2 = n1;
            n2 = n2 * 10 + 9;
            sum += n2;
            n1 = n2;
        }
        System.out.println(sum);
    }
}
