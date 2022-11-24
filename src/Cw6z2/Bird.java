package Cw6z2;

public class Bird extends Animal{

    String featherColor;

    Bird(){}

    public Bird(String featherColor){
        this.featherColor =featherColor;
    }

    public Bird(String featherColor, String name, int age, int weight){
        this.featherColor =featherColor;
        this.name =name;
        this.age =age;
        this.weight =weight;
    }
    @Override
    public void eat(){ System.out.println("The Bird sings"); }
    @Override
    public void getVoice(){ System.out.println("The Bird eats a bug"); }

    public String getfeatherColor(){ return featherColor; }
    public void setfeatherColor(){ this.featherColor=featherColor; }
    @Override
    public String toString(){ return "This featherColor of this bird is " + featherColor; }

}
