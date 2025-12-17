package com.example.demo.newentity;
import jakarta.util.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

public class NewFileEntity{
    @Id
    @GeneratedValue(strategy=GeneratedType.IDENTITY)
    private Long id;
    @NotBlank(message="Should not contain spaces")
    private String name;
    @Column(name=unique)
    @NotBlank(message="Should not contain spaces")
    @Email(message="Invalid message")
    private String email;

    public NewFileEntity(Long id,String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    public Long getID(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return email;
    }
    
    public void setName(String email) {
        this.email = email;
    }
}