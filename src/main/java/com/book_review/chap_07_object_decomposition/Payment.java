package com.book_review.chap_07_object_decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Payment {

    // 직원의 목록
    private static String[] $employees = new String[] {"직원 A", "직원 B", "직원 C"};

    // 직원별 기본급
    private static int[] $basePays = new int[] {400, 300, 250};

    public static void main(String[] args) {
        // 직원의 급여를 계산하라
        payment("직원 A");
        payment("직원 B");
        payment("직원 C");
    }

    public static void payment(String name) {
        // 사용자로부터 소득세율을 입력받는다.
        double taxRate = getTaxRate();
        System.out.println("taxRate = " + taxRate);

        // 직원의 급여를 계산한다.
        double pay = calculatePayFor(name, taxRate);

        // 양식에 맞체 결과를 출력한다.
        System.out.println(describeResult(name, pay));
    }

    private static double getTaxRate() {
        // "세율을 입력하세요: "라는 문장을 화면에 출력한다.
        System.out.print("세율을 입력하세요: ");

        // 키보드를 통해 세율을 입력받는다.
        Scanner sc = new Scanner(System.in);

        return sc.nextDouble();
    }

    private static double calculatePayFor(String name, double taxRate) {
        int index = Arrays.asList($employees).indexOf(name);
        int basePay = $basePays[index];
        return basePay - (basePay * taxRate / 100);
    }

    private static String describeResult(String name, double pay) {
        return String.format("이름: %s, 급여: %d", name, (int) pay);
    }
}
