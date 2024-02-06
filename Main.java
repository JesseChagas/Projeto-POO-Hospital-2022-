import java.util.Scanner;
 import java.io.*;

  public class Main{
   static Hospital broki = new Hospital("Broki's hospital");
   static Scanner input = new Scanner(System.in);
   public static final String ANSI_RESET = "\u001B[0m";
   public static final String ANSI_BLACK = "\u001B[30m";
   public static final String ANSI_RED = "\u001B[31m";
   public static final String ANSI_GREEN = "\u001B[32m";
   public static final String ANSI_YELLOW = "\u001B[33m";
   public static final String ANSI_BLUE = "\u001B[34m";
   public static final String ANSI_PURPLE = "\u001B[35m";
   public static final String ANSI_CYAN = "\u001B[36m";
   public static final String ANSI_WHITE = "\u001B[37m";
   
   public static void menu(){
    System.out.println("\n" );
    System.out.println(ANSI_YELLOW+"    >────────────────────────-────────────────────────< \n"+ANSI_RESET );
    System.out.println(ANSI_CYAN+"                      BROKI'S HOSPITAL \n"+ANSI_RESET );
    System.out.println(ANSI_YELLOW+"    >────────────────────────-────────────────────────< \n"+ANSI_RESET );

    System.out.println("    Seja bem vindo ao melhor hospital da região!\n");

    System.out.println("    Escolha uma opção abaixo: \n");
    
    System.out.println(ANSI_RED+ "    1 - "+ANSI_RESET + "Exibir médicos");
    System.out.println(ANSI_GREEN+ "    2 - "+ANSI_RESET + "Exibir fisioterapeutas");
    System.out.println(ANSI_YELLOW+ "    3 - "+ANSI_RESET + "Exibir enfermeiros");
    System.out.println(ANSI_BLUE+ "    4 - "+ANSI_RESET + "Exibir atendimentos");
    System.out.println(ANSI_PURPLE+ "    5 - "+ ANSI_RESET + "Listar pacientes");
    System.out.println(ANSI_BLACK+ "    6 - "+ANSI_RESET + "Listar funcionários");
    System.out.println("    7 - Encerrar programa\n");
    System.out.println(ANSI_RED+"    *Encerre o programa ao escolher uma opção. \n"+ANSI_RESET);
    System.out.print("    Opção desejada: ");


   }

    public static void main(String[] args) {

      // Paciente0
      String nome0 = "Lúcia Rosa";
      String cpf0 = "704.169.330-92";
      String end0 = "Grécia antiga";
      Paciente pac0 = new Paciente(nome0, cpf0, end0);

      // Paciente1
      String nome1 = "Epicuro de Samos";
      String cpf1 = "696-969-696-96";
      String end1 = "Grécia antiga";
      Paciente pac1 = new Paciente(nome1, cpf1, end1);
          
      // Paciente2
      String nome2 = "Maria do Jorge";
      String cpf2 = "131-131-131-31";
      String end2 = "Bahia";
      Paciente pac2 = new Paciente(nome2, cpf2, end2);
  
      // Funcionário 1
      String nome3 = "Bil de baixo";
      String cpf3 = "457.290.490-13";
      String end3 = "Países baixos";
      Enfermeiro func1 = new Enfermeiro(nome3, cpf3, end3);
      
  
      // Funcionário 2
      String nome4 = "Jorge Arimatéia";
      String cpf4 = "314.018.090-06";
      String end4 = "São Paulo";
      Enfermeiro func2 = new Enfermeiro(nome4, cpf4, end4);
      
  
      // Funcionário 3
      String nome5 = "Matheus Ritchelly";
      String cpf5 = "128.169.400-20";
      String end5 = "Paris";
      Fisioterapeuta func3 = new Fisioterapeuta(nome5, cpf5, end5);

      // Funcionário 4
      String nome6 = "Joana Martine";
      String cpf6 = "987.086.270-53";
      String end6 = "Ceará";
      Fisioterapeuta func4 = new Fisioterapeuta(nome6, cpf6, end6);
  
      // Funcionário 5
      String nome7 = "Mimi";
      String cpf7 = "559.188.610-84";
      String end7 = "Castelo branco";
      String crm1 = "69696";
      Medico func5 = new Medico(nome7, cpf7, end7, crm1);
  
      // Funcionário 6
      String nome8 = "Cotoquin vulgo Jessé";
      String cpf8 = "675.375.110-63";
      String end8 = "Três irmãs";
      String crm2 = "012006";
      Medico func6 = new Medico(nome8, cpf8, end8, crm2);
  
      int opcoes = 0;

      do {
        menu();
        opcoes = input.nextInt();
        switch(opcoes){
          case 1:
          broki.addFuncionario(func5);
          broki.addFuncionario(func6);
          broki.exibirFuncionarios();
            break;
          case 2:
          broki.addFuncionario(func3);
          broki.addFuncionario(func4);
          broki.exibirFuncionarios();
            break;
          case 3:
          broki.addFuncionario(func1);
          broki.addFuncionario(func2);
          broki.exibirFuncionarios();
            break;
          case 4:
          func1.atende(pac0);
          func3.atende(pac1);
          func5.atende(pac0);
            break;
          case 5:
          broki.addPaciente(pac0);
          broki.addPaciente(pac1);
          broki.addPaciente(pac2);
          broki.exibirPaciente();
            break;
          case 6:
          broki.addFuncionario(func1);
          broki.addFuncionario(func2);
          broki.addFuncionario(func3);
          broki.addFuncionario(func4);
          broki.addFuncionario(func5);
          broki.addFuncionario(func6);
          broki.exibirFuncionarios();
          case 7:
          System.out.println(ANSI_RED+"\n"+"    Programa encerrado\n\n"+ANSI_RESET);
            break;
          default:
            System.out.println("Opção inválida");
            break;
        }
      } while (opcoes !=7 );
  
    }
  }