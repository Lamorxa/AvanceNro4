package Vistas;

import conexion.Conexion;
import modelos.UnidadDAO;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.*;
import controladores.*;
import java.util.Date;


public class vistaadministrador extends javax.swing.JFrame {
    UsuarioDAO usDao= new UsuarioDAO();
    Usuarios us=new Usuarios();
    Rutas rut=new Rutas();
    RutasDAO rutdao=new RutasDAO();
    EmpresaTransporte emtrans=new EmpresaTransporte();
    EmpresaTransporteDAO emtransdao=new EmpresaTransporteDAO();
    Personas person=new Personas();
    PersonasDAO persondao=new PersonasDAO();
    Tarjetas tarj=new Tarjetas();
    TarjetaDAO tarjdao=new TarjetaDAO();
    Unidades unidad=new Unidades();
    UnidadDAO unidadesDAO=new UnidadDAO();
    Rellenarcombo re=new Rellenarcombo();
    Conexion conec=new Conexion();
    
  
    public vistaadministrador() {
        this.setUndecorated(true);
        initComponents();
        ControladorUsuarios users = new ControladorUsuarios(us, usDao, this);
        ControladorRutas rutas= new ControladorRutas(rut, rutdao, this);
        ControladorEmpresaTransporte empresas=new ControladorEmpresaTransporte(emtrans, emtransdao, this);
         ControladorPersonas personas=new ControladorPersonas(this, person, persondao);
         ControladorUnidades unidades =new ControladorUnidades(this, unidad, unidadesDAO);
         re.rellenar("tarjetas", "CodTarjeta",cbntarjetasrecarga,conec);
   
        /*ControladorTarjetas tarjetas=new ControladorTarjetas(tarj, tarjdao, this);
      */
        
        this.setLocationRelativeTo(null);
        btnRegrut.setVisible(false);
        btnCancelarManRut.setVisible(false);
        btndelrut.setVisible(false);
        btnCancelarManRut1.setVisible(false);
        btnModRut.setVisible(false);
        btnCancelarManRut2.setVisible(false);
        btncancelusu.setVisible(false);
        btncancelusu1.setVisible(false);
        btncancelusu2.setVisible(false);
        txtmoduser.setVisible(false);
        btndeluser.setVisible(false);
        btnadduser.setVisible(false);
        btnaddunidad.setVisible(false);
        btnmodunidad.setVisible(false);
        btndeluni.setVisible(false);
        btncanuni.setVisible(false);
        btncanuni1.setVisible(false);
        btncanuni2.setVisible(false);
        btnaddperso.setVisible(false);
        btndelper.setVisible(false);
        btnmodper.setVisible(false);
        btncanper.setVisible(false);
        btncanper1.setVisible(false);
        btncanper2.setVisible(false);
        btnaddtar.setVisible(false);
        btnmodtar.setVisible(false);
        btndeltar.setVisible(false);
        btncanTar.setVisible(false);
        btncanTar1.setVisible(false);
        btncanTar2.setVisible(false);
        btnaddemp.setVisible(false);
        btndelemp.setVisible(false);
        btnmodemp.setVisible(false);
        btncantrans.setVisible(false);
        btncantrans1.setVisible(false);
        btncantrans2.setVisible(false);
       
  
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelPersonas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelRutas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelTarjetas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelRecargas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanelConsumos = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanelEmpresas = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanelUsuarios = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanelUnidad = new javax.swing.JPanel();
        lblunidad = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelMantenimientoClientesSimples = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpersonas = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnombrepersona = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtapepatpersona = new javax.swing.JTextField();
        txtapematpersona = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtdnipersona = new javax.swing.JTextField();
        txtruc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btnactaddper = new javax.swing.JButton();
        btnactmodper = new javax.swing.JButton();
        btnactdelper = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        cbxtipousupersona = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        cbxestadopersona = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        txtcelusuario = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        btnaddperso = new javax.swing.JButton();
        btncanper = new javax.swing.JButton();
        btncanper2 = new javax.swing.JButton();
        btndelper = new javax.swing.JButton();
        btncanper1 = new javax.swing.JButton();
        btnmodper = new javax.swing.JButton();
        jPanelMantenimientoRutas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblrutas = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        txtnombreruta = new javax.swing.JTextField();
        txtidrutman = new javax.swing.JTextField();
        txtmontoruta = new javax.swing.JTextField();
        cbxEstadoRuta = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        btnListRut = new javax.swing.JButton();
        btnelirut = new javax.swing.JButton();
        btnAddRut = new javax.swing.JButton();
        btnmodrut = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        btnRegrut = new javax.swing.JButton();
        btndelrut = new javax.swing.JButton();
        btnModRut = new javax.swing.JButton();
        btnCancelarManRut = new javax.swing.JButton();
        btnCancelarManRut1 = new javax.swing.JButton();
        btnCancelarManRut2 = new javax.swing.JButton();
        jPanelMantenimientoTarjetas = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnactaddtar = new javax.swing.JButton();
        btnactmodtar = new javax.swing.JButton();
        btnactdeltar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbltarjetas = new javax.swing.JTable();
        txtsaldo = new javax.swing.JTextField();
        txtcodtarjeta = new javax.swing.JTextField();
        txtdnipersonatarjeta = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        cbxEstadotarjeta = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        jdcfechacaducTarjeta = new com.toedter.calendar.JDateChooser();
        jdcfechacreacionTarjeta = new com.toedter.calendar.JDateChooser();
        btncanTar2 = new javax.swing.JButton();
        btnaddtar = new javax.swing.JButton();
        btncanTar = new javax.swing.JButton();
        btnmodtar = new javax.swing.JButton();
        btncanTar1 = new javax.swing.JButton();
        btndeltar = new javax.swing.JButton();
        jPanelModuloRecargas = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtCodtarjetarecarga = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtMontorecarga = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblrecargas = new javax.swing.JTable();
        jPanelMantenimientoUsers = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblusuarios = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtIdUser = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtDniUsers = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtUserUsuario = new javax.swing.JTextField();
        btnactadduser = new javax.swing.JButton();
        btnactmoduser = new javax.swing.JButton();
        btnactdeluser = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        cbxestadoUser = new javax.swing.JComboBox<>();
        txtContraUser = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        btnadduser = new javax.swing.JButton();
        btncancelusu = new javax.swing.JButton();
        btndeluser = new javax.swing.JButton();
        btncancelusu1 = new javax.swing.JButton();
        txtmoduser = new javax.swing.JButton();
        btncancelusu2 = new javax.swing.JButton();
        jPanelMantenimientoEmpresastransporte = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblEmpresastrans = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtrucempresa = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtnombreempresa = new javax.swing.JTextField();
        txtcolorempresa = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        btnactaddemp = new javax.swing.JButton();
        btnactmodemp = new javax.swing.JButton();
        btnactdelemp = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        cbxEstadoTranporte = new javax.swing.JComboBox<>();
        btnaddemp = new javax.swing.JButton();
        btncantrans2 = new javax.swing.JButton();
        btncantrans = new javax.swing.JButton();
        btncantrans1 = new javax.swing.JButton();
        btndelemp = new javax.swing.JButton();
        btnmodemp = new javax.swing.JButton();
        jPanelModuloConsumos = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtcodtarjetaconsumo = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txticodunidad = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblconsumos = new javax.swing.JTable();
        cbxEstadoConsumo = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        cbntarjetasrecarga = new javax.swing.JComboBox<>();
        jPanelMantenimientoEmpresastransporte1 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblunidades = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtCodUnidad = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtCodSoat = new javax.swing.JTextField();
        txtDniunidad = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        btnactaddunidad = new javax.swing.JButton();
        btnactmodiunidad = new javax.swing.JButton();
        btnactdelunidad = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        cbxEstadoUnidad = new javax.swing.JComboBox<>();
        txtIdRutaUnidad = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        btnaddunidad = new javax.swing.JButton();
        btncanuni1 = new javax.swing.JButton();
        btndeluni = new javax.swing.JButton();
        btncanuni = new javax.swing.JButton();
        btnmodunidad = new javax.swing.JButton();
        btncanuni2 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Lucida Sans", 3, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 51, 51));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("EtravelEase");
        jLabel31.setToolTipText("");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, -1));

        jLabel2.setBackground(new java.awt.Color(102, 204, 255));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 190));

        jPanelPersonas.setBackground(new java.awt.Color(0, 153, 204));
        jPanelPersonas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelPersonasMouseMoved(evt);
            }
        });
        jPanelPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPersonasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelPersonasMouseExited(evt);
            }
        });
        jPanelPersonas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Personas");
        jLabel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jPanelPersonas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 180, 30));

        jPanel1.add(jPanelPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 270, 30));

        jPanelRutas.setBackground(new java.awt.Color(0, 153, 204));
        jPanelRutas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelRutasMouseMoved(evt);
            }
        });
        jPanelRutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRutasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRutasMouseExited(evt);
            }
        });
        jPanelRutas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Rutas");
        jLabel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jPanelRutas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 80, 30));

        jPanel1.add(jPanelRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 270, -1));

        jPanelTarjetas.setBackground(new java.awt.Color(0, 153, 204));
        jPanelTarjetas.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTarjetas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelTarjetasMouseMoved(evt);
            }
        });
        jPanelTarjetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelTarjetasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelTarjetasMouseExited(evt);
            }
        });
        jPanelTarjetas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tarjetas");
        jLabel5.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jPanelTarjetas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 30));

        jPanel1.add(jPanelTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 270, 30));

        jPanelRecargas.setBackground(new java.awt.Color(0, 153, 204));
        jPanelRecargas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelRecargasMouseMoved(evt);
            }
        });
        jPanelRecargas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRecargasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRecargasMouseExited(evt);
            }
        });
        jPanelRecargas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Recargas");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jPanelRecargas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, 30));

        jPanel1.add(jPanelRecargas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 270, 30));

        jPanelConsumos.setBackground(new java.awt.Color(0, 153, 204));
        jPanelConsumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelConsumosMouseClicked(evt);
            }
        });
        jPanelConsumos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Consumos");
        jPanelConsumos.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 30));

        jPanel1.add(jPanelConsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 270, 30));

        jPanelEmpresas.setBackground(new java.awt.Color(0, 153, 204));
        jPanelEmpresas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Empresas de transporte");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        jPanelEmpresas.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 30));

        jPanel1.add(jPanelEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 270, 30));

        jPanelUsuarios.setBackground(new java.awt.Color(0, 153, 204));
        jPanelUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelUsuariosMouseClicked(evt);
            }
        });
        jPanelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("Usuarios");
        jPanelUsuarios.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        jPanel1.add(jPanelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 270, 30));

        jPanelUnidad.setBackground(new java.awt.Color(0, 153, 204));
        jPanelUnidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelUnidadMouseClicked(evt);
            }
        });
        jPanelUnidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblunidad.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        lblunidad.setForeground(new java.awt.Color(51, 51, 51));
        lblunidad.setText("Unidades Transporte");
        jPanelUnidad.add(lblunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jPanel1.add(jPanelUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        jLabel7.setFont(new java.awt.Font("Corbel", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Administrador");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 190, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 40, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("_");
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 30, -1));

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 890, 60));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setEnabled(false);

        jPanelMantenimientoClientesSimples.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMantenimientoClientesSimples.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblpersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dni", "Nombres", "ApellidoPaterno", "ApellidoMaterno", "Telefono", "CorreoElectronico", "IdTipoPersona", "RucEmpresa", "estado"
            }
        ));
        tblpersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpersonas);

        jPanelMantenimientoClientesSimples.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 269, 813, 285));

        jLabel10.setText("Nombre");
        jPanelMantenimientoClientesSimples.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 38, 57, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Mantenimiento de Personas");
        jPanelMantenimientoClientesSimples.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, 299, 26));

        txtnombrepersona.setEnabled(false);
        jPanelMantenimientoClientesSimples.add(txtnombrepersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 168, -1));

        jLabel12.setText("Apellido Paterno");
        jPanelMantenimientoClientesSimples.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));

        txtapepatpersona.setEnabled(false);
        txtapepatpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapepatpersonaActionPerformed(evt);
            }
        });
        jPanelMantenimientoClientesSimples.add(txtapepatpersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 168, -1));

        txtapematpersona.setEnabled(false);
        txtapematpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapematpersonaActionPerformed(evt);
            }
        });
        jPanelMantenimientoClientesSimples.add(txtapematpersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 168, -1));

        jLabel13.setText("DNI");
        jPanelMantenimientoClientesSimples.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 206, 48, 10));

        txtdnipersona.setEnabled(false);
        jPanelMantenimientoClientesSimples.add(txtdnipersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 206, -1));

        txtruc.setEnabled(false);
        jPanelMantenimientoClientesSimples.add(txtruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 277, -1));

        jLabel14.setText("Celular");
        jPanelMantenimientoClientesSimples.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 78, -1));

        jLabel15.setText("Ruc");
        jPanelMantenimientoClientesSimples.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 85, -1));

        txtemail.setEnabled(false);
        jPanelMantenimientoClientesSimples.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 230, -1));

        btnactaddper.setText("AGREGAR");
        btnactaddper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactaddperActionPerformed(evt);
            }
        });
        jPanelMantenimientoClientesSimples.add(btnactaddper, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 127, -1));

        btnactmodper.setText("MODIFICAR");
        btnactmodper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactmodperActionPerformed(evt);
            }
        });
        jPanelMantenimientoClientesSimples.add(btnactmodper, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 121, -1));

        btnactdelper.setText("ELIMINAR");
        btnactdelper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactdelperActionPerformed(evt);
            }
        });
        jPanelMantenimientoClientesSimples.add(btnactdelper, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 127, -1));

        jButton4.setText("LIMPIAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelMantenimientoClientesSimples.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 121, -1));

        jLabel16.setText("Tipo usuario");
        jPanelMantenimientoClientesSimples.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 169, 78, -1));

        cbxtipousupersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Pasajero", "Conductor" }));
        cbxtipousupersona.setEnabled(false);
        cbxtipousupersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxtipousupersonaActionPerformed(evt);
            }
        });
        jPanelMantenimientoClientesSimples.add(cbxtipousupersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 166, 122, -1));

        jLabel43.setText("Apellido Materno");
        jPanelMantenimientoClientesSimples.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 25));

        cbxestadopersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        cbxestadopersona.setToolTipText("");
        cbxestadopersona.setEnabled(false);
        cbxestadopersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxestadopersonaActionPerformed(evt);
            }
        });
        jPanelMantenimientoClientesSimples.add(cbxestadopersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 122, -1));

        jLabel52.setText("estado");
        jPanelMantenimientoClientesSimples.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 203, 78, -1));

        txtcelusuario.setEnabled(false);
        jPanelMantenimientoClientesSimples.add(txtcelusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 206, -1));

        jLabel53.setText("Email");
        jPanelMantenimientoClientesSimples.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 85, 26));

        btnaddperso.setText("Añadir");
        jPanelMantenimientoClientesSimples.add(btnaddperso, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        btncanper.setText("Cancelar");
        btncanper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanperActionPerformed(evt);
            }
        });
        jPanelMantenimientoClientesSimples.add(btncanper, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        btncanper2.setText("Cancelar");
        btncanper2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanper2ActionPerformed(evt);
            }
        });
        jPanelMantenimientoClientesSimples.add(btncanper2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        btndelper.setText("Eliminar");
        jPanelMantenimientoClientesSimples.add(btndelper, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        btncanper1.setText("Cancelar");
        btncanper1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanper1ActionPerformed(evt);
            }
        });
        jPanelMantenimientoClientesSimples.add(btncanper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 80, -1));

        btnmodper.setText("Modificar");
        jPanelMantenimientoClientesSimples.add(btnmodper, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, -1));

        jTabbedPane1.addTab("tab1", jPanelMantenimientoClientesSimples);

        jPanelMantenimientoRutas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMantenimientoRutas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblrutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdRuta", "NombreRuta", "MontoRuta", "estado"
            }
        ));
        tblrutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblrutasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblrutas);

        jPanelMantenimientoRutas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 66, 598, 447));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Mantenimiento de Rutas");
        jPanelMantenimientoRutas.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 18, -1, 30));

        txtnombreruta.setEnabled(false);
        txtnombreruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrerutaActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(txtnombreruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 200, -1));

        txtidrutman.setEnabled(false);
        jPanelMantenimientoRutas.add(txtidrutman, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, -1));

        txtmontoruta.setEnabled(false);
        jPanelMantenimientoRutas.add(txtmontoruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, -1));

        cbxEstadoRuta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        cbxEstadoRuta.setToolTipText("");
        cbxEstadoRuta.setEnabled(false);
        cbxEstadoRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoRutaActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(cbxEstadoRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 122, -1));

        jLabel54.setText("Monto Ruta");
        jPanelMantenimientoRutas.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 78, -1));

        btnListRut.setText("LIMPIAR");
        btnListRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListRutActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(btnListRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 90, -1));

        btnelirut.setText("ELIMINAR");
        btnelirut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelirutActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(btnelirut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 90, -1));

        btnAddRut.setText("AGREGAR");
        btnAddRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRutActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(btnAddRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, -1));

        btnmodrut.setText("MODIFICAR");
        btnmodrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodrutActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(btnmodrut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel55.setText("estado");
        jPanelMantenimientoRutas.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 78, -1));

        jLabel56.setText("IdRuta");
        jPanelMantenimientoRutas.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 78, -1));

        jLabel57.setText("Nombre Ruta");
        jPanelMantenimientoRutas.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 78, -1));

        btnRegrut.setText("Registrar");
        btnRegrut.setEnabled(false);
        btnRegrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegrutActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(btnRegrut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        btndelrut.setText("eliminar");
        btndelrut.setEnabled(false);
        btndelrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelrutActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(btndelrut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        btnModRut.setText("Actualizar");
        btnModRut.setEnabled(false);
        jPanelMantenimientoRutas.add(btnModRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        btnCancelarManRut.setText("Cancelar");
        btnCancelarManRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarManRutActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(btnCancelarManRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        btnCancelarManRut1.setText("Cancelar");
        btnCancelarManRut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarManRut1ActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(btnCancelarManRut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        btnCancelarManRut2.setText("Cancelar");
        btnCancelarManRut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarManRut2ActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(btnCancelarManRut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        jTabbedPane1.addTab("tab2", jPanelMantenimientoRutas);

        jPanelMantenimientoTarjetas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMantenimientoTarjetas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Mantenimiento de Tarjetas");
        jPanelMantenimientoTarjetas.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 20, 230, 27));

        btnactaddtar.setText("Agregar");
        btnactaddtar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactaddtarActionPerformed(evt);
            }
        });
        jPanelMantenimientoTarjetas.add(btnactaddtar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 189, -1));

        btnactmodtar.setText("Editar");
        btnactmodtar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactmodtarActionPerformed(evt);
            }
        });
        jPanelMantenimientoTarjetas.add(btnactmodtar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 189, -1));

        btnactdeltar.setText("Eliminar");
        btnactdeltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactdeltarActionPerformed(evt);
            }
        });
        jPanelMantenimientoTarjetas.add(btnactdeltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 189, -1));

        jButton8.setText("Limpiar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelMantenimientoTarjetas.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 189, -1));

        tbltarjetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodTarjeta", "Saldo", "Dni", "FechaCreacion", "FechaCaducidad", "estado"
            }
        ));
        tbltarjetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltarjetasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbltarjetas);

        jPanelMantenimientoTarjetas.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 59, 533, 443));

        txtsaldo.setEnabled(false);
        jPanelMantenimientoTarjetas.add(txtsaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 190, -1));

        txtcodtarjeta.setEnabled(false);
        jPanelMantenimientoTarjetas.add(txtcodtarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 190, -1));

        txtdnipersonatarjeta.setEnabled(false);
        jPanelMantenimientoTarjetas.add(txtdnipersonatarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 190, -1));

        jLabel19.setText("fecha de caducidad");
        jPanelMantenimientoTarjetas.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel20.setText("Cod Tarjeta");
        jPanelMantenimientoTarjetas.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel21.setText("Saldo");
        jPanelMantenimientoTarjetas.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel22.setText("DNI usuario");
        jPanelMantenimientoTarjetas.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel58.setText("fecha de creacion");
        jPanelMantenimientoTarjetas.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        cbxEstadotarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        cbxEstadotarjeta.setToolTipText("");
        cbxEstadotarjeta.setEnabled(false);
        cbxEstadotarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadotarjetaActionPerformed(evt);
            }
        });
        jPanelMantenimientoTarjetas.add(cbxEstadotarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 122, -1));

        jLabel59.setText("estado");
        jPanelMantenimientoTarjetas.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 60, -1));

        jdcfechacaducTarjeta.setEnabled(false);
        jPanelMantenimientoTarjetas.add(jdcfechacaducTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 190, -1));

        jdcfechacreacionTarjeta.setEnabled(false);
        jPanelMantenimientoTarjetas.add(jdcfechacreacionTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 190, -1));

        btncanTar2.setText("Cancelar");
        btncanTar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanTar2ActionPerformed(evt);
            }
        });
        jPanelMantenimientoTarjetas.add(btncanTar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        btnaddtar.setText("Agregar");
        jPanelMantenimientoTarjetas.add(btnaddtar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        btncanTar.setText("Cancelar");
        btncanTar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanTarActionPerformed(evt);
            }
        });
        jPanelMantenimientoTarjetas.add(btncanTar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        btnmodtar.setText("modificar");
        jPanelMantenimientoTarjetas.add(btnmodtar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        btncanTar1.setText("Cancelar");
        btncanTar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanTar1ActionPerformed(evt);
            }
        });
        jPanelMantenimientoTarjetas.add(btncanTar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        btndeltar.setText("Eliminar");
        jPanelMantenimientoTarjetas.add(btndeltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        jTabbedPane1.addTab("tab3", jPanelMantenimientoTarjetas);

        jPanelModuloRecargas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelModuloRecargas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Módulo de Recargas");
        jPanelModuloRecargas.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 36, 190, 32));

        jLabel24.setText("Nro de Tarjeta");
        jPanelModuloRecargas.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 88, 122, 26));

        txtCodtarjetarecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodtarjetarecargaActionPerformed(evt);
            }
        });
        jPanelModuloRecargas.add(txtCodtarjetarecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 120, 275, -1));

        jLabel27.setText("Monto");
        jPanelModuloRecargas.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 250, 71, 27));
        jPanelModuloRecargas.add(txtMontorecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 252, 198, -1));

        jButton9.setText("Recargar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelModuloRecargas.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 325, 143, -1));

        tblrecargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CodRecarga", "MontoRecarga", "CodTarjeta", "FechaCodRecarga", "estado"
            }
        ));
        jScrollPane4.setViewportView(tblrecargas);

        jPanelModuloRecargas.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 120, 473, 403));

        jTabbedPane1.addTab("tab4", jPanelModuloRecargas);

        jPanelMantenimientoUsers.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMantenimientoUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdUsuario", "Dni", "User", "Contrasena", "estado"
            }
        ));
        tblusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblusuariosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblusuarios);

        jPanelMantenimientoUsers.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 263, 813, 285));

        jLabel25.setText("IdUsuario");
        jPanelMantenimientoUsers.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 57, 26));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Mantenimiento de Usuarios");
        jPanelMantenimientoUsers.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, -1, 26));

        txtIdUser.setEnabled(false);
        jPanelMantenimientoUsers.add(txtIdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 168, -1));

        jLabel30.setText("DNI");
        jPanelMantenimientoUsers.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 48, 20));

        txtDniUsers.setEnabled(false);
        jPanelMantenimientoUsers.add(txtDniUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 170, -1));

        jLabel32.setText("User");
        jPanelMantenimientoUsers.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 85, -1));

        txtUserUsuario.setEnabled(false);
        jPanelMantenimientoUsers.add(txtUserUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 170, -1));

        btnactadduser.setText("AGREGAR");
        btnactadduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactadduserActionPerformed(evt);
            }
        });
        jPanelMantenimientoUsers.add(btnactadduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 127, -1));

        btnactmoduser.setText("MODIFICAR");
        btnactmoduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactmoduserActionPerformed(evt);
            }
        });
        jPanelMantenimientoUsers.add(btnactmoduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 121, -1));

        btnactdeluser.setText("ELIMINAR");
        btnactdeluser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactdeluserActionPerformed(evt);
            }
        });
        jPanelMantenimientoUsers.add(btnactdeluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 127, -1));

        jButton13.setText("LIMPIAR");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanelMantenimientoUsers.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 121, -1));

        jLabel33.setText("estado");
        jPanelMantenimientoUsers.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 78, -1));

        cbxestadoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        cbxestadoUser.setEnabled(false);
        cbxestadoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxestadoUserActionPerformed(evt);
            }
        });
        jPanelMantenimientoUsers.add(cbxestadoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 122, -1));

        txtContraUser.setEnabled(false);
        jPanelMantenimientoUsers.add(txtContraUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 170, -1));

        jLabel28.setText("Contraseña");
        jPanelMantenimientoUsers.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 82, -1));

        btnadduser.setText("Añadir");
        btnadduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadduserActionPerformed(evt);
            }
        });
        jPanelMantenimientoUsers.add(btnadduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 90, -1));

        btncancelusu.setText("Cancelar");
        btncancelusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelusuActionPerformed(evt);
            }
        });
        jPanelMantenimientoUsers.add(btncancelusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 90, -1));

        btndeluser.setText("eliminar");
        btndeluser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeluserActionPerformed(evt);
            }
        });
        jPanelMantenimientoUsers.add(btndeluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 90, -1));

        btncancelusu1.setText("Cancelar");
        btncancelusu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelusu1ActionPerformed(evt);
            }
        });
        jPanelMantenimientoUsers.add(btncancelusu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 90, -1));

        txtmoduser.setText("Modificar");
        txtmoduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmoduserActionPerformed(evt);
            }
        });
        jPanelMantenimientoUsers.add(txtmoduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 90, -1));

        btncancelusu2.setText("Cancelar");
        btncancelusu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelusu2ActionPerformed(evt);
            }
        });
        jPanelMantenimientoUsers.add(btncancelusu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 90, -1));

        jTabbedPane1.addTab("tab5", jPanelMantenimientoUsers);

        jPanelMantenimientoEmpresastransporte.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMantenimientoEmpresastransporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEmpresastrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rucempresa", "NombreEmpresa", "Color", "Estado"
            }
        ));
        tblEmpresastrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpresastransMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblEmpresastrans);

        jPanelMantenimientoEmpresastransporte.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 233, 813, 315));

        jLabel36.setText("Ruc Empresa");
        jPanelMantenimientoEmpresastransporte.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 38, 114, 26));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setText("Mantenimiento de Empresas de Transporte");
        jPanelMantenimientoEmpresastransporte.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, -1, 26));

        txtrucempresa.setEnabled(false);
        jPanelMantenimientoEmpresastransporte.add(txtrucempresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 76, 168, -1));

        jLabel38.setText("Nombre Empresa");
        jPanelMantenimientoEmpresastransporte.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 116, 168, 25));

        txtnombreempresa.setEnabled(false);
        txtnombreempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreempresaActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte.add(txtnombreempresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 147, 168, -1));

        txtcolorempresa.setEnabled(false);
        txtcolorempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcolorempresaActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte.add(txtcolorempresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 76, 206, -1));

        jLabel40.setText("Color");
        jPanelMantenimientoEmpresastransporte.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 48, 78, -1));

        btnactaddemp.setText("AGREGAR");
        btnactaddemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactaddempActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte.add(btnactaddemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 127, -1));

        btnactmodemp.setText("MODIFICAR");
        btnactmodemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactmodempActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte.add(btnactmodemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 121, -1));

        btnactdelemp.setText("ELIMINAR");
        btnactdelemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactdelempActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte.add(btnactdelemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 127, -1));

        jButton17.setText("LIMPIAR");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 121, -1));

        jLabel42.setText("Estado");
        jPanelMantenimientoEmpresastransporte.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 150, 78, -1));

        cbxEstadoTranporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        cbxEstadoTranporte.setEnabled(false);
        cbxEstadoTranporte.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxEstadoTranporteItemStateChanged(evt);
            }
        });
        cbxEstadoTranporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoTranporteActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte.add(cbxEstadoTranporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 147, 122, -1));

        btnaddemp.setText("Añadir");
        btnaddemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddempActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte.add(btnaddemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        btncantrans2.setText("Cancelar");
        btncantrans2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncantrans2ActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte.add(btncantrans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, -1, -1));

        btncantrans.setText("Cancelar");
        btncantrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncantransActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte.add(btncantrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

        btncantrans1.setText("Cancelar");
        btncantrans1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncantrans1ActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte.add(btncantrans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, -1));

        btndelemp.setText("Eliminar");
        jPanelMantenimientoEmpresastransporte.add(btndelemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 80, -1));

        btnmodemp.setText("Modificar");
        btnmodemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodempActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte.add(btnmodemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 90, -1));

        jTabbedPane1.addTab("tab6", jPanelMantenimientoEmpresastransporte);

        jPanelModuloConsumos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setText("Módulo de Consumos");

        jLabel41.setText("Nro de Tarjeta");

        txtcodtarjetaconsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodtarjetaconsumoActionPerformed(evt);
            }
        });

        jLabel44.setText("Unidad");

        txticodunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txticodunidadActionPerformed(evt);
            }
        });

        jButton15.setText("Recargar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        tblconsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CodConsumo", "MontoConsumo", "CodTarjeta", "CodUnidad", "FechaConsumo", "estado"
            }
        ));
        jScrollPane7.setViewportView(tblconsumos);

        cbxEstadoConsumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        cbxEstadoConsumo.setToolTipText("");
        cbxEstadoConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoConsumoActionPerformed(evt);
            }
        });

        jLabel60.setText("estado");

        javax.swing.GroupLayout jPanelModuloConsumosLayout = new javax.swing.GroupLayout(jPanelModuloConsumos);
        jPanelModuloConsumos.setLayout(jPanelModuloConsumosLayout);
        jPanelModuloConsumosLayout.setHorizontalGroup(
            jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModuloConsumosLayout.createSequentialGroup()
                .addGroup(jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModuloConsumosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                        .addGroup(jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                                .addGroup(jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(cbxEstadoConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txticodunidad, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                                            .addComponent(txtcodtarjetaconsumo)
                                            .addComponent(cbntarjetasrecarga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModuloConsumosLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)))
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanelModuloConsumosLayout.setVerticalGroup(
            jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodtarjetaconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbntarjetasrecarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txticodunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel60))
                            .addComponent(cbxEstadoConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jButton15)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab7", jPanelModuloConsumos);

        jPanelMantenimientoEmpresastransporte1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMantenimientoEmpresastransporte1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblunidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodUnidad", "Dni", "Idruta", "CodSoat", "estado"
            }
        ));
        tblunidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblunidadesMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblunidades);

        jPanelMantenimientoEmpresastransporte1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 233, 813, 315));

        jLabel46.setText("CodUnidad");
        jPanelMantenimientoEmpresastransporte1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 114, 10));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setText("Mantenimiento de Unidades");
        jPanelMantenimientoEmpresastransporte1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 26));

        txtCodUnidad.setEnabled(false);
        txtCodUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodUnidadActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte1.add(txtCodUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 168, -1));

        jLabel48.setText("CodSoat");
        jPanelMantenimientoEmpresastransporte1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 95, 168, 10));

        txtCodSoat.setEnabled(false);
        txtCodSoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodSoatActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte1.add(txtCodSoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 168, -1));

        txtDniunidad.setEnabled(false);
        txtDniunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniunidadActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte1.add(txtDniunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 170, -1));

        jLabel49.setText("Dni");
        jPanelMantenimientoEmpresastransporte1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 78, -1));

        btnactaddunidad.setText("AGREGAR");
        btnactaddunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactaddunidadActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte1.add(btnactaddunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 127, -1));

        btnactmodiunidad.setText("MODIFICAR");
        btnactmodiunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactmodiunidadActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte1.add(btnactmodiunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 121, -1));

        btnactdelunidad.setText("ELIMINAR");
        btnactdelunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactdelunidadActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte1.add(btnactdelunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 127, -1));

        jButton18.setText("LIMPIAR");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 121, -1));

        jLabel50.setText("Estado");
        jPanelMantenimientoEmpresastransporte1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 47, -1));

        cbxEstadoUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        cbxEstadoUnidad.setEnabled(false);
        cbxEstadoUnidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxEstadoUnidadItemStateChanged(evt);
            }
        });
        cbxEstadoUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoUnidadActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte1.add(cbxEstadoUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 150, -1));

        txtIdRutaUnidad.setEnabled(false);
        txtIdRutaUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdRutaUnidadActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte1.add(txtIdRutaUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 206, -1));

        jLabel61.setText("IdRuta");
        jPanelMantenimientoEmpresastransporte1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 78, -1));

        btnaddunidad.setText("Añadir");
        btnaddunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddunidadActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte1.add(btnaddunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        btncanuni1.setText("Cancelar");
        btncanuni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanuni1ActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte1.add(btncanuni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 80, -1));

        btndeluni.setText("Eliminar");
        btndeluni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeluniActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte1.add(btndeluni, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 80, -1));

        btncanuni.setText("Cancelar");
        btncanuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanuniActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte1.add(btncanuni, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 80, -1));

        btnmodunidad.setText("Modificar");
        jPanelMantenimientoEmpresastransporte1.add(btnmodunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, -1, -1));

        btncanuni2.setText("Cancelar");
        btncanuni2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanuni2ActionPerformed(evt);
            }
        });
        jPanelMantenimientoEmpresastransporte1.add(btncanuni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 80, -1));

        jTabbedPane1.addTab("tab6", jPanelMantenimientoEmpresastransporte1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 890, 610));

        jLabel29.setFont(new java.awt.Font("Corbel", 0, 30)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("USUARIO");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 190, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPersonasMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jPanelPersonasMouseClicked

    private void jPanelPersonasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPersonasMouseMoved
        jPanelPersonas.setBackground(new Color(0, 204, 255));
    }//GEN-LAST:event_jPanelPersonasMouseMoved

    private void jPanelPersonasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPersonasMouseExited
        jPanelPersonas.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_jPanelPersonasMouseExited

    private void jPanelRutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRutasMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jPanelRutasMouseClicked

    private void jPanelRutasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRutasMouseMoved
        jPanelRutas.setBackground(new Color(0, 204, 255));
    }//GEN-LAST:event_jPanelRutasMouseMoved

    private void jPanelRutasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRutasMouseExited
        jPanelRutas.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_jPanelRutasMouseExited

    private void jPanelTarjetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTarjetasMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jPanelTarjetasMouseClicked

    private void jPanelTarjetasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTarjetasMouseMoved
        jPanelTarjetas.setBackground(new Color(0, 204, 255));
    }//GEN-LAST:event_jPanelTarjetasMouseMoved

    private void jPanelTarjetasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTarjetasMouseExited
        jPanelTarjetas.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_jPanelTarjetasMouseExited

    private void jPanelRecargasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRecargasMouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jPanelRecargasMouseClicked

    private void jPanelRecargasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRecargasMouseMoved
        jPanelRecargas.setBackground(new Color(0, 204, 255));
    }//GEN-LAST:event_jPanelRecargasMouseMoved

    private void jPanelRecargasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRecargasMouseExited
        jPanelRecargas.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_jPanelRecargasMouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void cbxtipousupersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxtipousupersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxtipousupersonaActionPerformed

    private void txtCodtarjetarecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodtarjetarecargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodtarjetarecargaActionPerformed

    private void cbxestadoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxestadoUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxestadoUserActionPerformed

    private void cbxEstadoTranporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoTranporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoTranporteActionPerformed

    private void jPanelConsumosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConsumosMouseClicked
        jTabbedPane1.setSelectedIndex(6);

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelConsumosMouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtapematpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapematpersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapematpersonaActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

    }//GEN-LAST:event_jButton17ActionPerformed

    private void txtcolorempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcolorempresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcolorempresaActionPerformed

    private void txtnombreempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreempresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreempresaActionPerformed

    private void tblEmpresastransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpresastransMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 1) {
            JTable receptor = (JTable)evt.getSource();
            txtrucempresa.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            txtnombreempresa.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
            txtcolorempresa.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
            cbxEstadoTranporte.setSelectedItem(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3));
          
            btnactmodemp.setEnabled(true);
            btnactdelemp.setEnabled(true);
        } 
    }//GEN-LAST:event_tblEmpresastransMouseClicked

    private void btnactaddempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactaddempActionPerformed
        // TODO add your handling code here:
        txtnombreempresa.setEnabled(true);
        txtrucempresa.setEnabled(true);
        txtcolorempresa.setEnabled(true);
        cbxEstadoTranporte.setEnabled(true);
        btnaddemp.setVisible(true);
        btncantrans.setVisible(true);
        txtnombreempresa.setText("");
        txtrucempresa.setText("");
        txtcolorempresa.setText("");
        btnactadduser.setEnabled(false);
   
    }//GEN-LAST:event_btnactaddempActionPerformed

    private void cbxEstadoTranporteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEstadoTranporteItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoTranporteItemStateChanged

    private void btnactmodempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactmodempActionPerformed
    
        txtnombreempresa.setEnabled(true);
        txtrucempresa.setEnabled(true);
        txtcolorempresa.setEnabled(true);
        cbxEstadoTranporte.setEnabled(true);
        btnmodemp.setVisible(true);
        btncantrans2.setVisible(true);
        txtnombreempresa.setText("");
        txtrucempresa.setText("");
        txtcolorempresa.setText("");
        btnactmodemp.setEnabled(false);
    }//GEN-LAST:event_btnactmodempActionPerformed

    private void btnactdelempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactdelempActionPerformed
        txtnombreempresa.setEnabled(true);
        txtrucempresa.setEnabled(true);
        txtcolorempresa.setEnabled(true);
        cbxEstadoTranporte.setEnabled(true);
        btndelemp.setVisible(true);
        btncantrans1.setVisible(true);
        txtnombreempresa.setText("");
        txtrucempresa.setText("");
        txtcolorempresa.setText("");
        btnactdelemp.setEnabled(false);
    }//GEN-LAST:event_btnactdelempActionPerformed

    private void txtcodtarjetaconsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodtarjetaconsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodtarjetaconsumoActionPerformed

    private void tblunidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblunidadesMouseClicked
        if(evt.getClickCount() == 1) {
    JTable receptor = (JTable)evt.getSource();
    // Asegúrate de tener los nombres de los elementos correctos para la clase Unidad
    txtCodUnidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
    txtDniunidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
    txtIdRutaUnidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
    txtCodSoat.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
    cbxEstadoUnidad.setSelectedItem(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4));


}
    }//GEN-LAST:event_tblunidadesMouseClicked

    private void txtCodSoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodSoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodSoatActionPerformed

    private void txtDniunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniunidadActionPerformed

    private void btnactaddunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactaddunidadActionPerformed
        txtCodUnidad.setEnabled(true);
        txtDniunidad.setEnabled(true);
        txtIdRutaUnidad.setEnabled(true);
        txtCodSoat.setEnabled(true);
        cbxEstadoUnidad.setEnabled(true);
        btnaddunidad.setVisible(true);
        btncanuni.setVisible(true);
        txtCodUnidad.setText("");
        txtDniunidad.setText("");
        txtIdRutaUnidad.setText("");
        txtCodSoat.setText("");
        btnactaddunidad.setEnabled(false);
       
        
        
        
        

        
    }//GEN-LAST:event_btnactaddunidadActionPerformed

    private void btnactmodiunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactmodiunidadActionPerformed
        // TODO add your handling code here:
        txtCodUnidad.setEnabled(true);
        txtDniunidad.setEnabled(true);
        txtIdRutaUnidad.setEnabled(true);
        txtCodSoat.setEnabled(true);
        cbxEstadoUnidad.setEnabled(true);
        btnmodunidad.setVisible(true);
        btncanuni1.setVisible(true);
        txtCodUnidad.setText("");
        txtDniunidad.setText("");
        txtIdRutaUnidad.setText("");
        txtCodSoat.setText("");
        btnactmodiunidad.setEnabled(false);
        
        
    
    }//GEN-LAST:event_btnactmodiunidadActionPerformed

    private void btnactdelunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactdelunidadActionPerformed
        // TODO add your handling code here:
        
        txtCodUnidad.setEnabled(true);
        txtDniunidad.setEnabled(true);
        txtIdRutaUnidad.setEnabled(true);
        txtCodSoat.setEnabled(true);
        cbxEstadoUnidad.setEnabled(true);
        btndeluni.setVisible(true);
        btncanuni2.setVisible(true);
        txtCodUnidad.setText("");
        txtDniunidad.setText("");
        txtIdRutaUnidad.setText("");
        txtCodSoat.setText("");
        btnactdelunidad.setEnabled(false);
      
    }//GEN-LAST:event_btnactdelunidadActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jButton18ActionPerformed

    private void cbxEstadoUnidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEstadoUnidadItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoUnidadItemStateChanged

    private void cbxEstadoUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoUnidadActionPerformed

    private void jPanelUnidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUnidadMouseClicked
 jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_jPanelUnidadMouseClicked

    private void jPanelUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUsuariosMouseClicked
        jTabbedPane1.setSelectedIndex(4);

    }//GEN-LAST:event_jPanelUsuariosMouseClicked

    private void cbxestadopersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxestadopersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxestadopersonaActionPerformed

    private void btnactaddperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactaddperActionPerformed
        txtnombrepersona.setEnabled(true);
        txtdnipersona.setEnabled(true);
        txtnombrepersona.setEnabled(true);
        txtcelusuario.setEnabled(true);
        txtemail.setEnabled(true);
        txtapematpersona.setEnabled(true);
        txtapepatpersona.setEnabled(true);
        cbxestadopersona.setEnabled(true);
        cbxtipousupersona.setEnabled(true);
        txtruc.setEnabled(true);
        btnaddperso.setVisible(true);
        btncanper.setVisible(true);
        txtnombrepersona.setText("");
        txtdnipersona.setText("");
        txtnombrepersona.setText("");
        txtcelusuario.setText("");
        txtemail.setText("");
        txtapematpersona.setText("");
        txtapepatpersona.setText("");
        btnactaddper.setEnabled(false);  
            }//GEN-LAST:event_btnactaddperActionPerformed

    private void tblpersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpersonasMouseClicked
       if(evt.getClickCount() == 1) {
    JTable receptor = (JTable)evt.getSource();
    txtdnipersona.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
    txtnombrepersona.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
    txtapepatpersona.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
    txtapematpersona.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),3).toString());
    txtcelusuario.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),4).toString());
    txtemail.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),5).toString());
          
