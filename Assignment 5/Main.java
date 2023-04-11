public class Main {
    public static void main(String[] args) {
        NormalEmployee e;
        e = new NormalEmployee("ll","manager","sales","12-03-2020",123456,21000,30,1,123456,456,567,12344,29,0);

        e.salaryCalculation();
        System.out.println(e.basic_sal);
    }
}
