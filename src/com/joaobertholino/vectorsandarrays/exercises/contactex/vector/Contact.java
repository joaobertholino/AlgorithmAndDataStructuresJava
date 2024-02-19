package com.joaobertholino.vectorsandarrays.exercises.contactex.vector;

public class Contact {
  private String name;
  private String fone;
  private String email;

  public Contact() {
  }

  public Contact(String name, String fone, String email) {
    this.name = name;
    this.fone = fone;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFone() {
    return fone;
  }

  public void setFone(String fone) {
    this.fone = fone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return STR."Contact{name='\{name}\{'\''}, number='\{fone}\{'\''}, email='\{email}\{'\''}\{'}'}";
  }
}
