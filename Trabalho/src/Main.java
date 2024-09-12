public class Main {
    public static void main(String[] args) {
        ConteudoProxy conteudoProxy = new ConteudoProxy();

        Usuario comum = new UsuarioComum();
        Usuario editor = new Editor();
        Usuario administrador = new Administrador();

        System.out.println("Usuário Comum:");
        comum.acessar(conteudoProxy);

        System.out.println("\nEditor:");
        editor.acessar(conteudoProxy);

        System.out.println("\nAdministrador:");
        administrador.acessar(conteudoProxy);
    }
}