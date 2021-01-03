package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int index = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++index] = in;
    }

    public boolean callCheck() {
        return index == -1;
    }

    public boolean isFull() {
        return index == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[index];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[index--];
    }

}
