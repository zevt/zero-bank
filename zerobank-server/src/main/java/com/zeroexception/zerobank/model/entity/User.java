package com.zeroexception.zerobank.model.entity;


import lombok.Getter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_USER")
public class User {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Getter
    @Column(name = "first_name")
    private String firstName;
    @Getter
    @Column(name = "last_name")
    private String lastsName;

    @Getter
    @Column(name = "phone_number")
    @ElementCollection
    @CollectionTable(name = "tb_PHONE_NUMBER", joinColumns = @JoinColumn(name = "user_id"))
    private Set<String> phoneNumberList;
    public User() {
    }

    public User setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User setLastsName(String lastsName) {
        this.lastsName = lastsName;
        return this;
    }

    public User setPhoneNumberList(Set<String> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
        return this;
    }
}
