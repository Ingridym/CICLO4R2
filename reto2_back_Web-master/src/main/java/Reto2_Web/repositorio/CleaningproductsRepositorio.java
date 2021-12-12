/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.modelo.Cleaningproducts;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto2_Web.interfaces.InterfaceCleaningproducts;

/**
 *
 * @author USUARIO
 */
@Repository
public class CleaningproductsRepositorio {
    @Autowired
    private InterfaceCleaningproducts repository;

    public List<Cleaningproducts> getAll() {
        return repository.findAll();
    }

    public Optional<Cleaningproducts> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Cleaningproducts create(Cleaningproducts clothe) {
        return repository.save(clothe);
    }

    public void update(Cleaningproducts clothe) {
        repository.save(clothe);
    }
    
    public void delete(Cleaningproducts clothe) {
        repository.delete(clothe);
    }
}
