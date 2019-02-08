public class Main
{
    public static void main(String[] args)
    {
        Squeezer squeezer_1 = new Squeezer();
        Squeezer squeezer_2 = new Squeezer("white", 4.0, 25.0, "PHILIPS");
        Squeezer squeezer_3 = new Squeezer("black", 4.0, 700, "BOSCH",
                "MES3500", "mechanic", "8710103641315",true);


        System.out.print("\n" + squeezer_1.toString());
        System.out.print("\n" + squeezer_2.toString());
        System.out.print("\n" + squeezer_3.toString());

        squeezer_2.printNumberOfSpeed();
        Squeezer.printStaticNumberOfSpeed();
    }
}

