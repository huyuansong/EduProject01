package com.bdqn.edu.baseservice;

public interface IBaseService<T> {

    public T findById(Integer id);

    public void save(T entity);

    public void deleteById(Object id);

    public void update(T entity);


}
