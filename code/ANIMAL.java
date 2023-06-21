package zoo;

import java.util.Scanner;

public abstract class ANIMAL {
    private String species;
    private int[] age;
    private int count;
    public ANIMAL(String species, int count){
        this.species=species;
        this.count=count;
    }
    public abstract void Display_animal();
    public void setAge(){
        Scanner scanner= new Scanner(System.in);
        for(int i=0;i<count;i++){
            age=new int[count];
            System.out.println("enter age of animal no."+i);
            age[i]=scanner.nextInt();
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int[] getAge() {
        return age;
    }

    public void setAge(int[] age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
