package ifpr.pgua.eic.bst.modelos;

public class Data {
    private int ano;
    private int mes;
    private int dia;

    public Data(int dia, int mes, int ano) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    /* Getters e Setters */

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String toString() {
        return dia+"/"+mes+"/"+ano;
    }
}
