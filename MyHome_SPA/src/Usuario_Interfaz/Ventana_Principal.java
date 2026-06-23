/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Usuario_Interfaz;

import  Operaciones.ValidarRutSimple;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import Personal.*;
import Operaciones.*;
import Inmuebles.*;
import Controlador.Controlador_Inmobiliaria;
import java.io.BufferedReader;
import java.io.FileReader;


public class Ventana_Principal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ventana_Principal.class.getName());

    /**
     * Creates new form Ventana_Principal
     */
    
    private void habilitarOrdenamiento() {

    jTableClientes.setRowSorter(
            new TableRowSorter<>(
                    (DefaultTableModel) jTableClientes.getModel()));

    jTableInmueble.setRowSorter(
            new TableRowSorter<>(
                    (DefaultTableModel) jTableInmueble.getModel()));

    jTableVisitas.setRowSorter(
            new TableRowSorter<>(
                    (DefaultTableModel) jTableVisitas.getModel()));

    jTableCierre.setRowSorter(
            new TableRowSorter<>(
                    (DefaultTableModel) jTableCierre.getModel()));
}
    private void aplicarPaletaMint() {

    java.awt.Color fondo = new java.awt.Color(0xE4F2EA);
    java.awt.Color panel = new java.awt.Color(0xD8E8E0);
    java.awt.Color texto = new java.awt.Color(0x203A3A);
    java.awt.Color encabezado = new java.awt.Color(0x2F4F4F);
    java.awt.Color boton = new java.awt.Color(0x4F7A70);
    java.awt.Color botonSecundario = new java.awt.Color(0x6F9B90);
    java.awt.Color eliminar = new java.awt.Color(0xA65A5A);

    getContentPane().setBackground(fondo);

    jPanel1.setBackground(fondo);
    jPanel2.setBackground(panel);
    jPanel3.setBackground(panel);
    jPanel4.setBackground(panel);
    jPanel5.setBackground(panel);
    jPanel8.setBackground(panel);

    estilizarTablaMint(jTableClientes, encabezado, texto);
    estilizarTablaMint(jTableInmueble, encabezado, texto);
    estilizarTablaMint(jTableVisitas, encabezado, texto);
    estilizarTablaMint(jTableCierre, encabezado, texto);

    estilizarBotonMint(jButtonAgregarCliente, boton);
    estilizarBotonMint(jButtonAgregarVivienda, boton);
    estilizarBotonMint(jButtonAgregarComercial, boton);
    estilizarBotonMint(jButtonRegistarVisita, boton);
    estilizarBotonMint(jButtonRegistrarCierre, boton);

    estilizarBotonMint(jButtonGuardarTxT, botonSecundario);
    estilizarBotonMint(jButtonCargarTxT, botonSecundario);
    estilizarBotonMint(jButtonGuardarTxT1, botonSecundario);
    estilizarBotonMint(jButtonCargarTxT1, botonSecundario);
    estilizarBotonMint(jButtonGuardarTxT2, botonSecundario);
    estilizarBotonMint(jButtonCargarTxT2, botonSecundario);
    estilizarBotonMint(jButtonGuardarTxT3, botonSecundario);
    estilizarBotonMint(jButtonCargarTxT3, botonSecundario);
    estilizarBotonMint(jButtonGuardarTxT4, botonSecundario);
    estilizarBotonMint(jButtonCargarTxT4, botonSecundario);
    
    jTabbedPane1.setBackground(fondo);
    jTabbedPane2.setBackground(fondo);

    jScrollPane1.setBackground(fondo);
    jScrollPane2.setBackground(fondo);
    jScrollPane3.setBackground(fondo);
    jScrollPane4.setBackground(fondo);
    jScrollPane5.setBackground(fondo);

    jScrollPane1.getViewport().setBackground(fondo);
    jScrollPane2.getViewport().setBackground(fondo);
    jScrollPane3.getViewport().setBackground(fondo);
    jScrollPane4.getViewport().setBackground(fondo);
    jScrollPane5.getViewport().setBackground(fondo);

    jCheckBoxGas.setBackground(panel);
    jCheckBoxPuertaViv.setBackground(panel);
    jCheckBoxVentanasCom.setBackground(panel);

    jCheckBoxGas.setForeground(texto);
    jCheckBoxPuertaViv.setForeground(texto);
    jCheckBoxVentanasCom.setForeground(texto);
    
    // Quitar bordes blancos/grises
    jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
    jTabbedPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    jScrollPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    jScrollPane4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    jScrollPane5.setBorder(javax.swing.BorderFactory.createEmptyBorder());

    // Fondo del área interna de los scroll
    jScrollPane1.getViewport().setBackground(fondo);
    jScrollPane2.getViewport().setBackground(fondo);
    jScrollPane3.getViewport().setBackground(fondo);
    jScrollPane4.getViewport().setBackground(fondo);
    jScrollPane5.getViewport().setBackground(fondo);

    // Fondo del tabbed pane
    jTabbedPane1.setOpaque(true);
    jTabbedPane2.setOpaque(true);
    jTabbedPane1.setBackground(fondo);
    jTabbedPane2.setBackground(fondo);
    
    // Botones de eliminar
    estilizarBotonMint(jButton1, eliminar); // Eliminar Cliente
    estilizarBotonMint(jButton2, eliminar); // Eliminar Vivienda
    estilizarBotonMint(jButton3, eliminar); // Eliminar Comercial
    estilizarBotonMint(jButton4, eliminar); // Eliminar Visita
    estilizarBotonMint(jButton5, eliminar); // Eliminar Registro

// Botón de métricas
    estilizarBotonMint(jButtonCalcularMetricas, botonSecundario);
}
    private void estilizarTablaMint(javax.swing.JTable tabla, java.awt.Color encabezado, java.awt.Color texto) {

    tabla.setBackground(java.awt.Color.WHITE);
    tabla.setForeground(texto);
    tabla.setRowHeight(26);
    tabla.setGridColor(new java.awt.Color(0xAFC6BD));
    tabla.setSelectionBackground(new java.awt.Color(0xBFD9CE));
    tabla.setSelectionForeground(texto);

    tabla.getTableHeader().setBackground(encabezado);
    tabla.getTableHeader().setForeground(java.awt.Color.BLACK);
    tabla.getTableHeader().setFont(
            new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13)
    );

    tabla.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
}
    private void estilizarBotonMint(javax.swing.JButton boton, java.awt.Color color) {

        java.awt.Color colorNormal = color;
        java.awt.Color colorOscuro = color.darker();

        boton.setBackground(colorNormal);
        boton.setForeground(java.awt.Color.WHITE);
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setOpaque(true);
        boton.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));

        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton.setBackground(colorOscuro);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton.setBackground(colorNormal);
            }
        });
    }
    public Ventana_Principal() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        aplicarPaletaMint();
        setIconImage(
            new javax.swing.ImageIcon(
            getClass().getResource("/recursos/iconos/MYHOUSE.png")
        ).getImage()
);
        jTextAreaComentarioVisita.setLineWrap(true);
        jTextAreaComentarioVisita.setWrapStyleWord(true);
        setTitle("MyHome SPA - Sistema de Gestión Inmobiliaria");
        setLocationRelativeTo(null);
        habilitarOrdenamiento();
        configurarColumnasTablas();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
    @Override
    public void windowClosing(java.awt.event.WindowEvent e) {

        int opcion = javax.swing.JOptionPane.showConfirmDialog(
                Ventana_Principal.this,
                "¿Está seguro de que desea salir del sistema?\nCualquier cambio no guardado sera descartado.",
                "Confirmar salida",
                javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE);

        if (opcion == javax.swing.JOptionPane.YES_OPTION) {
            dispose();
            System.exit(0);
        }
    }
    private boolean campoVacio(String texto) {
    return texto == null || texto.trim().isEmpty();
}    
    
