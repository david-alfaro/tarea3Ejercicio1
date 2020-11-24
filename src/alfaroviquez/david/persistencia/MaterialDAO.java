package alfaroviquez.david.persistencia;

import alfaroviquez.david.bl.entidades.Material;
import alfaroviquez.david.bl.entidades.Persona;

import java.util.List;

public abstract class MaterialDAO {
    public abstract void save(Material nuevoMaterial);
    public abstract List<Material> findAll();
}
