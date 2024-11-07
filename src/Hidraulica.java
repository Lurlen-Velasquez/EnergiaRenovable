public class Hidraulica extends EnergiaRenovable {

    public double volumenAgua;

    public Hidraulica(String tipo, String pais, int año, double produccion, double consumo ,double volumenAgua) {
        super(tipo, pais, año, produccion, consumo);
        this.volumenAgua = volumenAgua;
    }


    public double getVolumenAgua() {
        return volumenAgua;
    }

    public void setVolumenAgua(double volumenAgua) {
        this.volumenAgua = volumenAgua;
    }

    public void obtenerBalanceHidraulico (double volumenAgua){

        if (getConsumo()>0){
            double resultadoBalance = (getProduccion() - getConsumo()) * volumenAgua / 100 ;
            System.out.println("El resultado del balance es: " + resultadoBalance);
            System.out.println("Tipo de energía: " + getTipo());
            System.out.println("País: " + getPais());
            System.out.println("Año: " + getAño());
            System.out.println("Producción: " + getProduccion());
            System.out.println("Consumo: " + getConsumo() );
            System.out.println("Volumen de agua: " + volumenAgua );
            System.out.println("El balance general "+ getTipo() +" es: " + resultadoBalance + " kWh/m³");
        } else{
            System.out.println("No hay datos para balance: " + getConsumo());
        }

    }

    @Override
    public String toString() {
        return "Hidraulica{" +
                " Pais = '" + getPais() + '\'' +
                ", Año = " + getAño() +
                ", Produccion = " + getProduccion()  +
                ", Consumo = " + getConsumo()  +
                ", Volumen de agua = " + getVolumenAgua() +
                '}';
    }
}