Object value = receptor.getModel().getValueAt(receptor.getSelectedRow(), 7);
if (value == null) {
    txtruc.setText("");
} else {
    txtruc.setText(value.toString());
}
    
   
}
    }//GEN-LAST:event_tblpersonasMouseClicked

    private void btnactmodperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactmodperActionPerformed
     txtnombrepersona.setEnabled(true);
        txtdnipersona.setEnabled(true);
        txtnombrepersona.setEnabled(true);
        txtcelusuario.setEnabled(true);
        txtemail.setEnabled(true);
        txtapematpersona.setEnabled(true);
        txtapepatpersona.setEnabled(true);
        cbxestadopersona.setEnabled(true);
        cbxtipousupersona.setEnabled(true);
        txtruc.setEnabled(true);
        btnmodper.setVisible(true);
        btncanper1.setVisible(true);
        txtnombrepersona.setText("");
        txtdnipersona.setText("");
        txtnombrepersona.setText("");
        txtcelusuario.setText("");
        txtemail.setText("");
        txtapematpersona.setText("");
        txtapepatpersona.setText("");
        btnactmodper.setEnabled(false);     
        
    }//GEN-LAST:event_btnactmodperActionPerformed

    private void btnactdelperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactdelperActionPerformed
        txtnombrepersona.setEnabled(true);
        txtdnipersona.setEnabled(true);
        txtnombrepersona.setEnabled(true);
        txtcelusuario.setEnabled(true);
        txtemail.setEnabled(true);
        txtapematpersona.setEnabled(true);
        txtapepatpersona.setEnabled(true);
        cbxestadopersona.setEnabled(true);
        cbxtipousupersona.setEnabled(true);
        txtruc.setEnabled(true);
        btndelper.setVisible(true);
        btncanper2.setVisible(true);
        txtnombrepersona.setText("");
        txtdnipersona.setText("");
        txtnombrepersona.setText("");
        txtcelusuario.setText("");
        txtemail.setText("");
        txtapematpersona.setText("");
        txtapepatpersona.setText("");
        btnactdelper.setEnabled(false);  
    }//GEN-LAST:event_btnactdelperActionPerformed

    private void cbxEstadoRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoRutaActionPerformed

    private void btnListRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListRutActionPerformed

    private void btnelirutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelirutActionPerformed
        txtidrutman.setEnabled(true);
        txtnombreruta.setEnabled(true);
        txtmontoruta.setEnabled(true);
        cbxEstadoRuta.setEnabled(true);
        btndelrut.setVisible(true);
        btndelrut.setEnabled(true);
        btnCancelarManRut1.setVisible(true);
        txtidrutman.setText("");
        txtnombreruta.setText("");
        txtmontoruta.setText("");
        btnelirut.setEnabled(false);
        
        
        
        
          }//GEN-LAST:event_btnelirutActionPerformed

    private void btnAddRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRutActionPerformed
        txtidrutman.setEnabled(true);
        txtnombreruta.setEnabled(true);
        txtmontoruta.setEnabled(true);
        cbxEstadoRuta.setEnabled(true);
        btnRegrut.setVisible(true);
        btnRegrut.setEnabled(true);
        btnCancelarManRut.setVisible(true);
        txtidrutman.setText("");
        txtnombreruta.setText("");
        txtmontoruta.setText("");
        btnAddRut.setEnabled(false);
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddRutActionPerformed

    private void btnmodrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodrutActionPerformed
        txtidrutman.setEnabled(true);
        txtnombreruta.setEnabled(true);
        txtmontoruta.setEnabled(true);
        cbxEstadoRuta.setEnabled(true);
        btnModRut.setVisible(true);
        btnModRut.setEnabled(true);
        btnCancelarManRut2.setVisible(true);
        txtidrutman.setText("");
        txtnombreruta.setText("");
        txtmontoruta.setText("");
        btnmodrut.setEnabled(false);
       

         }//GEN-LAST:event_btnmodrutActionPerformed

    private void tblrutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblrutasMouseClicked
         JTable receptor = (JTable)evt.getSource();
    txtidrutman.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
    txtnombreruta.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
    txtmontoruta.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
    cbxEstadoRuta.setSelectedItem(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3));
    }//GEN-LAST:event_tblrutasMouseClicked

    private void tbltarjetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltarjetasMouseClicked
 if(evt.getClickCount() == 1) {
    JTable receptor = (JTable)evt.getSource();
    txtcodtarjeta.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
    txtsaldo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
    txtdnipersonatarjeta.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
    jdcfechacreacionTarjeta.setDate((Date)receptor.getModel().getValueAt(receptor.getSelectedRow(), 3));
    jdcfechacaducTarjeta.setDate((Date)receptor.getModel().getValueAt(receptor.getSelectedRow(), 4));
    cbxEstadotarjeta.setSelectedItem(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());
}
    }//GEN-LAST:event_tbltarjetasMouseClicked

    private void cbxEstadotarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadotarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadotarjetaActionPerformed

    private void btnactaddtarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactaddtarActionPerformed
        txtcodtarjeta.setEnabled(true);
        txtsaldo.setEnabled(true);
        txtnombrepersona.setEnabled(true);
        jdcfechacaducTarjeta.setEnabled(true);
        jdcfechacreacionTarjeta.setEnabled(true);
        txtdnipersonatarjeta.setEnabled(true);
        txtapematpersona.setEnabled(true);
        txtapepatpersona.setEnabled(true);
        cbxEstadotarjeta.setEnabled(true);
        btnaddtar.setVisible(true);
        btncanTar.setVisible(true);
        txtcodtarjeta.setText("");
        txtsaldo.setText("");
        txtnombrepersona.setText("");
        jdcfechacaducTarjeta.setDate(null);
        jdcfechacreacionTarjeta.setDate(null);
        txtapematpersona.setText("");
        txtapepatpersona.setText("");
        btnactaddtar.setEnabled(false);  
        
    }//GEN-LAST:event_btnactaddtarActionPerformed

    private void btnactmodtarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactmodtarActionPerformed
            
        txtcodtarjeta.setEnabled(true);
        txtsaldo.setEnabled(true);
        txtnombrepersona.setEnabled(true);
        jdcfechacaducTarjeta.setEnabled(true);
        jdcfechacreacionTarjeta.setEnabled(true);
        txtdnipersonatarjeta.setEnabled(true);
        txtapematpersona.setEnabled(true);
        txtapepatpersona.setEnabled(true);
        cbxEstadotarjeta.setEnabled(true);
        btnmodtar.setVisible(true);
        btncanTar1.setVisible(true);
        txtcodtarjeta.setText("");
        txtsaldo.setText("");
        txtnombrepersona.setText("");
        jdcfechacaducTarjeta.setDate(null);
        jdcfechacreacionTarjeta.setDate(null);
        txtapematpersona.setText("");
        txtapepatpersona.setText("");
        btnactmodtar.setEnabled(false);  
        
        
    }//GEN-LAST:event_btnactmodtarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnactdeltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactdeltarActionPerformed

        txtcodtarjeta.setEnabled(true);
        txtsaldo.setEnabled(true);
        txtnombrepersona.setEnabled(true);
        jdcfechacaducTarjeta.setEnabled(true);
        jdcfechacreacionTarjeta.setEnabled(true);
        txtdnipersonatarjeta.setEnabled(true);
        txtapematpersona.setEnabled(true);
        txtapepatpersona.setEnabled(true);
        cbxEstadotarjeta.setEnabled(true);
        btndeltar.setVisible(true);
        btncanTar2.setVisible(true);
        txtcodtarjeta.setText("");
        txtsaldo.setText("");
        txtnombrepersona.setText("");
        jdcfechacaducTarjeta.setDate(null);
        jdcfechacreacionTarjeta.setDate(null);
        txtapematpersona.setText("");
        txtapepatpersona.setText("");
        btnactdeltar.setEnabled(false);  
        
        
    }//GEN-LAST:event_btnactdeltarActionPerformed

    private void txticodunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txticodunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txticodunidadActionPerformed

    private void cbxEstadoConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoConsumoActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
      
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tblusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblusuariosMouseClicked
        if(evt.getClickCount() == 1) {
    JTable receptor = (JTable)evt.getSource();
    txtIdUser.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
    txtDniUsers.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
    txtUserUsuario.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
    txtContraUser.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),3).toString());
    cbxestadoUser.setSelectedItem(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4));
}
    }//GEN-LAST:event_tblusuariosMouseClicked

    private void btnactmoduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactmoduserActionPerformed
        txtUserUsuario.setEnabled(true);
        txtContraUser.setEnabled(true);
        txtDniUsers.setEnabled(true);
        cbxestadoUser.setEnabled(true);
        txtmoduser.setVisible(true);
        btncancelusu1.setVisible(true);
        txtUserUsuario.setText("");
        txtContraUser.setText("");
        txtDniUsers.setText("");
        txtIdUser.setText("");
        btnactmoduser.setEnabled(false);
        
    }//GEN-LAST:event_btnactmoduserActionPerformed

    private void btnactadduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactadduserActionPerformed
        txtUserUsuario.setEnabled(true);
        txtContraUser.setEnabled(true);
        txtDniUsers.setEnabled(true);
        cbxestadoUser.setEnabled(true);
        btnadduser.setVisible(true);
        btncancelusu.setVisible(true);
        txtUserUsuario.setText("");
        txtContraUser.setText("");
        txtDniUsers.setText("");
        txtIdUser.setText("");
        btnactadduser.setEnabled(false);
        
    }//GEN-LAST:event_btnactadduserActionPerformed

    private void btnactdeluserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactdeluserActionPerformed
        txtUserUsuario.setEnabled(true);
        txtContraUser.setEnabled(true);
        txtDniUsers.setEnabled(true);
        cbxestadoUser.setEnabled(true);
        btndeluser.setVisible(true);
        btncancelusu2.setVisible(true);
        txtUserUsuario.setText("");
        txtContraUser.setText("");
        txtDniUsers.setText("");
        txtIdUser.setText("");
        btnactdeluser.setEnabled(false);
    }//GEN-LAST:event_btnactdeluserActionPerformed

    private void txtIdRutaUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdRutaUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdRutaUnidadActionPerformed

    private void txtCodUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodUnidadActionPerformed

    private void txtnombrerutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrerutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrerutaActionPerformed

    private void btnCancelarManRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarManRutActionPerformed
        // TODO add your handling code here:
        txtidrutman.setEnabled(false);
        txtnombreruta.setEnabled(false);
        txtmontoruta.setEnabled(false);
        cbxEstadoRuta.setEnabled(false);
        btnRegrut.setVisible(false);
        btnRegrut.setEnabled(false);
        btnCancelarManRut.setVisible(false);
        btnAddRut.setEnabled(true);
        txtidrutman.setText("");
        txtnombreruta.setText("");
        txtmontoruta.setText("");

    }//GEN-LAST:event_btnCancelarManRutActionPerformed

    private void btnCancelarManRut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarManRut1ActionPerformed
        txtidrutman.setEnabled(false);
        txtnombreruta.setEnabled(false);
        txtmontoruta.setEnabled(false);
        cbxEstadoRuta.setEnabled(false);
        btndelrut.setVisible(false);
        btndelrut.setEnabled(false);
        btnCancelarManRut1.setVisible(false);
        btnelirut.setEnabled(true);
        txtidrutman.setText("");
        txtnombreruta.setText("");
        txtmontoruta.setText("");
        
        
    }//GEN-LAST:event_btnCancelarManRut1ActionPerformed

    private void btnCancelarManRut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarManRut2ActionPerformed
        txtidrutman.setEnabled(false);
        txtnombreruta.setEnabled(false);
        txtmontoruta.setEnabled(false);
        cbxEstadoRuta.setEnabled(false);
        btnModRut.setVisible(false);
        btnModRut.setEnabled(false);
        btnCancelarManRut2.setVisible(false);
        btnmodrut.setEnabled(true);
        txtidrutman.setText("");
        txtnombreruta.setText("");
        txtmontoruta.setText("");


    }//GEN-LAST:event_btnCancelarManRut2ActionPerformed

    private void btndelrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelrutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndelrutActionPerformed

    private void btnadduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadduserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnadduserActionPerformed

    private void btncancelusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelusuActionPerformed
        txtUserUsuario.setEnabled(false);
        txtContraUser.setEnabled(false);
        txtDniUsers.setEnabled(false);
        cbxestadoUser.setEnabled(false);
        btnadduser.setVisible(false);
        btncancelusu.setVisible(false);
        btnactadduser.setEnabled(true);
        txtIdUser.setText("");
        txtUserUsuario.setText("");
        txtContraUser.setText("");
        txtDniUsers.setText("");
    }//GEN-LAST:event_btncancelusuActionPerformed

    private void btndeluserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeluserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeluserActionPerformed

    private void btncancelusu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelusu1ActionPerformed
        // TODO add your handling code here:
        txtUserUsuario.setEnabled(false);
        txtContraUser.setEnabled(false);
        txtDniUsers.setEnabled(false);
        cbxestadoUser.setEnabled(false);
        txtmoduser.setVisible(false);
        btncancelusu1.setVisible(false);
        btnactmoduser.setEnabled(true);
        txtIdUser.setText("");
        txtUserUsuario.setText("");
        txtContraUser.setText("");
        txtDniUsers.setText("");
        
    }//GEN-LAST:event_btncancelusu1ActionPerformed

    private void txtmoduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmoduserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmoduserActionPerformed

    private void btncancelusu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelusu2ActionPerformed
        txtUserUsuario.setEnabled(false);
        txtContraUser.setEnabled(false);
        txtDniUsers.setEnabled(false);
        cbxestadoUser.setEnabled(false);
        btndeluser.setVisible(false);
        btncancelusu2.setVisible(false);
        btnactdeluser.setEnabled(true);
        txtIdUser.setText("");
        txtUserUsuario.setText("");
        txtContraUser.setText("");
        txtDniUsers.setText("");

    }//GEN-LAST:event_btncancelusu2ActionPerformed

    private void btnRegrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegrutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegrutActionPerformed

    private void btnaddunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaddunidadActionPerformed

    private void btncanuni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanuni1ActionPerformed
        // TODO add your handling code here:
        txtCodUnidad.setEnabled(false);
        txtDniunidad.setEnabled(false);
        txtIdRutaUnidad.setEnabled(false);
        txtCodSoat.setEnabled(false);
        cbxEstadoUnidad.setEnabled(false);
        btnmodunidad.setVisible(false);
        btncanuni1.setVisible(false);
        txtCodUnidad.setText("");
        txtDniunidad.setText("");
        txtIdRutaUnidad.setText("");
        txtCodSoat.setText("");
        btnactmodiunidad.setEnabled(true);
    }//GEN-LAST:event_btncanuni1ActionPerformed

    private void btndeluniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeluniActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btndeluniActionPerformed

    private void btncanuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanuniActionPerformed
        // TODO add your handling code here:
        txtCodUnidad.setEnabled(false);
        txtDniunidad.setEnabled(false);
        txtIdRutaUnidad.setEnabled(false);
        txtCodSoat.setEnabled(false);
        cbxEstadoUnidad.setEnabled(false);
        btnaddunidad.setVisible(false);
        btncanuni.setVisible(false);
        txtCodUnidad.setText("");
        txtDniunidad.setText("");
        txtIdRutaUnidad.setText("");
        txtCodSoat.setText("");
        btnactaddunidad.setEnabled(true);
        
        
        
        
        
    }//GEN-LAST:event_btncanuniActionPerformed

    private void btncanuni2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanuni2ActionPerformed
      txtCodUnidad.setEnabled(false);
        txtDniunidad.setEnabled(false);
        txtIdRutaUnidad.setEnabled(false);
        txtCodSoat.setEnabled(false);
        cbxEstadoUnidad.setEnabled(false);
        btncanuni2.setVisible(false);
        btndeluni.setVisible(false);
        txtCodUnidad.setText("");
        txtDniunidad.setText("");
        txtIdRutaUnidad.setText("");
        txtCodSoat.setText("");
        btnactdelunidad.setEnabled(true);
        
        
        
        
        
        
        
    }//GEN-LAST:event_btncanuni2ActionPerformed

    private void btnaddempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaddempActionPerformed

    private void btnmodempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodempActionPerformed

    private void btncanTar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanTar1ActionPerformed
        txtcodtarjeta.setEnabled(false);
        txtsaldo.setEnabled(false);
        txtnombrepersona.setEnabled(false);
        jdcfechacaducTarjeta.setEnabled(false);
        jdcfechacreacionTarjeta.setEnabled(false);
        txtdnipersonatarjeta.setEnabled(false);
        txtapematpersona.setEnabled(false);
        txtapepatpersona.setEnabled(false);
        cbxEstadotarjeta.setEnabled(false);
        btnmodtar.setVisible(false);
        btncanTar1.setVisible(false);
        btnactmodtar.setEnabled(true);

        // Resto del código
        txtcodtarjeta.setText("");
        txtsaldo.setText("");
        txtnombrepersona.setText("");
        jdcfechacaducTarjeta.setDate(null);
        jdcfechacreacionTarjeta.setDate(null);
        txtapematpersona.setText("");
        txtapepatpersona.setText("");
        
    }//GEN-LAST:event_btncanTar1ActionPerformed

    private void btncanper2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanper2ActionPerformed
        txtnombrepersona.setEnabled(false);
        txtdnipersona.setEnabled(false);
        txtnombrepersona.setEnabled(false);
        txtcelusuario.setEnabled(false);
        txtemail.setEnabled(false);
        txtapematpersona.setEnabled(false);
        txtapepatpersona.setEnabled(false);
        cbxestadopersona.setEnabled(false);
        cbxtipousupersona.setEnabled(false);
        txtruc.setEnabled(false);
        btndelper.setVisible(false);
        btncanper2.setVisible(false);
        txtnombrepersona.setText("");
        txtdnipersona.setText("");
        txtnombrepersona.setText("");
        txtcelusuario.setText("");
        txtemail.setText("");
        txtapematpersona.setText("");
        txtapepatpersona.setText("");
        btnactdelper.setEnabled(true);
        
        
    }//GEN-LAST:event_btncanper2ActionPerformed

    private void btncantransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncantransActionPerformed
        // TODO add your handling code here:
        txtnombreempresa.setEnabled(false);
