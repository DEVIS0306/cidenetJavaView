/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.api.representation.Form;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import sun.net.www.http.HttpClient;
import utilities.ModeloDeTabla;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.ws.rs.core.MediaType;
import model.Area;
import model.Country;
import model.Dominio;
import model.Empleado;
import model.Identificacion;
import model.Pais;
import netscape.javascript.JSObject;



/**
 *
 * @author Darwing Hernandez
 */
public class Principal extends javax.swing.JFrame {
    
    public JComboBox<Integer> pageJComboBox;

    
    public JTable tbl_tablab;
    public JPanel paginationPanel;
    boolean flagSaveOrUpdate = true;
    List<Empleado> listEmpleados;

    /**
     * Creates new form Registro
     */
    public Principal() {
        initComponents();
        this.setTitle("Cidenet S.A.S.");
        this.setResizable(false);
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/cidenet.png"));
        this.setIconImage(ico);
        this.setLocationRelativeTo(this);
//       tbl_tablad.setModel(crearModeloDeTabla());

        tbl_tablad.getTableHeader().setFont(new Font("segoe UI", Font.BOLD, 12));
        tbl_tablad.getTableHeader().setOpaque(false);
        tbl_tablad.getTableHeader().setBackground(new Color(11, 38, 88));
        tbl_tablad.getTableHeader().setForeground(new Color(255, 255, 255));
        tbl_tablad.setRowHeight(25);
        llenar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new org.edisoncor.gui.panel.Panel();
        Panel2 = new org.edisoncor.gui.panel.PanelShadow();
        jLabel7 = new javax.swing.JLabel();
        btnModificar = new rojeru_san.RSButtonRiple();
        btnGuardar = new rojeru_san.RSButtonRiple();
        btnBorrar = new rojeru_san.RSButtonRiple();
        txtBuscar = new org.edisoncor.gui.textField.TextField();
        tableSroll = new javax.swing.JScrollPane();
        tbl_tablad = new javax.swing.JTable();
        comboIdentidad = new rojerusan.RSComboMetro();
        comboArea = new rojerusan.RSComboMetro();
        comboPais = new rojerusan.RSComboMetro();
        txtApellP = new rojerusan.RSMetroTextFullPlaceHolder();
        txtApellS = new rojerusan.RSMetroTextFullPlaceHolder();
        txtNomP = new rojerusan.RSMetroTextFullPlaceHolder();
        txtNomS = new rojerusan.RSMetroTextFullPlaceHolder();
        txtNIdentificacion = new rojerusan.RSMetroTextFullPlaceHolder();
        txtCorreo = new rojerusan.RSMetroTextFullPlaceHolder();
        txtFechaRegi = new rojerusan.RSDateChooser();
        comboBuscar = new rojerusan.RSComboMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1.setColorPrimario(new java.awt.Color(0, 0, 102));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar");
        Panel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 90, 40));

        btnModificar.setBackground(new java.awt.Color(0, 204, 102));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        Panel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 100, 40));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        Panel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 140, 40));

        btnBorrar.setBackground(new java.awt.Color(153, 0, 0));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        Panel2.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 90, 40));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        Panel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 360, 30));

        tableSroll.setPreferredSize(new java.awt.Dimension(683, 280));

        tbl_tablab  = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbl_tablad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "P.APELL", "S.APELL", "P.NOM", "S.NOM", "PAIS", "IDENTIFICACION", "N.IDENTIFICACION", "CORREO", "AREA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_tablad.setFocusable(false);
        tbl_tablad.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_tablad.setSelectionBackground(new java.awt.Color(11, 38, 88));
        tbl_tablad.getTableHeader().setReorderingAllowed(false);
        tableSroll.setViewportView(tbl_tablad);

        Panel2.add(tableSroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 860, 180));

        comboIdentidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IDENTIFICACION", "Cedula de ciudadania", "Cedula de Extrangeria", "Pasaporte", "Permiso Especial" }));
        comboIdentidad.setColorArrow(new java.awt.Color(0, 0, 0));
        comboIdentidad.setColorBorde(new java.awt.Color(0, 0, 0));
        comboIdentidad.setColorFondo(new java.awt.Color(0, 0, 0));
        comboIdentidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        comboIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdentidadActionPerformed(evt);
            }
        });
        Panel2.add(comboIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 250, 40));

        comboArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AREA", "Administacion", "Financiera", "Compras", "Infraestructura", "Operacion", "Talento Humano", "Servicios Varios", "Etc" }));
        comboArea.setColorArrow(new java.awt.Color(0, 0, 0));
        comboArea.setColorBorde(new java.awt.Color(0, 0, 0));
        comboArea.setColorFondo(new java.awt.Color(0, 0, 0));
        comboArea.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        comboArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAreaActionPerformed(evt);
            }
        });
        Panel2.add(comboArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 250, 40));

        comboPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PAIS", "COLOMBIA", "ESTADOS UNIDOS" }));
        comboPais.setColorArrow(new java.awt.Color(0, 0, 0));
        comboPais.setColorBorde(new java.awt.Color(0, 0, 0));
        comboPais.setColorFondo(new java.awt.Color(0, 0, 0));
        comboPais.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        comboPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaisActionPerformed(evt);
            }
        });
        Panel2.add(comboPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 250, 40));

        txtApellP.setForeground(new java.awt.Color(0, 0, 0));
        txtApellP.setBorderColor(new java.awt.Color(0, 0, 0));
        txtApellP.setBotonColor(new java.awt.Color(0, 0, 0));
        txtApellP.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtApellP.setMayusculas(true);
        txtApellP.setPhColor(new java.awt.Color(0, 0, 0));
        txtApellP.setPlaceholder("PRIMER APELLIDO");
        txtApellP.setSoloLetras(true);
        txtApellP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellPActionPerformed(evt);
            }
        });
        Panel2.add(txtApellP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtApellS.setForeground(new java.awt.Color(0, 0, 0));
        txtApellS.setBorderColor(new java.awt.Color(0, 0, 0));
        txtApellS.setBotonColor(new java.awt.Color(0, 0, 0));
        txtApellS.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtApellS.setMayusculas(true);
        txtApellS.setPhColor(new java.awt.Color(0, 0, 0));
        txtApellS.setPlaceholder("SEGUNDO APELLIDO");
        txtApellS.setSoloLetras(true);
        Panel2.add(txtApellS, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        txtNomP.setForeground(new java.awt.Color(0, 0, 0));
        txtNomP.setBorderColor(new java.awt.Color(0, 0, 0));
        txtNomP.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNomP.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtNomP.setMayusculas(true);
        txtNomP.setPhColor(new java.awt.Color(0, 0, 0));
        txtNomP.setPlaceholder("PRIMER NOMBRE");
        txtNomP.setSoloLetras(true);
        txtNomP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomPActionPerformed(evt);
            }
        });
        Panel2.add(txtNomP, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        txtNomS.setForeground(new java.awt.Color(0, 0, 0));
        txtNomS.setBorderColor(new java.awt.Color(0, 0, 0));
        txtNomS.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNomS.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtNomS.setMayusculas(true);
        txtNomS.setPhColor(new java.awt.Color(0, 0, 0));
        txtNomS.setPlaceholder("SEGUNDO NOMBRE");
        txtNomS.setSoloLetras(true);
        Panel2.add(txtNomS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtNIdentificacion.setForeground(new java.awt.Color(0, 0, 0));
        txtNIdentificacion.setBorderColor(new java.awt.Color(0, 0, 0));
        txtNIdentificacion.setBotonColor(new java.awt.Color(0, 0, 0));
        txtNIdentificacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNIdentificacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtNIdentificacion.setMayusculas(true);
        txtNIdentificacion.setPhColor(new java.awt.Color(0, 0, 0));
        txtNIdentificacion.setPlaceholder("NUMERO DE IDENTIFICACION");
        txtNIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIdentificacionActionPerformed(evt);
            }
        });
        Panel2.add(txtNIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        txtCorreo.setEditable(false);
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setBorderColor(new java.awt.Color(0, 0, 0));
        txtCorreo.setBotonColor(new java.awt.Color(0, 0, 0));
        txtCorreo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCorreo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtCorreo.setMayusculas(true);
        txtCorreo.setPhColor(new java.awt.Color(0, 0, 0));
        txtCorreo.setPlaceholder("CORREO");
        Panel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        txtFechaRegi.setColorBackground(new java.awt.Color(0, 0, 0));
        txtFechaRegi.setColorButtonHover(new java.awt.Color(0, 0, 0));
        txtFechaRegi.setColorDiaActual(new java.awt.Color(0, 0, 0));
        txtFechaRegi.setColorForeground(new java.awt.Color(0, 0, 0));
        txtFechaRegi.setColorTextDiaActual(new java.awt.Color(0, 0, 0));
        txtFechaRegi.setFormatoFecha("yyyy-MM-dd");
        txtFechaRegi.setFuente(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtFechaRegi.setPlaceholder("FECHA DE REGISTRO");
        Panel2.add(txtFechaRegi, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 250, 40));

        comboBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filtro", "Primer Nombre", "Otros nombres", "Primer Apellido", "Segundo apeelido" }));
        comboBuscar.setColorArrow(new java.awt.Color(0, 0, 0));
        comboBuscar.setColorBorde(new java.awt.Color(0, 0, 0));
        comboBuscar.setColorFondo(new java.awt.Color(0, 0, 0));
        comboBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        comboBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBuscarActionPerformed(evt);
            }
        });
        Panel2.add(comboBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 250, 40));

        Panel1.add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 930, 640));

        getContentPane().add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
        
         
         
        Guardar();
        txtCorreo.setText("");
        txtNIdentificacion.setText("");


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased



    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        ModificarDatos();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        Borrar();

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void comboAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAreaActionPerformed

    private void comboPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPaisActionPerformed

    private void comboIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboIdentidadActionPerformed

    private void txtNIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIdentificacionActionPerformed

    private void txtApellPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellPActionPerformed

    private void txtNomPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomPActionPerformed

    private void comboBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBuscarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
       listEmpleados = listEmpleados.stream().filter(emp -> emp.getPrimerNombre().contains(txtBuscar.getText())).collect(Collectors.toList());
        DefaultTableModel defaultTableModel = new DefaultTableModel();
    String[] cabezera  = {
                "ID", "P.APELL", "S.APELL", "P.NOM", "S.NOM", "PAIS", "IDENTIFICACION", "N.IDENTIFICACION", "CORREO", "AREA"
            };
    defaultTableModel.setColumnIdentifiers(cabezera);
    Object[] data = new Object[10]; 
   listEmpleados.stream().forEach((t) -> {
    data[0] = t.getId();
    data[1] = t.getPrimerApellido();
    data[2] = t.getSegundoApellido();
    data[3] = t.getPrimerNombre();
    data[4] = t.getOtrosNombre();
    data[5] = t.getPais().getDescripcion();
    data[6] = t.getIdentificacion();
    data[7] = t.getNumeroIdentificacion();
    data[8] = t.getEmail();
    data[9] = t.getArea();
       
     defaultTableModel.addRow(data);
   });
     
       tbl_tablad.setModel(defaultTableModel);       
    }//GEN-LAST:event_txtBuscarKeyTyped
  

    public void Guardar() {
         Empleado empleado = new Empleado();
         empleado.setPrimerApellido(txtApellP.getText());
         empleado.setSegundoApellido(txtApellS.getText());
         empleado.setPrimerNombre(txtNomP.getText());
         empleado.setOtrosNombre(txtNomS.getText());
         if (comboPais.getSelectedItem().toString().equals("COLOMBIA")) {
            empleado.setPais(Pais.COLOMBIA);
        }else if (comboPais.getSelectedItem().toString().equals("ESTADOS UNIDOS")) {
            empleado.setPais(Pais.USA);
        }
        
         
         switch(comboIdentidad.getSelectedItem().toString()){
             case "Cedula de ciudadania":
                 empleado.setIdentificacion(Identificacion.CEDULA_CIUDADANIA);
                 break;
             case "Cedula de Extranjeria":
                 empleado.setIdentificacion(Identificacion.CEDULA_EXTRANJERIA);
                 break;
             case "Pasaporte":
                 empleado.setIdentificacion(Identificacion.PASAPORTE);
                break;
             case "Permiso Especial":
                 empleado.setIdentificacion(Identificacion.PERMISO_ESPECIAL);
                 break;
         }
        
         empleado.setNumeroIdentificacion(txtNIdentificacion.getText());
         empleado.setEmail(txtCorreo.getText());
         if (comboPais.getSelectedItem().toString() == "COLOMBIA") {
            empleado.setDominio(Dominio.COLOMBIA);
        }else{
             empleado.setDominio(Dominio.USA);
         }
         
        
        DateFormat formatter = new SimpleDateFormat("yy-MM-dd");
        try {
            Date date = formatter.parse(txtFechaRegi.getFechaSeleccionada());
             empleado.setFechaIngreso(date);
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
         switch(comboArea.getSelectedItem().toString()){
             case "Administacion":
                 empleado.setArea(Area.ADMINISTRACION);
                 break;
              case "Financiera":
                     empleado.setArea(Area.FINANCIERA);
                 break;
                  case "Compras":
                         empleado.setArea(Area.COMPRAS);
                 break;
                  case "Infraestructura":
                         empleado.setArea(Area.INFRAESTRUCTURA);
                 break;
                  case "Operacion":
                         empleado.setArea(Area.OPERACION);
                 break;
                  case "Talento Humano":
                         empleado.setArea(Area.TALENTO_HUMANO);
                 break;
                  case "Servicios Varios":
                         empleado.setArea(Area.VARIOS);
                 break;
                            
         }
         
         
  
         
         
         ClientConfig clientConfig =  new DefaultClientConfig();
         clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client  client =   Client.create(clientConfig);
        if (flagSaveOrUpdate) {
               WebResource target =  client.resource("http://localhost:8080/api/v001/empleado/" );
        Form f = new Form();
        f.add("primerApellido", empleado.getPrimerApellido());
        f.add("segundoApellido", empleado.getSegundoApellido());
        f.add("primerNombre", empleado.getPrimerNombre());
        f.add("otrosNombre", empleado.getOtrosNombre());
        f.add("pais", empleado.getPais());
        f.add("numeroIdentificacion", empleado.getNumeroIdentificacion());
        f.add("dominio", empleado.getDominio());
        f.add("identificacion", empleado.getIdentificacion());
        f.add("area", empleado.getArea());
              
              Empleado   empleado2 =  target.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).post(Empleado.class,f);
        }else{
            Modificar(client, empleado);
            
        }
        
        
     
              
              llenar();
              clear();
        
    }

    public void Modificar(Client client, Empleado empleado) {
        
        WebResource target =  client.resource("http://localhost:8080/api/v001/empleado/" );
        int row = tbl_tablad.getSelectedRow();
        empleado.setId((Long) tbl_tablad.getValueAt(row, 0));
        Form f = new Form();
        f.add("id", empleado.getId());
        f.add("primerApellido", empleado.getPrimerApellido());
        f.add("segundoApellido", empleado.getSegundoApellido());
        f.add("primerNombre", empleado.getPrimerNombre());
        f.add("otrosNombre", empleado.getOtrosNombre());
        f.add("pais", empleado.getPais());
        f.add("numeroIdentificacion", empleado.getNumeroIdentificacion());
        f.add("dominio", empleado.getDominio());
        f.add("identificacion", empleado.getIdentificacion());
        f.add("area", empleado.getArea());
              
              Empleado   empleado2 =  target.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).post(Empleado.class,f);

    }

    public void ModificarDatos() {
              flagSaveOrUpdate = false;
              int row =  tbl_tablad.getSelectedRow();
              txtApellP.setText((String) tbl_tablad.getValueAt(row, 1));
              txtApellS.setText((String) tbl_tablad.getValueAt(row, 2));
              txtNomP.setText((String) tbl_tablad.getValueAt(row, 3));
              txtNomS.setText((String) tbl_tablad.getValueAt(row, 4));       
              comboPais.setSelectedItem(tbl_tablad.getValueAt(row, 5));
              comboIdentidad.setSelectedItem(tbl_tablad.getValueAt(row, 6));
              txtNIdentificacion.setText((String) tbl_tablad.getValueAt(row, 7));
              txtCorreo.setText((String) tbl_tablad.getValueAt(row, 8));
              comboArea.setSelectedItem(tbl_tablad.getValueAt(row, row));
              
    }
    
    
    void clear(){
        flagSaveOrUpdate = true;
         txtApellP.setText("");
              txtApellS.setText("");
              txtNomP.setText("");
              txtNomS.setText("");       
              comboPais.setSelectedIndex(0);
              comboIdentidad.setSelectedIndex(0);
              txtNIdentificacion.setText("");
              txtCorreo.setText("");
              comboArea.setSelectedIndex(0);
        
    }
    
    public void llenar(){
        
         ClientConfig clientConfig =  new DefaultClientConfig();
         clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client  client =   Client.create(clientConfig);
        WebResource target =  client.resource("http://localhost:8080/api/v001/empleado/" );
       listEmpleados = target.get(new GenericType<List<Empleado>>(){});
       DefaultTableModel defaultTableModel = new DefaultTableModel();
    String[] cabezera  = {
                "ID", "P.APELL", "S.APELL", "P.NOM", "S.NOM", "PAIS", "IDENTIFICACION", "N.IDENTIFICACION", "CORREO", "AREA"
            };
    defaultTableModel.setColumnIdentifiers(cabezera);
    Object[] data = new Object[10]; 
   listEmpleados.stream().forEach((t) -> {
    data[0] = t.getId();
    data[1] = t.getPrimerApellido();
    data[2] = t.getSegundoApellido();
    data[3] = t.getPrimerNombre();
    data[4] = t.getOtrosNombre();
    data[5] = t.getPais().getDescripcion();
    data[6] = t.getIdentificacion();
    data[7] = t.getNumeroIdentificacion();
    data[8] = t.getEmail();
    data[9] = t.getArea();
       
     defaultTableModel.addRow(data);
   });
     
       tbl_tablad.setModel(defaultTableModel);
    }

    public void Borrar() {
        int fila = tbl_tablad.getSelectedRow();
        String Identidad = tbl_tablad.getValueAt(fila, 0).toString();
        int n = JOptionPane.showConfirmDialog(null, "Desea eliminar registro", "Registro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (n == JOptionPane.YES_NO_OPTION) {
            try {
              
              int row =  tbl_tablad.getSelectedRow();
              int column = 0;
              Object object = tbl_tablad.getValueAt(row, column);
              ClientConfig clientConfig =  new DefaultClientConfig();
         clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client  client =   Client.create(clientConfig);
        WebResource target =  client.resource("http://localhost:8080/api/v001/empleado/"+ object );
               target.delete(String.class);
               llenar();
               
            } catch (Exception ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.panel.Panel Panel1;
    private org.edisoncor.gui.panel.PanelShadow Panel2;
    private rojeru_san.RSButtonRiple btnBorrar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private rojeru_san.RSButtonRiple btnModificar;
    private rojerusan.RSComboMetro comboArea;
    private rojerusan.RSComboMetro comboBuscar;
    private rojerusan.RSComboMetro comboIdentidad;
    private rojerusan.RSComboMetro comboPais;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JScrollPane tableSroll;
    public javax.swing.JTable tbl_tablad;
    private rojerusan.RSMetroTextFullPlaceHolder txtApellP;
    private rojerusan.RSMetroTextFullPlaceHolder txtApellS;
    public org.edisoncor.gui.textField.TextField txtBuscar;
    private rojerusan.RSMetroTextFullPlaceHolder txtCorreo;
    private rojerusan.RSDateChooser txtFechaRegi;
    private rojerusan.RSMetroTextFullPlaceHolder txtNIdentificacion;
    private rojerusan.RSMetroTextFullPlaceHolder txtNomP;
    private rojerusan.RSMetroTextFullPlaceHolder txtNomS;
    // End of variables declaration//GEN-END:variables
}
