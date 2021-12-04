/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rockola.can.dao;

import Rockola.can.Modelo.Generos;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author diego
 */
@Service
@RequiredArgsConstructor
public class Generosdaoimp {
    private final GenerosDAO gendao;
    
    public List<Generos> findAll(){
        return gendao.findAll();
    }
    
    public void save (Generos gen){
        gendao.save(gen);
    }
    
}
