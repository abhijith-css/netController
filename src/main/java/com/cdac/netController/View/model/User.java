package com.cdac.netController.View.model;

import jakarta.persistence.*;

@Entity
@Table(name="userDetails")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String userName;
    String password;
}
