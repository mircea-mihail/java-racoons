public class Token
{
    private final String Name;
    private final String Description;
    public Token(String name, String description) {
        Name = name;
        Description = description;
    }
    @Override
    public String toString() {
        return "Token{" +
                "\n\tName='" + Name + '\'' +
                "\n\tDescription='" + Description + '\'' +
                "\n}";
    }
    public String getName() {
        return Name;
    }
    public String getDescription() {
        return Description;
    }
}
