package zoo;

public class Main {

    public static void main(String[] args) {
        // write your code here
        cage cages[]= new cage[3];
        System.out.println("number of cages created: : "+cages.length);
        ANIMAL lions= new lion("cats",4,"brown");
        lions.setAge();
        cages[0]= new cage(lions);

        ANIMAL elephants= new elephant("big",3,6000f);
        elephants.setAge();
        cages[1]= new cage(elephants);


        ANIMAL elephants2= new elephant("small",2,3000f);
        elephants2.setAge();
        cages[2]=new cage(elephants2);

        for (cage c: cages){
       c.display_cage_info();
        }
    }
}
