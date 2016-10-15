package com.java.rticket.negocio;

import com.java.rticket.model.TipoChamado;
import com.java.rticket.dao.DAOFactory;
import com.java.rticket.dao.dados.TipoChamadoDAO;
import java.util.Collection;

public class ControladorTipoChamado {
    
    private TipoChamadoDAO tipoChamadoDAO;
    
    public ControladorTipoChamado() {
        tipoChamadoDAO = DAOFactory.getTipoChamadoDAO();
    }
    
    //Metodo para Inserir TipoChamado
    public void inserirTipoChamado(TipoChamado tipoChamado){
        tipoChamadoDAO.inserir(tipoChamado);   
    }
    
    //Metodo para Buscar o TipoChamado pelo ID
    public TipoChamado buscarTipoChamado(int id){
        return tipoChamadoDAO.buscarPorChave(id);
    }
    
    //Metodo para Alterar TipoChamado
    public void alterarTipoChamado(TipoChamado tipoChamado){
        tipoChamadoDAO.alterar(tipoChamado);
    }
    
    //Listar todos os TipoChamado
    public Collection<TipoChamado> listarTipoChamado(){
        return tipoChamadoDAO.listarColecao();
    }
}