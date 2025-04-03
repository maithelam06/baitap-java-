package baitap;

public class MainDate {
    public static void main(String[] args) {
        Date d1=new Date(1,2,2014);
        System.out.println(d1);
        Date d2=new Date(9,12,2099);
        System.out.println(d2);
        d1.setDay(9);
        d1.setMonth(12);
        d1.setYear(2099);
        System.out.println(d1);
        System.out.println("Month: "+d1.getMonth());
        System.out.println("Day: "+d1.getDay());
        System.out.println("Year: "+d1.getYear());
        d1.setDate(03,04,2016);
        System.out.println(d1);
    }
}
