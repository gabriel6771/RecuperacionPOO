package MascotasFinal.Dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Veterinaria {

    private String nombre;
    private List<Mascota> pacientes;
    private List<MascotaApta> mascotaAptas;


    public Veterinaria(String nombre) {
        this.nombre = nombre;
        this.pacientes = new ArrayList<>();
        this.mascotaAptas = new ArrayList<>();
    }

    public Mascota revisarMascota(String nombre, String sexo, int edad, boolean esterilizado) {
        Mascota mascotaApta = null;
        if (sexo.contains("macho") && edad >= 12  || sexo.contains("hembra") && edad >= 18 ){
            mascotaApta = new MascotaApta(nombre,sexo,edad,true);
            System.out.println(nombre + "  sexo:"  +sexo + "  meses:" + edad + "   SI es apto para oparar");


        }else {
            System.out.println(nombre + "  sexo:"  +sexo + "  meses:" + edad + "   NO es apto para operar");

        }
        return mascotaApta;
    }

    public void operar(){
        pacientes.stream().filter(p -> p instanceof Operable && p.isEsterilizado()).forEach(mascota -> {
            ((Operable) mascota).operar();
        });
    }

    public List<MascotaApta> getPacientesAOperar() {
        pacientes.stream().filter(p -> p instanceof Operable).forEach(mascota -> {
            if (mascota.isEsterilizado()==false){
                mascota.esterilizado = false;
                mascotaAptas.add((MascotaApta) mascota);
            }else {
                System.out.println("La mascota ya esta esterilizada");
            }
        });
        return mascotaAptas;

    }

}
