public class Eolica extends EnergiaRenovable{

    public int numeroturbinas;


    public Eolica(String tipo, String pais, int año, double produccion, double consumo, int numeroturbinas) {
        super(tipo, pais, año, produccion, consumo);
        this.numeroturbinas = numeroturbinas;
    }

    public double getNumeroturbinas() {
        return numeroturbinas;
    }

    public void setNumeroturbinas(int numeroturbinas) {
        this.numeroturbinas = numeroturbinas;
    }

    public void obtenerBalanceEolica (int numeroturbinas){
        if (getConsumo()>0){
            double resultadoBalance = (getProduccion() - getConsumo()) * numeroturbinas / 100;
            System.out.println("Tipo de energía: " + getTipo());
            System.out.println("País: " + getPais());
            System.out.println("Año: " + getAño());
            System.out.println("Producción: " + getProduccion());
            System.out.println("Consumo: " + getConsumo() );
            System.out.println("Numero de turbinas: " + numeroturbinas );
            System.out.println("El balance general "+ getTipo() +" es: " + resultadoBalance + " m/s" );
        } else{
            System.out.println("No hay datos para mostrar: " + getConsumo() + " m/s");
        }
    }

    @Override
    public String toString() {
        return "Eólica{" +
                " pais = '" + getPais() + '\'' +
                ", año = " + getAño() +
                ", produccion = " + getProduccion()  +
                ", consumo = " + getConsumo()  +
                '}';
    }

}
