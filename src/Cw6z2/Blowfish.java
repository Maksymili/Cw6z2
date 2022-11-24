package Cw6z2;

public class Blowfish extends Fish{

    String color;

    Blowfish(){}

    public Blowfish(String color){
        this.color =color;
        this.name =name;
        this.age =age;
        this.weight =weight;
    }

    public Blowfish(String color, String predatorprey, String name, int age, int weight){
        this.color = color;
        this.predatorprey =predatorprey;
        this.name =name;
        this.age =age;
        this.weight =weight;
    }

    @Override
    public void eat(){ System.out.println("The Blowfish eats some waterweed"); }
    @Override
    public void getVoice(){ System.out.println("The Pigeon makes a weird sound"); }

    public String getcolor(){ return color; }
    public void setcolor(){ this.color=color; }

    @Override
    public String toString(){
        return "The color of this fish is" + color;
    }




}