txtrucempresa.setEnabled(false);
txtcolorempresa.setEnabled(false);
cbxEstadoTranporte.setEnabled(false);
btnaddemp.setVisible(false);
btncantrans.setVisible(false);
btnactadduser.setEnabled(true);

// Resto del código
txtnombreempresa.setText("");
txtrucempresa.setText("");
txtcolorempresa.setText("");
        
    }//GEN-LAST:event_btncantransActionPerformed

    private void txtapepatpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapepatpersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapepatpersonaActionPerformed

    private void btncanperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanperActionPerformed
        txtnombrepersona.setEnabled(false);
        txtdnipersona.setEnabled(false);
        txtnombrepersona.setEnabled(false);
        txtcelusuario.setEnabled(false);
        txtemail.setEnabled(false);
        txtapematpersona.setEnabled(false);
        txtapepatpersona.setEnabled(false);
        cbxestadopersona.setEnabled(false);
        cbxtipousupersona.setEnabled(false);
        txtruc.setEnabled(false);
        btnaddperso.setVisible(false);
        btncanper.setVisible(false);
        txtnombrepersona.setText("");
        txtdnipersona.setText("");
        txtnombrepersona.setText("");
        txtcelusuario.setText("");
        txtemail.setText("");
        txtapematpersona.setText("");
        txtapepatpersona.setText("");
        btnactaddper.setEnabled(true);
        
    }//GEN-LAST:event_btncanperActionPerformed

    private void btncanper1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanper1ActionPerformed
        // TODO add your handling code here:
        txtnombrepersona.setEnabled(false);
        txtdnipersona.setEnabled(false);
        txtnombrepersona.setEnabled(false);
        txtcelusuario.setEnabled(false);
        txtemail.setEnabled(false);
        txtapematpersona.setEnabled(false);
        txtapepatpersona.setEnabled(false);
        cbxestadopersona.setEnabled(false);
        cbxtipousupersona.setEnabled(false);
        txtruc.setEnabled(false);
        btnmodper.setVisible(false);
        btncanper1.setVisible(false);
        txtnombrepersona.setText("");
        txtdnipersona.setText("");
        txtnombrepersona.setText("");
        txtcelusuario.setText("");
        txtemail.setText("");
        txtapematpersona.setText("");
        txtapepatpersona.setText("");
        btnactmodper.setEnabled(true);

    }//GEN-LAST:event_btncanper1ActionPerformed

    private void btncanTarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanTarActionPerformed
        txtcodtarjeta.setEnabled(false);
        txtsaldo.setEnabled(false);
        txtnombrepersona.setEnabled(false);
        jdcfechacaducTarjeta.setEnabled(false);
        jdcfechacreacionTarjeta.setEnabled(false);
        txtdnipersonatarjeta.setEnabled(false);
        txtapematpersona.setEnabled(false);
        txtapepatpersona.setEnabled(false);
        cbxEstadotarjeta.setEnabled(false);
        btnaddtar.setVisible(false);
        btncanTar.setVisible(false);
        btnactaddtar.setEnabled(true);
        txtcodtarjeta.setText("");
        txtsaldo.setText("");
        txtnombrepersona.setText("");
        jdcfechacaducTarjeta.setDate(null);
        jdcfechacreacionTarjeta.setDate(null);
        txtapematpersona.setText("");
        txtapepatpersona.setText("");
    }//GEN-LAST:event_btncanTarActionPerformed

    private void btncanTar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanTar2ActionPerformed
        txtcodtarjeta.setEnabled(false);
        txtsaldo.setEnabled(false);
        txtnombrepersona.setEnabled(false);
        jdcfechacaducTarjeta.setEnabled(false);
        jdcfechacreacionTarjeta.setEnabled(false);
        txtdnipersonatarjeta.setEnabled(false);
        txtapematpersona.setEnabled(false);
        txtapepatpersona.setEnabled(false);
        cbxEstadotarjeta.setEnabled(false);
        btndeltar.setVisible(false);
        btncanTar2.setVisible(false);
        btnactdeltar.setEnabled(true);
        txtcodtarjeta.setText("");
        txtsaldo.setText("");
        txtnombrepersona.setText("");
        jdcfechacaducTarjeta.setDate(null);
        jdcfechacreacionTarjeta.setDate(null);
        txtapematpersona.setText("");
        txtapepatpersona.setText("");
    }//GEN-LAST:event_btncanTar2ActionPerformed

    private void btncantrans1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncantrans1ActionPerformed
        // TODO add your handling code here:
        txtnombreempresa.setEnabled(false);
        txtrucempresa.setEnabled(false);
        txtcolorempresa.setEnabled(false);
        cbxEstadoTranporte.setEnabled(false);
        btndelemp.setVisible(false);
        btncantrans1.setVisible(false);
        btnactdelemp.setEnabled(true);

        // Resto del código
        txtnombreempresa.setText("");
        txtrucempresa.setText("");
        txtcolorempresa.setText("");
    }//GEN-LAST:event_btncantrans1ActionPerformed

    private void btncantrans2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncantrans2ActionPerformed
        // TODO add your handling code here:
        txtnombreempresa.setEnabled(false);
        txtrucempresa.setEnabled(false);
        txtcolorempresa.setEnabled(false);
        cbxEstadoTranporte.setEnabled(false);
        btnmodemp.setVisible(false);
        btncantrans2.setVisible(false);
        btnactmodemp.setEnabled(true);

        // Resto del código
        txtnombreempresa.setText("");
        txtrucempresa.setText("");
        txtcolorempresa.setText("");
        
    }//GEN-LAST:event_btncantrans2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(vistaadministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaadministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaadministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaadministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaadministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddRut;
    private javax.swing.JButton btnCancelarManRut;
    public javax.swing.JButton btnCancelarManRut1;
    private javax.swing.JButton btnCancelarManRut2;
    public javax.swing.JButton btnListRut;
    public javax.swing.JButton btnModRut;
    public javax.swing.JButton btnRegrut;
    private javax.swing.JButton btnactaddemp;
    private javax.swing.JButton btnactaddper;
    public javax.swing.JButton btnactaddtar;
    public javax.swing.JButton btnactaddunidad;
    private javax.swing.JButton btnactadduser;
    private javax.swing.JButton btnactdelemp;
    private javax.swing.JButton btnactdelper;
    public javax.swing.JButton btnactdeltar;
    public javax.swing.JButton btnactdelunidad;
    private javax.swing.JButton btnactdeluser;
    private javax.swing.JButton btnactmodemp;
    public javax.swing.JButton btnactmodiunidad;
    private javax.swing.JButton btnactmodper;
    public javax.swing.JButton btnactmodtar;
    private javax.swing.JButton btnactmoduser;
    public javax.swing.JButton btnaddemp;
    public javax.swing.JButton btnaddperso;
    public javax.swing.JButton btnaddtar;
    public javax.swing.JButton btnaddunidad;
    public javax.swing.JButton btnadduser;
    private javax.swing.JButton btncanTar;
    private javax.swing.JButton btncanTar1;
    private javax.swing.JButton btncanTar2;
    public javax.swing.JButton btncancelusu;
    public javax.swing.JButton btncancelusu1;
    public javax.swing.JButton btncancelusu2;
    private javax.swing.JButton btncanper;
    private javax.swing.JButton btncanper1;
    private javax.swing.JButton btncanper2;
    private javax.swing.JButton btncantrans;
    private javax.swing.JButton btncantrans1;
    private javax.swing.JButton btncantrans2;
    private javax.swing.JButton btncanuni;
    private javax.swing.JButton btncanuni1;
    private javax.swing.JButton btncanuni2;
    public javax.swing.JButton btndelemp;
    public javax.swing.JButton btndelper;
    public javax.swing.JButton btndelrut;
    public javax.swing.JButton btndeltar;
    public javax.swing.JButton btndeluni;
    public javax.swing.JButton btndeluser;
    public javax.swing.JButton btnelirut;
    public javax.swing.JButton btnmodemp;
    public javax.swing.JButton btnmodper;
    public javax.swing.JButton btnmodrut;
    public javax.swing.JButton btnmodtar;
    public javax.swing.JButton btnmodunidad;
    private javax.swing.JComboBox<String> cbntarjetasrecarga;
    private javax.swing.JComboBox<String> cbxEstadoConsumo;
    public javax.swing.JComboBox<String> cbxEstadoRuta;
    public javax.swing.JComboBox<String> cbxEstadoTranporte;
    public javax.swing.JComboBox<String> cbxEstadoUnidad;
    public javax.swing.JComboBox<String> cbxEstadotarjeta;
    public javax.swing.JComboBox<String> cbxestadoUser;
    public javax.swing.JComboBox<String> cbxestadopersona;
    public javax.swing.JComboBox<String> cbxtipousupersona;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    public javax.swing.JButton jButton18;
    private javax.swing.JButton jButton4;
    public javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelConsumos;
    private javax.swing.JPanel jPanelEmpresas;
    private javax.swing.JPanel jPanelMantenimientoClientesSimples;
    private javax.swing.JPanel jPanelMantenimientoEmpresastransporte;
    private javax.swing.JPanel jPanelMantenimientoEmpresastransporte1;
    private javax.swing.JPanel jPanelMantenimientoRutas;
    private javax.swing.JPanel jPanelMantenimientoTarjetas;
    private javax.swing.JPanel jPanelMantenimientoUsers;
    private javax.swing.JPanel jPanelModuloConsumos;
    private javax.swing.JPanel jPanelModuloRecargas;
    private javax.swing.JPanel jPanelPersonas;
    private javax.swing.JPanel jPanelRecargas;
    private javax.swing.JPanel jPanelRutas;
    private javax.swing.JPanel jPanelTarjetas;
    private javax.swing.JPanel jPanelUnidad;
    private javax.swing.JPanel jPanelUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    public com.toedter.calendar.JDateChooser jdcfechacaducTarjeta;
    public com.toedter.calendar.JDateChooser jdcfechacreacionTarjeta;
    private javax.swing.JLabel lblunidad;
    public javax.swing.JTable tblEmpresastrans;
    private javax.swing.JTable tblconsumos;
    public javax.swing.JTable tblpersonas;
    private javax.swing.JTable tblrecargas;
    public javax.swing.JTable tblrutas;
    public javax.swing.JTable tbltarjetas;
    public javax.swing.JTable tblunidades;
    public javax.swing.JTable tblusuarios;
    public javax.swing.JTextField txtCodSoat;
    public javax.swing.JTextField txtCodUnidad;
    private javax.swing.JTextField txtCodtarjetarecarga;
    public javax.swing.JTextField txtContraUser;
    public javax.swing.JTextField txtDniUsers;
    public javax.swing.JTextField txtDniunidad;
    public javax.swing.JTextField txtIdRutaUnidad;
    public javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtMontorecarga;
    public javax.swing.JTextField txtUserUsuario;
    public javax.swing.JTextField txtapematpersona;
    public javax.swing.JTextField txtapepatpersona;
    public javax.swing.JTextField txtcelusuario;
    public javax.swing.JTextField txtcodtarjeta;
    private javax.swing.JTextField txtcodtarjetaconsumo;
    public javax.swing.JTextField txtcolorempresa;
    public javax.swing.JTextField txtdnipersona;
    public javax.swing.JTextField txtdnipersonatarjeta;
    public javax.swing.JTextField txtemail;
    private javax.swing.JTextField txticodunidad;
    public javax.swing.JTextField txtidrutman;
    public javax.swing.JButton txtmoduser;
    public javax.swing.JTextField txtmontoruta;
    public javax.swing.JTextField txtnombreempresa;
    public javax.swing.JTextField txtnombrepersona;
    public javax.swing.JTextField txtnombreruta;
    public javax.swing.JTextField txtruc;
    public javax.swing.JTextField txtrucempresa;
    public javax.swing.JTextField txtsaldo;
    // End of variables declaration//GEN-END:variables
}
