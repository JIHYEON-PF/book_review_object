package com.book_review.chap_02_object_oriented_programming.DiscountConditionImpl;

import com.book_review.chap_02_object_oriented_programming.DiscountCondition;
import com.book_review.chap_02_object_oriented_programming.Screening;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
