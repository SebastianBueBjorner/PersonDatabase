package com.company;
import java.util.Scanner;

public class UserInterface {
    private Application application = new Application();
    private Scanner input = new Scanner(System.in);

    public void start() {

        //opret();

        boolean run = true;

        while (run) {

            introTekst();

            switch (input.next()) {

                case "o", "opret":
                    System.out.print("Indtast fornavn: ");
                    String fornavn = input.next();
                    System.out.print("Indtast efternavn: ");
                    String efternavn = input.next();

                    application.opretPerson(fornavn, efternavn);
                    break;

                case "s", "slet":
                    getList();
                    System.out.print("Slet person nummer: ");
                    int nummer = input.nextInt();
                    application.deletePerson(nummer);
                    break;

                case "l", "liste":
                    getList();
                    break;

                case "x", "exit":
                    terminatesProgramTekst();
                    run = false;
                    break;

                default:
                    ukendtInputTekst();
                    break;

            }
        }
    }

    public void introTekst() {
        System.out.println();
        System.out.print("Commands:\n" +
                "Skriv [o]/[opret] - for at oprette person i databasen\n" +
                "Skriv [s]/[slet] - for at slette person i databasen\n" +
                "Skriv [l]/[liste] - for at se en liste a personer i databasen\n" +
                "Skriv [x]/[exit] - for at lukke programmet\n\n" +
                "Indtast command: ");
    }

    public void ukendtInputTekst() {
        System.out.println("Ugyldigt input..");
    }

    public void terminatesProgramTekst() {
        System.out.println("Lukker program..");
    }

    public void opret() {
        application.opretPerson("Karsten", "Christensen");
        application.opretPerson("Thomas", "Pedersen");
        application.opretPerson("Andreas", "Pedersen");
        application.opretPerson("Lillian", "Christensen");
    }

    public void getList() {
        application.sort();
        StringBuilder list = application.getList();
        System.out.print(list);
    }

}
