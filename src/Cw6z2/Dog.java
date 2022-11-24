package Cw6z2;

public class Dog extends Mammal{

    String race;

    Dog(){}

    public Dog(String race){
        this.race =race;
        this.name =name;
        this.age =age;
        this.weight =weight;
    }

    public Dog(String race, String furcolor, String name, int age, int weight){
        this.race = race;
        this.furcolor =furcolor;
        this.name =name;
        this.age =age;
        this.weight =weight;
    }
    @Override
    public void eat(){ System.out.println("The dog eats a squirrel"); }
    @Override
    public void getVoice(){ System.out.println("The dog barks"); }

    public String getrace(){ return race; }
    public void setrace(){ this.race=race; }

    @Override
    public String toString(){
        return "This Dogs race is " + race;
    }
}
