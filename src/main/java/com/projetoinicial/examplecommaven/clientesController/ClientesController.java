package com.projetoinicial.examplecommaven.clientesController;

import com.projetoinicial.examplecommaven.domain.clientes.DomainClientes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClientesController {

    @GetMapping("/clientes")
    public List<DomainClientes> listar(){
        var cliente1 = new DomainClientes();
        cliente1.setId(1L);
        cliente1.setNome("Marcelo");
        cliente1.setEmail("marceloandrebio@gmail.com");
        cliente1.setTelefone("123123");
        var cliente2 = new DomainClientes();
        cliente2.setId(2L);
        cliente2.setNome("Marcelo1");
        cliente2.setEmail("marceloandrebio1@gmail.com");
        cliente2.setTelefone("123123asd");
        var cliente3 = new DomainClientes();
        cliente3.setId(3L);
        cliente3.setNome("Marcelo2");
        cliente3.setEmail("marceloandrebio2@gmail.com");
        cliente3.setTelefone("123123123123");
        var cliente4 = new DomainClientes();
        cliente4.setId(4L);
        cliente4.setNome("Marceloas123123");
        cliente4.setEmail("marceloanasddrebio1@gmail.com");
        cliente4.setTelefone("123123asdasd");

        return Arrays.asList(cliente1,cliente2,cliente3,cliente4);

    }
}
