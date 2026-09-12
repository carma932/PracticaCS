package com.unifranzhk.practicascasa.application.service;

import com.unifranzhk.practicascasa.application.dto.UsuarioDto;

import java.util.List;

public interface UsuarioService {
    UsuarioDto guardar (UsuarioDto usuarioDto);
    List<UsuarioDto> listar();
    List<UsuarioDto> listarActivos();
    UsuarioDto guardarAdmin (UsuarioDto usuarioDto);
}
