import Entities.User;

import javax.enterprise.context.*;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;


@Named
@RequestScoped
public class CreerUser implements Serializable {

    private String Username, Email, Password;

    public void save() {
        System.out.println("La personne "+Username);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");

        EntityManager em = emf.createEntityManager();

        try{
            em.getTransaction().begin();
            User u = new User();
            u.setEmail("m.alitaleb@esi-sba.dz");
            u.setPassword("m.alitaleb");
            u.setUsername("m.alitaleb");

            em.persist(u);


            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}

