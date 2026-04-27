package domain;

/**
 * Представляє працівника творчої спеціальності.
 * Містить список професійних навичок.
 */
public class Artist extends Employee {

    private String[] skills;

    /**
     * Instantiates a new Artist.
     *
     * @param skills   the skills
     * @param name     the name
     * @param jobTitle the job title
     * @param level    the level
     * @param dept     the dept
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Instantiates a new Artist.
     *
     * @param skills the skills
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }

    /**
     * Instantiates a new Artist.
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Sets skills.
     *
     * @param skills skills
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    /**
     * Повертає список навичок у вигляді рядка, розділеного комами.
     *
     * @return Рядок навичок. Може виникнути помилка, якщо масив порожній (через substring).
     */
    public String getSkills() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String skill : skills) {
            stringBuilder.append(skill).append(", ");
        }
        stringBuilder = new StringBuilder(stringBuilder.substring(0, stringBuilder.length() - 2));
        return stringBuilder.toString();
    }

    /**
     * Get skills list string [ ].
     *
     * @return the string [ ]
     */
    public String[] getSkillsList() {
        return skills;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }
}
