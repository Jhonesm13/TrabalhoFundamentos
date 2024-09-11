public class ProxyConteudo implements Conteudo {
    private Conteudo conteudo;
    private String tipoUsuario;


    public ProxyConteudo(String tipoUsuario, Conteudo conteudo) {
        this.tipoUsuario = tipoUsuario;
        this.conteudo = conteudo;
    }

    private boolean temPermissao() {
        if (conteudo instanceof ConteudoBasico) {
            return true;
        }
        if (conteudo instanceof ConteudoExclusivo &&
                (tipoUsuario.equals("Editor") || tipoUsuario.equals("Administrador"))) {
            return true;
        }
        if (conteudo instanceof ConteudoAdministrativo && tipoUsuario.equals("Administrador")) {
            return true;
        }
        return false;
    }

    @Override
    public void acessar() {
        if (temPermissao()) {
            conteudo.acessar();
        } else {
            System.out.println("Acesso negado! Você não tem permissão para acessar este conteúdo.");
        }
    }
}