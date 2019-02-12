public class Squeezer {
    public static int numberOfSpeed = 0;
    protected String barCode;
    protected boolean isGuarantee;
    private String model;
    private String typeOfControl;
    private String color;
    private String producer;
    private double maxVolume;
    private double powerConsumption;


    Squeezer() {
        this(null, 0.0, 0.0, null, null, null, null,false);
    }

    Squeezer(String color, double maxVolume, double powerConsumption, String producer) {
        this(color, maxVolume, powerConsumption, producer, null, null, null,false);
    }

    Squeezer(String color, double maxVolume, double powerConsumption, String producer, String model,
             String typeOfControl, String barCode, boolean isGuarantee) {
        this.model = model;
        this.typeOfControl = typeOfControl;
        this.barCode = barCode;
        this.isGuarantee = isGuarantee;
        this.color = color;
        this.maxVolume = maxVolume;
        this.powerConsumption = powerConsumption;
        this.producer = producer;
    }

    public void setModel(String model) {
         this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setTypeOfControl(String typeOfControl) {
        this.typeOfControl = typeOfControl;
    }

    public String getTypeOfControl() {
        return typeOfControl;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(double maxVolume) {
        this.maxVolume = maxVolume;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String toString() {
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

    public static void printStaticNumberOfSpeed() {
        System.out.println("\n" + "Number of speeds: " + numberOfSpeed);
    }

    public void printNumberOfSpeed() {
        System.out.println("\n" + "Number of speeds: " + numberOfSpeed);
    }

    public void resetValues(String model, String typeOfControl, String color, String producer, double maxVolume,
                            double powerConsumption, String barCode, boolean isGuarantee) {
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

