public class Senha {
    private char tipoSenha;
    private int numSenha;
    private static int i = 1;
    
    public void  criarSenhaComum(){
        this.tipoSenha = 'C';
        this.numSenha = i;
        i++;
    }
    
    public void  criarSenhaRapida(){
        this.tipoSenha = 'R';
        this.numSenha = i;
        i++;
    }
    
    public void  criarSenhaPreferencia(){
        this.tipoSenha = 'P';
        this.numSenha = i;
        i++;
    }
}
