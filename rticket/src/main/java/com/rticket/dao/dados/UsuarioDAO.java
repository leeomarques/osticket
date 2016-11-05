package com.rticket.dao.dados;

import com.rticket.dao.DAOFactory;
import com.rticket.model.Usuario;
import com.rticket.dao.DAOGenerico;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UsuarioDAO extends DAOGenerico<Usuario>{
    Collection<Usuario> user = new ArrayList();

    public UsuarioDAO(EntityManager em) {
        
	super(em);
    }

    public Boolean buscarLogin(String login){
        String sql;
        Boolean verificaLogin = true;
        sql = ("SELECT u FROM Usuario u WHERE u.login = :login");
        Query q = getEntityManager().createQuery(sql, Usuario.class);
        q.setParameter("login", login);
        user = q.getResultList();
        if (user.isEmpty()){
<<<<<<< HEAD:rticket/src/main/java/com/rticket/dao/dados/UsuarioDAO.java
            verificaLogin = true;
        }
=======
            verificaLogin = false;
        }      
>>>>>>> origin:rticket/src/java/com/java/rticket/dao/dados/UsuarioDAO.java
        return verificaLogin;
    }

    public Boolean efetuarLogin(String login, String senha){

        String sql;
        Boolean verificaLogin = true;
        sql = ("SELECT u FROM Usuario u WHERE u.login = :usuarioLogin and u.senha = :usuarioSenha");
        Query q = getEntityManager().createQuery(sql, Usuario.class);
        q.setParameter("usuarioLogin", login);
        q.setParameter("usuarioSenha", senha);
        user = q.getResultList();
        if (user.isEmpty()){
<<<<<<< HEAD:rticket/src/main/java/com/rticket/dao/dados/UsuarioDAO.java
            verificaLogin = true;
        }
=======
            verificaLogin = false;
        }      
>>>>>>> origin:rticket/src/java/com/java/rticket/dao/dados/UsuarioDAO.java
        return verificaLogin;
    }
}
