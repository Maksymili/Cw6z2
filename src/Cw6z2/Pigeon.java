package Cw6z2;

public class Pigeon extends Bird{

    String species;

    Pigeon(){}

    public Pigeon(String species){
        this.species = species;
        this.name =name;
        this.age =age;
        this.weight =weight;
    }

    public Pigeon(String species, String featherColor, String name, int age, int weight){
        this.species = species;
        this.featherColor =featherColor;
        this.name =name;
        this.age =age;
        this.weight =weight;
    }
    @Override
    public void eat(){ System.out.println("The Pigeon eats a worm"); }
    @Override
    public void getVoice(){ System.out.println("The Pigeon makes a sound"); }

    public String getspecies(){ return species; }
    public void setspecies(){ this.species=species; }

    @Override
    public String toString(){
        return "This pigeons race is " + species;
    }

}
