/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author abhin
 */
public class Product {
    
    private String name;
    private String desc;
    private String availNum;
    private String price;
            
    
    public String getName() {
        return name;
    }
    
    public String getDesc() {
        return desc;
    }
 
    public String getAvailNum() {
        return availNum;
    }
    
    public String getPrice() {
        return price;
    }
    
    public void setName (String Name) {
        this.name = Name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setAvailNum(String availNum) {
        this.availNum = availNum;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
