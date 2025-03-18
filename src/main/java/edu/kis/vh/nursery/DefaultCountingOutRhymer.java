package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_CAPACITY = 12;
    public static final int EMPTY_RHYMER = -1;
    public static final int ERROR_VALUE = -1;

    private int[] numbers = new int[NUMBERS_CAPACITY];

    public int total = EMPTY_RHYMER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER;
    }

    public boolean isFull() {
        return total == NUMBERS_CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total--];
    }

}
