public class Palindromo {
    public boolean esPalindromo(String palabra){
        String inversa="";
        for(int i=palabra.length()-1;i>=0;i--){
            inversa+=palabra.charAt(i);
        }
        return palabra.equals(inversa);
    }
}
