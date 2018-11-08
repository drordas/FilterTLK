/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.filter;

/**
 *
 * @author drordas
 */
public class Toret {
    
    private static Toret instance;
    private final StringBuilder rules =  new StringBuilder();
    private int ipRules = 0;
    private int icmpRules = 0;
    private int tcpRules = 0;
    private int udpRules = 0;
            
    private Toret(){}
    
    public static Toret getInstance(){
        if(instance == null){
            instance = new Toret();
        }
        
        return instance;
    }
    
    public void ipRule(){
        ipRules++;
    }
    
    public void icmpRules(){
        icmpRules++;
    }
    
    public void tcpRules (){
        tcpRules++;
    }
    
    public void updRules(){
        udpRules++;
    }
    
    public int getNumIpRules(){
        return ipRules;
    }
    
    public int getNumICMPRules(){
        return icmpRules;
    }
    
    public int getNumTCPRules(){
        return tcpRules;
    }
    
    public int getNumUDPRules(){
        return udpRules;
    }
    
    public String getRules(){
        return this.rules.toString();
    }
    
    public void appendValue(String value){
        this.rules.append(value);
    }
    
    public void appendRules(String rules){
        
        if( this.rules.toString().length()!= 0 )
            this.rules.append(" and ").append(rules);
        else this.rules.append(rules);
        
    }
    
}
