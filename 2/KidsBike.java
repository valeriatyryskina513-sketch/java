// KidsBike.java
public class KidsBike extends Bicycle {
    // Дополнительные поля
    private boolean trainingWheels; // наличие дополнительных колес
    private boolean basket;        // наличие корзинки
    private String recommendedAge;    // рекомендуемый возраст
    private String characterTheme;    // тематика (с героями мультфильмов)
 
    public KidsBike(String brand, String model, String color, boolean trainingWheels, boolean basket, String recommendedAge, String characterTheme) {
        super(brand, model, color);
        this.trainingWheels = trainingWheels;
        this.basket = basket;
        this.recommendedAge = recommendedAge;
        this.characterTheme = characterTheme;
    }

    public KidsBike() {
        super("Comfort", "Трехколесный", "Розовый");
        this.trainingWheels = true;
        this.basket = true;
        this.recommendedAge = "3-5 лет";
        this.characterTheme = "Рапунцель";
    }

    public boolean getTrainingWheels(){
        return trainingWheels;
    }

    public void setTrainingWheels(boolean trainingWheels) {
        this.trainingWheels = trainingWheels;
    }

    public boolean getBasket() {
        return basket;
    }

    public void setBasket(boolean basket) {
        this.basket = basket;
    }

    public String getRecommendedAge() {
        return recommendedAge;
    }

    public void setRecommendedAge(String recommendedAge) {
        this.recommendedAge = recommendedAge;
    }

    public String getCharacterTheme() {
        return characterTheme;
    }

    public void setCharacterTheme(String characterTheme) {
        this.characterTheme = characterTheme;
    }

    @Override
    public void displayInfo() {
       
        super.displayInfo();
        
       System.out.println("  Дополнительные колёса: " + trainingWheels);
       System.out.println("  Корзинка:             " + basket);
       System.out.println("  Возраст:              " + recommendedAge);
       System.out.println("  Тематика:             " + characterTheme);
    }

    @Override
    public void ride() {
        System.out.println(" Маленький велосипедист учится кататься");
        if (trainingWheels) {
            System.out.println(" Дополнительные колеса помогают держать равновесие");
        }
    }

   
}
