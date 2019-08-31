package com.tw.vapasi;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

//Understands the chances of occurrences of Events
class Probability {
    static final private double CERTAINTY = 1;
    static final private int PRECISION_2_PLACES = 2;
    final private double value;

    Probability(double value) {
        this.value = value;
    }

    Probability and(Probability otherProbability) {
        return new Probability(calculatePrecision(this.value * otherProbability.value));
    }

    Probability or(Probability otherProbability) {
        return new Probability(calculatePrecision(this.value + otherProbability.value - and(otherProbability).value));
    }

    Probability not() {
        return new Probability(calculatePrecision(CERTAINTY - this.value));
    }

    private double calculatePrecision(double valueToBeConverted){
        BigDecimal bigDecimalValue = BigDecimal.valueOf(valueToBeConverted);
        return  bigDecimalValue.setScale(PRECISION_2_PLACES, RoundingMode.HALF_UP).doubleValue();
    }

    public boolean equals(Object otherProbability) {
        if (this == otherProbability) {
            return true;
        }
        if ((otherProbability == null) || (otherProbability.getClass() != this.getClass()))
            return false;

        return this.value == ((Probability) otherProbability).value;
    }

    public int hashCode() {
        return Objects.hashCode(this.value);
    }
}
