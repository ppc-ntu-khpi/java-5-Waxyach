package domain;

/**
 * Базовий клас, що описує працівника компанії.
 */
public class Employee {

    private static final String NAME_REGEX = "^([a-zA-Z]+[',.\\-]?[a-zA-Z ]*)+ ([a-zA-Z]+[',.\\-]?[a-zA-Z ]+)+$";

    private final int id;

    private String name, jobTitle, dept;

    private int level;

    /**
     * Instantiates a new Employee.
     *
     * @param name     the name
     * @param jobTitle the job title
     * @param level    the level
     * @param dept     the dept
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();

        setName(name);
        setJobTitle(jobTitle);
        setLevel(level);
        setDept(dept);
    }

    /**
     * Instantiates a new Employee.
     */
    public Employee() {
        this.id = (int) (Math.random() * 1000);
    }

    /**
     * Sets job title.
     *
     * @param job the job
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Gets job title.
     *
     * @return the job title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Встановлює ім'я працівника.
     *
     * @param name Має відповідати формату "Ім'я Прізвище" (через регулярний вираз). Якщо валідація не пройдена, встановлюється значення за замовчуванням "John Doe".
     */
    public void setName(String name) {
        if (name.matches(NAME_REGEX)) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень кваліфікації.
     *
     * @param level Дозволені значення: 1, 2, 3. Будь-яке інше значення скидає рівень до 1.
     */
    public void setLevel(int level) {
        this.level = switch (level) {
            case 1, 2, 3 -> level;
            default ->  1;
        };
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets dept.
     *
     * @param dept the dept
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Gets dept.
     *
     * @return the dept
     */
    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "\nEmployee ID= " + id + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }
}
