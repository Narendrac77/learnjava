package com.narendra.immutable;

import com.narendra.interfaceBY.A;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public final class EmployeeTwo {

    private final Integer id;
    private final String name;
    private final BigDecimal salary;
    private final Date dob;
    private final Address address;
    private final List<String> skills;

    public EmployeeTwo(Integer id, String name, BigDecimal salary, Date dob, Address address, List<String> skills) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dob = dob;
        this.address = address;
        this.skills = skills;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Date getDob() {
        return new Date(dob.getTime());
    }

    /*public Address getAddress() {
        return address;
    }*/
    public Address getAddress() {
        Address addressNew = new Address();
        addressNew.setAddressLine1(address.getAddressLine1());
        addressNew.setAddressLine2(address.getAddressLine2());
        addressNew.setCity(address.getCity());
        return addressNew;
    }

    /*public List<String> getSkills() {
        return skills;
    }*/

    public List<String> getSkills() {
        return new ArrayList<>(skills);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTwo that = (EmployeeTwo) o;
        return id.equals(that.id) && name.equals(that.name) && salary.equals(that.salary) && dob.equals(that.dob) && address.equals(that.address) && skills.equals(that.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, dob, address, skills);
    }

    @Override
    public String toString() {
        return "EmployeeTwo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dob=" + dob +
                ", address=" + address +
                ", skills=" + skills +
                '}';
    }
}
