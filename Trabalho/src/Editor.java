public class Editor implements Usuario {
    @Override
    public void acessar(ConteudoProxy conteudoProxy) {
        conteudoProxy.acessar("básico");
        conteudoProxy.acessar("exclusivo");
    }
}
