package alfaroviquez.david.persistencia;

import alfaroviquez.david.bl.entidades.Persona;

import java.util.List;

public abstract class PersonaDAO {
    public abstract void save(Persona nuevaPersona);
    public abstract List<Persona> findAll();
}