private boolean esNumeroEnteroPositivo(String texto) {
    try {
        int numero = Integer.parseInt(texto.trim());
        return numero > 0;
    } catch (NumberFormatException e) {
        return false;
    }
}

private boolean esNumeroDecimalPositivo(String texto) {
    try {
        double numero = Double.parseDouble(texto.trim());
        return numero > 0;
    } catch (NumberFormatException e) {
        return false;
    }
}

private boolean validarRutSimple(String rut) {
    return rut.matches("^\\d{1,2}\\.\\d{3}\\.\\d{3}-[\\dkK]$|^\\d{7,8}-[\\dkK]$");
}

private boolean validarFecha(String fecha) {
    try {
        java.time.LocalDate.parse(fecha);
        return true;
    } catch (java.time.format.DateTimeParseException e) {
        return false;
    }
}
});
    }
    private void configurarColumnasTablas() {
        // 1. Columnas para Tabla Clientes
        DefaultTableModel modeloClientes = (DefaultTableModel) jTableClientes.getModel();
        modeloClientes.setColumnIdentifiers(new Object[]{
            "RUT Cliente", "Nombre Completo"
        });

        // 2. Columnas para Tabla Inmuebles (La versión unificada que acordamos)
        DefaultTableModel modeloInmuebles = (DefaultTableModel) jTableInmueble.getModel();
        modeloInmuebles.setColumnIdentifiers(new Object[]{
            "Tipo", "N° Referencia", "Dirección", "Superficie (m²)", "Valor Tasación", "Distribución", "Características Específicas"
        });

        // 3. Columnas para Tabla Visitas
        DefaultTableModel modeloVisitas = (DefaultTableModel) jTableVisitas.getModel();
        modeloVisitas.setColumnIdentifiers(new Object[]{
            "Fecha", "RUT Cliente", "Ref. Inmueble", "RUT Agente", "Comentarios"
        });

        // 4. Columnas para Tabla Cierres / Operaciones
        DefaultTableModel modeloCierres = (DefaultTableModel) jTableCierre.getModel();
        modeloCierres.setColumnIdentifiers(new Object[]{
            "Tipo Operación", "Ref. Inmueble", "RUT Cliente", "RUT Agente", "RUT Gerente", "Precio Acordado"
        });
    
}
    private void guardarTodoTXT() {

        try (BufferedWriter bw =
                new BufferedWriter(
                        new FileWriter("DatosInmobiliaria.txt"))) {
            
            bw.write("========================================");
            bw.newLine();
            bw.write("        EXPORTACIÓN MYHOME SPA");
            bw.newLine();
            bw.write("========================================");
            bw.newLine();
            bw.write("Fecha: " + java.time.LocalDate.now());
            bw.newLine();
            bw.newLine();

            guardarTabla(bw, "CLIENTES REGISTRADOS", jTableClientes);
            guardarTabla(bw, "INMUEBLES REGISTRADOS", jTableInmueble);
            guardarTabla(bw, "VISITAS REGISTRADAS", jTableVisitas);
            guardarTabla(bw, "OPERACIONES / CIERRES", jTableCierre);
            guardarResumenFinanciero(bw);

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Reporte TXT generado correctamente."
            );

    } catch (IOException e) {

        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Error al guardar archivo: " + e.getMessage()
        );
    }
    guardarDatosParaCargar();
}    
    private void guardarTabla(
        BufferedWriter bw,
        String titulo,
        javax.swing.JTable tabla) throws IOException {

        DefaultTableModel modelo =
            (DefaultTableModel) tabla.getModel();

        bw.write("========================================");
        bw.newLine();
        bw.write(titulo);
        bw.newLine();
        bw.write("========================================");
        bw.newLine();

        if (modelo.getRowCount() == 0) {
            bw.write("No hay registros disponibles.");
            bw.newLine();
            bw.newLine();
            return;
        }

        for (int fila = 0; fila < modelo.getRowCount(); fila++) {

            bw.write("Registro N° " + (fila + 1));
            bw.newLine();
            bw.write("----------------------------------------");
            bw.newLine();

            for (int col = 0; col < modelo.getColumnCount(); col++) {

                String nombreColumna = modelo.getColumnName(col);
                Object valor = modelo.getValueAt(fila, col);

                bw.write(nombreColumna + ": "
                        + (valor == null ? "" : valor.toString()));
                bw.newLine();
            }

            bw.newLine();
        }
}
    private void guardarResumenFinanciero(BufferedWriter bw) throws IOException {

        DefaultTableModel modelo =
            (DefaultTableModel) jTableCierre.getModel();

        double totalVentas = 0;
        double totalArriendos = 0;
        double comisionesGlobales = 0;

        for (int fila = 0; fila < modelo.getRowCount(); fila++) {

            String tipoOperacion =
                    String.valueOf(modelo.getValueAt(fila, 0));

            double precio =
                    Double.parseDouble(
                            String.valueOf(modelo.getValueAt(fila, 5))
                    );

            if (tipoOperacion.equalsIgnoreCase("VENTA")) {
                totalVentas += precio;
            } else if (tipoOperacion.equalsIgnoreCase("ARRIENDO")) {
                totalArriendos += precio;
            }

            double comisionGerente = precio * 0.01;
            double comisionAgente = precio * 0.03;
            double comisionPropietario = precio * 0.03;

            comisionesGlobales += comisionGerente
                + comisionAgente
                + comisionPropietario;
        }

        bw.write("========================================");
        bw.newLine();
        bw.write("5. RESUMEN FINANCIERO");
        bw.newLine();
        bw.write("========================================");
        bw.newLine();

        bw.write("Total ingresos por ventas: $" + totalVentas);
        bw.newLine();

        bw.write("Total ingresos por arriendos: $" + totalArriendos);
        bw.newLine();

        bw.write("Total ingresos globales: $"
                + (totalVentas + totalArriendos));
        bw.newLine();

        bw.write("Total comisiones globales: $"
                + comisionesGlobales);
        bw.newLine();
        bw.newLine();
}
    private void guardarDatosParaCargar() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("base_datos.txt"))) {
        
            // Guardamos Clientes
            bw.write("#CLIENTES"); bw.newLine();
            guardarFilasPlanas(bw, jTableClientes);
        
            // Guardamos Inmuebles
            bw.write("#INMUEBLES"); bw.newLine();
            guardarFilasPlanas(bw, jTableInmueble);
        
            // Guardamos Visitas
            bw.write("#VISITAS"); bw.newLine();
            guardarFilasPlanas(bw, jTableVisitas);
        
            // Guardamos Cierres
            bw.write("#CIERRES"); bw.newLine();
            guardarFilasPlanas(bw, jTableCierre);
        
        } catch (IOException e) {
            System.out.println("Error al respaldar datos planos: " + e.getMessage());
        }
    }
    private void guardarFilasPlanas(BufferedWriter bw, javax.swing.JTable tabla) throws IOException {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                Object valor = modelo.getValueAt(i, j);
                sb.append(valor == null ? "" : valor.toString());
                if (j < modelo.getColumnCount() - 1) {
                    sb.append(";"); // Separador por punto y coma
                }
            }
            bw.write(sb.toString());
            bw.newLine();
        }
    }
    private void cargarDatosDesdeTXT() {
        java.io.File archivo = new java.io.File("base_datos.txt");
        if (!archivo.exists()) {
            return;
        }

        // Limpiamos los modelos actuales de las tablas para no duplicar si ya contienen algo
        DefaultTableModel modClientes = (DefaultTableModel) jTableClientes.getModel();
        DefaultTableModel modInmuebles = (DefaultTableModel) jTableInmueble.getModel();
        DefaultTableModel modVisitas = (DefaultTableModel) jTableVisitas.getModel();
        DefaultTableModel modCierre = (DefaultTableModel) jTableCierre.getModel();

        modClientes.setRowCount(0);
        modInmuebles.setRowCount(0);
        modVisitas.setRowCount(0);
        modCierre.setRowCount(0);

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            String seccionActual = "";

            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) continue;

                // Detectar en qué sección de datos nos encontramos
                if (linea.startsWith("#")) {
                    seccionActual = linea;
                    continue;
                }

                // Separar los valores usando el punto y coma
                String[] datos = linea.split(";", -1); 

                // Insertar los arreglos directamente en la tabla correspondiente
                switch (seccionActual) {
                    case "#CLIENTES":
                        modClientes.addRow(datos);
                        break;
                    case "#INMUEBLES":
                        modInmuebles.addRow(datos);
                        break;
                    case "#VISITAS":
                        modVisitas.addRow(datos);
                        break;
                    case "#CIERRES":
                        modCierre.addRow(datos);
                        break;
                }
            }

            //Recalcular las métricas globales de la interfaz usando tus labels
            calcularMetricas();
            javax.swing.JOptionPane.showMessageDialog(
                this,
                "Datos cargados correctamente.",
                "Carga exitosa",
                javax.swing.JOptionPane.INFORMATION_MESSAGE
            );
        } catch (IOException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar la base de datos: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    private boolean existeInmueble(String referencia) {
        DefaultTableModel modelo =
            (DefaultTableModel) jTableInmueble.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
        String refTabla =
            modelo.getValueAt(i, 1).toString().trim();
        if (refTabla.equalsIgnoreCase(referencia.trim())) {
            return true;
        }
    }

    return false;
}
    private void eliminarFila(javax.swing.JTable tabla, String nombreElemento) {

        int filaSeleccionada = tabla.getSelectedRow();

        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Seleccione " + nombreElemento + " para eliminar."
            );
            return;
        }

        int opcion = javax.swing.JOptionPane.showConfirmDialog(
                this,
                "¿Desea eliminar " + nombreElemento + " seleccionad@?",
                "Confirmar eliminación",
                javax.swing.JOptionPane.YES_NO_OPTION);

        if (opcion == javax.swing.JOptionPane.YES_OPTION) {

            DefaultTableModel modelo =
                (DefaultTableModel) tabla.getModel();

        modelo.removeRow(filaSeleccionada);

        javax.swing.JOptionPane.showMessageDialog(
                this,
                nombreElemento + " eliminad@ correctamente."
        );
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldRutCliente = new javax.swing.JTextField();
        jTextFieldN_CompletoCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButtonAgregarCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButtonCargarTxT = new javax.swing.JButton();
        jButtonGuardarTxT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableInmueble = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRefViv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDirViv = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldM2Viv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldValorViv = new javax.swing.JTextField();
        jComboBoxSubTipoViv = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldHabitaciones = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldBanos = new javax.swing.JTextField();
        jTextFieldCocinas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCheckBoxGas = new javax.swing.JCheckBox();
        jCheckBoxPuertaViv = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldGastosComunes = new javax.swing.JTextField();
        jComboBoxTipoPiso = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jButtonCargarTxT1 = new javax.swing.JButton();
        jButtonGuardarTxT1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButtonAgregarVivienda = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jComboBoxTipoComercial = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldRefCom = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldDirCom = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldValorCom = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldNPuertasAcceso = new javax.swing.JTextField();
        jCheckBoxVentanasCom = new javax.swing.JCheckBox();
        jComboBoxEstadoCom = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jTextFieldM2Com = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jButtonCargarTxT2 = new javax.swing.JButton();
        jButtonGuardarTxT2 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButtonAgregarComercial = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldFechaVisita = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldRutClienteVisita = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldRefInmuebleVisita = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableVisitas = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldRutAgenteVisita = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaComentarioVisita = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jButtonCargarTxT3 = new javax.swing.JButton();
        jButtonGuardarTxT3 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButtonRegistarVisita = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jComboBoxTipoOperacion = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableCierre = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldRefInmuebleCierre = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldRutClienteCierre = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldRutAgenteCierre = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldRutGerenteCierre = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldPrecioAcordado = new javax.swing.JTextField();
        jButtonCalcularMetricas = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabelTotalVentas = new javax.swing.JLabel();
        jLabelComisionesGlobales = new javax.swing.JLabel();
        jLabelTotalArriendos1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButtonCargarTxT4 = new javax.swing.JButton();
        jButtonGuardarTxT4 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButtonRegistrarCierre = new javax.swing.JButton();

        jScrollPane6.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(52, 135, 118));

        jTabbedPane1.setBackground(new java.awt.Color(228, 242, 234));

        jPanel1.setBackground(new java.awt.Color(228, 242, 234));

        jLabel1.setText("Rut");

        jLabel2.setText("Nombre Completo");

        jTextFieldRutCliente.addActionListener(this::jTextFieldRutClienteActionPerformed);

        jScrollPane1.setBackground(new java.awt.Color(216, 232, 224));

        jTableClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableClientes.setPreferredSize(new java.awt.Dimension(835, 345));
        jScrollPane1.setViewportView(jTableClientes);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setMaximumSize(new java.awt.Dimension(94, 47));
        jPanel6.setMinimumSize(new java.awt.Dimension(94, 47));

        jButtonAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/add_blanco.png"))); // NOI18N
        jButtonAgregarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAgregarCliente.setIconTextGap(0);
        jButtonAgregarCliente.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonAgregarCliente.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonAgregarCliente.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonAgregarCliente.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonAgregarCliente.addActionListener(this::jButtonAgregarClienteActionPerformed);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/remove_blanco.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(0);
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.setMaximumSize(new java.awt.Dimension(30, 31));
        jButton1.setMinimumSize(new java.awt.Dimension(30, 31));
        jButton1.setPreferredSize(new java.awt.Dimension(30, 31));
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAgregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.setMaximumSize(new java.awt.Dimension(94, 47));
        jPanel7.setMinimumSize(new java.awt.Dimension(94, 47));

        jButtonCargarTxT.setBackground(new java.awt.Color(111, 155, 144));
        jButtonCargarTxT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/open_blanco.png"))); // NOI18N
        jButtonCargarTxT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCargarTxT.setIconTextGap(0);
        jButtonCargarTxT.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonCargarTxT.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT.addActionListener(this::jButtonCargarTxTActionPerformed);

        jButtonGuardarTxT.setBackground(new java.awt.Color(111, 155, 144));
        jButtonGuardarTxT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/save_blanco.png"))); // NOI18N
        jButtonGuardarTxT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGuardarTxT.setIconTextGap(0);
        jButtonGuardarTxT.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonGuardarTxT.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT.addActionListener(this::jButtonGuardarTxTActionPerformed);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCargarTxT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonGuardarTxT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardarTxT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCargarTxT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldRutCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jTextFieldN_CompletoCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldN_CompletoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Gestion de Clientes", jPanel1);

        jPanel2.setBackground(new java.awt.Color(228, 242, 234));

        jTableInmueble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableInmueble.setPreferredSize(new java.awt.Dimension(835, 205));
        jScrollPane3.setViewportView(jTableInmueble);

        jPanel5.setBackground(new java.awt.Color(228, 242, 234));

        jLabel3.setText("№ Referencia");

        jTextFieldRefViv.addActionListener(this::jTextFieldRefVivActionPerformed);

        jLabel4.setText("Direccion");

        jLabel5.setText("M2Vivienda");

        jLabel6.setText("Valor");

        jComboBoxSubTipoViv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASA", "DEPARTAMENTO" }));
        jComboBoxSubTipoViv.addActionListener(this::jComboBoxSubTipoVivActionPerformed);

        jLabel7.setText("Habitaciones");

        jLabel8.setText("Baños");

        jLabel9.setText("Cocinas");

        jLabel10.setText("Tipo de Piso");

        jCheckBoxGas.setText("Red de Gas");

        jCheckBoxPuertaViv.setText("Puerta Blindada");

        jLabel11.setText("Gastos Comunes");

        jComboBoxTipoPiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ceramicos", "Porcelanato", "Madera", "Laminados", "Vinilicos", "Piedra Natural" }));
        jComboBoxTipoPiso.addActionListener(this::jComboBoxTipoPisoActionPerformed);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setMaximumSize(new java.awt.Dimension(94, 47));
        jPanel10.setMinimumSize(new java.awt.Dimension(94, 47));

        jButtonCargarTxT1.setBackground(new java.awt.Color(111, 155, 144));
        jButtonCargarTxT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/open_blanco.png"))); // NOI18N
        jButtonCargarTxT1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCargarTxT1.setIconTextGap(0);
        jButtonCargarTxT1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonCargarTxT1.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT1.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT1.setOpaque(true);
        jButtonCargarTxT1.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT1.addActionListener(this::jButtonCargarTxT1ActionPerformed);

        jButtonGuardarTxT1.setBackground(new java.awt.Color(111, 155, 144));
        jButtonGuardarTxT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/save_blanco.png"))); // NOI18N
        jButtonGuardarTxT1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGuardarTxT1.setIconTextGap(0);
        jButtonGuardarTxT1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonGuardarTxT1.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT1.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT1.setOpaque(true);
        jButtonGuardarTxT1.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT1.addActionListener(this::jButtonGuardarTxT1ActionPerformed);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCargarTxT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonGuardarTxT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardarTxT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCargarTxT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(204, 255, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonAgregarVivienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/add_blanco.png"))); // NOI18N
        jButtonAgregarVivienda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAgregarVivienda.setIconTextGap(0);
        jButtonAgregarVivienda.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonAgregarVivienda.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonAgregarVivienda.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonAgregarVivienda.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonAgregarVivienda.addActionListener(this::jButtonAgregarViviendaActionPerformed);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/remove_blanco.png"))); // NOI18N
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(0);
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.setMaximumSize(new java.awt.Dimension(30, 31));
        jButton2.setMinimumSize(new java.awt.Dimension(30, 31));
        jButton2.setPreferredSize(new java.awt.Dimension(30, 31));
        jButton2.addActionListener(this::jButton2ActionPerformed);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAgregarVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregarVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldRefViv, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jTextFieldDirViv)
                            .addComponent(jTextFieldM2Viv)
                            .addComponent(jTextFieldValorViv))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCocinas, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipoPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jTextFieldBanos))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jCheckBoxGas)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBoxPuertaViv))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldGastosComunes, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(111, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jComboBoxSubTipoViv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxSubTipoViv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldRefViv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldDirViv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldCocinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jTextFieldM2Viv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldValorViv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxGas)
                            .addComponent(jCheckBoxPuertaViv))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldBanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldGastosComunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jComboBoxTipoPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );

        jTabbedPane2.addTab("Vivienda", jPanel5);

        jPanel8.setBackground(new java.awt.Color(228, 242, 234));

        jComboBoxTipoComercial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LOCAL", "BODEGA" }));
        jComboBoxTipoComercial.addActionListener(this::jComboBoxTipoComercialActionPerformed);

        jLabel12.setText("№ Referencia");

        jLabel13.setText("Direccion");

        jLabel14.setText("Valor");

        jLabel15.setText("Numero Puertas acceso");

        jCheckBoxVentanasCom.setText("Tiene Ventanas");
        jCheckBoxVentanasCom.addActionListener(this::jCheckBoxVentanasComActionPerformed);

        jComboBoxEstadoCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACONDICIONADO", "PLANTA_LIBRE" }));

        jLabel29.setText("M2");

        jTextFieldM2Com.addActionListener(this::jTextFieldM2ComActionPerformed);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonCargarTxT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/open_blanco.png"))); // NOI18N
        jButtonCargarTxT2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCargarTxT2.setIconTextGap(0);
        jButtonCargarTxT2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonCargarTxT2.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT2.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT2.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT2.addActionListener(this::jButtonCargarTxT2ActionPerformed);

        jButtonGuardarTxT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/save_blanco.png"))); // NOI18N
        jButtonGuardarTxT2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGuardarTxT2.setIconTextGap(0);
        jButtonGuardarTxT2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonGuardarTxT2.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT2.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT2.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT2.addActionListener(this::jButtonGuardarTxT2ActionPerformed);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCargarTxT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonGuardarTxT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardarTxT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCargarTxT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(204, 255, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonAgregarComercial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/add_blanco.png"))); // NOI18N
        jButtonAgregarComercial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAgregarComercial.setIconTextGap(0);
        jButtonAgregarComercial.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonAgregarComercial.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonAgregarComercial.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonAgregarComercial.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonAgregarComercial.addActionListener(this::jButtonAgregarComercialActionPerformed);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/remove_blanco.png"))); // NOI18N
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(0);
        jButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton3.setMaximumSize(new java.awt.Dimension(30, 31));
        jButton3.setMinimumSize(new java.awt.Dimension(30, 31));
        jButton3.setPreferredSize(new java.awt.Dimension(30, 31));
        jButton3.addActionListener(this::jButton3ActionPerformed);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAgregarComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAgregarComercial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxTipoComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel29))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldDirCom)
                                    .addComponent(jTextFieldM2Com, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldNPuertasAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBoxEstadoCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxVentanasCom)))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldRefCom)
                                .addComponent(jTextFieldValorCom, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(131, 131, 131)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jComboBoxTipoComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldRefCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldM2Com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel29)
                                        .addComponent(jCheckBoxVentanasCom))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(jTextFieldDirCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxEstadoCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(jTextFieldValorCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldNPuertasAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Comercial", jPanel8);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Inmuebles", jPanel2);

        jPanel3.setBackground(new java.awt.Color(228, 242, 234));

        jLabel16.setText("Fecha Visita");

        jLabel17.setText("Rut Cliente");

        jLabel18.setText("Codigo Referencia ");

        jTableVisitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableVisitas.setPreferredSize(new java.awt.Dimension(835, 278));
        jScrollPane4.setViewportView(jTableVisitas);

        jLabel20.setText("Rut Agente");

        jLabel19.setText("Comentario");

        jTextAreaComentarioVisita.setColumns(20);
        jTextAreaComentarioVisita.setRows(5);
        jScrollPane2.setViewportView(jTextAreaComentarioVisita);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CAS", "DEP", "LOC", "BOD" }));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonCargarTxT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/open_blanco.png"))); // NOI18N
        jButtonCargarTxT3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCargarTxT3.setIconTextGap(0);
        jButtonCargarTxT3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonCargarTxT3.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT3.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT3.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT3.addActionListener(this::jButtonCargarTxT3ActionPerformed);

        jButtonGuardarTxT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/save_blanco.png"))); // NOI18N
        jButtonGuardarTxT3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGuardarTxT3.setIconTextGap(0);
        jButtonGuardarTxT3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonGuardarTxT3.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT3.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT3.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT3.addActionListener(this::jButtonGuardarTxT3ActionPerformed);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCargarTxT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonGuardarTxT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardarTxT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCargarTxT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(204, 255, 204));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonRegistarVisita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/add_blanco.png"))); // NOI18N
        jButtonRegistarVisita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRegistarVisita.setIconTextGap(0);
        jButtonRegistarVisita.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonRegistarVisita.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonRegistarVisita.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonRegistarVisita.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonRegistarVisita.addActionListener(this::jButtonRegistarVisitaActionPerformed);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/remove_blanco.png"))); // NOI18N
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setIconTextGap(0);
        jButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton4.setMaximumSize(new java.awt.Dimension(30, 31));
        jButton4.setMinimumSize(new java.awt.Dimension(30, 31));
        jButton4.setPreferredSize(new java.awt.Dimension(30, 31));
        jButton4.addActionListener(this::jButton4ActionPerformed);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegistarVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistarVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel20))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldRutAgenteVisita, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldRutClienteVisita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldFechaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldRefInmuebleVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldFechaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldRefInmuebleVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextFieldRutClienteVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTextFieldRutAgenteVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Visitas", jPanel3);

        jPanel4.setBackground(new java.awt.Color(228, 242, 234));

        jComboBoxTipoOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VENTA", "ARRIENDO" }));

        jTableCierre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableCierre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableCierre.setPreferredSize(new java.awt.Dimension(835, 203));
        jScrollPane5.setViewportView(jTableCierre);

        jLabel21.setText("N Referencia Inmueble ");

        jLabel22.setText("Rut Cliente");

        jLabel23.setText("Rut Agente");

        jLabel24.setText("Rut Gerente");

        jLabel25.setText("Precio Acordado");

        jButtonCalcularMetricas.setText("CalcularMetricas");
        jButtonCalcularMetricas.addActionListener(this::jButtonCalcularMetricasActionPerformed);

        jLabel26.setText("Total Ventas");

        jLabel27.setText("Total Arriendo");

        jLabel28.setText("Comisiones Globales");

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonCargarTxT4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/open_blanco.png"))); // NOI18N
        jButtonCargarTxT4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCargarTxT4.setIconTextGap(0);
        jButtonCargarTxT4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonCargarTxT4.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT4.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT4.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonCargarTxT4.addActionListener(this::jButtonCargarTxT4ActionPerformed);

        jButtonGuardarTxT4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/save_blanco.png"))); // NOI18N
        jButtonGuardarTxT4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGuardarTxT4.setIconTextGap(0);
        jButtonGuardarTxT4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonGuardarTxT4.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT4.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT4.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonGuardarTxT4.addActionListener(this::jButtonGuardarTxT4ActionPerformed);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCargarTxT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonGuardarTxT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardarTxT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCargarTxT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(204, 255, 204));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/remove_blanco.png"))); // NOI18N
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setIconTextGap(0);
        jButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton5.setMaximumSize(new java.awt.Dimension(30, 31));
        jButton5.setMinimumSize(new java.awt.Dimension(30, 31));
        jButton5.setPreferredSize(new java.awt.Dimension(30, 31));
        jButton5.addActionListener(this::jButton5ActionPerformed);

        jButtonRegistrarCierre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/add_blanco.png"))); // NOI18N
        jButtonRegistrarCierre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRegistrarCierre.setIconTextGap(0);
        jButtonRegistrarCierre.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonRegistrarCierre.setMaximumSize(new java.awt.Dimension(30, 31));
        jButtonRegistrarCierre.setMinimumSize(new java.awt.Dimension(30, 31));
        jButtonRegistrarCierre.setPreferredSize(new java.awt.Dimension(30, 31));
        jButtonRegistrarCierre.addActionListener(this::jButtonRegistrarCierreActionPerformed);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegistrarCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegistrarCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCalcularMetricas)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelComisionesGlobales, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelTotalArriendos1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addGap(77, 77, 77)
                                    .addComponent(jLabelTotalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxTipoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldRutAgenteCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addGap(15, 15, 15)
                                                .addComponent(jTextFieldRutGerenteCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel25))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldRefInmuebleCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldPrecioAcordado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldRutClienteCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBoxTipoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jTextFieldRutAgenteCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jTextFieldRefInmuebleCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jTextFieldRutGerenteCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jTextFieldPrecioAcordado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jTextFieldRutClienteCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCalcularMetricas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabelTotalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel27)
                    .addComponent(jLabelTotalArriendos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelComisionesGlobales, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Operaciones y Reportes", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRefVivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRefVivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRefVivActionPerformed

    private void jButtonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarClienteActionPerformed
        // CAPTURAR los textos ingresados por el usuario
        String rut = jTextFieldRutCliente.getText().trim();
        String nombre = jTextFieldN_CompletoCliente.getText().trim();
    
        // VALIDACIONES iniciales y formato de RUT chileno
        if (Validaciones.campoVacio(rut) || Validaciones.campoVacio(nombre)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe completar RUT y nombre del cliente.");
            return;
        }
        if (!ValidarRutSimple.validarRutSimple(rut)) {
            javax.swing.JOptionPane.showMessageDialog(this, "El RUT debe tener un formato válido. Ejemplo: 12.345.678-9 o 12345678-9.");
            return;
        }
        if (rut.isEmpty() || nombre.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete tanto el RUT como el Nombre del cliente.", "Campos Vacíos", javax.swing.JOptionPane.WARNING_MESSAGE);
            return; 
        }

    
        Cliente nuevoCliente = new Cliente(rut, nombre);

        // OBTENER el modelo de la tabla para poder manipular sus filas
        DefaultTableModel modeloTabla = (DefaultTableModel) jTableClientes.getModel();

        // AGREGAR la fila rescatando los datos del objeto usando herencia de Personal
        modeloTabla.addRow(new Object[]{
            nuevoCliente.getRut(),             
            nuevoCliente.getNombre_Completo()  
        });

        // LIMPIAR los campos de texto
        jTextFieldRutCliente.setText("");
        jTextFieldN_CompletoCliente.setText("");
        jTextFieldRutCliente.requestFocus();
    
        javax.swing.JOptionPane.showMessageDialog(this, "Cliente agregado exitosamente a la lista.");

    }//GEN-LAST:event_jButtonAgregarClienteActionPerformed

    private void jButtonAgregarViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarViviendaActionPerformed
        // CAPTURAR los datos comunes y específicos
        String subtipo = jComboBoxSubTipoViv.getSelectedItem().toString(); 
        String refIngresada = jTextFieldRefViv.getText().trim();
        String direccion = jTextFieldDirViv.getText().trim();
        String m2Str = jTextFieldM2Viv.getText().trim();
        String valorStr = jTextFieldValorViv.getText().trim();
        String habitaciones = jTextFieldHabitaciones.getText().trim();
        String banos = jTextFieldBanos.getText().trim();
        String cocinas = jTextFieldCocinas.getText().trim();
        String tipoPiso = jComboBoxTipoPiso.getSelectedItem().toString();

        // Convertir estados de CheckBox a texto legibles
        String redGas = jCheckBoxGas.isSelected() ? "c/Gas" : "";
        String puertaBlindada = jCheckBoxPuertaViv.isSelected() ? "Blindada" : "Normal";

        // VALIDAR campos obligatorios
        if (refIngresada.isEmpty() || direccion.isEmpty() || m2Str.isEmpty() || valorStr.isEmpty() || habitaciones.isEmpty() || banos.isEmpty() || cocinas.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos de la vivienda.", "Campos Vacíos", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Validamos que los números sean correctos
            int m2 = Integer.parseInt(m2Str);
            double valor = Double.parseDouble(valorStr);
            int habs = Integer.parseInt(habitaciones);
            int bns = Integer.parseInt(banos);
            int cocs = Integer.parseInt(cocinas);
        
            boolean gasBool = jCheckBoxGas.isSelected();
            boolean puertaBool = jCheckBoxPuertaViv.isSelected();

            String prefijo = subtipo.equalsIgnoreCase("CASA")
                ? "CAS-"
                : "DEP-";
            String refFinal = prefijo + refIngresada;
            
            double precioInitial = 0.0; // Exigido por herencia

            Vivienda nuevaVivienda = new Vivienda(
                habs, bns, cocs, gasBool, puertaBool, tipoPiso, 
                refFinal, direccion, m2, valor, precioInitial
            );

            // Estructuración de textos dinámicos desde el objeto creado
            String distribucion = nuevaVivienda.getHabitaciones() + " H, " + nuevaVivienda.getBanos() + " B, " + nuevaVivienda.getCocinas() + " C";
            String caracteristicas = redGas + " / " + puertaBlindada + " / " + (nuevaVivienda.getTipoPiso().isEmpty() ? "No especificado" : nuevaVivienda.getTipoPiso());
    
            if (subtipo.equalsIgnoreCase("DEPARTAMENTO") && !jTextFieldGastosComunes.getText().trim().isEmpty()) {
                caracteristicas += " / GGCC: $" + jTextFieldGastosComunes.getText().trim();
            }

            // AGREGAR a la tabla única de inmuebles usando herencia de Inmobiliaria
            DefaultTableModel modelo = (DefaultTableModel) jTableInmueble.getModel();
            modelo.addRow(new Object[]{
                subtipo, 
                nuevaVivienda.getNumeroReferencia(), 
                nuevaVivienda.getDireccion(), 
                nuevaVivienda.getSuperficieM2(), 
                nuevaVivienda.getValorTasacion(), 
                distribucion, 
                caracteristicas 
            });

            // LIMPIAR el formulario de vivienda
            jTextFieldRefViv.setText("");
            jTextFieldDirViv.setText("");
            jTextFieldM2Viv.setText("");
            jTextFieldValorViv.setText("");
            jTextFieldHabitaciones.setText("");
            jTextFieldBanos.setText("");
            jTextFieldCocinas.setText("");
            jComboBoxTipoPiso.setSelectedIndex(0);
            jTextFieldGastosComunes.setText("");
            jCheckBoxGas.setSelected(false);
            jCheckBoxPuertaViv.setSelected(false);

            javax.swing.JOptionPane.showMessageDialog(this, "Vivienda agregada exitosamente.");

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Superficie, Valor, Habitaciones, Baños y Cocinas deben ser números válidos.", "Error de Formato", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAgregarViviendaActionPerformed

    private void jButtonAgregarComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarComercialActionPerformed
        // CAPTURAR los datos comunes y específicos
        String tipo = jComboBoxTipoComercial.getSelectedItem().toString(); 
        String refIngresada = jTextFieldRefCom.getText().trim();
        String direccion = jTextFieldDirCom.getText().trim();
        String m2Str = jTextFieldM2Com.getText().trim();
        String valorStr = jTextFieldValorCom.getText().trim();
        String puertasStr = jTextFieldNPuertasAcceso.getText().trim();
    
        boolean tieneVentanas = jCheckBoxVentanasCom.isSelected();
        boolean esAcondicionado = jComboBoxEstadoCom.getSelectedItem().toString().equalsIgnoreCase("Acondicionado");

        // VALIDAR campos obligatorios
        if (refIngresada.isEmpty() || direccion.isEmpty() || m2Str.isEmpty() || valorStr.isEmpty() || puertasStr.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos.", "Campos Vacíos", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int m2 = Integer.parseInt(m2Str);
            double valor = Double.parseDouble(valorStr);
            int nPuertas = Integer.parseInt(puertasStr);
            String prefijo = tipo.equalsIgnoreCase("LOCAL") ? "LOC-" : "BOD-";
            String refFinal = prefijo + refIngresada;
            double precioInicial = 0.0; 
        
            DefaultTableModel modelo = (DefaultTableModel) jTableInmueble.getModel();
            String distribucion = "-";
            String caracteristicas = "";

            if (tipo.equalsIgnoreCase("BODEGA")) {
                Bodega nuevaBodega = new Bodega(
                    nPuertas, tieneVentanas, esAcondicionado, refFinal, direccion, m2, valor, precioInicial
            );

            caracteristicas = nuevaBodega.getNum_Puertas_Acceso() + " puertas de acceso / " + 
                              (nuevaBodega.isTiene_Ventanas() ? "c/Ventanas" : "s/Ventanas") + " / Estado: " + 
                              (nuevaBodega.isEs_acondicionado() ? "Acondicionado" : "Planta Libre");

            modelo.addRow(new Object[]{
                tipo, nuevaBodega.getNumeroReferencia(), nuevaBodega.getDireccion(),
                nuevaBodega.getSuperficieM2(), nuevaBodega.getValorTasacion(), distribucion, caracteristicas
            });

            } else {
                Local_Comercial nuevoLocal = new Local_Comercial(
                    nPuertas, tieneVentanas, esAcondicionado, refFinal, direccion, m2, valor, precioInicial
                );

                caracteristicas = nuevoLocal.getNum_Puertas_acceso() + " puertas de acceso / " + 
                                (nuevoLocal.isTieneVentanas() ? "Con ventanas" : "Sin ventanas") + " / Estado: " + 
                                (nuevoLocal.isEs_Acondicionado() ? "Acondicionado" : "Planta Libre");

                modelo.addRow(new Object[]{
                    tipo, nuevoLocal.getNumeroReferencia(), nuevoLocal.getDireccion(),
                    nuevoLocal.getSuperficieM2(), nuevoLocal.getValorTasacion(), distribucion, caracteristicas
                });
            }

            // LIMPIAR el formulario comercial
            jTextFieldRefCom.setText("");
            jTextFieldDirCom.setText("");
            jTextFieldM2Com.setText("");
            jTextFieldValorCom.setText("");
            jTextFieldNPuertasAcceso.setText("");
            jCheckBoxVentanasCom.setSelected(false);
            jComboBoxEstadoCom.setSelectedIndex(0);

            javax.swing.JOptionPane.showMessageDialog(this, tipo + " agregad@ exitosamente.");

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Superficie, Valor y Puertas deben ser valores numéricos válidos.", "Error de Formato", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAgregarComercialActionPerformed

    private void jTextFieldM2ComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldM2ComActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldM2ComActionPerformed

    private void jButtonRegistrarCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarCierreActionPerformed
        // CAPTURAR los datos del formulario
        String tipoOp = jComboBoxTipoOperacion.getSelectedItem().toString();
        String refInmueble = jTextFieldRefInmuebleCierre.getText().trim().toUpperCase();
        String rutCliente = jTextFieldRutClienteCierre.getText().trim();
        String rutAgente = jTextFieldRutAgenteCierre.getText().trim();
        String rutGerente = jTextFieldRutGerenteCierre.getText().trim();
        String precioStr = jTextFieldPrecioAcordado.getText().trim();

        // VALIDAR que no haya campos vacíos
        if (refInmueble.isEmpty() || rutCliente.isEmpty() || rutAgente.isEmpty() || rutGerente.isEmpty() || precioStr.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos para cerrar la operación.", "Campos Vacíos", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            double precioAcordado = Double.parseDouble(precioStr);
            Operaciones.OperacionCierre nuevoCierre = new Operaciones.OperacionCierre(tipoOp, precioAcordado, rutCliente, rutAgente, rutGerente);

            DefaultTableModel modelo = (DefaultTableModel) jTableCierre.getModel();

            // AGREGAR la fila mapeando desde el objeto
            modelo.addRow(new Object[]{
                nuevoCierre.getTipo(),
                refInmueble,                                    
                nuevoCierre.getCliente().getRut(),              
                rutAgente,                                      
                rutGerente,                                     
                nuevoCierre.getPrecio_Acordado()                
            });

            // LIMPIAR el formulario de cierres
            jTextFieldRefInmuebleCierre.setText("");
            jTextFieldRutClienteCierre.setText("");
            jTextFieldRutAgenteCierre.setText("");
            jTextFieldRutGerenteCierre.setText("");
            jTextFieldPrecioAcordado.setText("");
            jComboBoxTipoOperacion.setSelectedIndex(0);

            javax.swing.JOptionPane.showMessageDialog(this, "Operación de " + nuevoCierre.getTipo() + " cerrada con éxito.");
            calcularMetricas();

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "El precio acordado debe ser un número válido.", "Error de Formato", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRegistrarCierreActionPerformed

    private void jButtonGuardarTxTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarTxTActionPerformed
        guardarTodoTXT();
    }//GEN-LAST:event_jButtonGuardarTxTActionPerformed

    private void jButtonCargarTxTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarTxTActionPerformed
        cargarDatosDesdeTXT();
    }//GEN-LAST:event_jButtonCargarTxTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        eliminarFila(jTableClientes, "Cliente");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        eliminarFila(jTableInmueble, "Vivienda");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        eliminarFila(jTableInmueble, "Comercial");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        eliminarFila(jTableCierre, "Registro");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButtonCalcularMetricasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularMetricasActionPerformed
        calcularMetricas();
    }//GEN-LAST:event_jButtonCalcularMetricasActionPerformed

    private void jTextFieldRutClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRutClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRutClienteActionPerformed

    private void jComboBoxSubTipoVivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSubTipoVivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSubTipoVivActionPerformed

    private void jComboBoxTipoPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoPisoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        eliminarFila(jTableVisitas, "Visita");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonRegistarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarVisitaActionPerformed
        // CAPTURAR los datos (Formato exigido en fecha: AAAA-MM-DD)
        String fechaStr = jTextFieldFechaVisita.getText().trim();
        String rutCliente = jTextFieldRutClienteVisita.getText().trim();
        String prefijo = jComboBox1.getSelectedItem().toString();
        String numeroRef = jTextFieldRefInmuebleVisita.getText().trim().toUpperCase();
        String refInmueble = prefijo + "-" + numeroRef;
        if (!existeInmueble(refInmueble)) {
            javax.swing.JOptionPane.showMessageDialog(
                this,
                "La referencia de inmueble ingresada no existe.",
                "Inmueble no encontrado",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        String rutAgente = jTextFieldRutAgenteVisita.getText().trim();
        String comentario = jTextAreaComentarioVisita.getText().trim();

        // VALIDAR campos obligatorios
        if (fechaStr.isEmpty() || rutCliente.isEmpty() || refInmueble.isEmpty() || rutAgente.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete los campos obligatorios para registrar la visita.", "Campos Vacíos", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String comentarioFinal = comentario.isEmpty() ? "Sin comentarios" : comentario;

        try {

            Operaciones.Visitas nuevaVisita = new Operaciones.Visitas(fechaStr, comentarioFinal, rutCliente, refInmueble, rutAgente);

            DefaultTableModel modelo = (DefaultTableModel) jTableVisitas.getModel();

            // AGREGAR rescatando los datos del objeto estructurado
            modelo.addRow(new Object[]{
                nuevaVisita.getFecha().toString(),
                nuevaVisita.getCliente().getRut(),
                refInmueble,
                rutAgente,
                nuevaVisita.getComentario()
            });

            // LIMPIAR el formulario de visitas
            jTextFieldFechaVisita.setText("");
            jTextFieldRutClienteVisita.setText("");
            jTextFieldRefInmuebleVisita.setText("");
            jTextFieldRutAgenteVisita.setText("");
            jTextAreaComentarioVisita.setText("");
            jTextFieldFechaVisita.requestFocus();

            javax.swing.JOptionPane.showMessageDialog(this, "Visita registrada exitosamente.");

        } catch (java.time.format.DateTimeParseException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese la fecha en formato AAAA-MM-DD. Ejemplo: 2026-06-20", "Error de Fecha", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRegistarVisitaActionPerformed

    private void jCheckBoxVentanasComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxVentanasComActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxVentanasComActionPerformed

    private void jComboBoxTipoComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoComercialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoComercialActionPerformed

    private void jButtonCargarTxT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarTxT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCargarTxT1ActionPerformed

    private void jButtonGuardarTxT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarTxT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGuardarTxT1ActionPerformed

    private void jButtonCargarTxT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarTxT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCargarTxT2ActionPerformed

    private void jButtonGuardarTxT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarTxT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGuardarTxT2ActionPerformed

    private void jButtonCargarTxT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarTxT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCargarTxT3ActionPerformed

    private void jButtonGuardarTxT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarTxT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGuardarTxT3ActionPerformed

    private void jButtonCargarTxT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarTxT4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCargarTxT4ActionPerformed

    private void jButtonGuardarTxT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarTxT4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGuardarTxT4ActionPerformed

    private void calcularMetricas() {

        DefaultTableModel modeloCierres = (DefaultTableModel) jTableCierre.getModel();

        double sumaVentas = 0;
        double sumaArriendos = 0;
        double totalComisiones = 0;

        for (int i = 0; i < modeloCierres.getRowCount(); i++) {
            String tipoOp = modeloCierres.getValueAt(i, 0).toString();
            double precioCierre = Double.parseDouble(modeloCierres.getValueAt(i, 5).toString());

            if (tipoOp.equalsIgnoreCase("VENTA")) {
                sumaVentas += precioCierre;
            } else if (tipoOp.equalsIgnoreCase("ARRIENDO")) {
                sumaArriendos += precioCierre;
            }
            totalComisiones += (precioCierre * 0.07); 
        }

        jLabelTotalVentas.setText("Total Ventas: $" + String.format("%.0f", sumaVentas));
        jLabelTotalArriendos1.setText("Total Arriendos: $" + String.format("%.0f", sumaArriendos));
        jLabelComisionesGlobales.setText("Comisiones Globales: $" + String.format("%.0f", totalComisiones));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        javax.swing.UIManager.put("TabbedPane.contentBorderInsets", new java.awt.Insets(0, 0, 0, 0));
        javax.swing.UIManager.put("TabbedPane.tabsOverlapBorder", true);
        javax.swing.UIManager.put("TabbedPane.selected", new java.awt.Color(0xD8E8E0));
        try {
        javax.swing.UIManager.setLookAndFeel(
            javax.swing.UIManager.getSystemLookAndFeelClassName()
        );
    } catch (Exception e) {
        e.printStackTrace();
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Ventana_Principal().setVisible(true);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonAgregarCliente;
    private javax.swing.JButton jButtonAgregarComercial;
    private javax.swing.JButton jButtonAgregarVivienda;
    private javax.swing.JButton jButtonCalcularMetricas;
    private javax.swing.JButton jButtonCargarTxT;
    private javax.swing.JButton jButtonCargarTxT1;
    private javax.swing.JButton jButtonCargarTxT2;
    private javax.swing.JButton jButtonCargarTxT3;
    private javax.swing.JButton jButtonCargarTxT4;
    private javax.swing.JButton jButtonGuardarTxT;
    private javax.swing.JButton jButtonGuardarTxT1;
    private javax.swing.JButton jButtonGuardarTxT2;
    private javax.swing.JButton jButtonGuardarTxT3;
    private javax.swing.JButton jButtonGuardarTxT4;
    private javax.swing.JButton jButtonRegistarVisita;
    private javax.swing.JButton jButtonRegistrarCierre;
    private javax.swing.JCheckBox jCheckBoxGas;
    private javax.swing.JCheckBox jCheckBoxPuertaViv;
    private javax.swing.JCheckBox jCheckBoxVentanasCom;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxEstadoCom;
    private javax.swing.JComboBox<String> jComboBoxSubTipoViv;
    private javax.swing.JComboBox<String> jComboBoxTipoComercial;
    private javax.swing.JComboBox<String> jComboBoxTipoOperacion;
    private javax.swing.JComboBox<String> jComboBoxTipoPiso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelComisionesGlobales;
    private javax.swing.JLabel jLabelTotalArriendos1;
    private javax.swing.JLabel jLabelTotalVentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTableCierre;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableInmueble;
    private javax.swing.JTable jTableVisitas;
    private javax.swing.JTextArea jTextAreaComentarioVisita;
    private javax.swing.JTextField jTextFieldBanos;
    private javax.swing.JTextField jTextFieldCocinas;
    private javax.swing.JTextField jTextFieldDirCom;
    private javax.swing.JTextField jTextFieldDirViv;
    private javax.swing.JTextField jTextFieldFechaVisita;
    private javax.swing.JTextField jTextFieldGastosComunes;
    private javax.swing.JTextField jTextFieldHabitaciones;
    private javax.swing.JTextField jTextFieldM2Com;
    private javax.swing.JTextField jTextFieldM2Viv;
    private javax.swing.JTextField jTextFieldNPuertasAcceso;
    private javax.swing.JTextField jTextFieldN_CompletoCliente;
    private javax.swing.JTextField jTextFieldPrecioAcordado;
    private javax.swing.JTextField jTextFieldRefCom;
    private javax.swing.JTextField jTextFieldRefInmuebleCierre;
    private javax.swing.JTextField jTextFieldRefInmuebleVisita;
    private javax.swing.JTextField jTextFieldRefViv;
    private javax.swing.JTextField jTextFieldRutAgenteCierre;
    private javax.swing.JTextField jTextFieldRutAgenteVisita;
    private javax.swing.JTextField jTextFieldRutCliente;
    private javax.swing.JTextField jTextFieldRutClienteCierre;
    private javax.swing.JTextField jTextFieldRutClienteVisita;
    private javax.swing.JTextField jTextFieldRutGerenteCierre;
    private javax.swing.JTextField jTextFieldValorCom;
    private javax.swing.JTextField jTextFieldValorViv;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
