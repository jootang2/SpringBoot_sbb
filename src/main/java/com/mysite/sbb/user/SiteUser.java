package com.mysite.sbb.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class SiteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
}
