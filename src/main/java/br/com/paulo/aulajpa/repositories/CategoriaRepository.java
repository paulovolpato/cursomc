package br.com.paulo.aulajpa.repositories;

import br.com.paulo.aulajpa.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {


}
