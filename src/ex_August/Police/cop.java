package ex_August.Police;

public class cop {

    private String name;
    private int gun;

    public cop(int gun) {
        this.gun = gun;
    }

    protected void canishoot(){
        System.out.println("Yes You can shoot!!!");
    }
}
