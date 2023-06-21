package zoo;

public class cage {
    private ANIMAL animal;
    private static int count;
    public cage(ANIMAL animal){
        this.animal=animal;
        count++;
    }
    public void display_cage_info(){

        for(int i=0;i<animal.getAge().length;i++){
            animal.Display_animal();
            if(animal instanceof elephant){
                System.out.println("elephant species: "+animal.getSpecies()+"/n age: "+animal.getAge()+"/n count: "+animal.getCount()+"/n wight: "+((elephant) animal).getWeight());
            }else if(animal instanceof lion){
                System.out.println("lion species: "+animal.getSpecies()+"/n age: "+animal.getAge()+"/n count: "+animal.getCount()+"/n color: "+((lion) animal).getColor());
            }
        }

    }
    public void display_cage_num(){
        System.out.println("no. of cages: "+count);
    }


}
