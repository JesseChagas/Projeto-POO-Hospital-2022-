import java.util.*;

public class Sistema implements FuncionalidadesIF {

  Hospital broki;
  
  public void inicializaSistema(){
    broki = new Hospital("Broki's hospital");
  }
 
  public void finalizaSistema(){}

  //Funcionalidade que cadastra o paciente no sistema 
  public void cadastraPaciente(String novoCpf, String novoNome, String novoEndereco){
    Paciente p = new Paciente (novoCpf, novoNome, novoEndereco);
    broki.addPaciente(p);
  }

  public Paciente localizaPaciente(String cpf){
    return broki.localizaPaciente(cpf);
  }

  //verifica o valor dos atributos da pessoa que está cadastrada no sistema com esse cpf
  public String recuperaNome(String cpf){
    broki.localizaPaciente(cpf);
    return null;
  }

  public String recuperaEndereco(String cpf){return null;}

  public void alteraAltura(Paciente p, int altura){}
  public void altaPeso(Paciente p, double peso){}

  public void cadastraMedico(String cpf, String nome, String crm){
    Medico m = new Medico(cpf, nome, crm, "");
    broki.addFuncionario(m);
  }
  
  public Medico localizaMedico(String crm){return null;}
  
  public void cadastraEnfermeiro(String cpf, String nome){
    Enfermeiro e = new Enfermeiro(cpf, nome, "");
    broki.addFuncionario(e);
  }

  public Enfermeiro localizaEnfermeiro(String cpf){
    return broki.localizaEnfermeiro(cpf);
  }
  
  public void cadastraFisioterapeuta(String cpf, String nome){
    Fisioterapeuta f = new Fisioterapeuta(cpf, nome, "");
    broki.addFuncionario(f);
  }

  public Fisioterapeuta localizaFisioterapeuta(String cpf){
    return null;
  }

  public ArrayList<Paciente> listagemDePacientesInternados(){return null;}
  public ArrayList<Funcionario> listagemDeFuncionarios(){return null;}

  public int getNumeroDeFuncionarios(){
    return broki.getFuncionarios().size();
  }

  public int getNumeroDePacientesInternados(){
    return broki.getPacientes().size();
  }

  public void atendimento(String cpfFuncionario, String cpfPaciente){}

  public double atendimentoMedico(String crmMedico, String cpfPaciente){return 0;}
  
}