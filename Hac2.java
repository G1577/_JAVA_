public class Hac2 extends Hacke {
    public Hac2(){super(1);}

    @Override
    public void run(){
        for (int password = 0;
            !isStop(password) && password < 10000;
            password++);
        System.out.println(2);
    }
}