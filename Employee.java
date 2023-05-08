public class Employee {
    private String name, id;
    private int salary;

    public Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary(){
        return salary;
    }
    public int raisedSalary(int percent){
        if (percent > 0 && percent < 100)
            salary = salary + (salary*percent/100);
        else
            System.out.println("Unable to make the operation");
        return salary;
    }

    @Override
    public String toString() {
        return "Employee info : " +
                "\nName : " + name +
                "\nID : " + id +
                "\nSalary: " + salary +
                "\n";
    }
}
