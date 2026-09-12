package com.unifranzhk.practicascasa.application.dto;

import com.unifranzhk.practicascasa.domain.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto {
    private Long id;
    private String nombre;
    private String email;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
    private String creadoPor;
    private String modificadoPor;
    private Boolean eliminado;
    private String rol; // Cambiado de Boolean a String para aceptar "Admin" o "Normal"

    public UsuarioDto(Usuario usuario) {
        this.id = usuario.getId();
        this.nombre = usuario.getNombre();
        this.email = usuario.getEmail();
        this.fechaCreacion = usuario.getFechaCreacion();
        this.fechaModificacion = usuario.getFechaModificacion();
        this.creadoPor = usuario.getCreadoPor();
        this.modificadoPor = usuario.getModificadoPor();
        this.eliminado = usuario.getEliminado();

        if (usuario.getRol() != null && "ADMIN".equalsIgnoreCase(usuario.getRol())) {
            this.rol = "Admin";
        } else {
            this.rol = "Normal";
        }
    }
}