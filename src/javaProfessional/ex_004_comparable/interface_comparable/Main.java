package javaProfessional.ex_004_comparable.interface_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 8, 8, 5000);
        Animal dog = new Animal("Labrador", 7, 8, 5000);
        Animal bird = new Animal("King Penguin", 9, 8, 5000);

        Animal[] c = {cat, dog, bird};

        Arrays.sort(c);   // ClassCastException w/o Comparable

        for (Animal tmp : c) {
            System.out.println(tmp);
        }
    }
}
