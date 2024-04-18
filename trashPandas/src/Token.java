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
                "Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
    public String getName() {
        return Name;
    }
    public String getDescription() {
        return Description;
    }
}
