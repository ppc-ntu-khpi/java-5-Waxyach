package domain;

/**
 * Представляє менеджера, який керує групою інших працівників.
 */
public class Manager extends Employee {

    private Employee[] employees;

    /**
     * Instantiates a new Manager.
     *
     * @param employees the employees
     * @param name      the name
     * @param jobTitle  the job title
     * @param level     the level
     * @param dept      the dept
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Instantiates a new Manager.
     *
     * @param employees the employees
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Instantiates a new Manager.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Sets employees.
     *
     * @param employees the employees
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Формує список імен усіх підлеглих.
     *
     * @return Рядок з іменами працівників, розділених комою.
     */
    public String getEmployees() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Employee employee : employees) {
            stringBuilder.append(employee.getName()).append(", ");
        }
        stringBuilder = new StringBuilder(stringBuilder.substring(0, stringBuilder.length() - 2));
        return stringBuilder.toString();
    }

    /**
     * Get employees list employee [ ].
     *
     * @return the employee [ ]
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees();
    }
}
