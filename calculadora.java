public class calculadora{
    int soma;
    int sub;
    int a;
    int b;

    public int calcularSoma(){
        soma = a + b;
        return soma;
    }

    public int getSoma() {
        return soma;
    }
    public void setSoma(int soma) {
        this.soma = soma;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public int calcularSub(){
        sub = a - b;
        return sub;
    }


}