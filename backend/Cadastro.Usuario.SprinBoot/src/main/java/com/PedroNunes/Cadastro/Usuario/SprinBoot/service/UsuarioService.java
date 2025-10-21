package com.PedroNunes.Cadastro.Usuario.SprinBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PedroNunes.Cadastro.Usuario.SprinBoot.model.Usuario;
import com.PedroNunes.Cadastro.Usuario.SprinBoot.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario cadastarUsuario(Usuario usuario){

        if(usuarioRepository.findByEmail(usuario.getEmail()).isPresent()){
            return null;
        }
        else if(usuario.getEmail() == null){   //Verifica se o email que foi passado para verificação passou!
            return null;
        }
        else{
            return usuarioRepository.save(usuario);
        }
    }
}
