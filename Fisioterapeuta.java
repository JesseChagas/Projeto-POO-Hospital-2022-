import java.io.*;
public class Fisioterapeuta extends Funcionario   {

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";
  
  public Fisioterapeuta(String newCpf, String newNome,String newEndereco){
    super(newCpf, newNome, newEndereco);
    super.profissao = "Fisioterapeuta";
  }

   public void atende(Paciente p) {
   System.out.println("\n"+ ANSI_BLUE+">────────────────────────-────────────────────────<" + ANSI_RESET + "\n"+"             " +ANSI_YELLOW+"CONSULTA FISIOTERAPÊUTICA "+ ANSI_RESET+"\n" );
    System.out.println("\nDr. " +getCpf() + " está atendendo paciente " + p.getCpf());
    System.out.println("Analisando condições do paciente...");
    System.out.println("Realizando exame de força no braço...");
    System.out.println("Realizando exame de força na perna...");
    System.out.println("Prescrevendo exercícios laborais...\n");
    System.out.println(ANSI_GREEN+"FIM DA CONSULTA"+ANSI_RESET);

  }

  public String toString() {
	  String saida = "\n- Nome: " + getCpf()+"\n- Cpf: "+getNome()+"\n- Endereço: "+getEndereco()+"\n- Profissão: Fisioterapeuta\n";
    return saida;
  }

}