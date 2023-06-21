package zoo;

public class elephant extends ANIMAL{
    private float weight;
    public elephant(String species, int count, float weight) {
        super(species,count);
        this.weight=weight;
    }

    @Override
    public void Display_animal() {
        System.out.println("this is an elephant:" +getSpecies());
        System.out.println("this is an elephant weight:" +getWeight());
        System.out.println("this is an elephant age:" +getAge());
        System.out.println("this is an elephant count:" +getCount());
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
