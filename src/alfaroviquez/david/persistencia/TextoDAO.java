package alfaroviquez.david.persistencia;

import alfaroviquez.david.bl.entidades.Material;
import alfaroviquez.david.bl.entidades.Texto;
import alfaroviquez.david.bl.entidades.Video;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class TextoDAO extends MaterialDAO {
    @Override
    public void save(Material nuevoMaterial) {
        ArrayList<String> lines = new ArrayList<>();
        lines.add(nuevoMaterial.toCSVLine());
        try{
            Files.write(Paths.get("c:\\dev\\listaMaterialTexto.csv"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Material> findAll() {
        ArrayList<Material> result = new ArrayList<>();
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader("c:\\dev\\listaMaterialTexto.csv"));
            String currentLine = reader.readLine();
            while (currentLine!=null){
                result.add(new Texto(currentLine));
                currentLine = reader.readLine();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
}
