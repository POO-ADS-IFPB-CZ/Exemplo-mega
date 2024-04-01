public class Jogo {

    private int[] numeros;
    private int quantidade;

    public Jogo(int tamanho){
        numeros = new int[tamanho];
        quantidade = 0;
    }

    public boolean adicionarNumero(int numero){
        //TODO: Criar método ehValido(numero)
        if(numero <1 || numero >60) return false;

        //TODO: Criar método estahPresente(numero)
        for(int i=0; i<quantidade;i++){
            if(numeros[i]==numero) return false;
        }

        if(estahCheio()) return false;

        numeros[quantidade++] = numero;
        return true;
    }

    public boolean estahCheio(){
        if(quantidade>=numeros.length) return true;
        return false;
    }

    public int[] getNumeros(){
        return numeros;
    }

}