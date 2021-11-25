package MascotasFinal.App;

import MascotasFinal.Dominio.Mascota;
import MascotasFinal.Dominio.MascotaApta;
import MascotasFinal.Dominio.MascotaEsterilizada;
import MascotasFinal.Dominio.Veterinaria;

public class Aplicacion {
    public static void main(String[] args) {

        Veterinaria veterinaria = new Veterinaria("maria");

        veterinaria.revisarMascota("lulu","hembra",10,false);
        veterinaria.revisarMascota("manolo","macho",15,false);
        veterinaria.revisarMascota("luna","hembra",22,false);
        veterinaria.revisarMascota("coco","macho",18,false);
        veterinaria.revisarMascota("nana","hembra",16,false);

        veterinaria.getPacientesAOperar();


    }
}
