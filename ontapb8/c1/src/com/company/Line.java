package com.company;

public final class Line {
    private int Fare; // tuyến đường cao tốc
    private int cost;
    private double distance; //quãng đường
    public Line(double a){
        this.distance=a;
    };

    public int getFare(){
        if (distance<=4){
            cost = 120;
        }else if((distance%2)==0){
            cost = 120 + 30*(int)(distance-4)/2;
        }else {
            cost = 120 + 30*((int)((distance-4)/2)+1);
       }
        return cost;
    }
}
