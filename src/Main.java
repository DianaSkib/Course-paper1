import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        EmployeeBook book = new EmployeeBook();

        // Добавляем сотрудников (11 вызовов для проверки переполнения)
        System.out.println("ДОБАВЛЕНИЕ СОТРУДНИКОВ");
        System.out.println("Добавление 1: " + book.addEmployee(new Employee("Иванов И.И.", 1, 100)));
        System.out.println("Добавление 2: " + book.addEmployee(new Employee("Петров П.П.", 2, 200)));
        System.out.println("Добавление 3: " + book.addEmployee(new Employee("Сидоров С.С.", 1, 300)));
        System.out.println("Добавление 4: " + book.addEmployee(new Employee("Козлов К.К.", 3, 150)));
        System.out.println("Добавление 5: " + book.addEmployee(new Employee("Николаев Н.Н.", 2, 400)));
        System.out.println("Добавление 6: " + book.addEmployee(new Employee("Федоров Ф.Ф.", 4, 250)));
        System.out.println("Добавление 7: " + book.addEmployee(new Employee("Васильев В.В.", 5, 350)));
        System.out.println("Добавление 8: " + book.addEmployee(new Employee("Алексеев А.А.", 1, 180)));
        System.out.println("Добавление 9: " + book.addEmployee(new Employee("Семенов С.С.", 2, 220)));
        System.out.println("Добавление 10: " + book.addEmployee(new Employee("Павлов П.П.", 3, 280)));
        System.out.println("Добавление 11: " + book.addEmployee(new Employee("Михайлов М.М.", 4, 320))); // Должно вернуть false

        System.out.println("СПИСОК ВСЕХ СОТРУДНИКОВ");
        book.printAllEmployees();

        System.out.println("СРЕДНЯЯ ЗАРПЛАТА");
        System.out.println("Средняя зарплата: " + book.calculateAverageSalary());

        System.out.println("НАЛОГИ (ПРОПОРЦИОНАЛЬНЫЕ)");
        book.printTaxes("PROPORTIONAL");

        System.out.println("НАЛОГИ (ПРОГРЕССИВНЫЕ)");
        book.printTaxes("PROGRESSIVE");
    }
}