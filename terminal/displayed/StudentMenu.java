package terminal.displayed;

public class StudentMenu {
    public static void displayMenu(){
        System.out.println("Введите команду и данные студента через пробел.");
        System.out.println("Примеры: add -student Ivanov Ivan Ivanovich 2005,\n" +
                "         delete -student Ivanov Ivan Ivanovich");
    }
}
