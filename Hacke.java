public abstract class Hacke extends Thread{
    private int hackeId;
    private static final Safe safe;// הכספת
    private boolean thereIsSuccess;// אם ההאקר הצליח
    private boolean ifCaught;// אם ההאקר נתפס
    static {safe = new Safe();}

    public Hacke(int hackeId){
        this.hackeId = hackeId;
        this.thereIsSuccess = false;
        this.ifCaught = false;
    }

    protected final boolean isStop(int password){
        this.thereIsSuccess = safe.ifThereIsSuccess(password);
        return this.ifCaught || this.thereIsSuccess;
    }

    public final int getHackeId()
    {return this.hackeId;}

    public final boolean getIfCaught()
    {return this.ifCaught;}

    public final boolean getThereIsSuccess()
    {return this.thereIsSuccess;}

    public final void caught()
    {this.ifCaught = !this.thereIsSuccess;}
}
