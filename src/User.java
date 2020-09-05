/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TENGAH
 */
class User {
    private String Name, ISBN,Author,Edition,Date_In, Accession_Number, Status; 
    public User(String Accession_Number, String Name, String ISBN, String Author, String Edition, String Date_In, String Status){
        this.Accession_Number =Accession_Number;
        this.Name = Name;
        this.ISBN = ISBN;
        this.Author = Author;
        this.Edition = Edition;
        this.Date_In = Date_In;
        this.Status = Status;
    }
    public String getAccesion_Number(){
        return Accession_Number;
    } 
    public String getName(){
        return Name;
    } 
    public String getISBN(){
        return ISBN;
    } 
    public String getAuthor(){
        return Author;
    }
    public String getEdition(){
        return Edition;
    }
    public String getDate_In(){
        return Date_In;
    } 
    public String getStatus(){
        return Status;
    }
}
