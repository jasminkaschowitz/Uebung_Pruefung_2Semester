package OOPVererbung;

public class PercentCommissionEmployee extends Employee{

    private double percentCommission;

    public PercentCommissionEmployee(String lastname, String firstname, String department, double baseSalary, double percentCommission) {
        super(lastname, firstname, department, baseSalary);
        this.percentCommission = percentCommission;
    }

    @Override
    public double getFullSalary() {
        return super.getFullSalary() * (1 + percentCommission);
    }

}
