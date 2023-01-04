package com.book_review.chap_02_object_oriented_programming.DiscountPolicyImpl;

import com.book_review.chap_02_object_oriented_programming.DiscountCondition;
import com.book_review.chap_02_object_oriented_programming.DiscountPolicy;
import com.book_review.chap_02_object_oriented_programming.Money;
import com.book_review.chap_02_object_oriented_programming.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
