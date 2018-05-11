import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {


    public static void main(String ... args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");

        EntityManager em = emf.createEntityManager();

        try{
            em.getTransaction().begin();



            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }



    }
}
