package Cw6z2;

public class Fish extends Animal{

    String predatorprey;

    Fish(){}

    public Fish(String predatorprey){
        this.predatorprey =predatorprey;
    }


    public Fish(String predatorprey, String name, int age, int weight){
        this.predatorprey =predatorprey;
        this.name =name;
        this.age =age;
        this.weight =weight;
    }

    @Override
    public void eat(){ System.out.println("The Fish eats seaweed"); }
    @Override
    public void getVoice(){ System.out.println("The Fish makes a sound"); }


    public String getpredatorprey(){ return predatorprey; }
    public void setpredatorprey(){ this.predatorprey=predatorprey; }
    @Override
    public String toString(){
        return "The fish is a " + predatorprey;
    }

}