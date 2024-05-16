import dao.OdontologoDaoHashMap;
import dao.iDao;
import model.Odontologo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OdontologoTestService {
    @Test
    public void testListarTodos() {
        iDao<Odontologo, String> odontologoDao = new OdontologoDaoHashMap();
        odontologoDao.guardar(new Odontologo(1, "Juan", "Perez"));
        odontologoDao.guardar(new Odontologo(2, "Maria", "Gomez"));
        List<Odontologo> odontologos = odontologoDao.listarTodos();
        assertEquals(2, odontologos.size());
    }

}
