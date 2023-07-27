package org.example.java_basics.for_loops;

public class LogicalOp {
    //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul
    // primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void generateNumbers(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.print(i * -1 + " ");
        }
    }

    //3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // numaratoarea sa se faca de la x, la y.

    public void printNumInterval(int first, int last) {
        for (int i = first; i <= last; i++) {
            System.out.print(i + " ");
        }
    }

    //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    public void compareNumbersAndPrint(int first, int last) {
        if (first >= last) {
            for (int i = last; i <= first; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = first; i <= last; i++) {
                System.out.print(i + " ");
            }
        }
    }


    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void printNumbers() {
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

}
