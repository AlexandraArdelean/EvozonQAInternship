package org.example.java_basics.if_else_asgn;

public class LogicalOp {
    //3. In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(),
    // si sa primeasca doua int-uri ca si parametrii. Folosind if - else, verificati in interiorul metode
    // care numar este mai mare, dintre cele doua valori care va vin ca si parametrii, si returnati numarul mai mare.
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    //4. Creati o metoda de tip String, care sa primeasca un parametru de tip String.
    // Verificati daca textul ce vine ca si parametru este egal cu “Evozon”.
    // Daca da, atunci metoda sa returneze “Learning text comparison”.
    // Daca nu, atunci metoda sa returneze “Got to try some more”.

    public String compareStrings(String text) {
        if (text.equals("Evozon")) {
            return "Learning text comparison";
        } else {
            return "Go to try some more";
        }
    }

    //5. Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int.
    // Daca textul primit ca si parametru este egal cu “Evozon”, si numarul primit ca si parametru
    // este mai mic sau egal cu 3, returnati textul si numarul, in ordinea asta.
    // Daca textul nu este “Evozon” si numarul este mai mare sau egal cu 4, returnati numarul si textul, in ordinea asta.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public String printMessage(String text, int number) {
        if (text.equals("Evozon") && number <= 3) {
            return text + " " + number;
        } else {
            return number + " " + text;
        }
    }

    //6. Creati o metoda de tip String, care sa primeasca un parametru de tip int.
    // Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze
    // “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa returneze “The forecast snow is(cm):” si numarul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public String printWeatherForecast(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm): " + number;
        }
    }
}
