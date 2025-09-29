public class Calculadora{
    /**
     * Esta função tem como papel retornar verdadeiro quando um número é par e positivo, e falso quando o contrário
     * @param numero - valores inteiros
     * @return true - boolean
     * @return false - boolean
     * @author Lucas Da Silva Rocha
     * @version 4.0.0
     */
    public static boolean verificaValor(int numero){
        //verifica se o número é positivo e se o mesmo é par
        if(numero >= 0 && numero % 2 == 0){
            if(numero < 18){
                return false;
            }
            return true;
        }
        else{
            return false;
        }

    }

}
