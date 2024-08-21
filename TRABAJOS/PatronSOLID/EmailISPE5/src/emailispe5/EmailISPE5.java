/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emailispe5;

/**
 *
 * @author Seidor Colombia
 */
public class EmailISPE5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Contacto contacto = new Contacto();
       contacto.setName("Sebastian");
       contacto.setEmailAddress("Bogota");
       contacto.setEmailAddress("Sebastian@gmail.com");
       contacto.setTelephone("3005322873");
       SMSSender sms = new SMSSender();
       sms.sendSMS(contacto, "Mensaje");
       EmailSender email = new EmailSender();
       email.sendEmail(contacto, "Mensaje");
      
       GmailAccount gmail = new GmailAccount("Sebastian", "Sebastian@gmail.com");
       EmailSender.sendEmail(gmail, "Prueba");

      
       
    }
    
}
