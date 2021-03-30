package br.com.moreiravictor.classes.pessoa;

import br.com.moreiravictor.classes.usuario.SuperUsuario;

public class Usuario extends SuperUsuario {

    public Usuario(final String login, final String senha) {
        super(login, senha);
    }
}
