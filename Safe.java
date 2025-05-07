import java.util.Random;

public class Safe {
    private int password;

    public Safe() {
        Random rand = new Random();
        this.password = rand.nextInt(10000);
        System.out.println("password: " + this.password);
    }

    public boolean ifThereIsSuccess(int password){
        boolean isPassword = this.password == password;

        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        return isPassword;
    }
}
