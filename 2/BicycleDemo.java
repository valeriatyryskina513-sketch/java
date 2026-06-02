public class BicycleDemo {
    
    public static void main(String[] args) {
        
        MountainBike m = new MountainBike("Forward", "Haro Saguaro 2", "зеленый", true, true, "V-Brake", "Грязевые", "воздушно-масляная");
        KidsBike k = new KidsBike("Comfort", "Двухколесный", "Синий", false, false, "8-12 лет", "Человек-паук");
        BMXBike b = new BMXBike(" StolenBike", "Для фристайла", "Красный", "Cr-Mo 4130, хромоль", 16.0, true, 1, "Двухкомпонентный", null);

        m.displayInfo();
        k.displayInfo();
        b.displayInfo();

        System.out.println("Текущуу количество созданных велосипедов: " + Bicycle.getCount());

        System.out.println("----------Использование геттеров---------");
        System.out.println ("Бренд горного велосипеда: " + m.getBrand());
        System.err.println("Цвет детского велосипеда: " + k.getColor());

        System.err.println("-------------Использование сеттеров--------");
        m.setBrand("Giant");
        System.out.println( "Новый бренд горного велосипеда: " + m.getBrand());

        System.out.println("------------Демонстрация перегрузки----------");
        
        MountainBike m2 = new MountainBike();                       
        KidsBike    k2 = new KidsBike();                            
        BMXBike     b2 = new BMXBike("Haro", "Steel Reserve", "Чёрный",
                                     "Hi-Ten Steel", 20.5, true, 4, "4-pc", "4130 Chromoly");

        System.out.println("Создан горный велосипед :");
        m2.displayInfo();
        
        System.out.println("Создан детский велосипед:");
        k2.displayInfo();

        System.out.println("Создан BMX велосипед:");
        b2.displayInfo();
        

        Bicycle[] bikes = {m, k, b, m2, k2, b2};
        
        System.out.println("Вызов метода ride() у всех велосипедов:");
        for (Bicycle bike : bikes) {
            bike.ride();         
            System.out.println("----------------------------");
        }

        System.out.println("Всего создано велосипедов: " + Bicycle.getCount());
    }    
    
}
