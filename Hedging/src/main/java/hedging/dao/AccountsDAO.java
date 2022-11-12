package hedging.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import hedging.entity.Accounts;

@Repository
public interface AccountsDAO extends JpaRepository<Accounts, Integer>{
	@Query(value = "SELECT sum(a.balance) FROM Account a", nativeQuery = true)
    double sumBalance();
	
	@Query(value = "SELECT * FROM Account ORDER BY balance desc", nativeQuery = true)
    List<Accounts> findAllSorted();
}
