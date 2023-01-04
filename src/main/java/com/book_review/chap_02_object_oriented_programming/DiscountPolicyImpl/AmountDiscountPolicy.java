package com.book_review.chap_02_object_oriented_programming.DiscountPolicyImpl;

import com.book_review.chap_02_object_oriented_programming.DiscountCondition;
import com.book_review.chap_02_object_oriented_programming.DiscountPolicy;
import com.book_review.chap_02_object_oriented_programming.Money;
import com.book_review.chap_02_object_oriented_programming.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition ... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
