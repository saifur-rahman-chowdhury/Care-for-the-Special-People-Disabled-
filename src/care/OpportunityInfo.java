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
class OpportunityInfo {
   //  private int dis_id;
    private String name,details,type;
    
    public OpportunityInfo(String name,String details,String type){
        //this.dis_id = dis_id;
        this.name = name;
        this.details= details;
        this.type = type;

    }
  
    public String getname(){
        return name;
    }
    public String getdetails(){
        return details;
    }
    public String gettype(){
        return type;
    }

}
