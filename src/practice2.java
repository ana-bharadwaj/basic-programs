class Methods{

    String animal;
    int value;
    void run()
    { System.out.println("running");
    System.out.println("my"+ animal+"is"+ value+"years old");
    }


}
public class practice2 {
    public static void main(String[] args) {
        Methods name = new Methods();
        name.animal = "cat";
        name.value = 9;
        name.run();


    }
}
