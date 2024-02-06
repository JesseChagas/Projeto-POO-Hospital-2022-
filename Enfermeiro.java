import java.io.*;
public class Enfermeiro extends Funcionario {

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  /**
   * @param newNome
   * @param newCpf
   * @param newEndereco
   */

  public Enfermeiro(String newNome, String newCpf,String newEndereco){
    super(newNome, newCpf, newEndereco);
    super.profissao =  "Enfermeiro";
  }

  /**
   * @param cpf
   * @param nome
   */

  public Enfermeiro(String nome, String cpf) {
    super(nome, cpf,"");
    super.profissao =  "Enfermeiro";
  }

  public void atende(Paciente p) {
    System.out.println("\n"+ ANSI_BLUE + ">────────────────────────-────────────────────────<"+ ANSI_RESET + "\n"+"           " + ANSI_YELLOW+" ATENDIMENTO DE ENFERMAGEM "+ ANSI_RESET+ "\n" );
    System.out.println("\nEnf. " + getCpf() + " está atendendo o paciente " + p.getCpf());
    System.out.println("Realizando triagem...");
    System.out.println("Medindo a pressão...");
    System.out.println("Medindo temperatura...");
    System.out.println("Coletando exames...");
    System.out.println("Monitorando estado de sáude...");
    System.out.println("Preenchendo prontuários...\n");
    System.out.println( ANSI_GREEN +"FIM DO ATENDIMENTO" + ANSI_RESET);
  }

  public String toString() {
	  String saida = "\n- Nome: " + getCpf()+"\n- Cpf: "+getNome()+"\n- Endereço: "+getEndereco()+"\n- Profissão: Enfermeiro\n\n";
    return saida;
  }
}