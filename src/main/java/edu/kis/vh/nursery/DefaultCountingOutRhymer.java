package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int SIZE_OF_ARRAY = 12;
    private static final int ERROR_CODE = -1;
    private static final int[] numbers = new int[SIZE_OF_ARRAY];

    private int index = ERROR_CODE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++index] = in;
    }

    public boolean isEmpty() {
        return index == ERROR_CODE;
    }

    public boolean isFull() {
        return index == SIZE_OF_ARRAY - 1;
    }

    protected int peekaboo() {
        if (isEmpty())
            return ERROR_CODE;
        return numbers[index];
    }

    public int countOut() {
        if (isEmpty())
            return ERROR_CODE;
        return numbers[index--];
    }

}
