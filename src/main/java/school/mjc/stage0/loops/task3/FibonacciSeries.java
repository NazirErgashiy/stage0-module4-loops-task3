package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        long num0 = 1;
        long num1 = 1;
        long num2 = 1;
        System.out.println("0"+"\n"+"1"+"\n"+"1");
        for (int i = 3; i < lastFibonacci; i++) {
            num2 = num0 + num1;
            num0 = num1;
            num1 = num2;
            System.out.println(num2);
        }
    }
}
