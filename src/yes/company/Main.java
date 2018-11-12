package yes.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String FILENAME = "calculatordata.txt";

    public static void main(String[] args) {

        // Geef de gebruiker een boodschap of de file al bestaat of juist niet
        if (fileExists()) {
            System.out.println("ER IS AL EEN BESTAND!");
        }

        readMyDataAndWriteDataToFile();

    }



    public static void readMyDataAndWriteDataToFile() {

// Gebruik de scanner om een aantal gegevens op te vragen.

        Scanner s = new Scanner(System.in);

// Vraag om je leeftijd en stop dat in een variabele
//      noem deze variabele age
//      Kijk naar writeToFile welk type de variabele heeft.

        String age;
        System.out.print("Hoe oud ben je? \n");
        age = s.next();

// Vraag ook om je naam en stop dat ook in een andere variabele
//      noem deze variabele name
//      Kijk naar writeToFile welk type de variabele heeft.

        String name;
        System.out.print("Hoe heet je? \n");
        name = s.next();

// Maak de functie af waarin je dus je leeftijd en naam opvraagt.
// Als je de variabelen goed gemaakt hebt verdwijnen de foutmeldingen

        // .... Jouw code .....


        writeToFile(name, age );

    }


    // Aan de hieronder code hoef je niets meer te doen behalve te
    // begrijpen wat er gebeurd.

    public static Boolean fileExists() {
        Boolean exists;
        File fileName = new File(FILENAME);

        if (fileName.exists()) {
            exists = true;
        } else {
            exists = false;
        }

        return exists;
    }

    public static void writeToFile(String age, String name) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

            String content = name + "\n";
            bw.write(content);
            bw.write(age + "\n");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
