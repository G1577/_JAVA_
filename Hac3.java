import java.util.HashSet;
import java.util.Random;

public class Hac3 extends Hacke {
    private Random rean;
    private HashSet<Integer> set;

    public Hac3(){
        super(2);
        this.rean = new Random();
        this.set = new HashSet<Integer>();
    }
    @Override
    public void run(){
        int password;
        do {
            do {
                password = this.rean.nextInt(10000);
                this.set.add(password);
            } while(this.set.contains(password));
        } while (!isStop(password));
        System.out.println(3);
    }
}