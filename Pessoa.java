public abstract class Pessoa{

  protected String nome;
  protected String cpf;
  protected String endereco;

  /*
   * Método para construir um objeto do tipo Pessoa.
   * 
   * @param cpf O cpf da Pessoa
   * 
   * @param nome O nome da Pessoa
   * 
   * @param crm O crm da Pessoa
   */
  
  public Pessoa(String novoCpf, String novoNome, String novoEndereco) {
    this.cpf = novoCpf;
    this.nome = novoNome;
    this.endereco = novoEndereco;

  }

  public String getNome() {
    return nome;
  }

  public void setNome(String novo) {
    this.nome = novo;
  }

    public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String novo) {
    this.endereco = novo;
  }
  
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String novoCpf) {
    this.cpf = novoCpf;
  }

  // todos os métodos equals devem ter essa assinatura
  public boolean equals(Object obj) {

    if (obj instanceof Pessoa) {
      // faremos um cast para conseguir compara os atributos
      Pessoa p = (Pessoa) obj;
      if (getCpf().equals(p.getCpf())){
        return true;
      }   
    }
    // qualquer outra situação deve retornar false
    return false;
  }

}