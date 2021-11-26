/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rockola.can.dao;

import Rockola.can.Modelo.Cancion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author diego
 */
@Repository
public interface CancionDAO extends MongoRepository<Cancion, String> {   
}
