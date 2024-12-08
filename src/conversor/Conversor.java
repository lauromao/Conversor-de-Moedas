package conversor;

import modelo.TabelaMoedas;

public class Conversor {
    ConsultaExchangerateAPI exchangerateAPI;
    TabelaMoedas tabelaMoedas;

    public Conversor() {
        this.exchangerateAPI = new ConsultaExchangerateAPI();
        this.tabelaMoedas = exchangerateAPI.consultar("usd");

    }
    public double dolarparareal (double dolar){
        return dolar * tabelaMoedas.brl();
    }
    public double realparadolar (double real){
        return real/tabelaMoedas.brl();
    }
    public double dolarParaPesoArgentino (double dolar){
        return dolar*tabelaMoedas.ars();
    }
    public double pesoArgentinoParaDolar (double peso){
        return peso/tabelaMoedas.ars();
    }
    public double dolarParaPesoColombiano (double dolar){
        return dolar*tabelaMoedas.cop();
    }
    public double pesoColombianoParaDolar (double peso){
        return peso/tabelaMoedas.cop();
    }
}
