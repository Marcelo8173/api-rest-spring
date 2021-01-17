package com.projetoinicial.examplecommaven.repository;

import com.projetoinicial.examplecommaven.domain.clientes.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//componente do spring
@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
