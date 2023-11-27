package edu.eci.arsw.app.ucord.service;

import edu.eci.arsw.app.ucord.model.Usuario;

import java.util.List;

public interface IUsuarioService {
    // POST
    void agregarUsuario(Usuario usuario) throws UCordServicesException;

    // GET
    Usuario getUsuarioPorCorreo(String correo) throws UCordServicesException;

    Usuario getUsuarioPorId(Integer id) throws UCordServicesException;

    List<Usuario> getAllUsuarios() throws UCordServicesException;

    // PUT
    void actualizarFotoDeUsuario(String correo, String url) throws UCordServicesException;

    void actualizarContraseñaDeUsuario(String correo, String contraseña) throws UCordServicesException;

}