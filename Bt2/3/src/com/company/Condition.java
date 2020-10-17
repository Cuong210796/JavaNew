package com.company;

public class Condition {
    public Condition(int number) throws Exception {
        if (number<1||number>12){
            throw new Exception("Không có tháng phù hợp:");
        }
                if (number == 1){
                    System.out.println("Tháng Một");
                }
                else if(number == 2){
                    System.out.println("Tháng Hai");
                }
                else if(number == 3){
                    System.out.println("Tháng Ba");
                }
                else if(number == 4){
                    System.out.println("Tháng Tư");
                }
                else if(number == 5){
                    System.out.println("Tháng Năm");
                }
                else if(number == 6){
                    System.out.println("Tháng Sáu");
                }
                else if(number == 7){
                    System.out.println("Tháng Bảy");
                }
                else if(number == 8){
                    System.out.println("Tháng Tám");
                }
                else if(number == 9){
                    System.out.println("Tháng Chín");
                }
                else if(number == 10){
                    System.out.println("Tháng Mười");
                }
                else if(number == 11){
                    System.out.println("Tháng Mười Một");
                }
                else {
                    System.out.println("Tháng Mười Hai");
                }
    }
}
