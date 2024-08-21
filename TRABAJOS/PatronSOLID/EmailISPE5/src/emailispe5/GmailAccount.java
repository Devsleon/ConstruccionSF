package emailispe5;


import emailispe5.EmailRecipient;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Seidor Colombia
 */
public class GmailAccount implements EmailRecipient{
private String name;
private String emailAddress;

public GmailAccount(String name,String emailAddress){
    this.name = name;
    this.emailAddress = emailAddress;    
}
    @Override
    public String getEmailAddress() {
        return emailAddress;
    }    
}
