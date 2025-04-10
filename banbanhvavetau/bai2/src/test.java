public class test {
    public static void main(String[] args) {
        gatau g3=new gatau();
        nguoimua n1=new nguoimua(g3,3);
//        Thread number1 = new nguoimua(g3,"tuấn",8);
//        Thread number2 = new nguoimua(g3,"hải",2);
//        Thread number3 = new nguoimua(g3,"thanh",2);
//        number1.start();
//        number2.start();
//        number3.start();
        new Thread() {
            public void run(){
                try {
                    g3.sove();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();
        n1.start();
    }
}
