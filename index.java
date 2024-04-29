abstract class Veiculo {
    // abstract method
    public abstract void rodas();
}

class Moto extends Veiculo {
    public void rodas() {
        System.out.println(2);
    }
}

class Carro extends Veiculo {
    public void rodas() {
        System.out.println(4);
    }
}

class Adapter {
    public static void main(String[] args) {
        Moto moto = new Moto();
        Carro carro = new Carro();
        moto.rodas();
        carro.rodas();
    }
}
