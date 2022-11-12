package hedging.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Transac")
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
    private int Id;

    @Column(name = "HedgingAmout")
    private double hedgingAmout;
    
    @Column(name = "HedgingSize")
    private String hedgingSize = "NOTYET";
    
    @ManyToOne
    @JoinColumn(name = "AccountId")
    private Accounts account;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getHedgingAmout() {
		return hedgingAmout;
	}

	public void setHedgingAmout(double hedgingAmout) {
		this.hedgingAmout = hedgingAmout;
	}

	public String getHedgingSize() {
		return hedgingSize;
	}

	public void setHedgingSize(String hedgingSize) {
		this.hedgingSize = hedgingSize;
	}

	public Accounts getAccount() {
		return account;
	}

	public void setAccount(Accounts account) {
		this.account = account;
	}
    
    
}
