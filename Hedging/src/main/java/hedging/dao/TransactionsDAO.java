package hedging.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import hedging.entity.Transactions;

@Repository
public interface TransactionsDAO extends JpaRepository<Transactions, Integer>{
	@Query(value = "SELECT count(*) FROM Transac", nativeQuery = true)
    int countTransaction();
}
