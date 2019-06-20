package etechoracioferias.com.br.solicitaodeferias.model;

import java.util.Date;

import etechoracioferias.com.br.solicitaodeferias.enuns.OpcaoAbonoEnum;

public class MinhasFerias {

    private OpcaoAbonoEnum opabono;
    private Date datainicio;
    private int diasferias;
    private Date datafinal;

    public OpcaoAbonoEnum getOpabono() {
        return opabono;
    }

    public void setOpabono(OpcaoAbonoEnum opabono) {
        this.opabono = opabono;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public int getDiasferias() {
        return diasferias;
    }

    public void setDiasferias(int diasferias) {
        this.diasferias = diasferias;
    }

    public Date getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(Date datafinal) {
        this.datafinal = datafinal;
    }
}
