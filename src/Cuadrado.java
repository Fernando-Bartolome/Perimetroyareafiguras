
public class Cuadrado {
	    private double lado;
	    private String nombre; // Agregamos la variable nombre

	    public Cuadrado(String nombre, double lado) {
	        this.nombre = nombre;
	        this.lado = lado;
	    }//constructor

	    public double calcularArea() {
	        return (this.lado * this.lado);
	    }//calcularArea

	    public double calcularPerimetro() {
	        return this.lado * 4;
	    }//calcularPerimetro

	    public String getNombre() {
	        return this.nombre;
	    }

	    public double getLado() {
	        return this.lado;
	    }

	    public static void main(String[] args) {
	        // El método main se utiliza para probar la clase Triangulo
	        Cuadrado c = new Cuadrado("Cuadrado", 5);
	        System.out.println("Nombre: " + c.getNombre());
	        System.out.println("Área: " + c.calcularArea());
	        System.out.println("Perímetro: " + c.calcularPerimetro());
	    }
	}

