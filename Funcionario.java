public abstract class Funcionario extends Pessoa{

  protected String profissao;
  
  public Funcionario(String novoCpf, String novoNome, String novoEndereco) {
    super(novoCpf, novoNome, novoEndereco);
  }

  public String getProfissao(){
    return profissao;
  }
  public void setProfissao(String novaProfissao){
    this.profissao = novaProfissao;
  }
  
  public abstract void atende(Paciente p);

}