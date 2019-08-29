package com.tw.vapasi;
//Understands the chances of occurrences of Events
class ProbabilityComparator {

    private double probability;

    ProbabilityComparator(double probability)
    {
        this.probability = probability;
    }

    boolean equals(ProbabilityComparator otherProbability) {
        if(this == otherProbability) {
            return true;
        }
        if((otherProbability == null) || (otherProbability.getClass() != this.getClass()))
            return false;

        if(this.probability == otherProbability.probability)
            return true;
        else
            return false;
    }

    double combineProbability(ProbabilityComparator otherProbability){
        return this.probability * otherProbability.probability;
    }
}
