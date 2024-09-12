public class UsuarioComum implements Usuario {
    @Override
    public void acessar(ConteudoProxy conteudoProxy) {
        conteudoProxy.acessar("básico");
    }
}