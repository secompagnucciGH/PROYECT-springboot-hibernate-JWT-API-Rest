package com.prueba.prueba.dao;

import com.prueba.prueba.models.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional

public class UsuarioDaoImp implements UsuarioDao {

    @Override
    public List<Usuario> GetUsuarios() {
        return null;
    }
}
