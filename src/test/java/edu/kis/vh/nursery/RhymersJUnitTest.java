package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    private static final int TEST_VALUE = 4;
	private static final int BIG_TEST_VALUE = 888;
    private static final int EMPTY_STACK_VALUE = -1;

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        rhymer.countIn(TEST_VALUE);

        int result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
    }

    @Test
    public void testIsEmpty() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.isEmpty();
        Assert.assertEquals(true, result);

        rhymer.countIn(BIG_TEST_VALUE);

        result = rhymer.isEmpty();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(BIG_TEST_VALUE);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        rhymer.countIn(TEST_VALUE);

        result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        rhymer.countIn(TEST_VALUE);

        result = rhymer.countOut();
        Assert.assertEquals(TEST_VALUE, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
