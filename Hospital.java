import java.util.*;
import java.io.*;
import java.util.ArrayList;



  public class Hospital {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    

    private ArrayList<Paciente> pacientes;
    private ArrayList<Funcionario> funcionarios;
    private String nome;
  

  public Hospital(String nome) {
    this.nome = nome;
    pacientes = new ArrayList<Paciente>();
    funcionarios = new ArrayList<Funcionario>();
  }

  public void addPaciente(Paciente p) {

    if (!(pacientes.contains(p))){
      pacientes.add(p);
    }
  }

  public boolean addFuncionario(Funcionario p) {
    if (!(funcionarios.contains(p))){
      funcionarios.add(p);
    }
    return false;
  }

  public ArrayList<Funcionario> getFuncionarios() {
    return funcionarios;
  }

   public ArrayList<Paciente> getPacientes() {
    return pacientes;
  }

  public void exibirFuncionarios() {
    System.out.println("\n"+ ANSI_BLUE+">────────────────────────-────────────────────────<"+"\n" + ANSI_RESET + "             " +ANSI_YELLOW+"  FUNCIONÁRIOS CADASTRADOS "+ ANSI_RESET);
    System.out.println(funcionarios.toString().replace("[", "").replace("]", "").replace(", ", ""));
  }

  public void exibirPaciente() {
      System.out.println("\n"+ ANSI_BLUE+">────────────────────────-────────────────────────<" + ANSI_RESET +"\n"+"             " +ANSI_YELLOW+"  PACIENTES CADASTRADOS "+ANSI_RESET);
    System.out.println(pacientes.toString().replace("[", "").replace("]", "").replace(", ", ""));
  }

  public void listagemFuncionarios() {
    Iterator<Funcionario> it = funcionarios.iterator();
    System.out.println("\n"+ ANSI_BLUE+">────────────────────────-────────────────────────<" + ANSI_RESET +"\n"+"             " +ANSI_YELLOW+"  FUNCIONÁRIOS "+ANSI_RESET+ "\n" );
    while (it.hasNext()) {
      Funcionario f = it.next();
      System.out.println("- " + f.getNome() + " -> " + f.getProfissao());
      
    }
  }

  public void listagemPacientes() {
    Iterator<Paciente> it = pacientes.iterator();
    System.out.println("\n"+ ANSI_BLUE+">────────────────────────-────────────────────────<" + ANSI_RESET +"\n"+"             "+ANSI_YELLOW+"  PACIENTES "+ ANSI_RESET+ "\n" );
    while (it.hasNext()) {
      Paciente p = it.next();
      System.out.println("- " + p.getNome());
      
    }
  }
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @param cpf
   * @return
   */

  public Paciente localizaPaciente(String cpf) {
    Iterator it = pacientes.iterator();
    while (it.hasNext()) {
      Paciente p = (Paciente) it.next();
      if (p.getCpf().equals(cpf)) {
        return p;
        }
    }
    return null;
  }

  public Enfermeiro localizaEnfermeiro(String cpf) {
    return null;
  }
  
}
