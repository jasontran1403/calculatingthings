package hedging.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Account")
public class Accounts {
	@Id
	@Column(name = "Id")
    private int Id;

    @Column(name = "Accountname")
    private String Accountname;
    
    @Column(name = "Balance")
    private double balance;
    
    @Column(name = "StopLoss")
    private double stoploss;
    
    @Column(name = "StopProfit")
    private double stopprofit;
    

	public double getStoploss() {
		return stoploss;
	}

	public void setStoploss(double stoploss) {
		this.stoploss = stoploss;
	}

	public double getStopprofit() {
		return stopprofit;
	}

	public void setStopprofit(double stopprofit) {
		this.stopprofit = stopprofit;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAccountname() {
		return Accountname;
	}

	public void setAccountname(String accountname) {
		Accountname = accountname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
    
    
}
