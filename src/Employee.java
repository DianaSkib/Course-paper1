public class Employee {
    private static int idCounter = 1; // Статический счётчик для генерации ID

    private int id;
    private String fullName;
    private int department;
    private int salary;

    // Конструктор
    public Employee(String fullName, int department, int salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return salary == employee.salary;
    }

    @Override
    public String toString() {
        return "Сотрудник[ID=" + id +
                ", Ф.И.О.=" + fullName +
                ", Отдел=" + department +
                ", Зарплата=" + salary + "]";
    }

    public void printShortInfo() {
        System.out.println("Ф.И.О.: " + fullName + ", Зарплата: " + salary);
    }
}