package ifsp.aula2;
public class Main {
    public static void main(String[] args) {

        Dentista d1 = new Dentista("João", 29);
        Dentista d2 = new Dentista("Maria", 30);

        Dentista d3 = new Dentista("Maria", 30);

        //hashcode
        System.out.println("HashCode do Dentista 1: " + dentista1.hashCode());
        System.out.println("HashCode do Dentista 2: " + dentista2.hashCode());

        //equals
        System.out.println("Dentista 1 é igual ao Dentista 2? " + d1.equals(d2));
        System.out.println("Dentista 1 é igual ao Dentista 3? " + d1.equals(d3)); 

        //toString
        System.out.println("Dentista 1: " + d1.toString());
        System.out.println("Dentista 2: " + d2.toString());
        System.out.println("Dentista 3: " + d3.toString());
    }
}

