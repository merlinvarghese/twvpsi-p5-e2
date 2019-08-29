package com.tw.vapasi;

import java.util.Objects;

//Understands the chances of occurrences of Events
class ProbabilityComparator {

    final private double value;

    ProbabilityComparator(double value)
    {
        this.value = value;
    }

    public boolean equals(Object otherProbability) {
        if(this == otherProbability) {
            return true;
        }
        if((otherProbability == null) || (otherProbability.getClass() != this.getClass()))
            return false;

        if(this.value == ((ProbabilityComparator)otherProbability).value)
            return true;

        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this);
    }

    ProbabilityComparator and(ProbabilityComparator otherProbability){
        return new ProbabilityComparator(this.value * otherProbability.value);
    }
}
