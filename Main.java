public class Main {
    public static void main(String[] args) {
        Account acc = new Account("Khaled","2346",5000);
        Account acc1 = new Account("Naif", "5753",2000);
        System.out.println("Khaled's Balance : " + acc.debit(1000));
        System.out.println("Khaled's Balance : " + acc.credit(500));
        System.out.println("Khaled's Balance After transaction : " + acc.transferTo(acc1,3000));
        System.out.println(acc1.toString());

        Employee e = new Employee("Ali","4325",5000);
        System.out.println("Salary after raised: " + e.raisedSalary(10));
        System.out.println(e.toString());
    }
}