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
class HospitalInfo {
   private int id;
    private String name,phone,address,city;
    
    public HospitalInfo(int id,String name,String phone,String address,String city){
       // this.h_id = h_id;
       this.id = id;
        this.name = name;
        this.phone= phone;
        this.address = address;
        this.city=city;

    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getphone(){
        return phone;
    }
    public String getaddress(){
        return address;
    }
    public String getcity(){
        return city;
    }

}
