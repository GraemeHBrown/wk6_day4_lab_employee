package staff;

public class Employee {

    private String niNumber;
    private String name;
    private Double salary;

    public Employee(String name, String niNumber, Double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }


    public String getNiNumber() {
        return this.niNumber;
    }

    public Double getSalary() {
        return this.salary;
    }

    public double raiseSalary(Double raise) {
        if(raise > 0){
            return this.salary += raise;
        }
            return this.salary;
        }

    public double payBonus() {
        return this.salary /= 100;
    }
}



