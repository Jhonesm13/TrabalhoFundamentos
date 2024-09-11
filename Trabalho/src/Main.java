public class Main {
    public static void main(String[] args) {
        // Usuário Comum tentando acessar todos os conteúdos
        System.out.println("Usuário Comum:");
        Conteudo conteudo1 = new ProxyConteudo("Usuario Comum", new ConteudoBasico());
        conteudo1.acessar();
        Conteudo conteudo2 = new ProxyConteudo("Usuario Comum", new ConteudoExclusivo());
        conteudo2.acessar();
        Conteudo conteudo3 = new ProxyConteudo("Usuario Comum", new ConteudoAdministrativo());
        conteudo3.acessar();

        // Editor tentando acessar todos os conteúdos
        System.out.println("\nEditor:");
        Conteudo conteudo4 = new ProxyConteudo("Editor", new ConteudoBasico());
        conteudo4.acessar();
        Conteudo conteudo5 = new ProxyConteudo("Editor", new ConteudoExclusivo());
        conteudo5.acessar();
        Conteudo conteudo6 = new ProxyConteudo("Editor", new ConteudoAdministrativo());
        conteudo6.acessar();

        // Administrador acessando todos os conteúdos
        System.out.println("\nAdministrador:");
        Conteudo conteudo7 = new ProxyConteudo("Administrador", new ConteudoBasico());
        conteudo7.acessar();
        Conteudo conteudo8 = new ProxyConteudo("Administrador", new ConteudoExclusivo());
        conteudo8.acessar();
        Conteudo conteudo9 = new ProxyConteudo("Administrador", new ConteudoAdministrativo());
        conteudo9.acessar();
    }
}