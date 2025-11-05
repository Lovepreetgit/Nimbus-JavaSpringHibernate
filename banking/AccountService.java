import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;
import org.hibernate.Transaction as HibTransaction;

@Service
public class AccountService {
    @Transactional
    public void transfer(int fromAccId, int toAccId, double amount) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        HibTransaction htx = session.beginTransaction();
        Account from = session.get(Account.class, fromAccId);
        Account to = session.get(Account.class, toAccId);

        if (from.getBalance() < amount) {
            throw new Exception("Insufficient funds");
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        session.update(from);
        session.update(to);

        Transaction txn = new Transaction();
        txn.setFromAcc(fromAccId);
        txn.setToAcc(toAccId);
        txn.setAmount(amount);
        txn.setDate(new java.util.Date());
        session.save(txn);

        htx.commit();
        session.close();
    }
}
