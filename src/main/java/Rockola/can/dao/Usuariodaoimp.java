/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rockola.can.dao;

import Rockola.can.Modelo.Usuario;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author diego
 */
@Service
@RequiredArgsConstructor
public class Usuariodaoimp {

    private final UsuarioDAO usdao;
        
    public void save (Usuario user){
        usdao.save(user);
    }
    
    public boolean veriuser (String nick){
        Optional<Usuario> us=usdao.findById(nick);
        return us.isPresent();
    }
    
    public Usuario obtusercred (String nick){
        Optional<Usuario> us=usdao.findById(nick);
        if(us.isPresent()){
                return us.get();
            }
        return null;
    }
    


}
