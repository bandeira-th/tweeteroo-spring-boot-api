package com.bandeira.tweeteroospringbootapi.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb_users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID user_id;

    @Column(nullable = false, length = 60)
    private String username;

    @Column(nullable = false, length = 600)
    private String avatar;

    public User() {
    }

    public User(String username, String avatar) {
        this.username = username;
        this.avatar = avatar;
    }
}
