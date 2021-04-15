/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package care;

/**
 *
 * @author SAIF
 */
class DisabilityInfo {
    private int dis_id;
    private String disability,symptoms, curable , communication,department, doctor;
    
    public DisabilityInfo(String disability,String symptoms,String curable,String communication,String department,String doctor){
        //this.dis_id = dis_id;
        this.disability = disability;
        this.symptoms= symptoms;
        this.curable = curable;
        this.communication=communication;
        this.department = department;
        this.doctor = doctor;
    }
    public int getdis_id(){
        return dis_id;
    }
    public String getdisability(){
        return disability;
    }
    public String getsymptoms(){
        return symptoms;
    }
    public String getcurable(){
        return curable;
    }
    public String getcommunication(){
        return communication;
    }
    public String getdepartment(){
        return department;
    }
    public String getdoctor(){
        return doctor;
    }
}
