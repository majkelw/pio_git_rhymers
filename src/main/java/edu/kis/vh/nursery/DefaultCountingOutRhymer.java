package edu.kis.vh.nursery;

/**
 * class controlling the state of the array to which elements can be added
 */
public class DefaultCountingOutRhymer {
    private static final int SIZE_OF_ARRAY = 12;
    private static final int ERROR_CODE = -1;
    private static final int[] numbers = new int[SIZE_OF_ARRAY];

    private int total = ERROR_CODE;

    /**
     * pre-increment the value "in" and insertion into the array
     *
     * @param in value to insert
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * check if the array is empty
     *
     * @return boolean value, true if empty, false if not
     */
    public boolean isEmpty() {
        return total == ERROR_CODE;
    }

    /**
     * check if the array is full
     *
     * @return boolean value, true if full, false if not
     */
    public boolean isFull() {
        return total == SIZE_OF_ARRAY - 1;
    }

    /**
     * return last entered value, if array is empty, return ERROR_CODE
     *
     * @return the last entered value in the array
     */
    protected int peekaboo() {
        if (isEmpty())
            return ERROR_CODE;
        return numbers[total];
    }

    /**
     * return last entered value and reduce current index, if array is empty, return ERROR_CODE
     *
     * @return the last entered value in the array
     */
    public int countOut() {
        if (isEmpty())
            return ERROR_CODE;
        return numbers[total--];
    }

    /**
     * return current index in the array
     * @return current index in the array
     */
    public int getTotal() {
        return total;
    }
}
