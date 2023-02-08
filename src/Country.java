public class Country {
    private String name;
    private int population;
    private String president;

    public Country(String name, int population, String president) {
        this.name = name;
        this.population = population;
        this.president = president;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPresident() {
        return president;
    }

    public void setCapital(String capital) {
        this.president = president;
    }
}
