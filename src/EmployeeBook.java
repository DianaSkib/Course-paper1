public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    // Метод добавления сотрудника
    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    // Получить список всех сотрудников
    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    // Подсчитать среднее значение зарплат
    public double calculateAverageSalary() {
        int sum = 0;
        int count = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                count++;
            }
        }

        return count > 0 ? (double) sum / count : 0;
    }

    // Вывести значения налогов
    public void printTaxes(String taxType) {
        for (Employee employee : employees) {
            if (employee != null) {
                double tax = 0;
                int salary = employee.getSalary();

                switch (taxType) {
                    case "PROPORTIONAL":
                        tax = salary * 0.13;
                        break;
                    case "PROGRESSIVE":
                        if (salary <= 150) {
                            tax = salary * 0.13;
                        } else if (salary <= 350) {
                            tax = salary * 0.17;
                        } else {
                            tax = salary * 0.21;
                        }
                        break;
                    default:
                        System.out.println("Неизвестный тип налога: " + taxType);
                        return;
                }

                System.out.println("Сотрудник: " + employee.getFullName() +
                        ", Зарплата: " + salary +
                        ", Налог: " + tax);
            }
        }
    }

    // Индексировать зарплату сотрудников отдела
    public void indexSalaries(int department, double percent) {
        double coefficient = 1 + percent / 100;

        for (Employee employee : employees) {
            if (employee == null) continue;
            if (employee.getDepartment() != department) continue;

            int newSalary = (int) (employee.getSalary() * coefficient);
            employee.setSalary(newSalary);
        }
    }

    // Найти первого сотрудника отдела с зарплатой больше указанной
    public void findFirstEmployeeWithHigherSalary(int department, int wage) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee == null) continue;
            if (employee.getDepartment() == department && employee.getSalary() > wage) {
                System.out.println("Найден сотрудник на позиции " + (i + 1) + ":");
                employee.printShortInfo();
                break;
            }
        }
    }

    // Найти первых employeeNumber сотрудников с зарплатой меньше wage
    public void findEmployeesWithLowerSalary(int wage, int employeeNumber) {
        int foundCount = 0;
        int index = 0;

        while (index < employees.length && foundCount < employeeNumber) {
            Employee employee = employees[index];
            if (employee != null && employee.getSalary() < wage) {
                foundCount++;
                System.out.println("Сотрудник №" + foundCount + ":");
                employee.printShortInfo();
            }
            index++;
        }
    }

    // Проверить, есть ли сотрудник с такой же зарплатой
    public boolean containsEmployee(Employee employee) {
        for (Employee emp : employees) {
            if (emp != null && emp.equals(employee)) {
                return true;
            }
        }
        return false;
    }

    // Получить сотрудника по ID
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}