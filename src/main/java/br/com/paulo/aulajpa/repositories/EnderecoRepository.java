package br.com.paulo.aulajpa.repositories;

import br.com.paulo.aulajpa.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {


}
