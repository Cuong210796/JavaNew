package com.company;

public class SavingAccount extends Account {
    public int month_of_year = 12;
    private int soDuTrongTk;
    private double tienlai;


    public SavingAccount(String name, int id,int sodutrongtk) {
        super(name, id);
        this.soDuTrongTk = sodutrongtk;
    }
    public void add(int soTienRut) throws Exception {
        if (soDuTrongTk < soTienRut)
            throw new Exception("so du khong du !!!");
        soDuTrongTk = soDuTrongTk - soTienRut;
    }
    public void tienLaiThang(double laiSuatNam){
        tienlai = soDuTrongTk*laiSuatNam/month_of_year;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"số dư TK: " + soDuTrongTk+ "\n"+ "tiền lãi: "+ tienlai;
    }
}
