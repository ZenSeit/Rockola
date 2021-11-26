/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rockola.can.dao;

import Rockola.can.Modelo.Cancion;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


/**
 *
 * @author diego
 */
@Service
@RequiredArgsConstructor
public class Canciondaoimp {
    private final CancionDAO candao;
        
    public void save (Cancion can){
        candao.save(can);
    }
    
    public List<Cancion> findAll(){
        return candao.findAll();
    }
    
    public void deleteById(String id){
        candao.deleteById(id);
    }
}
