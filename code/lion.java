package zoo;

public class lion extends ANIMAL{
    private String color;

    public lion(String species, int count, String color) {
        super(species, count);
        this.color=color;
    }


    @Override
    public void Display_animal() {
        System.out.println("this is a lion: "+getSpecies());
        System.out.println("this is a lion color: "+getColor());
        System.out.println("this is a lion age: "+getAge());
        System.out.println("this is a lion count: "+getCount());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
