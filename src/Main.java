import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List container = new List();

        boolean exit = false;
        while (!exit) {
            System.out.println("\n=== Меню ===");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Удалить элемент");
            System.out.println("3. Получить элемент по индексу");
            System.out.println("4. Отобразить контейнер");
            System.out.println("5. Проверить, пуст ли контейнер");
            System.out.println("6. Очистить контейнер");
            System.out.println("0. Выход");
            System.out.print("Введите свой выбор: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Введите элемент для добавления: ");
                    int elementToAdd = scanner.nextInt();
                    container.add(elementToAdd);
                    System.out.println("Элемент добавлен");
                    break;
                case 2:
                    System.out.print("Введите индекс удаляемого элемента: ");
                    int indexToRemove = scanner.nextInt();
                    container.remove(indexToRemove);
                    System.out.println("Элемент удалён");
                    break;
                case 3:
                    System.out.print("Введите индекс элемента: ");
                    int indexToGet = scanner.nextInt();
                    System.out.println("Индекс элемента " + indexToGet + ": " + container.get(indexToGet));
                    break;
                case 4:
                    System.out.println("Элементы контейнера: " + container);
                    break;
                case 5:
                    System.out.println("Контейнер пуст? " + container.isEmpty());
                    break;
                case 6:
                    container.clear();
                    System.out.println("Контейнер очищен.");
                    break;
                case 0:
                    exit = true;
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, введите номер в меню");
            }
        }
        scanner.close();
    }
}