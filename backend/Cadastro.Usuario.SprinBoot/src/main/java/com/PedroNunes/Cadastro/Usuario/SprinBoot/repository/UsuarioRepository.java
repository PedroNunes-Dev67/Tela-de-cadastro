package com.PedroNunes.Cadastro.Usuario.SprinBoot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PedroNunes.Cadastro.Usuario.SprinBoot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

    Optional<Usuario> findByEmail(String email);
}
