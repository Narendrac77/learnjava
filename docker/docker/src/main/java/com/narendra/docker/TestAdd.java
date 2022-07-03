package com.narendra.docker;

import java.util.Objects;

public class TestAdd {

    private String firtstName;

    private String lastName;

    public TestAdd(String firtstName, String lastName) {
        this.firtstName = firtstName;
        this.lastName = lastName;
    }

    public String getFirtstName() {
        return firtstName;
    }

    public void setFirtstName(String firtstName) {
        this.firtstName = firtstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestAdd testAdd = (TestAdd) o;
        return Objects.equals(firtstName, testAdd.firtstName) && Objects.equals(lastName, testAdd.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firtstName, lastName);
    }*/

    @Override
    public String toString() {
        return "TestAdd{" +
                "firtstName='" + firtstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
