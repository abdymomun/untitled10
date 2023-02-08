public class City {
    private String name;
    private  String life;
    private  int population;
    public City (String name,String life,int population){
        this.name = name;
        this.life = life;
        this.population = population;
    }
    public String getName (){
        return name;
    }
    public String getLife (){
        return life;
    }
    public int getPopulation(){
        return population;
    }
}
