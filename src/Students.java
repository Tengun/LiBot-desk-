class Students {
    private String Name, Surname,Course,Gender,Reg_No, Level,National_ID,Intake,Intake_Year, Status; 
    public Students(String Name, String Surname, String Course, String Gender, String Reg_No, String Level,String National_ID,String Intake,String Intake_Year, String Status){
        this.Name = Name;
        this.Surname =Surname;
        this.Course = Course;
        this.Gender = Gender;
        this.Reg_No = Reg_No;
        this.Level = Level;
        this.National_ID = National_ID;
        this.Intake = Intake;
        this.Intake_Year = Intake_Year;
        this.Status = Status;
        
    }
    public String getName(){
        return Name;
    } 
    public String getSurname(){
        return Surname;
    } 
    public String getCourse(){
        return Course;
    } 
    public String getGender(){
        return Gender;
    }
    public String getReg_Number(){
        return Reg_No;
    }
    public String getLevel(){
        return Level;
    }
    public String getNationalID(){
        return National_ID;
    }
    public String getIntake(){
        return Intake;
    }
    public String getIntake_Year(){
        return Intake_Year;
    }
    public String getStatus(){
        return Status;
    }
}
