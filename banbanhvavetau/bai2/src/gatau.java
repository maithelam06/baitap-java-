public class gatau {
    private int slvetau=0;
    public synchronized void sove(){
        slvetau +=10;
        System.out.println("Ga tàu đã có 10 cái vé.Tổng vé là "+slvetau);
        notify();
    }
    public synchronized void banvetau(int soluong){
        while (slvetau < soluong) {
            System.out.println("bạn vui lòng chờ ga tàu đã hết vé");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        slvetau -=soluong;
        System.out.println(" bạn đã mua " +soluong+ " vé.Số vé còn lại của ga là  "+slvetau );
        notify();
    }
}
