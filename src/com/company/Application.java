package com.company;

import java.util.ArrayList;

public class Application {
    private ArrayList<Person> personDatabase = new ArrayList<>();

    public void opretPerson(String fornavn, String efternavn) {
        Person person = new Person(fornavn, efternavn);
        personDatabase.add(person);
    }

    public void sort() {
        QuickSortPerson.sort(this.personDatabase);
    }

    public StringBuilder getList() {
        StringBuilder str = new StringBuilder();

        for (int i=0; i < this.personDatabase.size(); i++) {
            str.append(i+1 + ") " + this.personDatabase.get(i) + "\n");
        }
        return str;
    }

    public void deletePerson(int nummer) {
        this.personDatabase.remove(nummer-1);
    }

}
