package dao;

import javax.faces.bean.ApplicationScoped;



//	@ApplicationScopedped
	public abstract class DAO {
//		<E extends Identificavel> (na classe)

//		@Inject
//		private EntityManager em;
//
//		private Class<E> classe;
//
//	public DAO(Class<E> classe) {
//		this.classe = classe;
//	}
//
//	public void save(E obj) {
//		if(obj.getId() == null) {
//			em.persist(obj);
//		} else {
//			update(obj);
//		}
//	}
//
//	public E update(E obj) {
//		E resultado = obj;
//		resultado = em.merge(obj);
//		return resultado;
//	}
//
//	public void remove(E obj) {
//		obj = getByID(obj.getId());
//		em.remove(obj);
//	}
//
//	public E getByID(Long objId) {
//		return em.find(classe, objId);
//	}
//
//	public List<E> getAll() {
//		Query query = em.createQuery("from " + classe.getSimpleName());
//		return query.getResultList();
//	}
//
}
