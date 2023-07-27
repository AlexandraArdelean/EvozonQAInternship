package org.example.java_basics.while_loops;

public class LogicalOp {
    //1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void printFromGivenNumber(int number) {
        int i = number;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
    }

    //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void printNegativeNumbers(int number) {
        int i = number;
        while (i <= 100) {
            System.out.print(i * -1 + " ");
            i++;
        }
    }

    // 7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala,
    // iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
    // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public void calculateSumAndAverage() {
        int count = 0;
        int sum = 0;
        int i = 111;
        double average = 0;
        while (i <= 8899) {
            count++;
            sum = sum + i;
            average = sum / count;
            i++;
        }
        System.out.println(sum);
        System.out.println(average);
    }

    //8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7,
    // din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public double calculateAverage(int num1, int num2) {
        int i = num1;
        int sum = 0;
        int count = 0;
        while (i <= num2) {
            if (i % 7 == 0) {
                sum = sum + i;
                count++;
            }
            i++;
        }
        return (double) sum /count;
    }

}
