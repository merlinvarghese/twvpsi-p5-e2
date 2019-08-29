package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityComparatorTest {

    //Step 1
    @Test
    void expectTrueIfEventIsSame() {
        ProbabilityComparator coinProbability = new ProbabilityComparator(0.5);
        assertTrue(coinProbability.equals(coinProbability));
    }

    //Step 2
    @Test
    void expectFalseIfOtherEventIsNull() {
        ProbabilityComparator coinProbability = new ProbabilityComparator(0.5);
        assertFalse(coinProbability.equals(null));
    }

    //Step 2
    @Test
    void expectFalseIfBothObjectsAreDifferent() {
        ProbabilityComparator coinProbability = new ProbabilityComparator(0.5);
        String differentObject = "";
        assertFalse(coinProbability.equals(differentObject));
    }

    //Step 3
    @Test
    void expectTrueIfProbabilityOfBothEventsAreSame() {
        ProbabilityComparator coinProbability = new ProbabilityComparator(0.5);
        ProbabilityComparator diceProbability = new ProbabilityComparator(0.5);
        assertTrue(coinProbability.equals(diceProbability));
    }

    //Step 3
    @Test
    void expectFalseIfProbabilityOfBothEventsAreDifferent() {
        ProbabilityComparator coinProbability = new ProbabilityComparator(0.5);
        ProbabilityComparator diceProbability = new ProbabilityComparator(0.6);
        assertFalse(coinProbability.equals(diceProbability));
    }

    @Test
    void expectCombinedProbabilityOfTwoEvents() {
        ProbabilityComparator coinProbability = new ProbabilityComparator(0.5);
        ProbabilityComparator diceProbability = new ProbabilityComparator(0.16);
        ProbabilityComparator andValue = new ProbabilityComparator(0.08);
        assertEquals(andValue, coinProbability.and(diceProbability));
    }
}
