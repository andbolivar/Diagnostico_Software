package com.crud.demo.modelo;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "client")

public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idClient;
private String Client_Name;
private String Client_Surname;
private String Client_Email;
private int Client_Address_idClient_Address;
private Date Client_Birthday_Date;
private Date Client_Register_Date;
private int Client_Status;
private Date updated_at;
private Date deleted_at;


public Client() {
	// TODO Auto-generated constructor stub
}
public Client (int idClient, String Client_name, String Client_Surname, String Client_Email, int Client_Address_idClient_Address, Date Client_Birthday_Date, Date Client_Register_Date, int Client_Status, Date updated_at, Date deleted_at)
{
	this.idClient=idClient;
	this.Client_Name=Client_name;
	this.Client_Surname=Client_Surname;
	this.Client_Email=Client_Email;
	this.Client_Address_idClient_Address=Client_Address_idClient_Address;
	this.Client_Birthday_Date=Client_Birthday_Date;
	this.Client_Register_Date=Client_Register_Date;
	this.Client_Status=Client_Status;
	this.updated_at=updated_at;
	this.deleted_at=deleted_at;
}


public int getIdClient() {
	return idClient;
}


public void setIdClient(int idClient) {
	this.idClient = idClient;
}


public String getClient_Name() {
	return Client_Name;
}


public void setClient_Name(String client_Name) {
	Client_Surname = client_Name;
}


public String getClient_Surname() {
	return Client_Surname;
}


public void setClient_Surname(String client_Surname) {
	Client_Surname = client_Surname;
}


public String getClient_Email() {
	return Client_Email;
}


public void setClient_Email(String client_Email) {
	Client_Email = client_Email;
}


public int getClient_Address_idClient_Address() {
	return Client_Address_idClient_Address;
}


public void setClient_Address_idClient_Address(int client_Address_idClient_Address) {
	Client_Address_idClient_Address = client_Address_idClient_Address;
}


public Date getClient_Birthday_Date() {
	return Client_Birthday_Date;
}


public void setClient_Birthday_Date(Date client_Birthday_Date) {
	Client_Birthday_Date = client_Birthday_Date;
}


public Date getClient_Register_Date() {
	return Client_Register_Date;
}


public void setClient_Register_Date(Date client_Register_Date) {
	Client_Register_Date = client_Register_Date;
}


public int getClient_Status() {
	return Client_Status;
}


public void setClient_Status(int client_Status) {
	Client_Status = client_Status;
}


public Date getUpdated_at() {
	return updated_at;
}


public void setUpdated_at(Date updated_at) {
	this.updated_at = updated_at;
}


public Date getDeleted_at() {
	return deleted_at;
}


public void setDeleted_at(Date deleted_at) {
	this.deleted_at = deleted_at;
}

}
