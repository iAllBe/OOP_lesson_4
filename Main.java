import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Task taskOne = new Task("Помыть посуду", "И.И. Иванов", 3, 1);
        Task taskTwo = new Task("Выкинуть мусор", "П.П. Петров", 6, 2);
        Task taskThree = new Task("Купить молоко", "В.В. Васильев", 10, 9);

        System.out.println(taskOne);
        System.out.println(taskTwo);
        System.out.println(taskThree);

        try (FileWriter writer = new FileWriter("file.txt", false)) {
            writer.write(taskOne.toString() + '\n');
            writer.write(taskTwo.toString() + '\n');
            writer.write(taskThree.toString() + '\n');

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}