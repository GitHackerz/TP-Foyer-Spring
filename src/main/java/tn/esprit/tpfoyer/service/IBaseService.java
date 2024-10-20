package tn.esprit.tpfoyer.service;

import java.util.List;
import java.util.Optional;

public interface IBaseService<T, ID> {
    List<T> findAll();
    Optional<T> findById(ID id);
    T create(T entity);
    List<T> createAll(List<T> entities);
    T update(T entity);
    void delete(T entity);
    void deleteById(ID id);
    void deleteAll();
}
