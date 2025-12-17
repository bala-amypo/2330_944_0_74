package com.example.demo.newentity;

import java.util.persistence.*;
public class NewFileEntity{
    @Id
    @GeneratedValue()
    private Long id;
    @NotBlank(message="Should not contain spaces")
    private String name;
    @Column(name=unique)
    @NotBlank(message="Should not contain spaces")
    @Email(message="Invalid message")
    private String email;
}