package mislugares.perstudio.com.mislugares;


public enum TipoLugar {

    OTROS ("Otros",R.drawable.otros),
    RESTAURANTE ("Restaurante",R.drawable.restaurante),
    BAR("Bar",R.drawable.bar),
    COPAS("Copas",R.drawable.copas),
    ESPECTACULOS("Espectaculos",R.drawable.espectaculos),
    HOTEL("Hotel",R.drawable.hotel),
    COMPRAS("Compras",R.drawable.compras),
    EDUCACION("Educacion",R.drawable.educacion),
    DEPORTE("Deporte",R.drawable.deporte),
    NATURALEZA("Naturaleza",R.drawable.naturaleza),
    GASOLINERA("Gasolinera",R.drawable.gasolinera);

    private final String texto;
    private final int recurso;

    TipoLugar(String texto, int recurso){
        this.texto = texto;
        this.recurso = recurso;
    }

    public String getTexto() {
        return texto;
    }
    public int getRecurso() {
        return recurso;
    }
    public static String[] getNombres(){
        String[] resultados = new String[TipoLugar.values().length];
        for(TipoLugar tipo: TipoLugar.values()){
            resultados[tipo.ordinal()]=tipo.texto;
        }
        return resultados;
    }
}
