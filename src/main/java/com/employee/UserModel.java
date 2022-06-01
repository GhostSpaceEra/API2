package com.employee;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="firstname")
    String firstname;

    @Column(name="lastname")
    String lastname;

    @Column(name="email")
    String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
