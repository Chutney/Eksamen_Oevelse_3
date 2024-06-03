public class Main {
    public static void main(String[] args) {


        Raflebæger rb = new Raflebæger(10);

        System.out.println("Samlet antal øjne: " + rb.ryst());
        System.out.println("Liste af øjne: " + rb.se().toString());
    }
}