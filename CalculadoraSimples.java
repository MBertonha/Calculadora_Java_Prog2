package calculadora;


public class CalculadoraSimples {
    double n1, n2;
    double total;

    public double mais(){
        total = n1 + n2;
        return total;
    }

    public double menos(){
        total = n1 - n2;
        return total;
    }

    public double dividir(){
        total = n1 / n2;
        return total;
    }
    public double vezes(){
        total = n1 * n2;
        return total;
    }
}