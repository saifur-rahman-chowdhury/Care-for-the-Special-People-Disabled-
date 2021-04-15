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
class DoctorInfo {
    private int id;
    private String name,degree,hospital,department,email;
    
    public DoctorInfo(String name,String degree,String hospital,String department,String email){
       // this.h_id = h_id;
      // this.id = id;
        this.name = name;
        this.degree= degree;
        this.hospital = hospital;
        this.department=department;
        this.email=email;

    }

    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getdegree(){
        return degree;
    }
    public String gethospital(){
        return hospital;
    }
    public String getdepartment(){
        return department;
    }
    public String getemail(){
        return email;
    }
}
