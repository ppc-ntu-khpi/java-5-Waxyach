package test;

import domain.*;

/**
 * Тестовий клас для демонстрації роботи ієрархії класів пакету domain.
 * Перевіряє коректність створення об'єктів різних типів та роботу
 * механізму агрегації (менеджер та його підлеглі).
 */
public class EmployeesTest {

    static void main() {

        String[] skills = { "Microsoft Word", "TeX", "OpenOffice", "Markdown" };
        Editor editor = new Editor(true, skills, "Phil Coulson", "Chief Editor", 3, "Publishing");
        Employee employee = new Employee("Melinda May", "Assistant", 1, "Publishing");

        Artist artist = new Artist(skills);
        Employee[] employees = { editor, employee, artist };
        Manager manager = new Manager(employees, "Steve Ballmer", "CEO", 3, "Publishing");

        System.out.println(manager);
    }
}
