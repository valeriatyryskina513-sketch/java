// MountainBike.java
public class MountainBike extends Bicycle {
    // Дополнительные поля
    private boolean frontSuspension; //передняя подвеска
    private boolean rearSuspension; //задняя подвеска
    private String brake; // тип тормоза
    private String tireType;      // тип покрышек
    private String depreciation;  //тип армортизации

    public MountainBike(String brand, String model, String color, boolean frontSuspension, boolean rearSuspension, String brake, String tireType, String depreciation) {
        super(brand, model, color);
        this.frontSuspension = frontSuspension;
        this.rearSuspension = rearSuspension;
        this.brake = brake;
        this.tireType = tireType;
        this.depreciation = depreciation;
    }
    
    public MountainBike() {
        super("Stels", "для даунхилла", "голубой");
        this.frontSuspension = true;
        this.rearSuspension = true;
        this.brake = "Дисковые тормоза";
        this.tireType = "Полуслики";
        this.depreciation = "пружинно-масляная";
    }

    public boolean getFrontSuspension() {
        return frontSuspension;
    }

    public void setFrontSuspension(boolean frontSuspension) {
        this.frontSuspension = frontSuspension;
    }

    public boolean getRearSuspension() {
        return rearSuspension;
    }

    public void setRearSuspension(boolean rearSuspension) {
        this.rearSuspension = rearSuspension;
    }

    public String getBrake() {
        return brake;
    }

    public void setBrake(String brake) {
        this.brake = brake;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public String getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(String depreciation) {
        this.depreciation = depreciation;
    }

    @Override
    public void displayInfo() {
       
        super.displayInfo();
        
        System.out.println("  Передняя подвеска:    " + frontSuspension);
        System.out.println("  Задняя подвеска:      " + rearSuspension);
        System.out.println("  Тип тормоза:          " + brake);
        System.out.println("  Тип покрышек:         " + tireType);
        System.out.println("  Тип амортизации:      " + depreciation);
}
    

    @Override
    public void ride() {
        System.out.println("Еду по бездорожью на горном велосипеде");
        if (frontSuspension || rearSuspension) {
            System.out.println("Подвеска работает поглащая неровности");
        }
    }
}


