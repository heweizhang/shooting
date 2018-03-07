package com.guoer.shooting.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user", schema = "shooting")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "account")
    private String account;
    @Column(name = "pwd")
    private String pwd;
    @Column(name = "nickname")
    private String nickname;
}
