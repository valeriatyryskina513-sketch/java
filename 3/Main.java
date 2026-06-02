public class Main {
    public static void main(String[] args) {

        
        StudentFleet fleet = new StudentFleet();

        fleet.addStudent("123456", new Student("Иван", "Иванов", 20, 4.5));
        fleet.addStudent("654321", new Student("Мария", "Петрова", 21, 4.8));
        fleet.addStudent("111222", new Student("Алексей", "Сидоров", 19, 3.9));

        System.out.println("Все студенты в группе:");
        fleet.printAllStudents();

        System.out.println("\nПоиск студента 654321:");
        System.out.println(fleet.findStudent("654321"));

        System.out.println("\nУдаление студента 123456:");
        System.out.println(fleet.removeStudent("123456"));

        System.out.println("\nСтуденты после удаления:");
        fleet.printAllStudents();
    }
}
