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

    //3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // numaratoarea sa se faca de la x, la y.
    public void printGivenNumbersInterval(int num1, int num2) {
        int i = num1;
        while (i <= num2) {
            System.out.print(i + " ");
            i++;
        }
    }

    // 4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    public void printAscedingOrder(int num1, int num2) {
        int smaller;
        int higher;
        if (num1 < num2) {
            smaller = num1;
            higher = num2;
        } else {
            smaller = num2;
            higher = num1;
        }
        while (smaller <= higher) {
            System.out.print(smaller + " ");
            smaller++;
        }

    }

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void printEvenNumbers() {
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void printOddNumbers() {
        int i = 0;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
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
        return (double) sum / count;
    }

    //9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
    public void printFibonacciFirst20Numbers() {
        System.out.println("First 20 numbers from Fibonacci series are: ");
        int count = 0;
        int firstNumber = 0;
        int secondNumber = 1;
        while (count < 20) {
            System.out.print(firstNumber + " ");
            int sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            count++;
        }
    }

    // 10. Creati o metoda numita CozaLozaWoza.
    public void printMessageCozaWoza() {
        int num = 1;
        while (num <= 100) {
            if (num % 3 == 0) {
                System.out.print("Coza ");
            } else if (num % 5 == 0) {
                System.out.print("Loza ");

            } else if (num % 7 == 0) {
                System.out.print("Woza ");

            } else if (num % 3 == 0 && num % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (num % 3 == 0 && num % 7 == 0) {
                System.out.print("CozaWoza ");

            } else if (num % 5 == 0 && num % 7 == 0) {
                System.out.print("WozaLoza ");

            } else if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else {
                System.out.print(num + " ");
            }

            if (num % 11 == 0) {
                System.out.println();
            }
            num++;
        }
    }


}
