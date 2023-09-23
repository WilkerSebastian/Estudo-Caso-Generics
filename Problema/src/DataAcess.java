public interface DataAcess {
    
    void save(Object obj);
    void update(Object obj, int id);
    Object getById(int id);
    void delete(int id);

}
