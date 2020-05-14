public class Palindromo {
    public boolean esPalindromo(String palabra){
        String inversa="";
        palabra=palabra.replaceAll("\\s","");
        for(int i=palabra.length()-1;i>=0;i--){
            inversa+=palabra.charAt(i);
        }
        return palabra.equals(inversa);
    }
}
