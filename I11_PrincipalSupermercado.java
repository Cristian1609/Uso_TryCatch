package General;

import General.I6_Supermercado_Cliente;
import General.I7_Supermercado_Compra;
import General.I8_Supermercado_Inventario;
import General.I9_Supermercado_Producto;
import General.I12_Supermercado_Proveedor;
import General.I13_Supermercado_Venta;
import java.util.ArrayList;
import java.util.Scanner;

public class I11_PrincipalSupermercado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //-------------------
        try {
            ArrayList<I6_Supermercado_Cliente> clientes = new ArrayList<>();
        ArrayList<I7_Supermercado_Compra> compras = new ArrayList<>();
        ArrayList<I8_Supermercado_Inventario> inventarios = new ArrayList<>();
        ArrayList<I9_Supermercado_Producto> productos = new ArrayList<>();
        ArrayList<I12_Supermercado_Proveedor> proveedores = new ArrayList<>();
        ArrayList<I13_Supermercado_Venta> ventas = new ArrayList<>();
        //-------------------

        int menu = 0;
        int subMenu = 0;
        boolean salir = false;

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
                                listarCompra(compras);
                                break;
                            case 2:
                                agregarCompras(entrada, compras);
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
                                listarInventario(inventarios);
                                break;
                            case 2:
                                agregarInventario(entrada, inventarios);
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

                                ListarProducto(productos);
                                break;
                            case 2:

                                agregarProdcutos(entrada, productos);
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
                    while (!salir) {
                        subMenu = mostrarSubMenu(entrada);

                        switch (subMenu) {
                            case 1:

                                ListarProveedor(proveedores);
                                break;
                            case 2:

                                agregarProveedor(entrada, proveedores);
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
                case 6:
                    while (!salir) {
                        subMenu = mostrarSubMenu(entrada);

                        switch (subMenu) {
                            case 1:

                                ListarVenta(ventas);
                                break;
                            case 2:

                                agregarVenta(entrada, ventas);
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
                case 7: 
                    salir=true;
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
        System.out.println("2. Compras");
        System.out.println("3. Inventario");
        System.out.println("4. Productos");
        System.out.println("5. Proveedor");
        System.out.println("6. Ventas");
        System.out.println("7. Salir");
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

    private static void listarClientes(ArrayList<I6_Supermercado_Cliente> clientes) {
        try {
            System.out.println("\nLos clientes registrados son:");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (I6_Supermercado_Cliente cliente : clientes) {
                System.out.println(cliente.toString());
            }
        }
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void agregarCliente(Scanner entrada, ArrayList<I6_Supermercado_Cliente> clientes) {

        try {
            System.out.println("\nDigite la información del cliente:");

        System.out.println("Id:");
        int id = entrada.nextInt();

        System.out.println("Nom cliente: ");
        String nombre = entrada.next();

        System.out.println("Telefono:");
        String telefono = entrada.next();

        System.out.println("Correo:");
        String correo = entrada.next();

        I6_Supermercado_Cliente cliente = new I6_Supermercado_Cliente(id, nombre, telefono, correo);
        clientes.add(cliente);
        System.out.println("Cliente agregado correctamente.");
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void listarCompra(ArrayList<I7_Supermercado_Compra> compras) {
        try {
             System.out.println("\nLas compras registradas son:");
        if (compras.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (I7_Supermercado_Compra compra : compras) {
                System.out.println(compra.toString());
            }
        }
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void agregarCompras(Scanner entrada, ArrayList<I7_Supermercado_Compra> compras) {
        try {
             System.out.println("\nDigite la información de la compra:");

        System.out.println("Id:");
        int id = entrada.nextInt();

        System.out.println("Fecha: ");
        String fecha = entrada.next();

        System.out.println("Cantidad productos");
        int cantidad = entrada.nextInt();

        System.out.println("Precio Unitario");
        double precioU = entrada.nextDouble();

        System.out.println("Precio Total: ");
        double precioT = entrada.nextDouble();

        I7_Supermercado_Compra compra = new I7_Supermercado_Compra(id, fecha, cantidad, precioU, precioT);
        compras.add(compra);
        System.out.println("Cliente agregado correctamente.");
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void listarInventario(ArrayList<I8_Supermercado_Inventario> inventarios) {
        try {
             System.out.println("\nLos inventarios  registrados son:");
        if (inventarios.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (I8_Supermercado_Inventario inventario : inventarios) {
                System.out.println(inventario.toString());
            }
        }
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void agregarInventario(Scanner entrada, ArrayList<I8_Supermercado_Inventario> inventarios) {
        try {
             System.out.println("\nDigite la información del inventario:");

        System.out.println("Cantidad productos:");
        int id = entrada.nextInt();

        System.out.println("Cantidad categorias: ");
        String fecha = entrada.next();

        System.out.println("Balance");
        double cantidad = entrada.nextInt();

        I8_Supermercado_Inventario inventario = new I8_Supermercado_Inventario(id, fecha, cantidad);
        inventarios.add(inventario);
        System.out.println("Inventario agregado correctamente.");
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void ListarProducto(ArrayList<I9_Supermercado_Producto> productos) {
        try {
             System.out.println("\nLos inventarios  registrados son:");
        if (productos.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (I9_Supermercado_Producto producto : productos) {
                System.out.println(producto.toString());
            }
        }
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void agregarProdcutos(Scanner entrada, ArrayList<I9_Supermercado_Producto> productos) {
        try {
            System.out.println("\nDigite la información del producto:");

        System.out.println("Id:");
        int id = entrada.nextInt();

        System.out.println("Categoria: ");
        String categoria = entrada.next();

        System.out.println("Precio");
        double precio = entrada.nextInt();

        System.out.println("Descripcion");
        String descripcion = entrada.next();

        System.out.println("Caducidad");
        String caducidad = entrada.next();

        I9_Supermercado_Producto producto = new I9_Supermercado_Producto(id, categoria, precio, descripcion, caducidad);
        productos.add(producto);
        System.out.println("Producto agregado correctamente.");
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void ListarVenta(ArrayList<I13_Supermercado_Venta> ventas) {
        try {
            System.out.println("\nLas ventas  registradas son:");
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            for (I13_Supermercado_Venta venta : ventas) {
                System.out.println(venta.toString());
            }
        }
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void agregarVenta(Scanner entrada, ArrayList<I13_Supermercado_Venta> ventas) {
        try {
            System.out.println("\nDigite la información del producto:");

        System.out.println("Id:");
        int id = entrada.nextInt();

        System.out.println("Fecha : ");
        String fecha = entrada.next();

        System.out.println("Precio Unitario:");
        double precioU = entrada.nextInt();

        System.out.println("Precio Total:");
        double precioT = entrada.nextDouble();

        System.out.println("Cantidad Productos");
        int cantidadProductos = entrada.nextInt();
        
        System.out.println("Categoria Productos");
        String categoria = entrada.next();
        
         System.out.println("Cliente: ");
        String cliente = entrada.next();

       I13_Supermercado_Venta venta = new I13_Supermercado_Venta(id, fecha, precioU, precioT, cantidadProductos, categoria, cliente);
       ventas.add(venta);
        System.out.println("Producto agregado correctamente.");
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void ListarProveedor(ArrayList<I12_Supermercado_Proveedor> proveedores) {
        try {
            System.out.println("\nLos proveedores  registrados son:");
        if (proveedores.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (I12_Supermercado_Proveedor proveedor : proveedores) {
                System.out.println(proveedor.toString());
            }
        }
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

    private static void agregarProveedor(Scanner entrada, ArrayList<I12_Supermercado_Proveedor> proveedores) {
        try {
             System.out.println("\nDigite la información del proveedor:");

        System.out.println("Nit:");
        int nit = entrada.nextInt();

        System.out.println("Nombre: ");
        String nombre = entrada.next();

        System.out.println("Telefono");
        String telefono = entrada.next();

        System.out.println("Correo");
        String correo = entrada.next();

        System.out.println("Categoria");
        String categoria = entrada.next();

        I12_Supermercado_Proveedor proveedor = new I12_Supermercado_Proveedor(nit, nombre, telefono, correo, categoria);
        proveedores.add(proveedor);
        System.out.println("Proveedor agregado correctamente.");
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

}
