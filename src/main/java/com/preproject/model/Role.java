package com.preproject.model;

import org.springframework.security.core.GrantedAuthority;



import javax.persistence.*;



@Entity
@Table(name = "role")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role(){}

    public Role(int id){
        this.id = id;
    }
    public Role(int id,String name){
        this.id = id;
        this.name = name;
    }
    public Role(String  role){
        this.name = role;
    }
    @Override
    public String getAuthority() {
        return name;
    }
}