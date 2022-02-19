package SenhaForte;

public interface ISenhaForte {
    public String passwordStrong(String password);

    public boolean caracteresEspeciais(String password);

    public boolean verificarRequisitos(String password);
}