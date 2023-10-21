
package appfigurageometrica;


    public abstract class FiguraGeometrica {
    private String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }
    
    public abstract double calcularArea();
    
    public String getColor() {
        return color;
    }
}

