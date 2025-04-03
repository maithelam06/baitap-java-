package baitap;

public class MainEm {
    public static void main(String[] args) {
        Employee em=new Employee(8,2500,"Peter","Tan");
        System.out.println(em.toString());
        em.setId(8);
        em.setFirstName("Peter");
        em.setLastName("Tan");
        em.setSalary(999);
        System.out.println("id is: "+em.getId());
        System.out.println("firstName is: "+em.getFirstName());
        System.out.println("lastName is: "+em.getLastName());
        System.out.println("salary is: "+em.getSalary());
        System.out.println("name is: "+" "+ em.getName());
        System.out.println("annual salary is: " +em.getAnnualSalary());
        System.out.println(em.RaiseSalary(10));
    }
}
