package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int START_SIZE_VALUE = -1;
    public static final int CAPACITY = 12;
    public static final int MAX_SIZE = 11;
    private final int[] numbers = new int[CAPACITY];

    public int total = START_SIZE_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == START_SIZE_VALUE;
    }

    public boolean isFull() {
        return total == MAX_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return START_SIZE_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return START_SIZE_VALUE;
        return numbers[total--];
    }

}
