package com.example.gabinete_pdm;

public class pessoasAtendimento {

    private int codigo;
    private String status;
    private int prontuario;
    private String sintomas;
    private int data;
    private int hora;
    private String codigo_Medico;
    private String codigo_Servidor;
    private String codigo_Paciente;

    public pessoasAtendimento(int codigo, String status, int prontuario, String sintomas, int data, int hora, String codigo_Medico, String codigo_Servidor, String codigo_Paciente){
        this.codigo = codigo;
        this.status = status;
        this.prontuario = prontuario;
        this.sintomas = sintomas;
        this.data = data;
        this.hora = hora;
        this.codigo_Medico = codigo_Medico;
        this.codigo_Servidor = codigo_Servidor;
        this.codigo_Paciente = codigo_Paciente;
    }

    public void setCodigo(int Codigo){
        this.codigo = Codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setStatus(String Status){
        this.status = Status;
    }

    public String getStatus(){
        return status;
    }

    public void setProntuario(int prontuario){
        this.prontuario = prontuario;
    }

    public int getProntuario(){
        return prontuario;
    }

    public void setSintomas(String sintomas){
        this.sintomas = sintomas;
    }

    public String getSintomas(){
        return sintomas;
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void setHora(int hora){
        this.hora = hora;
    }

    public int getHora(){
        return hora;
    }

    public void setCodigo_Medico(String medico){
        this.codigo_Medico = medico;
    }

    public String getCodigo_Medico(){
        return codigo_Medico;
    }

    public void setCodigo_Servidor(String codigo_Servidor){
        this.codigo_Servidor = codigo_Paciente;
    }

    public String getCodigo_Servidor(){
        return codigo_Servidor;
    }

    public void setCodigo_Paciente(String codigo_Paciente){
        this.codigo_Paciente = codigo_Paciente;
    }

    public String getCodigo_Paciente(){
        return codigo_Paciente;
    }

    @Override
    public String toString(){
        return "Código: "+ codigo
                + "\nStatus: "+ status
                + "\nProntuário: "+ prontuario
                + "\nSintomas: "+ sintomas
                + "\nData: "+ data
                + "\nHora: "+ hora
                + "\nCódigo do Médico: "+ codigo_Medico
                + "\nCódigo do Servidor: " + codigo_Servidor
                + "\nCódigo do Paciente: "+ codigo_Paciente;
    }

}
