public class NormalEmployee extends Employee {

    long basic_sal, hra, ca, ma, oa, totalEarnings, epf, esi, pt, loanRecovery, totalDeductions,netsalary;

    public NormalEmployee(String name, String desig, String dept, String doj, long id, long gross_wage, long total_working_days, long lop, long uan, long pf, long esi, long ac_no, long paid_days, long leaves_taken) {
        super(name, desig, dept, doj, id, gross_wage, total_working_days, lop, uan, pf, esi, ac_no, paid_days, leaves_taken);
    }

    @Override
    void salaryCalculation() {
        basic_sal = (long) (((getGross_wage() / getTotal_working_days()) * getPaid_days()) * 0.45);
    }
}