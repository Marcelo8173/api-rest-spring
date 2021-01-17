package com.projetoinicial.examplecommaven.clientesController;

import com.projetoinicial.examplecommaven.domain.clientes.Cliente;
import com.projetoinicial.examplecommaven.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
public class ClientesController {

    @PersistenceContext
    private EntityManager manager;

    //quero uma instancia dessa classe
    @Autowired
    private ClienteRepository ClienteRepository;
    @GetMapping("/clientes")
    public List<Cliente> listar(){
        return ClienteRepository.findAll();
    }
}
