package com.projetoinicial.examplecommaven.clientesController;

import com.projetoinicial.examplecommaven.domain.clientes.DomainClientes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClientesController {

    @PersistenceContext
    private EntityManager manager;

    @GetMapping("/clientes")
    public List<DomainClientes> listar(){
        return manager.createQuery("from clientes", DomainClientes.class).getResultList();
    }
}
