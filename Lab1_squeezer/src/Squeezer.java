public class Squeezer
{
    private String model;                           //"HR2738/00";
    private String typeOfControl;                   //"mechanical type of control";
    public String color;                            //"white";
    public String producer;                         //"PHILIPS";
    public double maxVolume;                        //4.0; //   litres/hour
    public double powerConsumption;                 //25.0; //watt
    private static int numberOfSpeed = 0;                      //1;
    protected String barCode;                       //"8710103641315";
    protected boolean isGuarantee;                  //true;

    Squeezer()
    {
        numberOfSpeed++;
    }

    Squeezer(String color, double maxVolume, double powerConsumption, String producer)
    {
        this();
        this.color = color;
        this.maxVolume = maxVolume;
        this.powerConsumption = powerConsumption;
        this.producer = producer;
    }

    Squeezer(String color, double maxVolume, double powerConsumption, String producer, String model,
             String typeOfControl, String barCode, boolean isGuarantee)
    {
        this(color, maxVolume, powerConsumption, producer);
        this.model = model;
        this.typeOfControl = typeOfControl;
        this.barCode = barCode;
        this.isGuarantee = isGuarantee;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getModel()
    {
        return model;
    }

    public void setTypeOfControl(String typeOfControl)
    {
        this.typeOfControl = typeOfControl;
    }

    public String getTypeOfControl()
    {
        return typeOfControl;
    }

    public String toString()
    {
        String characteristics = " The model of squeezer: " + model +
                "\n Type of control: " + typeOfControl +
                "\n Color: " + color +
                "\n The producer: " + producer +
                "\n The maximum amount of juice that this juicer can squeeze: " + maxVolume + " liters per hour" +
                "\n The power consumption: " + powerConsumption + " watt" +
                "\n The BAR CODE: " + barCode +
                "\n Availability of guarantee: " + isGuarantee + "\n";
        return characteristics;
    }

    public static void printStaticNumberOfSpeed()
    {
        System.out.println("\n" + "Number of speeds: " + numberOfSpeed);
    }

    public void printNumberOfSpeed()
    {
        System.out.println("\n" + "Number of speeds: " + numberOfSpeed);
    }

    public void resetValues(String model, String typeOfControl, String color, String producer, double maxVolume,
                            double powerConsumption, String barCode, boolean isGuarantee)
    {
        this.model = model;
        this.typeOfControl = typeOfControl;
        this.color = color;
        this.producer = producer;
        this.maxVolume = maxVolume;
        this.powerConsumption = powerConsumption;
        this.barCode = barCode;
        this.isGuarantee = isGuarantee;
    }
}

