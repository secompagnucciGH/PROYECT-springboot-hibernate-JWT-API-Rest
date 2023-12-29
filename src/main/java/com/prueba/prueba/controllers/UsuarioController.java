package com.prueba.prueba.controllers;

import com.prueba.prueba.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Sebastian");
        usuario.setApellido("Compagnucci");
        usuario.setEmail("sebastiancompagnucci@gmail.com");
        usuario.setTelefono("3401536");
        usuario.setPassword("password");
        return usuario;
    }

    @RequestMapping(value = "usuario")
    public List <Usuario> getUsuario() {

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(01L);
        usuario.setNombre("Sebastian");
        usuario.setApellido("Compagnucci");
        usuario.setEmail("sebastiancompagnucci@gmail.com");
        usuario.setTelefono("3401536");
        usuario.setPassword("password");


        Usuario usuario2 = new Usuario();
        usuario2.setId(02L);
        usuario2.setNombre("Sebastian2 ");
        usuario2.setApellido("dos");
        usuario2.setEmail("sebastiancompagnucci@gmail.com");
        usuario2.setTelefono("22222222222");
        usuario2.setPassword("password");

        Usuario usuario3 = new Usuario();
        usuario3.setId(05L);
        usuario3.setNombre("Sebastian3 ");
        usuario3.setApellido("tres");
        usuario3.setEmail("sebastiancompagnucci@gmail.com");
        usuario3.setTelefono("3333333");
        usuario3.setPassword("password");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    @RequestMapping(value = "usuarioeEdicion")
    public Usuario editarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Sebastian");
        usuario.setApellido("Compagnucci");
        usuario.setEmail("sebastiancompagnucci@gmail.com");
        usuario.setTelefono("3401536");
        usuario.setPassword("password");
        return usuario;
    }
}
