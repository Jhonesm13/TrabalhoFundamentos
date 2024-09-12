public class ConteudoProxy {
    private Conteudo conteudoBasico;
    private Conteudo conteudoExclusivo;
    private Conteudo conteudoAdministrativo;

    public ConteudoProxy() {
        conteudoBasico = new ConteudoBasico();
        conteudoExclusivo = new ConteudoExclusivo();
        conteudoAdministrativo = new ConteudoAdministrativo();
    }

    public void acessar(String tipo) {
        switch (tipo) {
            case "básico":
                conteudoBasico.acessar();
                break;
            case "exclusivo":
                conteudoExclusivo.acessar();
                break;
            case "administrativo":
                conteudoAdministrativo.acessar();
                break;
            default:
                System.out.println("Conteúdo inválido.");
                break;
        }
    }
}