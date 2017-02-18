package marco.modelo.pojos;
// Generated Feb 18, 2017 4:04:37 PM by Hibernate Tools 4.3.1



/**
 * Interview generated by hbm2java
 */
public class Interview  implements java.io.Serializable {


     private InterviewId id;
     private Company company;
     private Person person;
     private boolean accepted;

    public Interview() {
    }

    public Interview(InterviewId id, Company company, Person person, boolean accepted) {
       this.id = id;
       this.company = company;
       this.person = person;
       this.accepted = accepted;
    }
   
    public InterviewId getId() {
        return this.id;
    }
    
    public void setId(InterviewId id) {
        this.id = id;
    }
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    public boolean isAccepted() {
        return this.accepted;
    }
    
    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }




}


