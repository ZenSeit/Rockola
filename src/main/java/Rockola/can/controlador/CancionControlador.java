/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rockola.can.controlador;

import Rockola.can.Modelo.Cancion;
import Rockola.can.Utilidades.JWTUtil;
import Rockola.can.dao.Canciondaoimp;
import Rockola.can.dao.Usuariodaoimp;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author diego
 */
@CrossOrigin(value = "*")
@RestController
@RequiredArgsConstructor
public class CancionControlador {

    private final Canciondaoimp canmon;
    private final Usuariodaoimp usmon;
    @Autowired
    JWTUtil idhead;

    @PostMapping("/gcan") //guardar
    public void save(@RequestBody Cancion can) {
        canmon.save(can);
    }

    @GetMapping("/lcan") //listar @RequestHeader(value="Authorization") String token
    public List<Cancion> Listarcancion() {

        //if (!validarToken(token)) { return null; }
        return canmon.findAll();

    }

    @DeleteMapping("/dcan/{id}") //borrar
    public void borrarcan(@PathVariable String id) {
        canmon.deleteById(id);
    }

    @PutMapping("/acan") //actualizar
    public void actualizar(@RequestBody Cancion can) {
        canmon.save(can);
    }

    private boolean validarToken(String token) {
        String usuarioId = idhead.getKey(token);
        return usuarioId != null;
    }

}
