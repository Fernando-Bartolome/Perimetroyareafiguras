
public class Triangulo {
    private double base;
    private double altura;
    private double lado;
    private String nombre; // Agregamos la variable nombre

    public Triangulo(String nombre, double base, double altura, double lado) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }//constructor

    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }//calcularArea

    public double calcularPerimetro() {
        return this.lado + this.lado + this.lado;
    }//calcularPerimetro

    public String getNombre() {
        return this.nombre;
    }

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getLado() {
        return this.lado;
    }

    public static void main(String[] args) {
        // El método main se utiliza para probar la clase Triangulo
        Triangulo t = new Triangulo("Equilátero", 5, 5, 5);
        System.out.println("Nombre: " + t.getNombre());
        System.out.println("Área: " + t.calcularArea());
        System.out.println("Perímetro: " + t.calcularPerimetro());
    }
}
