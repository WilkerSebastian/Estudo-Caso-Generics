public interface DataAcess<T> {
    
    void save(T entity);
    void update(T entity, int id);
    T getById(int id);
    void delete(int id);

}
