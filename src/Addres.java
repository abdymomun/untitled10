public class Addres {
    private String street;
    private String name;
    private  String city;

    public Addres (String street, String name, String city){
        this.street = street;
        this.name = name;
        this.city = city;
    }
    public String getStreet(){
        return street;
    }
    public String getName(){
        return name;
    }
    public String getCity (){
        return city;
    }
}
