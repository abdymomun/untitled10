public class Person {
    private String name ;
    private int age ;
    private String gender;
    private int weight;
    public Person (String name , int age , String gender , int weight){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }
    public String getName (){
        return name;
    }
    public  int getAge (){
        return age;
    }
    public  String getGender(){
        return gender;
    }
    public int getWeight (){
        return weight;
    }
}

