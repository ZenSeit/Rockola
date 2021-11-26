/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Rockola.can.Modelo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(value = "Cancion")
@Data
public class Cancion {
    @Id
    private String id;
    private String nom;
    private String autor;
    private String gen;
    private String enlace;
    private String comentario;
    @Field("nickname")
    private String usercanr;

    public Cancion() {

    }
    

    

/* json cancion
    {
    "id":"1",
    "nom":"Labios compartidos",
    "autor":"Mana",
    "gen":"Rock",
    "enlace":"https://www.youtube.com/watch?v=5KlN9ujUw0s",
    "comentario":"2006",
    "usercanr":{
        "nickname":"diegofer11",
        "nombre":"Diego Becerra",
        "genero":"Masculino",
        "password":"12345"}
    }
    
    }*/

    public Cancion(String id, String nom, String autor, String gen, String enlace, String comentario, String usercanr) {
        this.id = id;
        this.nom = nom;
        this.autor = autor;
        this.gen = gen;
        this.enlace = enlace;
        this.comentario = comentario;
        this.usercanr = usercanr;
    }

}
