package modelo;

public class FiguraGeometrica {

    private int numLados;
    private String nombre;
    private static final int MIN_NUMBER = 3;

    public void showInfo() {
        System.out.printf("Soy un %s. Tengo %d lados%n", nombre, numLados);
    }


    public FiguraGeometrica(int numLados, String nombre) throws Exception {
        if (numLados < MIN_NUMBER) {
            throw new Exception("El número de lados debe ser mayor que " + MIN_NUMBER);
        }
        this.numLados = numLados;
        this.nombre = nombre;
    }
    // Jose Manuel Torres Seco

    

    public FiguraGeometrica() {
    }

   
    public int getNumLados() {
      return this.numLados;
    }
    public void setNumLados(int value) {
      this.numLados = value;
    }

    public String getNombre() {
      return this.nombre;
    }
    public void setNombre(String value) {
      this.nombre = value;
    }
}
