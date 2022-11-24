package Cw6z2;

public class Mammal extends Animal{

    String furcolor;

    Mammal(){}

    public Mammal(String furcolor){
        this.furcolor =furcolor;
    }

    public Mammal(String furcolor, String name, int age, int weight){
        this.furcolor =furcolor;
        this.name =name;
        this.age =age;
        this.weight =weight;
    }
    @Override
    public void eat(){ System.out.println("The Mammal eats an ant"); }
    @Override
    public void getVoice(){ System.out.println("The Mammal makes a sound"); }

    public String getfurcolor(){ return furcolor; }
    public void setfurcolor(){ this.furcolor=furcolor; }
    @Override
    public String toString(){
        return "This Mammals fur color is " + furcolor;
    }

}