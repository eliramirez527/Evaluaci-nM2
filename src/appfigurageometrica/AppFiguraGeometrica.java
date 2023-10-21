
package appfigurageometrica;


public class AppFiguraGeometrica {

    public static void main(String[] args) {
      Cuadrado cuadrado = new Cuadrado("Amarillo", 10.0);
        Circulo circulo = new Circulo("Rojo", 5.0);
        
        
        System.out.println("Areas solicitadas");
        System.out.println("");
        System.out.println("Area del cuadrado de color " + cuadrado.getColor() + ": " + cuadrado.calcularArea());
        System.out.println("");
        System.out.println("Area del circulo de color " + circulo.getColor() + ": " + circulo.calcularArea());
        System.out.println("");
        System.out.println("***********Fin de Operacion*************");
    }
}
    
    

