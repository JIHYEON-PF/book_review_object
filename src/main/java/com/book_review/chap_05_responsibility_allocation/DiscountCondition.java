package com.book_review.chap_05_responsibility_allocation;

import java.time.DayOfWeek;
import java.time.LocalTime;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
