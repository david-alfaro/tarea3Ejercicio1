package alfaroviquez.david.persistencia;


import alfaroviquez.david.bl.entidades.Persona;
import alfaroviquez.david.bl.entidades.Profesor;

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

public   class ProfesorDAO extends PersonaDAO {

    @Override
    public void save(Persona nuevaPersona) {
        ArrayList<String> lines = new ArrayList<>();
        lines.add(nuevaPersona.toCSVLine());
        try {
            Files.write(Paths.get("c:\\dev\\listadeProfesores.csv"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Persona> findAll() {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader("c:\\dev\\listadeProfesores.csv"));
            String currentLine = reader.readLine();
            while(currentLine!=null){
                listaPersonas.add(new Profesor(currentLine));
                currentLine=reader.readLine();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return listaPersonas;
    }
}
