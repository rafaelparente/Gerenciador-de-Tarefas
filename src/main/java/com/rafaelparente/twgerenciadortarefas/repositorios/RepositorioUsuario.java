package com.rafaelparente.twgerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelparente.twgerenciadortarefas.modelos.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {

	Usuario findByEmail(String email);
	
}
