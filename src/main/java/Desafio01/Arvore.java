package Desafio01;

public class Arvore {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();

        for (int i = 0; i <= 6; i++) {
            for (int j = 6; j > 0; j--) {
                if (i < j) {
                    out.append(" ");
                } else {
                    out.append("*");
                }
            }
            out.append("\n");
        }
        System.out.println(out.toString());
    }
}