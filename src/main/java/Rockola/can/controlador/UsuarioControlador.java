/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rockola.can.controlador;

import Rockola.can.Modelo.Usuario;
import Rockola.can.dao.Usuariodaoimp;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
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
public class UsuarioControlador {
    private final Usuariodaoimp usmon;
    
    
    @PostMapping("/registro") //registrarUsuario
    public void save(@RequestBody Usuario user){
        usmon.save(user);
    }
    
}
