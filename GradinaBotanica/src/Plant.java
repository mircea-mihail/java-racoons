public class Plant
{
    private String m_name;
    private String m_species;
    private double m_age;
    private double m_heightM;

    public Plant(String p_name, String p_species, double p_age, double p_heightM)
    {
        m_name = p_name;
        m_species = p_species;
        m_age = p_age;
        m_heightM = p_heightM;
    }

    public String getM_name() {
        return m_name;
    }

    public String getM_species() {
        return m_species;
    }

    public double getM_age() {
        return m_age;
    }

    public double getM_heightM() {
        return m_heightM;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public void setM_species(String m_species) {
        this.m_species = m_species;
    }

    public void setM_age(double m_age) {
        this.m_age = m_age;
    }

    public void setM_heightM(double m_heightM) {
        this.m_heightM = m_heightM;
    }
}
