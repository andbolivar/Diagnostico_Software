package com.crud.demo.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.cglib.core.TinyBitSet;
@Entity
@Table(name = "client")

public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idClient;
private char[] Client_Name;
private char[] Client_Surname;
private char[] Client_Email;
private int Client_Address_idClient_Address;
private Date Client_Birthday_Date;
private Date Client_Register_Date;
private TinyBitSet [] Status;
private Date updated_at;
private Date deleted_at;


public Client() {
	// TODO Auto-generated constructor stub
}


public int getIdClient() {
	return idClient;
}


public void setIdClient(int idClient) {
	this.idClient = idClient;
}


public char[] getClient_Surname() {
	return Client_Surname;
}


public void setClient_Surname(char[] client_Surname) {
	Client_Surname = client_Surname;
}


public char[] getClient_Email() {
	return Client_Email;
}


public void setClient_Email(char[] client_Email) {
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


public TinyBitSet[] getStatus() {
	return Status;
}


public void setStatus(TinyBitSet[] status) {
	Status = status;
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
