package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int index = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++index] = in;
    }


    public boolean isEmpty() {
        return index == -1;
    }

    public boolean isFull() {
        return index == 11;
    }

    protected int peekaboo() {
        if (isEmpty())
            return -1;
        return numbers[index];
    }

    public int countOut() {
        if (isEmpty())
            return -1;
        return numbers[index--];
    }

}
