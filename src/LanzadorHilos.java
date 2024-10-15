public class LanzadorHilos {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Triangulo tri=new Triangulo(i, i+1);
            tri.run();
        }
    }
}