public class EnergiaRenovable {
    public String tipo;
    public String pais;
    public int año;
    public double produccion;
    public double Consumo;

    //Constructores

    public EnergiaRenovable(String tipo, String pais, int año, double produccion, double consumo) {
        this.tipo = tipo;
        this.pais = pais;
        this.año = año;
        this.produccion = produccion;
        this.Consumo = consumo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getProduccion() {
        return produccion;
    }

    public void setProduccion(double produccion) {
        this.produccion = produccion;
    }

    public double getConsumo() {
        return Consumo;
    }

    public void setConsumo(double consumo) {
        Consumo = consumo;
    }

    public void balance (double consumo,double produccion){

        if (produccion < 0 || consumo < 0) {
            System.out.println("Error: no pueden ser negativos.");
        }else if (consumo == 0){
            double resultadoBalance = produccion - consumo ;
            System.out.println("El resultado del balance es: " + resultadoBalance);
        } else{
            System.out.println("No se puede calcular el balance. " + consumo);
        }
    }
}

