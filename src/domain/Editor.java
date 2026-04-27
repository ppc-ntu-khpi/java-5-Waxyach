package domain;

/**
 * Спеціалізація митця, що займається редагуванням.
 */
public class Editor extends Artist {

    private boolean electronicEditing;

    /**
     * Instantiates a new Editor.
     *
     * @param electronicEditing the electronic editing
     * @param skills            the skills
     * @param name              the name
     * @param jobTitle          the job title
     * @param level             the level
     * @param dept              the dept
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Instantiates a new Editor.
     *
     * @param electronicEditing the electronic editing
     * @param skills            the skills
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Instantiates a new Editor.
     *
     * @param electronicEditing the electronic editing
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Instantiates a new Editor.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Sets preferences.
     *
     * @param electronic the electronic
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }

    /**
     * Gets preferences.
     *
     * @return the preferences
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    @Override
    public String toString() {
        String string = super.toString() + "\nEditing preferences=";
        if (electronicEditing)
            string = string + "electronic";
        else
            string = string + "paper";
        return string;

    }
}
