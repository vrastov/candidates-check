package ru.cbr.candidatesCheck.domen;


public class Candidate {
    private String name;
    private String surname;

    public Candidate() {
    }

    public Candidate(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candidate candidate = (Candidate) o;

        if (name != null ? !name.equals(candidate.name) : candidate.name != null) return false;
        return !(surname != null ? !surname.equals(candidate.surname) : candidate.surname != null);

    }

}
