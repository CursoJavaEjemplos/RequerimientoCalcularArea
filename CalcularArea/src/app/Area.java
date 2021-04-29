package app;

public class Area {
    
    private Float resultadoArea = null;
    private Float base = null;
    private Float altura = null;

    
    
    public Area() {
        super();
    }


    public Float getResultadoArea() {
        resultadoArea = base * altura;
        return resultadoArea;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getBase() {
        return base;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getAltura() {
        return altura;
    }
    
    
    public  Float areaCalcular(Float base, Float altura) {
      this.base = base;
      this.altura = base;
      resultadoArea = base * altura;
      return resultadoArea;
    }

    public boolean esMayor(Float x) {
            if(resultadoArea.compareTo(x) > 0) {
                return true;
            }
            return false;
    }
    
}
