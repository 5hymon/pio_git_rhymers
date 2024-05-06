package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int arraySize = 12;
    public static final int totalSize = -1;
    private int[] numbers = new int[arraySize];

    public int total = totalSize;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == totalSize;
    }

    public boolean isFull() {
        return total == arraySize-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
