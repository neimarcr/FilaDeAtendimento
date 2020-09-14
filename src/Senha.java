public class Senha {
    private char tipoSenha;
    private int numSenha;
    private static int i = 1;
    
    public void  criarSenha(char tipo){
        this.tipoSenha = tipo;
        this.numSenha = i;
        i++;
    }
    
    public String retornarSenha(){
        return this.tipoSenha + "-" + this.numSenha;
    }
}
