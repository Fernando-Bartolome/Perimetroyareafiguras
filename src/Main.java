
public class Main {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
        Triangulo t = new Triangulo("Triangulo T", 200, 100, 50);
        Cuadrado c = new Cuadrado("Cuadrado T", 20);
        Rectangulo r = new Rectangulo("Rectangulo",10 ,20);
        Main.imprimirCalculos(t1);
        Main.imprimirCalculos(t);
        Main.imprimirCalculos(c);
        Main.imprimirCalculos(r);
    }//main

    public static void imprimirCalculos(Triangulo t) {
        System.out.println(t); // Ahora imprimirá la salida del método toString() de Triangulo
        System.out.println("+-----------------------------------------+");
        System.out.println("| El área de ["+ t.getNombre()+"]");
        System.out.println("|es "+t.calcularArea());
        System.out.println(" El perimetro de ["+t.getNombre()+"]");
        System.out.println("| es "+t.calcularPerimetro());
        System.out.println("+-----------------------------------------+");
    }//imprimircalculos
    public static void imprimirCalculos(Cuadrado c) {
        System.out.println(c); // Ahora imprimirá la salida del método toString() de Triangulo
        System.out.println("+-----------------------------------------+");
        System.out.println("| El área de ["+ c.getNombre()+"]");
        System.out.println("|es "+c.calcularArea());
        System.out.println(" El perimetro de ["+c.getNombre()+"]");
        System.out.println("| es "+c.calcularPerimetro());
        System.out.println("+-----------------------------------------+");
    }//imprimircalculos
    public static void imprimirCalculos(Rectangulo r) {
        System.out.println(r); // Ahora imprimirá la salida del método toString() de Triangulo
        System.out.println("+-----------------------------------------+");
        System.out.println("| El área de ["+ r.getNombre()+"]");
        System.out.println("|es "+r.calcularArea());
        System.out.println(" El perimetro de ["+r.getNombre()+"]");
        System.out.println("| es "+r.calcularPerimetro());
        System.out.println("+-----------------------------------------+");
    }//imprimircalculos
}