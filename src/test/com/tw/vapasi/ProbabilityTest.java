package com.tw.vapasi;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    //Step 1
    @Test
    void expectTrueIfEventIsSame() {
        Probability coinProbability = new Probability(0.5);
        assertTrue(coinProbability.equals(coinProbability));
    }

    //Step 2
    @Test
    void expectFalseIfOtherEventIsNull() {
        Probability coinProbability = new Probability(0.5);
        assertFalse(coinProbability.equals(null));
    }

    //Step 2
    @Test
    void expectFalseIfBothObjectsAreDifferent() {
        Probability coinProbability = new Probability(0.5);
        String differentObject = "";
        assertFalse(coinProbability.equals(differentObject));
    }

    //Step 3
    @Test
    void expectTrueIfProbabilityOfBothEventsAreSame() {
        Probability coinProbability = new Probability(0.5);
        Probability diceProbability = new Probability(0.5);
        assertTrue(coinProbability.equals(diceProbability));
    }

    //Step 3
    @Test
    void expectFalseIfProbabilityOfBothEventsAreDifferent() {
        Probability coinProbability = new Probability(0.5);
        Probability diceProbability = new Probability(0.6);
        assertFalse(coinProbability.equals(diceProbability));
    }

    @Test
    void expectAndOfProbabilityOfTwoEvents() {
        Probability coinProbability = new Probability(0.5);
        Probability diceProbability = new Probability(0.16);
        Probability andExpected = new Probability(0.08);

        Probability andActual = coinProbability.and(diceProbability);

        assertEquals(andExpected,andActual );
    }

    @Test
    void expectOrOfProbabilityOfTwoEvents() {
        Probability coinProbability = new Probability(0.5);
        Probability diceProbability = new Probability(0.16);
        Probability orExpected = new Probability(0.58);

        Probability orActual = coinProbability.or(diceProbability);

        assertEquals(orExpected,orActual);
    }

    @Test
    void expectComplementOfAnEvent() {
        Probability diceProbability = new Probability(0.16);
        Probability notExpected = new Probability(0.84);

        Probability notActual = diceProbability.not();

        assertEquals(notExpected,notActual );
    }
}

