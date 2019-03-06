package ncpsb.datascience.dpeng.design.proxy.staticproxy;

public class ProxyStar implements Star {

    private Star star;

    public ProxyStar(Star star) {
        super();
        this.star = star;
    }

    public ProxyStar() {
    }

    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    public void signContract() {
        System.out.println("ProxyStar.signContract()");


    }

    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");


    }

    public void sing() {
        star.sing();
    }

    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");


    }
}
