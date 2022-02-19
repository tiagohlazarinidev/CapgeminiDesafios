package SenhaForte;

public class SenhaForte implements ISenhaForte {

    private final int TAMANHO_MINIMO = 6;

    private String resultado = "";
    private boolean temMinuscula = false;
    private boolean temMaiuscula = false;
    private boolean temCaracteresEspeciais = false;
    private boolean temDigito = false;
    private String caracteresEspeciais = "!@#$%&*()’+,-./:;<=>?[]^_`{|}";

    public String passwordStrong(String password) {

        if (password.length() < TAMANHO_MINIMO) {
            resultado = ""+ (TAMANHO_MINIMO - password.length());
        } else {
            if (password.length() >= TAMANHO_MINIMO && caracteresEspeciais(password) && verificarRequisitos(password)) {
                resultado = "Sua senha tem todos requisitos";
            } else {
                resultado = "Sua senha precisa ter maiuscula, miniscula e caracteres especiais para ser considerada forte";
            }
        }
        return resultado;
    }

    public boolean caracteresEspeciais(String password) {
        for (int i = 0; i < password.length(); i++) {
            String strChar = Character.toString(password.charAt(i));
            if (caracteresEspeciais.contains(strChar)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarRequisitos(String password) {
        char[] letras = password.toCharArray();

        for (char letra : letras) {
            if (Character.isDigit(letra)) {
                temDigito = true;
            }
            if (Character.isUpperCase(letra)) {
                temMaiuscula = true;
            }
            if (Character.isLowerCase(letra)) {
                temMinuscula = true;
            }
        }
        if (temDigito && temMaiuscula && temMinuscula) {
            return true;
        }
        return false;
    }

}
