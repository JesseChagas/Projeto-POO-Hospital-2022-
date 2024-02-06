import java.io.*;
public class Medico extends Funcionario {
  
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  private String crm;

  /*
   * Método para construir um objeto do tipo Médico.
   * 
   * @param cpf O cpf do médico
   * 
   * @param nome O nome do médico
   * 
   * @param crm O crm do médico
   */

  public Medico(String newCpf, String newNome,String newEndereco, String crm){
    super(newCpf, newNome, newEndereco);
    this.crm = crm;
    super.profissao = "Médico";
  }

  public Medico (String cpf, String nome, String crm) {
    super(cpf, nome, "");
    this.crm = crm;
    super.profissao = "Médico";
  }

  public String getCrm() {
    return crm;
  }

  public void setCrm(String novo) {
    this.crm = novo;
  }

  public String toString() {
	  String saida = "\n- Nome: " + getCpf()+"\n- Cpf: "+getNome()+"\n- Endereço: "+getEndereco()+"\n- Profissão: Médico\n- Crm: "+getCrm()+"\n\n════════════════════════════════════════════════"+"\n";
    return saida;
  }


  // todos os métodos equals devem ter essa assinatura
  public boolean equals(Object obj) {
    // se o objeto passado como parametro for do tipo Medico
    if (obj instanceof Medico) {
      // faremos um cast para conseguir compara os atributos
      Medico m = (Medico) obj;
      if (/*getCpf().equals(m.getCpf()) || getRg().equals(m.getRg()) ||*/ getCrm().equals(m.getCrm())) {
        System.out.println("Não foi possivel cadastrar. CRM já cadastrado.");
        return true;
      }
    }
    // qualquer outra situação deve retornar false
    return false;
  }

  public void atende(Paciente p) {
    System.out.println("\n"+ ANSI_BLUE + ">────────────────────────-────────────────────────<"+ ANSI_RESET + "\n"+"             " +ANSI_YELLOW+"    CONSULTA MÉDICA "+ ANSI_RESET+"\n" );
    System.out.println("\nDr. " + getCpf() + " está examinando o paciente " + p.getCpf());
    System.out.println("Avaliando paciente...");
    System.out.println("Auscultando o pulmão...");
    System.out.println("Auscultando o coração...");
    System.out.println("Examinando do fundo do olho...");
    System.out.println("Examinando o ouvido...");
    System.out.println("Receitando medicamentos...\n");
    System.out.println(ANSI_GREEN+"FIM DA CONSULTA\n"+ANSI_RESET);
  }

}