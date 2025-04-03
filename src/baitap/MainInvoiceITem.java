package baitap;

public class MainInvoiceITem {
    public static void main(String[] args) {
        InvoiceITem i1=new InvoiceITem("A101","Pen Red",888,0.08);
        System.out.println(i1);
        i1.setQty(999);
        i1.setUnitPrice(0.99);
        System.out.println(i1);
        System.out.println("id is: "+i1.getId());
        System.out.println("desc is: "+i1.getDesc());
        System.out.println("qty is: "+i1.getQty());
        System.out.println("unitPrice is: "+i1.getUnitPrice());
        System.out.println("The total is: " +i1.getTotal());
    }
}
