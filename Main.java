public class Main
{
    public static void main(String[] args)
    {
        Squeezer emptySqueezer = new Squeezer();
        Squeezer philips = new Squeezer("white", 4.0, 25.0, "PHILIPS");
        Squeezer bosch = new Squeezer("black", 4.0, 700, "BOSCH",
                "MES3500", "mechanic", "8710103641315",true);


        System.out.print("\n" + emptySqueezer.toString());
        System.out.print("\n" + philips.toString());
        System.out.print("\n" + bosch.toString());

        philips.printNumberOfSpeed ();
        Squeezer.printStaticNumberOfSpeed();
    }
}

