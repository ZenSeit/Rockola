/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rockola.can.Modelo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author diego
 */
@Document(value="Usuario")
@Data
public class Usuario {
    @Id
    private String nickname;
    private String nombre;
    private String email;
    private String genero;
    private String password;
    
    public Usuario(){
        
    }


    public Usuario(String nickname, String nombre, String email, String genero, String password) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.email = email;
        this.genero = genero;
        this.password = password;
    }

    /*{
    "nickname":"diegofer11",
    "nombre":"Diego Becerra",
    "email":"diegofer@hotmail.com",
    "genero":"Masculino",
    "password":"12345"
    }*/
    
}
