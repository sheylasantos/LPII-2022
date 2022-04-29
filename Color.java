package br.ufrn.imd;

public enum Color {
    RED("#FF0000"),BLACK("#FFFFFF"),BLUE("#0000FF");
    private String codigoHex;
    //private String pt;

    Color(String codigoHex) {
        this.codigoHex = codigoHex;
    }


    public String getCodigoHex() {
        return codigoHex;
    }
}
