package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = secondBoarder*(secondBoarder+1)/2 - firstBoarder*(firstBoarder+1)/2 + firstBoarder;
        System.out.println(sum);
    }
}
