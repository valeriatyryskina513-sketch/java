// BMXBike.java
public class BMXBike extends Bicycle {
    // Дополнительные поля
    private String frameMaterial;     // материал рамы
    private double frameSize;         // размер рамы в дюймах
    private boolean pegs;          // наличие пег (для трюков)
    private int numberPegs;         // количество пег
    private String handlebarType;     // тип руля
    

    public BMXBike(String brand, String model, String color, String farmeMaterial, double  farmeSize, boolean pegs, int numberPegs, String handlebarType, String frameMaterial) {
        super(brand, model, color);
        this.frameMaterial = frameMaterial;
        this.frameSize = farmeSize;
        this.pegs = pegs;
        this.numberPegs = numberPegs;
        this.handlebarType = handlebarType;
    }
   
    public BMXBike() {
        super("HaroBike", "Для фристайла", "Черный");
        this.frameMaterial = "Сталь Hi-Ten";
        this.frameSize = 20.0;
        this.pegs = true;
        this.numberPegs = 2;
        this.handlebarType = "Двухкомпонентный";
    }


    public String getFrameMaterial() {
        return frameMaterial;
    }
    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }


    public double getFrameSize() {
        return frameSize;
    }
    public void setFrameSize(double frameSize) {
        this.frameSize = frameSize;
    }


    public boolean getPegs() {
        return pegs;
    }
    public void setPegs(boolean pegs) {
        this.pegs = pegs;
    }


    public int getNumberPegs() {
        return  numberPegs;
    }

    public void setNumberPegs(int numberPegs) {
        this.numberPegs = numberPegs;
    }


    public String getHandlebarType() {
        return handlebarType;
    }

    public void setHandlebarType(String handlebarType) {
        this.handlebarType = handlebarType;
    }
    

    @Override
    public void displayInfo() {
       
        super.displayInfo();
        
        System.out.println("  Материал рамы:        " + frameMaterial);
        System.out.println("  Размер рамы:          " + frameSize);
        System.out.println("  Пеги:                 " + pegs);
        System.out.println("  Количество пег:       " + numberPegs);
        System.out.println("  Тип руля:             " + handlebarType);
    }

    @Override
    public void ride() {
        System.out.println("Выполняю трюк на BMX");
        if (pegs) {
            System.out.println("Исопльзую пеги для скольжения по перилам");
        }
    }
    
}
