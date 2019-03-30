package com.bdqn.edu.mapper.basemapper;

public interface BaseMapper<T> {

    public T findById(Integer id);
    public void deleteById(Integer id);
    public void save(T entity);
    public void update(T entity);

}
