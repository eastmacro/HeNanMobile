package dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by richard on 2015/12/7.
 */
public class PosDao extends BaseDao{
    public void Retrieval(String ApplyDocCode, int sent){
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String queryString = "update PosEntity as model set model.sent = ? where model.applyDocCode = ?";
            Query queryObject = session.createQuery(queryString);
            queryObject.setParameter(0, sent);
            queryObject.setParameter(1, ApplyDocCode);
            queryObject.executeUpdate();
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    public List findUnSent() {
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String queryString = "from PosEntity as model where model.sent = 0";
            Query queryObject = session.createQuery(queryString);
            tx.commit();
            return queryObject.list();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public List findSent() {
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String queryString = "from PosEntity as model where model.sent = 1";
            Query queryObject = session.createQuery(queryString);
            tx.commit();
            return queryObject.list();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public List findOne(String ApplyDocCode){
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String queryString = "from PosEntity as model where applyDocCode = ?";
            Query queryObject = session.createQuery(queryString);
            queryObject.setParameter(0, ApplyDocCode);
            queryObject.setMaxResults(1);
            tx.commit();
            return queryObject.list();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
