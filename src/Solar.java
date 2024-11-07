public class Solar extends EnergiaRenovable {
    public int paneles;

    public Solar(String tipo, String pais, int año, double produccion, double consumo, int paneles) {
        super(tipo, pais, año, produccion, consumo);
        this.paneles = paneles;

    }

    public double getPaneles() {
        return paneles;
    }

    public void setPaneles(int paneles) {
        this.paneles = paneles;
    }


    public void obtenerBalanceSolar (int paneles){

        if (getConsumo()>0){
            double resultadoBalance = (getProduccion() - getConsumo())  * paneles / 100;
            System.out.println("Tipo de energía: " + getTipo());
            System.out.println("País: " + getPais());
            System.out.println("Año: " + getAño());
            System.out.println("Producción: " + getProduccion());
            System.out.println("Consumo: " + getConsumo() );
            System.out.println("Numero de paneles: " + paneles );
            System.out.println("El balance general "+ getTipo() +" es: " + resultadoBalance + " kWh/p");
        } else{
            System.out.println("No hay datos para balance: " + getConsumo());
        }
    }
    @Override
    public String toString() {
        return "Solar{" +
                " Pais = '" + getPais() + '\'' +
                ", Año = " + getAño() +
                ", Produccion = " + getProduccion()  +
                ", Consumo = " + getConsumo()  +
                ", Numeros de paneles = " + getPaneles() +
                '}';
    }

}

