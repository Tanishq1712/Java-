abstract class Employee {
    private String name, desig, dept, doj;
    private long id, gross_wage, total_working_days, lop, uan, pf, esi, ac_no, paid_days, leaves_taken;

    public void setId(long id) {
        this.id = id;
    }

    public long getGross_wage() {
        return gross_wage;
    }

    public void setGross_wage(long gross_wage) {
        this.gross_wage = gross_wage;
    }

    public long getTotal_working_days() {
        return total_working_days;
    }

    public void setTotal_working_days(long total_working_days) {
        this.total_working_days = total_working_days;
    }

    public long getLop() {
        return lop;
    }

    public void setLop(long lop) {
        this.lop = lop;
    }

    public void setUan(long uan) {
        this.uan = uan;
    }

    public long getPaid_days() {
        return paid_days;
    }

    public void setPaid_days(long paid_days) {
        this.paid_days = paid_days;
    }

    public Employee(String name, String desig, String dept, String doj, long id, long gross_wage, long total_working_days, long lop, long uan, long pf, long esi, long ac_no, long paid_days, long leaves_taken) {
        this.name = name;
        this.desig = desig;
        this.dept = dept;
        this.doj = doj;
        this.id = id;
        this.gross_wage = gross_wage;
        this.total_working_days = total_working_days;
        this.lop = lop;
        this.uan = uan;
        this.pf = pf;
        this.esi = esi;
        this.ac_no = ac_no;
        this.paid_days = paid_days;
        this.leaves_taken = leaves_taken;
    }

  /*  public Employee(String name, long id, String desig, String dept, String doj, long uan, long pf, long esi, long ac_no, long gross_wage, long lop, long total_working_days, long leaves_taken) {
        this.name = name;
        this.id = id;
        this.desig = desig;
        this.dept = dept;
        this.doj = doj;
        this.uan = uan;
        this.pf = pf;
        this.esi = esi;
        this.ac_no = ac_no;
        this.leaves_taken = leaves_taken;
    }
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public long getUan() {
        return uan;
    }

    public void setUan(Integer uan) {
        this.uan = uan;
    }

    public long getPf() {
        return pf;
    }

    public void setPf(long pf) {
        this.pf = pf;
    }

    public long getEsi() {
        return esi;
    }

    public void setEsi(long esi) {
        this.esi = esi;
    }

    public long getAc_no() {
        return ac_no;
    }

    public void setAc_no(long ac_no) {
        this.ac_no = ac_no;
    }

    public long getLeaves_taken() {
        return leaves_taken;
    }

    public void setLeaves_taken(long leaves_taken) {
        this.leaves_taken = leaves_taken;
    }
    abstract void salaryCalculation();
}
