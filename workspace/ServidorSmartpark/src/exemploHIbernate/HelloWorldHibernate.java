package exemploHIbernate;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
public class HelloWorldHibernate {
    
	public static void main(String[] args) { 
        AnnotationConfiguration config = new AnnotationConfiguration(); 
        config.addAnnotatedClass(Teste.class);
        SessionFactory sessionFactory = config.buildSessionFactory(); 
        Session session = sessionFactory.openSession(); 
        inserirProduto(session); 
        listarProdutos(session); 
        session.close();
        sessionFactory.close(); 
    }
    
	private static void inserirProduto(Session session) { 
    	Teste produto = new Teste(); 
        produto.setNome("Samuel");
        Transaction tx = session.beginTransaction(); 
        session.persist(produto);
        tx.commit();
        System.out.println("Produto inserido"); 
    } 
    
    @SuppressWarnings("unchecked")
	private static void listarProdutos(Session session) { 
//      List<Teste> produtos = session.createQuery("from Teste " ).list(); 
    	
    	List<Teste> produtos = null;
    	
    	Criteria q = session.createCriteria( Teste.class );
    	
    	produtos = q.list();
    	
        for (Teste p: produtos) { 
            System.out.printf("%4d \t %s %n", p.getId(), p.getNome()); 
        } 
    }
}