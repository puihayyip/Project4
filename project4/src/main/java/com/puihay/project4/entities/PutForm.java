package com.puihay.project4.entities;

public class PutForm {

  private long id;
  private String password;

  public PutForm(long id, String password) {
    this.id = id;
    this.password = password;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
