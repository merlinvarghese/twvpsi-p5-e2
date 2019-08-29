package com.tw.vapasi;
//Understands the chances of occurrences of Events
class ProbabilityComparator {

    private int numberOfChances;
    private int eventOccurrences;

    ProbabilityComparator(int numberOfChances, int eventOccurrence)
    {
        this.numberOfChances = numberOfChances;
        this.eventOccurrences = eventOccurrences;
    }

    boolean isEqual(ProbabilityComparator probability) {
        return true;
    }
}
