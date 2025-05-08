
public class Rectangulo {
	private double base;
    private double altura;
    private String nombre; // Agregamos la variable nombre

    public Rectangulo(String nombre, double base, double altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }//constructor

    public double calcularArea() {
        return (this.base * this.altura);
    }//calcularArea

    public double calcularPerimetro() {
        return (this.base * 2) + (this.altura * 2) ;
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

    public static void main(String[] args) {
        // El método main se utiliza para probar la clase Triangulo
        Rectangulo r = new Rectangulo("Rectangulo",10 ,20);
        System.out.println("Nombre: " + r.getNombre());
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
    }
}
