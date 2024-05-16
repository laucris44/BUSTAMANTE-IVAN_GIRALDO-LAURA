package dao;

import java.util.List;

public interface iDao <T, S> {
    void guardar (T t);
    List<T> listarTodos();
}
