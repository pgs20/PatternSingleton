import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            Logger logger = Logger.getInstance();
            logger.log("Запускаем программу");
            logger.log("Просим пользователя ввести входные данные для списка");
            System.out.print("Введите размер списка: ");
            int sizeList = scanner.nextInt();
            System.out.print("Введите верхнюю границу для значений: ");
            int maxBorder = scanner.nextInt();
            logger.log("Создаём и наполняем список");
            List<Integer> source = new ArrayList<>();
            for (int i = 0; i < sizeList; ++i) {
                source.add(new Random().nextInt(maxBorder));
            }
            System.out.println("Вот случайный список: " + source);
            logger.log("Просим пользователя ввести входные данные для фильтрации");
            System.out.print("Введите порог для фильтра: ");
            int threshold = scanner.nextInt();
            List<Integer> res = new Filter(threshold).filterOut(source);
            logger.log("Выводим результат на экран");
            System.out.println("Отфильтрованный список: " + res);
            logger.log("Завершаем программу");
        }
    }
}
