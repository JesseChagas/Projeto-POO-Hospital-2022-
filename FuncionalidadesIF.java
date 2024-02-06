import java.util.*;
public interface FuncionalidadesIF {

  public void inicializaSistema();

  public void finalizaSistema();

  //Funcionalidade que cadastra o paciente no sistema 
  public void cadastraPaciente(String novoCpf, String novoNome, String novoEndereco);
  public Paciente localizaPaciente(String cpf);

  //altera o valor dos parametros da pessoa que é cadastrada no sistema com o cpf passado como parametro

  // public void alteraNome(String cpf, String novoNome);
  //public void alteraEndereco(String cpf, String novoEndereco);

  //verifica o valor dos atributos da pessoa que está cadastrada no sistema com esse cpf
  public String recuperaNome(String cpf);
  public String recuperaEndereco(String cpf);

  
  //TODO NÃO SERÁ NECESSÁRIO IMPLEMENTAR NESSE PRIMEIRO MOMENTO

  //  public void internaNaUti(Paciente p);
  // public void altaDaUti(Paciente p);


  public void alteraAltura(Paciente p, int altura);
  public void altaPeso(Paciente p, double peso);

  public void cadastraMedico(String cpf, String nome, String crm);
  public Medico localizaMedico(String crm);
  public void cadastraEnfermeiro(String novoCpf, String novoNome);
  public Enfermeiro localizaEnfermeiro(String cpf);
  public void cadastraFisioterapeuta(String cpf, String nome);

  //CORREÇÃO DA ASSINATURA DO MÉTODO
  public Fisioterapeuta localizaFisioterapeuta(String cpf);
  
  public int getNumeroDePacientesInternados();
  public int getNumeroDeFuncionarios();

  public ArrayList<Paciente> listagemDePacientesInternados();
  public ArrayList<Funcionario> listagemDeFuncionarios();
  public void atendimento(String cpfFuncionario, String cpfPaciente);

   //TODO NÃO SERÁ NECESSÁRIO IMPLEMENTAR NESSE PRIMEIRO MOMENTO
  public double atendimentoMedico(String crmMedico, String cpfPaciente);

}