import javax.swing.*;
import java.io.File;

public class Archivos {

    public static void crearArchivo() {
        JOptionPane NombreArchivo = new JOptionPane();
        File archivo;

        archivo = new File(NombreArchivo.showInputDialog
                (null, "Dime el nombre del archivo que vas a crear"));
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: ".concat(" ")
                        .concat(archivo.getName()));
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (Exception e) {
            System.out.println("Error al crear el archivo");
            e.printStackTrace();
        }
    }

    public static void crearDirectorio() {
        JOptionPane NombreDirectorio = new JOptionPane();
        File directorio;
        directorio = new File(NombreDirectorio.showInputDialog(null,
                "Dime el nombre del directorio"));

        if (directorio.mkdir()) {
            System.out.println("Directorio creado: ".concat(directorio.getName()));
        } else {
            System.out.println("Error al crear el directorio");
        }
    }

    public static void existenciaArchivo() {
        JOptionPane NombreArchivo = new JOptionPane();
        File archivo;
        archivo = new File(NombreArchivo.showInputDialog(null,
                "Dime el nombre del archivo a buscar"));
        if (archivo.exists()) {
            System.out.println("El archivo existe: ".concat(archivo.getName()));

            System.out.println("Es legible? ".concat(String.valueOf(archivo.canRead())));

            System.out.println("Es escribible? ".concat(String.valueOf(archivo.canWrite())));
        } else {
            System.out.println("El archivo no existe");
        }
    }

    public static void infoArchivos() {
        JOptionPane NombreArchivo = new JOptionPane();
        File archivo;
        archivo = new File(JOptionPane.showInputDialog(null,
                "Dime el nombre del archivo"));
        if (archivo.exists()) {
            System.out.println("El archivo existe: ".concat(archivo.getName()));

            System.out.println("Ruta absoluta: ".concat(archivo.getAbsolutePath()));

            System.out.println("Tamaño: ".concat(String.valueOf(archivo.length()))
                    .concat(" bytes"));
        } else {
            System.out.println("El archivo no existe");
        }
    }

    public static void listarDirectorios() {
        JOptionPane NombreDirectorio = new JOptionPane();
        File directorio;
        directorio = new File(JOptionPane.showInputDialog(null,
                "Escribe la ruta del directorio"));
        if (directorio.isDirectory()) {
            String[] contenido = directorio.list();

            if (contenido != null) {
                for (String nombre : contenido) {
                    System.out.println(nombre);
                }
            } else {
                System.out.println("No se pudo obtener el contenido del directorio");
            }

        } else {
            System.out.println("La ruta especificada no es un directorio");
        }
    }

    public static void eliminarArchivos() {
        JOptionPane NombreArchivo = new JOptionPane();
        File archivo;
        archivo = new File(JOptionPane.showInputDialog(null,
                "Dime el nombre del archivo a eliminar (con extension): "));
        if (archivo.delete()) {
            System.out.println("El archivo eliminado: ".concat(archivo.getName()));
        } else {
            System.out.println("Error al eliminar el archivo");
        }


    }

    public static void eliminarDirectorioVacio() {
        JOptionPane NombreDirectorio = new JOptionPane();
        File directorio;
        directorio = new File(JOptionPane.showInputDialog(null,
                "Dime el nombre del directorio vacio"));
        if (directorio.delete()) {
            System.out.println("El archivo eliminado: ".concat(directorio.getName()));
        } else {
            System.out.println("Error al eliminar el directorio," +
                    " asegurate de que este vacio");
        }

    }
}
