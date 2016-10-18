package com.rticket.negocio;

import com.rticket.excecao.CampoVazioException;
import com.rticket.excecao.CampoExistenteException;
import com.rticket.excecao.FormatoInvalidoException;
import com.rticket.excecao.ValidarLoginException;
import com.rticket.model.Modulo;
import com.rticket.model.Usuario;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class GUITeste {
    public static void main(String[] args)
            throws NoSuchAlgorithmException, FormatoInvalidoException, ValidarLoginException{
        IFachada fach = new Fachada();
        try{
            Usuario user = new Usuario();
            user.setNome("Yanne");
            user.setLogin("PPPYQASW");
            user.setSenha("Senhssa1");
            fach.efetuarLogin("PPYQASW", "Senhssa1");
            fach.inserirUsuario(user);
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
        }catch(CampoVazioException e){
            JOptionPane.showMessageDialog(null, "Preencher todos os campos");
        }catch(CampoExistenteException e){
            JOptionPane.showMessageDialog(null, "Login Existente");
        }catch(FormatoInvalidoException e){
            JOptionPane.showMessageDialog(null, "Formato Invalido");
        }catch(ValidarLoginException e){
            JOptionPane.showMessageDialog(null, "Login Invalido");
        }

        // Iterator<Modulo> iterator;
        //
        // iterator = fach.listarModulo().iterator();
        //
        // //Laço para exibir a lista de Modulos.
        // while(iterator.hasNext()) {
        //     Modulo item = (Modulo)iterator.next();
        //     System.out.println(item.getId()+" "+item.getNome());
        // }
    }
}
