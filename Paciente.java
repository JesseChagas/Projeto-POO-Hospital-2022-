public class Paciente extends Pessoa{

  private String procedimento;
  private boolean estaNaUti;
  private double peso; // em kilos
  private int altura; //em centimetros

  public Paciente (String cpf, String nome, String novoendereco){
    super(cpf, nome, novoendereco);
  }
  
  public Paciente(String novoNome, String novoCpf, String novoEndereco, String procedimento, boolean estaNaUti, double peso, int altura) {
    super(novoNome, novoCpf, novoEndereco);
    this.procedimento = procedimento;
    this.estaNaUti = estaNaUti;
    this.peso = peso;
    this.altura = altura;
  }

  public double getPeso() {
    return peso;
  }

  
  public int getAltura() {
    return altura;
  }

  public void setPeso(double p) {
    this.peso= p;
  }

  public void setAltura(int a) {
    this.altura= a;
  }
  public boolean estaNaUti() {
    return estaNaUti;
  }

  public String getProcedimento() {
    return procedimento;
  }

  public void setEstaNaUti(boolean uti) {
    this.estaNaUti = uti;
  }

  public void setProcedimento (String proc) {
    this.procedimento = proc;
  }

  public String toString() {
	  String saida = "\n- Nome: " +getCpf()+"\n- Cpf: "+getNome()+"\n- Endereço: "+getEndereco()+"\n\n" + "════════════════════════════════════════════════"+"\n";
    return saida;
  }

}