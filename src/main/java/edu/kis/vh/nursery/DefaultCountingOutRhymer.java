package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private final int SIZE_OF_ARRAY = 12;
    private final int ERROR_CODE = -1;
    private int[] numbers = new int[SIZE_OF_ARRAY];

    private int index = ERROR_CODE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++index] = in;
    }

    public boolean isEmpty() {
        return index == ERROR_CODE;
    }

    public boolean isFull() {
        return index == SIZE_OF_ARRAY + ERROR_CODE;
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
