package Cvika2;

public class Database
{
    private String name;
    private int year;
    private double uvazek;

    public static double max = 1;

   Database(String name,int year)
    {
       this.name = name;
       this.year = year;
    }

    public String getName() {
        return this.name;
    }
    public int getYear() {
        return this.year;
    }
    public double getUvazek() {
        return this.uvazek;
    }

    public static void SetMax(double Newmax)
    {
        max = Newmax;
    }

    public boolean KontrolaUvazku(double NewUvazek)
    {
        if ((NewUvazek + this.uvazek) > max)
            return false;
        else
            {
            this.uvazek = this.uvazek + NewUvazek;
            return true;
        }
    }
}
