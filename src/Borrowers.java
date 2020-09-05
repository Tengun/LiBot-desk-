/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TENGAH
 */
class Borrowers {
    private String Student_Reg_No, Student_Name, Student_Surname, Book_Accession_Number, Book_Name, Issue_Date; 
    public Borrowers(String Student_Reg_No, String Student_Name, String Student_Surname, String Book_Accession_Number, String Book_Name, String Issue_Date){
        this.Student_Reg_No = Student_Reg_No;
        this.Student_Name =Student_Name;
        this.Student_Surname = Student_Surname;
        this.Book_Accession_Number = Book_Accession_Number;
        this.Book_Name = Book_Name;
        this.Issue_Date = Issue_Date;
    }  
    
    public String getStudent_Reg_No(){
        return Student_Reg_No;
    } 
    public String getStudent_Name(){
        return Student_Name;
    } 
    public String getStudent_Surname(){
        return Student_Surname;
    } 
    public String getBook_Accession_Number(){
        return Book_Accession_Number;
    }
    public String getBook_Name(){
        return Book_Name;
    }
    public String getIssue_Date(){
        return Issue_Date;
    }
}
