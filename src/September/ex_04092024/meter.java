package September.ex_04092024;

public class meter {
    public static void main(String[] args) {
        paramet p = new paramet(2024, "September");
        System.out.println(p.year);
        System.out.println(p.month);

    }
}

class paramet{
    int year;
    String month;

    paramet(int a, String b){
        this.year = a;
        this.month = b;
    }
}