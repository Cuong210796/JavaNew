package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int scoreU = 0;
        int scoreB = 0;
        for (int i =0;i<3;i++){
            System.out.println("Nhập K B O tương ứng với kéo búa bao :");
            String user = input.next();
            var ott = new OANTT();
            ott.setUser(user);

            ott.getBot();
          var check=   ott.checkUser();
          if (check == 1){
              System.out.println("bạn thắng");
              scoreU++;
          }
          else if(check == -1){
              System.out.println("bạn thua");
              scoreB++;
          }else if (check == 0){
              System.out.println("Hòa");
          }
        }
        System.out.println("Kết quả User-bot : "+scoreU+"-"+scoreB);
    }
}
