public abstract class Bicycle {
    // Поля класса 
    protected String brand;
    protected String model;
    protected String color;
    protected static int count = 0;
    
    
    
    
    // Конструктор с параметрами 
    public Bicycle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        count++;
    }
    
    // Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
        
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // Статический метод для получения количества велосипедов
    public static int getCount() {
        return count;
    }
    
  
    
    
    // Обычные методы
    public void displayInfo() {
        System.out.println("Информация о велосипеде:");
        System.out.println("   Бренд: " + brand);
        System.out.println("   Модель: " + model);
        System.out.println("   Цвет: " + color);
    }

    public void ringBell() {
        System.out.println("Звонок велосипеда");
    }

    //Абстрактные методы

    public abstract void ride();
    
   
}
