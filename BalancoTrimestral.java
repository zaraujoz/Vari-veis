public class BalancoTrimestral{
    public static void main (String []args){
    int gastosJaneiro = 15000;
    int gastosFevereiro = 23000;
    int gastosMarco = 17000;
    int gastosTrimestre = gastosJaneiro+gastosFevereiro+gastosMarco;
    int gastoMensal = gastosTrimestre/3;
    System.out.println("O gasto trimestral foi de: " + gastosTrimestre);
    System.out.println("O gasto mensal foi de: " + gastoMensal);
    }
}    