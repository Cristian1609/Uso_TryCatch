package General;

import General.I1_Cine_Cafeteria;
import General.I2_Cine_Cliente;
import General.I3_Cine_Empleado;
import General.I4_Cine_Sala;
import java.util.ArrayList;

import java.util.Scanner;

public class I10_PrincipalCine {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //-------------------
        try {
            ArrayList<I2_Cine_Cliente> clientes = new ArrayList<>();
            ArrayList<I3_Cine_Empleado> empleados = new ArrayList<>();
            ArrayList<I1_Cine_Cafeteria> cafeterias = new ArrayList<>();
            ArrayList<I4_Cine_Sala> salas = new ArrayList<>();
            int menu = 0;
            int subMenu = 0;
            boolean salir = false;
            //-------------------

            while (!salir) {
                menu = mostrarMenu(entrada);
                switch (menu) {
                    case 1:
                        while (!salir) {
                            subMenu = mostrarSubMenu(entrada);

                            switch (subMenu) {
                                case 1:
                                    listarClientes(clientes);
                                    break;
                                case 2:
                                    agregarCliente(entrada, clientes);
                                    break;
                                case 3:
                                    salir = true;
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                                    break;
                            }
                        }
                        salir = false;
                        break;
                    case 2:
                        while (!salir) {
                            subMenu = mostrarSubMenu(entrada);

                            switch (subMenu) {
                                case 1:
                                    listarEmpleados(empleados);
                                    break;
                                case 2:
                                    agregarEmpleados(entrada, empleados);
                                    break;
                                case 3:
                                    salir = true;
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                                    break;
                            }
                        }
                        salir = false;
                        break;

                    case 3:
                        while (!salir) {
                            subMenu = mostrarSubMenu(entrada);

                            switch (subMenu) {
                                case 1:
                                    listarCafeteria(cafeterias);
                                    break;
                                case 2:
                                    agregarCafeterias(entrada, cafeterias);
                                    break;
                                case 3:
                                    salir = true;
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                                    break;
                            }
                        }
                        salir = false;
                        break;

                    case 4:
                        while (!salir) {
                            subMenu = mostrarSubMenu(entrada);

                            switch (subMenu) {
                                case 1:

                                    ListarSala(salas);
                                    break;
                                case 2:

                                    agregarSalas(entrada, salas);
                                    break;
                                case 3:
                                    salir = true;
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                                    break;
                            }
                        }
                        salir = false;
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }
            entrada.close();
            System.out.println("Saliendo...");
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static int mostrarMenu(Scanner entrada) {
        try {
            System.out.println("\nBienvenido al Sistema");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Clientes");
            System.out.println("2. Empleados");
            System.out.println("3. Cafeteria");
            System.out.println("4. Sala");
            System.out.println("5. Salir");
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
        return entrada.nextInt();
    }

    private static int mostrarSubMenu(Scanner entrada) {
        try {
            System.out.println("\nSub Menu General");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Listar");
            System.out.println("2. Crear");
            System.out.println("3. Salir.");
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
        return entrada.nextInt();
    }

    private static void listarClientes(ArrayList<I2_Cine_Cliente> clientes) {
        try {
            System.out.println("\nLos clientes registrados son:");
            if (clientes.isEmpty()) {
                System.out.println("No hay clientes registrados.");
            } else {
                for (I2_Cine_Cliente cliente : clientes) {
                    System.out.println(cliente.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void agregarCliente(Scanner entrada, ArrayList<I2_Cine_Cliente> clientes) {
        try {
            System.out.println("\nDigite la información del cliente:");

            System.out.println("Nombre:");
            String nombre = entrada.next();

            System.out.println("Numero Identificacion:");
            String identificacion = entrada.next();

            System.out.println("Telefono:");
            String telefono = entrada.next();

            I2_Cine_Cliente cliente = new I2_Cine_Cliente(nombre, identificacion, telefono);
            clientes.add(cliente);
            System.out.println("Cliente agregado correctamente.");
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void listarEmpleados(ArrayList<I3_Cine_Empleado> empleados) {
        try {
            System.out.println("\nLos empleado registrados son:");
            if (empleados.isEmpty()) {
                System.out.println("No hay empleados registrados.");
            } else {
                for (I3_Cine_Empleado empleado : empleados) {
                    System.out.println(empleado.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void agregarEmpleados(Scanner entrada, ArrayList<I3_Cine_Empleado> empleados) {

        try {
            System.out.println("\nDigite la información del empleado:");

            System.out.println("Id:");
            int id = entrada.nextInt();

            System.out.println("Nombre:");
            String nombre = entrada.next();

            System.out.println("Direccion:");
            String direccion = entrada.next();

            System.out.println("Correo:");
            String correo = entrada.next();

            System.out.println("Fecha Nacimiento:");
            String fechaNacimineto = entrada.next();

            System.out.println("ARL: ");
            String arl = entrada.next();
            System.out.println("Tipo labor: ");
            String labor = entrada.next();

            I3_Cine_Empleado empleado = new I3_Cine_Empleado(id, nombre, direccion, correo, fechaNacimineto, arl, labor);
            empleados.add(empleado);

            System.out.println("Empleado agregado correctamente.");
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void listarCafeteria(ArrayList<I1_Cine_Cafeteria> cafeterias) {
        try {
            System.out.println("\nLas cafeterias  registradas son:");
            if (cafeterias.isEmpty()) {
                System.out.println("No hay cafeterias registradas.");
            } else {
                for (I1_Cine_Cafeteria cafeteria : cafeterias) {
                    System.out.println(cafeteria.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void agregarCafeterias(Scanner entrada, ArrayList<I1_Cine_Cafeteria> cafeterias) {
        try {
            System.out.println("\nDigite la información de la cafeteria:");

            System.out.println("Nombre:");
            String nombre = entrada.next();

            System.out.println("Ubicacion:");
            String ubicacion = entrada.next();

            System.out.println("Horario:");
            String horario = entrada.next();

            System.out.println("Numero Cafeteria");
            int numeroCafeteria = entrada.nextInt();

            System.out.println("Numero Empleados:");
            int numeroEmpleados = entrada.nextInt();

            System.out.println("Numero Mesas");
            int numeroMesas = entrada.nextInt();

            I1_Cine_Cafeteria cafeteria = new I1_Cine_Cafeteria(nombre, ubicacion, horario, numeroCafeteria, numeroEmpleados, numeroMesas);
            cafeterias.add(cafeteria);
            System.out.println("Cafeteria agregada correctamente.");
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void ListarSala(ArrayList<I4_Cine_Sala> salas) {
        try {
            System.out.println("\nLas salas  registradas son:");
            if (salas.isEmpty()) {
                System.out.println("No hay cafeterias registradas.");
            } else {
                for (I4_Cine_Sala sala : salas) {
                    System.out.println(sala.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void agregarSalas(Scanner entrada, ArrayList<I4_Cine_Sala> salas) {

        try {
            System.out.println("\nDigite la información de la sala:");

            System.out.println("Nombre:");
            String nombre = entrada.next();

            System.out.println("Tipo:");
            String tipo = entrada.next();

            System.out.println("Numero sillas");
            int sillas = entrada.nextInt();

            System.out.println("Numero Empleados");
            int empleados = entrada.nextInt();

            I4_Cine_Sala sala = new I4_Cine_Sala(nombre, tipo, sillas, empleados);
            salas.add(sala);
            System.out.println("sala agregada correctamente.");

        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }
}
