package com.company;

public class Staff {
   private StaffMember[] staffList = {
            new Volunteer("c","2321 jqeqw","0121","123-384-23",123,31),
            new Employee("c1","321 jqeqw","0121321","223-884-23",500_000,21),
            new Executive("c2","3123d daaf","321332","1213-21-231",500_000,21,0.1),
            new Hourly("cư","23123ff","21312313","213",50_000,80)
    };
    public void payDay(){
        staffList[2].setAward(1000_000);
            for (int i=0; i< staffList.length;i++)
                System.out.println(staffList[i].toString()+"\n");
}
    public void printPayDays(){
        staffList[2].setAward(1000_000);
            for (StaffMember staff:staffList)
                System.out.println(staff.toString()+"\n");

}
}
