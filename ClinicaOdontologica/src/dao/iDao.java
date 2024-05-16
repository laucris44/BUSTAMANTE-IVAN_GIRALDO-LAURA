package dao;

import model.Odontologo;

import java.util.List;

public interface iDao <T> {
    Odontologo guardar (T t);
    List<T> listarTodos();
}
