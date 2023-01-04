package com.book_review.chap_02_object_oriented_programming;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
