public class CodigoEmpleado {
    /*A: españa
    b: francia
    c: alemania
    d: reino unido
    e: paises pbajos
     */

    /* hacer una funcion hash con codigos de trabajador: (A,23), (C,134) y (E, 1)*/
    public String getCodPais() {
        return null;
    }

    public int getCodEmpleado() {
        return 0;
    }


    CodigoEmpleado codigo;

    public int getHash() {
        int codPais = codigo.getCodPais().charAt(0) - 'A';
        int hash = codPais * 1000 + codigo.getCodEmpleado();
        return hash;
        int codEmpleado = codigo.getCodEmpleado().charAt(0) - 'A';
    }

}