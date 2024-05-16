package dao;

import model.Odontologo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class OdontologoDaoHashMap implements iDao<Odontologo> {
    private HashMap<String, Odontologo> odontologos = new HashMap<>();

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        odontologos.put(odontologo.getNumeroMatricula(), odontologo);
        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        return new ArrayList<>(odontologos.values());
    }
}
