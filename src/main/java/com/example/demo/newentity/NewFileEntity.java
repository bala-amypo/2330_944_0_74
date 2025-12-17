package com.example.demo.newentity;

public class NewFileEntity{
    @Id
    private Long id;
    @NotBlank(message="S")
    private String name;
    @Common(name=unique)
    private String email;
}