package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int arraySize = 12;
    private static final int totalSize = -1;
    private static final int returnValue =-1;
    private final int[] numbers = new int[arraySize];

    public int getTotal() {
        return total;
    }

    private int total = totalSize;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == totalSize;
    }

    public boolean isFull() {
        return total == arraySize + totalSize;
    }

    protected int peekaboo() {
        if (callCheck())
            return returnValue;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return returnValue;
        return numbers[total--];
    }

}
