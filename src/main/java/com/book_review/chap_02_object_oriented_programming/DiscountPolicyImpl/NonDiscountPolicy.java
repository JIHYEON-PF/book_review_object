package com.book_review.chap_02_object_oriented_programming.DiscountPolicyImpl;

import com.book_review.chap_02_object_oriented_programming.DiscountPolicy;
import com.book_review.chap_02_object_oriented_programming.Money;
import com.book_review.chap_02_object_oriented_programming.Screening;

public class NonDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
