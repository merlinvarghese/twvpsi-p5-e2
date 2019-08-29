package com.tw.vapasi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProbabilityComparatorTest {

    @Test
    void expectProbability1EqualToProbability2(){
        ProbabilityComparator probability = new ProbabilityComparator(2,1);
        ProbabilityComparator probability1 = new ProbabilityComparator(2,1);
        assertTrue(probability.isEqual(probability1));
    }



}
