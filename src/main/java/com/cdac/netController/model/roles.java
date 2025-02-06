package com.cdac.netController.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(schema = "user")
public class roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;
}
