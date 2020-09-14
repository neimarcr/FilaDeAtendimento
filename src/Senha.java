public class Senha {
    private char tipoSenha;
    private int numSenha;
    private static int i = 1;

    public char getTipoSenha() {
        return tipoSenha;
    }

    public void setTipoSenha(char tipoSenha) {
        this.tipoSenha = tipoSenha;
    }

    public int getNumSenha() {
        return numSenha;
    }

    public void setNumSenha(int numSenha) {
        this.numSenha = numSenha;
    }
    
    
    public void  criarSenha(char tipo){
        this.tipoSenha = tipo;
        this.numSenha = i;
        i++;
    }
    
    public String retornarSenha(){
        return this.tipoSenha + "-" + this.numSenha;
    }
}
