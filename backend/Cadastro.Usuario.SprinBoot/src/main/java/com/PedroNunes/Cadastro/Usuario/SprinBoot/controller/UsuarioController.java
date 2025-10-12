package com.PedroNunes.Cadastro.Usuario.SprinBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PedroNunes.Cadastro.Usuario.SprinBoot.model.Usuario;
import com.PedroNunes.Cadastro.Usuario.SprinBoot.service.UsuarioService;

@CrossOrigin(origins="http://localhost:5500")
@RestController
@RequestMapping("/cadastro")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/novoUsuario")
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario){

        Usuario novoUsuario = usuarioService.cadastarUsuario(usuario);

        if(novoUsuario == null){
            return ResponseEntity.status(HttpStatus.CONFLICT).body(usuario);
        }
        else{
            return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
        }
    }
    
}
