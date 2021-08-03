package br.com.financeiro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.financeiro.model.Titulo;

public interface TitulosRepository extends JpaRepository<Titulo, Long>{

	public Optional<Titulo> findByDescricao(String descricao);
	
}
