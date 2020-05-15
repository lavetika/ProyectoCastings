/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author laura
 */
public class Control {
    
    private DaoAgenteCasting daoAgenteCasting;
    private DaoCandidatoAdulto daoCandidatoAdulto;
    private DaoCandidatoNiño daoCandidatoNiño;
    private DaoCasting daoCasting;
    private DaoCastingPresencial daoCastingPresencial;
    private DaoCliente daoCliente;
    private DaoFase daoFase;
    private DaoPerfil daoPerfil;
    private DaoPrueba daoPrueba;
    private DaoRepresentante daoRepresentante;
    
    public DaoAgenteCasting getDaoAgenteCasting(){
        if(this.daoAgenteCasting != null){
            return this.daoAgenteCasting;
        }else{
            this.daoAgenteCasting = new DaoAgenteCasting();
            return this.daoAgenteCasting;
        }
    }
    
    public DaoCandidatoAdulto getDaoCandidatoAdulto(){
        if(this.daoCandidatoAdulto != null){
            return this.daoCandidatoAdulto;
        }else{
            this.daoCandidatoAdulto = new DaoCandidatoAdulto();
            return this.daoCandidatoAdulto;
        }
    }

    public DaoCandidatoNiño getDaoCandidatoNiño(){
        if(this.daoCandidatoNiño != null){
            return this.daoCandidatoNiño;
        }else{
            this.daoCandidatoNiño = new DaoCandidatoNiño();
            return this.daoCandidatoNiño;
        }
    }
    
    public DaoCasting getDaoCasting(){
        if(this.daoCasting != null){
            return this.daoCasting;
        }else{
            this.daoCasting = new DaoCasting();
            return this.daoCasting;
        }
    }
    
    public DaoCastingPresencial getDaoCastingPresencial(){
        if(this.daoCastingPresencial != null){
            return this.daoCastingPresencial;
        }else{
            this.daoCastingPresencial = new DaoCastingPresencial();
            return this.daoCastingPresencial;
        }
    }

    public DaoCliente getDaoCliente(){
        if(this.daoCliente != null){
            return this.daoCliente;
        }else{
            this.daoCliente = new DaoCliente();
            return this.daoCliente;
        }
    }

    public DaoFase getDaoFase(){
        if(this.daoFase != null){
            return this.daoFase;
        }else{
            this.daoFase = new DaoFase();
            return this.daoFase;
        }
    }

    public DaoPerfil getDaoPerfil(){
        if(this.daoPerfil != null){
            return this.daoPerfil;
        }else{
            this.daoPerfil = new DaoPerfil();
            return this.daoPerfil;
        }
    }

    public DaoPrueba getDaoPrueba(){
        if(this.daoPrueba != null){
            return this.daoPrueba;
        }else{
            this.daoPrueba = new DaoPrueba();
            return this.daoPrueba;
        }
    }
    
     public DaoRepresentante getDaoRepresentante(){
        if(this.daoRepresentante != null){
            return this.daoRepresentante;
        }else{
            this.daoRepresentante = new DaoRepresentante();
            return this.daoRepresentante;
        }
    }
}
