package clinic.problem2;

public class Main
{
    public static void main(String[] args)
    {
        new Thread(new MouseChecker()).start();
    }
}
