public class Administrador implements Usuario {
    @Override
    public void acessar(ConteudoProxy conteudoProxy) {
        conteudoProxy.acessar("básico");
        conteudoProxy.acessar("exclusivo");
        conteudoProxy.acessar("administrativo");
    }
}
