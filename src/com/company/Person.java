package com.company;

public class Person {
    private String fornavn;
    private String efternavn;

    public Person(String fornavn, String efternavn) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
    }

    public int compareTo(Person andenPerson) {
        // DEFINATION: returner -1 hvis denne person kommer FØR andenPerson
        /*
        String voresFornavn = firstName;
        String andetFornavn = andenPerson.firstName;
        if( voresFornavn.compareTo(andetFornavn) <= 0 ) {
            return -1;
        } else {
            return 1;
        }
        */

        return  fornavn.compareTo(andenPerson.fornavn);
    }

    public String toString() {
        return fornavn + " " + efternavn;
    }

}
