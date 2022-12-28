import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        new Task("Помыть посуду", "И.И. Иванов", 3, 1);
        new Task("Выкинуть мусор", "П.П. Петров", 6, 2);
        new Task("Купить молоко", "В.В. Васильев", 10, 8);

        ExportCSV ex = new ExportCSV();
        ex.givenDataArray_whenConvertToCSV_thenOutputCreated();
    }
}