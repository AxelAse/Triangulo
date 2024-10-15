class Triangulo implements Runnable {
    int base, altura;
    public Triangulo(int base, int altura)
    {
        this.base=base;
        this.altura=altura;
    }
    @Override
    public void run() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + (base*altura)/2);
    }
}
