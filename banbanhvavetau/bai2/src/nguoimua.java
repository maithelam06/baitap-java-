public class nguoimua extends Thread {
    private gatau g1;
    private int sove;
//    private String name;
    public nguoimua(gatau g1,int sove) {
        this.g1=g1;
        this.sove=sove;
//        this.name=name;
    }
    public void run() {
        while(true) {
            g1.banvetau(6);
            System.out.println(" tôi đã mua được  " +g1+ " vé ");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}