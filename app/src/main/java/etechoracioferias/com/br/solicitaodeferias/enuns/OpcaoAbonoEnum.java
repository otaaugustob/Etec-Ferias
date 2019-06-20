package etechoracioferias.com.br.solicitaodeferias.enuns;

public enum OpcaoAbonoEnum {

    SIM ("SIM"),
    NAO ("NÃO");

    private String abono;

    OpcaoAbonoEnum(String abono){this.abono = abono;
    }
    @Override
    public String toString(){
        return abono;
    }
}
