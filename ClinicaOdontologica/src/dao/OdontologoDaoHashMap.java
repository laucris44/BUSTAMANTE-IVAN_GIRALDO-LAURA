package dao;

import model.Odontologo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OdontologoDaoHashMap implements IDao<Odontologo> {
    private HashMap<Integer, Odontologo> odontologos = new HashMap<>();

    @Override
    public void guardar(Odontologo odontologo) {
        odontologos.put(odontologo.getNumeroMatricula(), odontologo);
    }

    @Override
    public List<Odontologo> listarTodos() {
        return new ArrayList<>(odontologos.values());
    }
}
