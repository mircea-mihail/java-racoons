public class Token
{
    private final String name;
    private final String description;

    public Token(String _name, String _description) {
        name = _name;
        description = _description;
    }
    @Override
    public String toString() {
        return "Token{" +
                "\n\tName='" + name + '\'' +
                "\n\tDescription='" + description + '\'' +
                "\n}";
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}
