import javax.swing.*;

public class Entrada {
    public static void main(String[] args) {

        int option;
        do {
            String menu = """
                    ===MENU===
                    0. Salir
                    1. Crear archivo
                    2. Crear directorio
                    3. Existencia de fichero
                    4. Informacion de fichero
                    5. Listar directorios
                    6. Eliminar archivo
                    7. Eliminar directorio vacio 
                    """;

            option = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (option) {
                case 0 -> System.exit(0);
                case 1 -> GestorArchivos.crearArchivo();
                case 2 -> GestorArchivos.crearDirectorio();
                case 3 -> GestorArchivos.existenciaArchivo();
                case 4 -> GestorArchivos.infoArchivos();
                case 5 -> GestorArchivos.listarDirectorios();
                case 6 -> GestorArchivos.eliminarArchivos();
                case 7 -> GestorArchivos.eliminarDirectorioVacio();
                default -> JOptionPane.showMessageDialog(null,
                        "Opcion no permitida, por favor ingrese una valida");

            }
        } while (option != 0);


    }

}
