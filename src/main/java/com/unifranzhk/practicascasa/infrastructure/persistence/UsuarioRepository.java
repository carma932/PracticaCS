package com.unifranzhk.practicascasa.infrastructure.persistence;

import com.unifranzhk.practicascasa.application.dto.UsuarioDto;
import com.unifranzhk.practicascasa.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {



    @Query("SELECT new com.unifranzhk.practicascasa.application.dto.UsuarioDto(u)"+
            " FROM Usuario u" +
            " WHERE u.eliminado = false")
    List<UsuarioDto> listarActivos();
}
