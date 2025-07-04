
    /* hacer una funcion hash con codigos de trabajador: (A,23), (C,134) y (E, 1)*/
    import java.util.HashMap;
import java.util.Map;

    public class CodigoEmpleado {
        private String codPais; // codigo del pais
        private int codEmpleado; // numero del empleado

        public CodigoEmpleado(String codPais, int codEmpleado) {
            this.codPais = codPais;
            this.codEmpleado = codEmpleado;
        }

        public String getCodPais() {
            return codPais;
        }

        public int getCodEmpleado() {
            return codEmpleado;
        }

        public int getHash() {
            int codPaisValue = codPais.charAt(0) - 'A'; // convertimos el codigo del pais a un numero
            return codPaisValue * 1000 + codEmpleado; // ahora generamos el Hash
        }

        public static void main(String[] args) {
            // Creamos una tabla para almacenar los empleados usando HashMap
            Map<Integer, CodigoEmpleado> tbl = new HashMap<>();

            // Utilizamos los ejemplos de los empleados
            CodigoEmpleado emp1 = new CodigoEmpleado("A", 23);
            CodigoEmpleado emp2 = new CodigoEmpleado("C", 134);
            CodigoEmpleado emp3 = new CodigoEmpleado("E", 1);

            // almacenamos los empleados en las tablas usando Hash
            tbl.put(emp1.getHash(), emp1);
            tbl.put(emp2.getHash(), emp2);
            tbl.put(emp3.getHash(), emp3);

            // Ahora imprimos las tablas de hash
            for (Map.Entry<Integer, CodigoEmpleado> entry : tbl.entrySet()) {
                System.out.println("Hash: " + entry.getKey() + ", Empleado: " +
                        entry.getValue().getCodPais() + ", " + entry.getValue().getCodEmpleado());
            }
        }
    }
