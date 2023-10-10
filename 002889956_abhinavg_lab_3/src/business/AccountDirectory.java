/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author admin
 */
public class AccountDirectory {
    private ArrayList<Account> accountlist;

    public AccountDirectory(){
        this.accountlist = new ArrayList<>();
        
    }
    
    public ArrayList<Account> getAccountlist() {
        return accountlist;
    }

    public void setAccountlist(ArrayList<Account> accountlist) {
        this.accountlist = accountlist;
    }
    
    public Account addAccount(){
        Account account = new Account();
        accountlist.add(account);
        return account;
    }
    
    public void deleteAccount(Account account) {
        accountlist.remove(account);
    }
    
    public Account searchAccount(String accountNumber){
        for (Account account: accountlist) {
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }
    
}
