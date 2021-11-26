/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rockola.can.controlador;

import Rockola.can.Modelo.Usuario;
import Rockola.can.Utilidades.JWTUtil;
import Rockola.can.dao.Usuariodaoimp;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author diego
 */
@CrossOrigin(value="*")
@RestController
@RequiredArgsConstructor
public class AutControlador {

    private final Usuariodaoimp usmon;

    @Autowired
    private JWTUtil jwtUtil;

    
    @PostMapping(value="/login", consumes= {MediaType.APPLICATION_JSON_VALUE})
    public String login(@RequestBody JsonNode payload){
        Usuario usver=usmon.obtusercred(payload.get("nickname").textValue());
        
        if(usver==null){
            return "mal";
        }else if(usver.getPassword().equals(String.valueOf(payload.get("password").textValue()))){
            String tokenJwt = jwtUtil.create(usver.getNickname(), usver.getEmail());
            return tokenJwt;
        }
        return "mal";
    }
}
