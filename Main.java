import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Quadrado q1 = new Quadrado();
        Retangulo r1 = new Retangulo();
        Circulo c1 = new Circulo();

        ArrayList<Forma> l1 = new ArrayList<>;

        l1.add (q1);
        l1.add (r1);
        l1.add(c1);

        for (Forma forma : l1) {
            System.out.println(calcularArea);
        }

    }
}
