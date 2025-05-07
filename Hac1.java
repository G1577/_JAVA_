public class Hac1 extends Hacke {
    public Hac1(){super(0);}
    @Override
    public void run(){
        for (int password = 9999;
            !isStop(password) && 0 <= password;
            password--);
        System.out.println(1);
    }
}