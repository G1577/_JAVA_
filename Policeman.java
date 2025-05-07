public class Policeman {
    private Hac1 hac1;
    private Hac2 hac2;
    private Hac3 hac3;

    public Policeman(){
        this.hac1 = new Hac1();
        this.hac2 = new Hac2();
        this.hac3 = new Hac3();
    }

    public void start(){
        this.hac1.start();
        this.hac2.start();
        this.hac3.start();

        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.hac1.caught();
        this.hac2.caught();
        this.hac3.caught();

        show();
    }

    private void show(){
        System.out.println("ID: " + this.hac1.getHackeId());
        System.out.println("There is  success: " + this.hac1.getThereIsSuccess());

        System.out.println("ID: " + this.hac2.getHackeId());
        System.out.println("There is  success: " + this.hac2.getThereIsSuccess());

        System.out.println("ID: " + this.hac3.getHackeId());
        System.out.println("There is  success: " + this.hac3.getThereIsSuccess());
    }
}
