package com.book_review.chap_02_object_oriented_programming.DiscountPolicyImpl;

import com.book_review.chap_02_object_oriented_programming.DiscountCondition;
import com.book_review.chap_02_object_oriented_programming.DefaultDiscountPolicy;
import com.book_review.chap_02_object_oriented_programming.Money;
import com.book_review.chap_02_object_oriented_programming.Screening;

public class AmountDefaultDiscountPolicy extends DefaultDiscountPolicy {
    private Money discountAmount;

    public AmountDefaultDiscountPolicy(Money discountAmount, DiscountCondition ... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
