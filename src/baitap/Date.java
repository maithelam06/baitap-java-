package baitap;

 class Date {
    private int day,month,year;
    public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    int getDay(){
        return day;
    }
    int getMonth(){
        return month;
    }
    int getYear(){
        return year;
    }
    void setDay(int day){
        this.day=day;
    }
    void setMonth(int month){
        this.month=month;
    }
    void setYear(int year){
        this.year=year;
    }
    void setDate(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
     public String toString(){
         return String.format("%02d/%02d/%d",day,month,year);
    }
}
