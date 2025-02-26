package domain.model;

public class Person {

  private String name;
  private String cpf;
  private String cnpj;
  private String birthDate;
  private String address;
  private String tel;
  private String email;

  public Person(String name, String email, String tel) throws Exception {
    this.setName(name);
    this.setEmail(email);
    this.setTel(tel);
  }

  public Person(String name, String cpf) throws Exception {
    this.setName(name);
    this.setCpf(cpf);
  }

public void setName(String name) throws Exception {
    if (name.equals("")) throw new Exception("Nome em branco!");
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public String getBirthDate() {
    return this.birthDate;
  }

  public void setCnpj(String cpnj) {
    this.cnpj = cpnj;
  }

  public String getCnpj() {
    return this.cnpj;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return this.address;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getTel() {
    return this.tel;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }
}
