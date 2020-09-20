package com.company;

public class LottoryChecknumber {
    private char lotteryDigit1;
    private char lotteryDigit2;
    private char numberDigit1;
    private char numberDigit2;

    public String getAward(String lotteryNumber, String number){
//        var lotteryNumber = numbers.getLotteryNumber();
//        var number = numbers.getNumber();

        lotteryDigit1 = lotteryNumber.charAt(0);
        lotteryDigit2 = lotteryNumber.charAt(1);
        numberDigit1 = number.charAt(0);
        numberDigit2 = number.charAt(1);

        if (lotteryNumber.equals(number)) {
            return "Giải đặt biệt 10000";
        } else if (lotteryDigit1 == numberDigit1 && lotteryDigit2 == numberDigit2) {
            return "Giải nhất 3000";
        } else if (lotteryDigit1 == numberDigit2 || lotteryDigit2 == numberDigit1
                || lotteryDigit1 == numberDigit1 || lotteryDigit2 == numberDigit2) {
            return "Giải khuyen khich 1000";
        } else {
            return "Không trúng";
        }
    }
}