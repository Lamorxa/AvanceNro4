package Vistas;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.*;
import servicios.ContenedorData;
import servicios.ExtractorArchivos;

public class vistaadministrador extends javax.swing.JFrame {
    
    DefaultTableModel modeloClientes;
    DefaultTableModel modeloempresatransportes;
    DefaultTableModel modeloUsuarios;
    DefaultTableModel modeloRegistroConsumo;
    DefaultTableModel modeloRegitrorecargas;
    DefaultTableModel modeloRutas;
    DefaultTableModel modeloTarjetas;
    DefaultTableModel modeloUnidades;
    
    
    
    
    
    public vistaadministrador() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        
        String titulosPersona[]
                = {
                    "Dni",
                    "Nombres",
                    "ApellidoPaterno",
                    "ApellidoMaterno",
                    "Telefono",
                    "CorreoElectronico",
                    "IdTipoPersona",
                    "RucEmpresa",
                    "estado"};
        String empresatransportes[]
                = {
                    "Rucempresa",
                    "NombreEmpresa",
                    "Color",
                    "Estado"};
        String users[]
                = {
                    "IdUsuario",
                    "Dni",
                    "User",
                    "Contrasena",
                    "estado"};
        String registroConsumo[]
                = {
                    "CodConsumo",
                    "MontoConsumo",
                    "CodTarjeta",
                    "CodUnidad",
                    "FechaConsumo",
                    "estado"};
        String registroRecarga[]
                = {
                    "CodRecarga",
                    "MontoRecarga",
                    "CodTarjeta",
                    "FechaCodRecarga",
                    "estado"};
        
         String ruta[]
                = {
                    "IdRuta",
                    "NombreRuta",
                    "MontoRuta",
                    "estado"};
         
         String tarjetas[]
                = {
                    "CodTarjeta",
                    "Saldo",
                    "Dni",
                    "FechaCreacion",
                    "FechaCaducidad",
                    "estado"};
         String unidad[]
                = {
                    "CodUnidad",
                    "Dni",
                    "Idruta",
                    "CodSoat",
                    "estado"};
         
         
                    modeloUsuarios = new DefaultTableModel(null, users);
                    
                    modeloRegistroConsumo = new DefaultTableModel(null, registroConsumo);
                    tblconsumos.setModel(modeloRegistroConsumo);
                    modeloRegitrorecargas = new DefaultTableModel(null, registroRecarga);
                    tblrecargas.setModel(modeloRegitrorecargas);
                    modeloRutas = new DefaultTableModel(null, ruta);
                    tblrutas.setModel(modeloRutas);
                    modeloTarjetas = new DefaultTableModel(null, tarjetas);
                    tbltarjetas.setModel(modeloTarjetas);
                    modeloUnidades = new DefaultTableModel(null, unidad);
                    tblunidades.setModel(modeloUnidades);
                    modeloClientes = new DefaultTableModel(null, titulosPersona);
                    tblpersonas.setModel(modeloClientes);
                    modeloempresatransportes=new DefaultTableModel(null,empresatransportes);
                    tblEmpresastrans.setModel(modeloempresatransportes);
                    tblusuarios.setModel(modeloUsuarios);
        this.mostrardatos();
    }
    public void mostrardatos(){
                // Para modeloempresatransportes
        while (modeloempresatransportes.getRowCount() > 0) {
            modeloempresatransportes.removeRow(0);
        }

        // Para modeloUsuarios
        while (modeloUsuarios.getRowCount() > 0) {
            modeloUsuarios.removeRow(0);
        }

        // Para modeloRegistroConsumo
        while (modeloRegistroConsumo.getRowCount() > 0) {
            modeloRegistroConsumo.removeRow(0);
        }

        // Para modeloRegitrorecargas
        while (modeloRegitrorecargas.getRowCount() > 0) {
            modeloRegitrorecargas.removeRow(0);
        }

        // Para modeloRutas
        while (modeloRutas.getRowCount() > 0) {
            modeloRutas.removeRow(0);
        }

        // Para modeloTarjetas
        while (modeloTarjetas.getRowCount() > 0) {
            modeloTarjetas.removeRow(0);
        }

        // Para modeloUnidades
        while (modeloUnidades.getRowCount() > 0) {
            modeloUnidades.removeRow(0);
        }

        // Para modeloClientes
        while (modeloClientes.getRowCount() > 0) {
            modeloClientes.removeRow(0);
        }
          ExtractorArchivos datos = new ExtractorArchivos();
          
    for(Personas iterador: ExtractorArchivos.tmpPersonas) {
    Object[] Datos = {
        iterador.getDni(),
        iterador.getNombres(),
        iterador.getApellidoPaterno(),
        iterador.getApellidoMaterno(),
        iterador.getTelefono(),
        iterador.getCorreoElectronico(),
        iterador.getIdTipoPersona(),
        iterador.getRucEmpresa(),
        iterador.getEstado()
    };   
    modeloClientes.addRow(Datos);
    }
    for(RegistroConsumos iterador: ExtractorArchivos.tmpRegistroConsumos) {
    Object[] Datos = {
        iterador.getCodConsumo(),
        iterador.getMontoConsumo(),
        iterador.getCodTarjeta(),
        iterador.getCodUnidad(),
        iterador.getFechaConsumo(),
        iterador.getEstado()
    };   
    modeloRegistroConsumo.addRow(Datos);
    }
    for(RegistroRecargas iterador: ExtractorArchivos.tmpRegistroRecargas) {
    Object[] Datos = {
        iterador.getCodRecarga(),
        iterador.getMontoRecarga(),
        iterador.getCodTarjeta(),
        iterador.getFechaRecarga(),
        iterador.getEstado()
    };   
    modeloRegitrorecargas.addRow(Datos);
    }
    for(Rutas iterador: ExtractorArchivos.tmpRutas) {
    Object[] Datos = {
        iterador.getIdRuta(),
        iterador.getNombreRuta(),
        iterador.getMontoRuta(),
        iterador.getEstado()
    };   
    modeloRutas.addRow(Datos);
}   for(Usuarios iterador: ExtractorArchivos.tmpUsuarios) {
    Object[] Datos = {
        iterador.getIdUsuario(),
        iterador.getDni(),
        iterador.getUser(),
        iterador.getContrasena(),
        iterador.getEstado()
    };   
    modeloUsuarios.addRow(Datos);
}
    for(EmpresaTransporte iterador: ExtractorArchivos.tmpEmpresaTransporte)
    {
        Object[] Datos=
    {
        iterador.getRucEmpresa(),
        iterador.getNombreEmpresa(),
        iterador.getColor(),
        iterador.getEstado()
    };   
            modeloempresatransportes.addRow(Datos);
            }
    for(Tarjetas iterador: ExtractorArchivos.tmpTarjetas) {
    Object[] Datos = {
        iterador.getCodTarjeta(),
        iterador.getSaldo(),
        iterador.getDni(),
        iterador.getFechaCreacion(),
        iterador.getFechaCaducidad(),
        iterador.getEstado()
    };   
    modeloTarjetas.addRow(Datos);
}
    for(Unidades iterador: ExtractorArchivos.tmpUnidades) {
    Object[] Datos = {
        iterador.getCodUnidad(),
        iterador.getDni(),
        iterador.getIdRuta(),
        iterador.getCodSoat(),
        iterador.getEstado()
    };   
    modeloUnidades.addRow(Datos);
    
}
    
    }
        public void limpiarFormulario() {
        txtcolorempresa.setText("");
        txtnombreempresa.setText("");
        txtrucempresa.setText("");
        txtdnipersona.setText("");
        txtnombrepersona.setText("");
        txtapepatpersona.setText("");
        txtapematpersona.setText("");
        txtcelusuario.setText("");
        txtemail.setText("");
        txtruc.setText("");
        txtcodtarjeta.setText("");
        txtsaldo.setText("");
        txtdnipersonatarjeta.setText("");
        txtfechacreacion.setText("");
        txtfechacaducidad.setText("");
        txtIdUsuario.setText("");
        txtDni.setText("");
        txtNombreUsuario.setText("");
        txtcontra.setText("");

    }
    public Personas recuperardatospersona()
    {Personas recuperado =new Personas();
        recuperado.setDni(txtdnipersona.getText());
        recuperado.setNombres(txtnombrepersona.getText());
        recuperado.setApellidoPaterno(txtapepatpersona.getText());
        recuperado.setApellidoMaterno(txtapematpersona.getText());
        recuperado.setTelefono(txtcelusuario.getText());
        recuperado.setCorreoElectronico(txtemail.getText());
        int tipoper=cbxtipousupersona.getSelectedIndex();
        int tipper;
        if (tipoper==0) {
           tipper=1;
        } else {
            if (tipoper==1) {
                tipper=2;
            } else {
                tipper=3;
            }
        }
        recuperado.setIdTipoPersona(tipper);
        int variable= cbxestadopersona.getSelectedIndex();
        if (variable==0) {
            recuperado.setEstado("activo");
        } else {
            recuperado.setEstado("inactivo");
        }
        recuperado.setRucEmpresa(txtruc.getText());
        return recuperado;
    }
    public RegistroConsumos recuperarDatosConsumo() {
    RegistroConsumos recuperado = new RegistroConsumos();
    recuperado.setMontoConsumo(1);
    recuperado.setCodTarjeta(txtcodtarjetaconsumo.getText());
    recuperado.setCodUnidad(txticodunidad.getText());
    int variable = cbxEstadoConsumo.getSelectedIndex();
    if (variable == 0) {
        recuperado.setEstado("activo");
    } else {
        recuperado.setEstado("inactivo");
    }
    return recuperado;
}
    public RegistroRecargas recuperarDatosRecargas() {
    RegistroRecargas recuperado = new RegistroRecargas();
    recuperado.setMontoRecarga(Double.parseDouble(txtMontorecarga.getText()));
    recuperado.setCodTarjeta(txtCodtarjetarecarga.getText());
    int variable = cbxEstadoConsumo.getSelectedIndex();
    if (variable == 0) {
        recuperado.setEstado("activo");
    } else {
        recuperado.setEstado("inactivo");
    }
    return recuperado;
}
    public Usuarios recuperarDatosUsuario() {
    Usuarios recuperado = new Usuarios();
    recuperado.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
    recuperado.setDni(txtDni.getText());
    recuperado.setUser(txtNombreUsuario.getText());
    recuperado.setContrasena(txtcontra.getText());
    int variable = cbxestadoUsuario.getSelectedIndex();
    if (variable == 0) {
        recuperado.setEstado("activo");
    } else {
        recuperado.setEstado("inactivo");
    }
    return recuperado;
}
    public Rutas recuperardatosruta(){
    Rutas recuperado = new Rutas();
    recuperado.setNombreRuta(txtnombreruta.getText());
    recuperado.setIdRuta(Integer.parseInt(txtidruta.getText()));
    recuperado.setMontoRuta(Double.parseDouble(txtmontoruta.getText()));
    int variable = cbxEstadoRuta.getSelectedIndex();
    if (variable == 0) {
        recuperado.setEstado("activo");
    } else {
        recuperado.setEstado("inactivo");
    }
    mostrardatos();
    return recuperado;
    
}
    public Tarjetas recuperarDatosTarjeta() {
    Tarjetas recuperado = new Tarjetas();
    recuperado.setCodTarjeta(txtcodtarjeta.getText());
    recuperado.setSaldo(Double.parseDouble(txtsaldo.getText()));
    recuperado.setDni(txtdnipersonatarjeta.getText());
    recuperado.setFechaCreacion(txtfechacreacion.getText());
    recuperado.setFechaCaducidad(txtfechacaducidad.getText());
    int variable = cbxEstadotarjeta.getSelectedIndex();
    if (variable == 0) {
        recuperado.setEstado("activo");
    } else {
        recuperado.setEstado("inactivo");
    }
        mostrardatos();
    return recuperado;
}

    public EmpresaTransporte recuperardatos(){
        EmpresaTransporte recuperado=new EmpresaTransporte();
        recuperado.setNombreEmpresa(txtnombreempresa.getText());
        recuperado.setRucEmpresa(txtrucempresa.getText());
        recuperado.setColor(txtcolorempresa.getText());
        int variable= cbxEstadoTranporte.getSelectedIndex();
        if (variable==0) {
            recuperado.setEstado("activo");
        } else {
            recuperado.setEstado("inactivo");
        }
        
        mostrardatos();
    
    return recuperado;
            }
    public Unidades recuperardatosUnidad() {
    Unidades recuperado = new Unidades();
    recuperado.setCodUnidad(txtCodUnidad.getText());
    recuperado.setDni(txtDniunidad.getText());
    recuperado.setIdRuta(Integer.parseInt(txtIdRuta.getText()));
    recuperado.setCodSoat(Integer.parseInt(txtCodSoat.getText()));
    int variable = cbxEstadoUnidad.getSelectedIndex();
    if (variable == 0) {
        recuperado.setEstado("activo");
    } else {
        recuperado.setEstado("inactivo");
    }
    mostrardatos();
    return recuperado;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel31 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        cbxtipousupersona = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        cbxestadopersona = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        txtcelusuario = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jPanelMantenimientoRutas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblrutas = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        txtnombreruta = new javax.swing.JTextField();
        txtidruta = new javax.swing.JTextField();
        txtmontoruta = new javax.swing.JTextField();
        cbxEstadoRuta = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanelMantenimientoTarjetas = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbltarjetas = new javax.swing.JTable();
        txtsaldo = new javax.swing.JTextField();
        txtcodtarjeta = new javax.swing.JTextField();
        txtfechacaducidad = new javax.swing.JTextField();
        txtdnipersonatarjeta = new javax.swing.JTextField();
        txtfechacreacion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        cbxEstadotarjeta = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        jPanelModuloRecargas = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtCodtarjetarecarga = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtMontorecarga = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblrecargas = new javax.swing.JTable();
        jPanelMantenimientoTransportistas = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblusuarios = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        cbxestadoUsuario = new javax.swing.JComboBox<>();
        txtcontra = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
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
        jButton14 = new javax.swing.JButton();
        btnmodiempresa = new javax.swing.JButton();
        btneliminarempresa = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        cbxEstadoTranporte = new javax.swing.JComboBox<>();
        jPanelModuloRecargas1 = new javax.swing.JPanel();
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
        jButton16 = new javax.swing.JButton();
        btnmodiempresa1 = new javax.swing.JButton();
        btneliminarempresa1 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        cbxEstadoUnidad = new javax.swing.JComboBox<>();
        txtIdRuta = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Lucida Sans", 3, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 51, 51));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("EtravelEase");
        jLabel31.setToolTipText("");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanelMantenimientoClientesSimples.setBackground(new java.awt.Color(255, 255, 255));

        tblpersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpersonas);

        jLabel10.setText("Nombre");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Mantenimiento de Personas");

        jLabel12.setText("Apellido Paterno");

        txtapematpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapematpersonaActionPerformed(evt);
            }
        });

        jLabel13.setText("DNI");

        jLabel14.setText("Celular");

        jLabel15.setText("Ruc");

        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("LIMPIAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel16.setText("Tipo usuario");

        cbxtipousupersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Pasajero", "Conductor" }));
        cbxtipousupersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxtipousupersonaActionPerformed(evt);
            }
        });

        jLabel43.setText("Apellido Materno");

        cbxestadopersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        cbxestadopersona.setToolTipText("");
        cbxestadopersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxestadopersonaActionPerformed(evt);
            }
        });

        jLabel52.setText("estado");

        jLabel53.setText("Email");

        javax.swing.GroupLayout jPanelMantenimientoClientesSimplesLayout = new javax.swing.GroupLayout(jPanelMantenimientoClientesSimples);
        jPanelMantenimientoClientesSimples.setLayout(jPanelMantenimientoClientesSimplesLayout);
        jPanelMantenimientoClientesSimplesLayout.setHorizontalGroup(
            jPanelMantenimientoClientesSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                .addGroup(jPanelMantenimientoClientesSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txtnombrepersona, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(txtdnipersona, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanelMantenimientoClientesSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtapepatpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))
                        .addGap(94, 94, 94)
                        .addGroup(jPanelMantenimientoClientesSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcelusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(cbxtipousupersona, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanelMantenimientoClientesSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtruc)))
                    .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txtapematpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cbxestadopersona, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelMantenimientoClientesSimplesLayout.setVerticalGroup(
            jPanelMantenimientoClientesSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanelMantenimientoClientesSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelMantenimientoClientesSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtnombrepersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdnipersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanelMantenimientoClientesSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtapepatpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addGroup(jPanelMantenimientoClientesSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcelusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelMantenimientoClientesSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel16))
                            .addComponent(cbxtipousupersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanelMantenimientoClientesSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addGroup(jPanelMantenimientoClientesSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtapematpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel52))
                    .addComponent(cbxestadopersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton3))
                    .addGroup(jPanelMantenimientoClientesSimplesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton4)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab1", jPanelMantenimientoClientesSimples);

        jPanelMantenimientoRutas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMantenimientoRutas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblrutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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
        jPanelMantenimientoRutas.add(txtnombreruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 200, -1));
        jPanelMantenimientoRutas.add(txtidruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, -1));
        jPanelMantenimientoRutas.add(txtmontoruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, -1));

        cbxEstadoRuta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        cbxEstadoRuta.setToolTipText("");
        cbxEstadoRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoRutaActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(cbxEstadoRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 122, -1));

        jLabel54.setText("Monto Ruta");
        jPanelMantenimientoRutas.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 78, -1));

        jButton19.setText("LIMPIAR");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 90, -1));

        jButton20.setText("ELIMINAR");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, -1));

        jButton21.setText("AGREGAR");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 90, -1));

        jButton22.setText("MODIFICAR");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanelMantenimientoRutas.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jLabel55.setText("estado");
        jPanelMantenimientoRutas.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 78, -1));

        jLabel56.setText("IdRuta");
        jPanelMantenimientoRutas.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 78, -1));

        jLabel57.setText("Nombre Ruta");
        jPanelMantenimientoRutas.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 78, -1));

        jTabbedPane1.addTab("tab2", jPanelMantenimientoRutas);

        jPanelMantenimientoTarjetas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMantenimientoTarjetas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Mantenimiento de Tarjetas");
        jPanelMantenimientoTarjetas.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 20, 230, 27));

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelMantenimientoTarjetas.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 350, 189, -1));

        jButton6.setText("Editar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanelMantenimientoTarjetas.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 385, 189, -1));

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanelMantenimientoTarjetas.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 420, 189, -1));

        jButton8.setText("Limpiar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelMantenimientoTarjetas.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 455, 189, -1));

        tbltarjetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbltarjetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltarjetasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbltarjetas);

        jPanelMantenimientoTarjetas.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 59, 533, 443));
        jPanelMantenimientoTarjetas.add(txtsaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 190, -1));
        jPanelMantenimientoTarjetas.add(txtcodtarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 190, -1));
        jPanelMantenimientoTarjetas.add(txtfechacaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 190, -1));
        jPanelMantenimientoTarjetas.add(txtdnipersonatarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 190, -1));
        jPanelMantenimientoTarjetas.add(txtfechacreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 190, -1));

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
        cbxEstadotarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadotarjetaActionPerformed(evt);
            }
        });
        jPanelMantenimientoTarjetas.add(cbxEstadotarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 122, -1));

        jLabel59.setText("estado");
        jPanelMantenimientoTarjetas.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 60, -1));

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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblrecargas);

        jPanelModuloRecargas.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 120, 473, 403));

        jTabbedPane1.addTab("tab4", jPanelModuloRecargas);

        jPanelMantenimientoTransportistas.setBackground(new java.awt.Color(255, 255, 255));

        tblusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblusuariosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblusuarios);

        jLabel25.setText("IdUsuario");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Mantenimiento de Usuarios");

        jLabel30.setText("DNI");

        jLabel32.setText("user");

        jButton10.setText("AGREGAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("MODIFICAR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("ELIMINAR");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("LIMPIAR");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel33.setText("estado");

        cbxestadoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        cbxestadoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxestadoUsuarioActionPerformed(evt);
            }
        });

        jLabel28.setText("Contraseña");

        javax.swing.GroupLayout jPanelMantenimientoTransportistasLayout = new javax.swing.GroupLayout(jPanelMantenimientoTransportistas);
        jPanelMantenimientoTransportistas.setLayout(jPanelMantenimientoTransportistasLayout);
        jPanelMantenimientoTransportistasLayout.setHorizontalGroup(
            jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                .addGroup(jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel26))
                    .addGroup(jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                        .addGroup(jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(cbxestadoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addGroup(jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(12, 12, 12))
        );
        jPanelMantenimientoTransportistasLayout.setVerticalGroup(
            jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                        .addGroup(jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMantenimientoTransportistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxestadoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addGap(12, 12, 12)
                        .addComponent(jButton12))
                    .addGroup(jPanelMantenimientoTransportistasLayout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(12, 12, 12)
                        .addComponent(jButton13)))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab5", jPanelMantenimientoTransportistas);

        jPanelMantenimientoEmpresastransporte.setBackground(new java.awt.Color(255, 255, 255));

        tblEmpresastrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEmpresastrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpresastransMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblEmpresastrans);

        jLabel36.setText("Ruc Empresa");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setText("Mantenimiento de Empresas de Transporte");

        jLabel38.setText("Nombre Empresa");

        txtnombreempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreempresaActionPerformed(evt);
            }
        });

        txtcolorempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcolorempresaActionPerformed(evt);
            }
        });

        jLabel40.setText("Color");

        jButton14.setText("AGREGAR");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        btnmodiempresa.setText("MODIFICAR");
        btnmodiempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodiempresaActionPerformed(evt);
            }
        });

        btneliminarempresa.setText("ELIMINAR");
        btneliminarempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarempresaActionPerformed(evt);
            }
        });

        jButton17.setText("LIMPIAR");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel42.setText("Estado");

        cbxEstadoTranporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
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

        javax.swing.GroupLayout jPanelMantenimientoEmpresastransporteLayout = new javax.swing.GroupLayout(jPanelMantenimientoEmpresastransporte);
        jPanelMantenimientoEmpresastransporte.setLayout(jPanelMantenimientoEmpresastransporteLayout);
        jPanelMantenimientoEmpresastransporteLayout.setHorizontalGroup(
            jPanelMantenimientoEmpresastransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMantenimientoEmpresastransporteLayout.createSequentialGroup()
                .addGroup(jPanelMantenimientoEmpresastransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMantenimientoEmpresastransporteLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanelMantenimientoEmpresastransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelMantenimientoEmpresastransporteLayout.createSequentialGroup()
                                .addGroup(jPanelMantenimientoEmpresastransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtrucempresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(txtnombreempresa, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(94, 94, 94)
                                .addGroup(jPanelMantenimientoEmpresastransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMantenimientoEmpresastransporteLayout.createSequentialGroup()
                                        .addGroup(jPanelMantenimientoEmpresastransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcolorempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelMantenimientoEmpresastransporteLayout.createSequentialGroup()
                                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbxEstadoTranporte, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelMantenimientoEmpresastransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btneliminarempresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanelMantenimientoEmpresastransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnmodiempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanelMantenimientoEmpresastransporteLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel37)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelMantenimientoEmpresastransporteLayout.setVerticalGroup(
            jPanelMantenimientoEmpresastransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMantenimientoEmpresastransporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMantenimientoEmpresastransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMantenimientoEmpresastransporteLayout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtrucempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMantenimientoEmpresastransporteLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcolorempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelMantenimientoEmpresastransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMantenimientoEmpresastransporteLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelMantenimientoEmpresastransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton14)
                            .addComponent(btnmodiempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelMantenimientoEmpresastransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btneliminarempresa)
                            .addComponent(jButton17)))
                    .addGroup(jPanelMantenimientoEmpresastransporteLayout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMantenimientoEmpresastransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombreempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(cbxEstadoTranporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("tab6", jPanelMantenimientoEmpresastransporte);

        jPanelModuloRecargas1.setBackground(new java.awt.Color(255, 255, 255));

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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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

        javax.swing.GroupLayout jPanelModuloRecargas1Layout = new javax.swing.GroupLayout(jPanelModuloRecargas1);
        jPanelModuloRecargas1.setLayout(jPanelModuloRecargas1Layout);
        jPanelModuloRecargas1Layout.setHorizontalGroup(
            jPanelModuloRecargas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModuloRecargas1Layout.createSequentialGroup()
                .addGroup(jPanelModuloRecargas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModuloRecargas1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelModuloRecargas1Layout.createSequentialGroup()
                        .addGroup(jPanelModuloRecargas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModuloRecargas1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116))
                            .addGroup(jPanelModuloRecargas1Layout.createSequentialGroup()
                                .addGroup(jPanelModuloRecargas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelModuloRecargas1Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanelModuloRecargas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelModuloRecargas1Layout.createSequentialGroup()
                                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txticodunidad, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                                            .addComponent(txtcodtarjetaconsumo)))
                                    .addGroup(jPanelModuloRecargas1Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(cbxEstadoConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)))
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanelModuloRecargas1Layout.setVerticalGroup(
            jPanelModuloRecargas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModuloRecargas1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanelModuloRecargas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModuloRecargas1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodtarjetaconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelModuloRecargas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txticodunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModuloRecargas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModuloRecargas1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel60))
                            .addComponent(cbxEstadoConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jButton15))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab7", jPanelModuloRecargas1);

        jPanelMantenimientoEmpresastransporte1.setBackground(new java.awt.Color(255, 255, 255));

        tblunidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblunidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblunidadesMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblunidades);

        jLabel46.setText("CodUnidad");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setText("Mantenimiento de Unidades");

        txtCodUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodUnidadActionPerformed(evt);
            }
        });

        jLabel48.setText("CodSoat");

        txtCodSoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodSoatActionPerformed(evt);
            }
        });

        txtDniunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniunidadActionPerformed(evt);
            }
        });

        jLabel49.setText("Dni");

        jButton16.setText("AGREGAR");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        btnmodiempresa1.setText("MODIFICAR");
        btnmodiempresa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodiempresa1ActionPerformed(evt);
            }
        });

        btneliminarempresa1.setText("ELIMINAR");
        btneliminarempresa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarempresa1ActionPerformed(evt);
            }
        });

        jButton18.setText("LIMPIAR");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel50.setText("Estado");

        cbxEstadoUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
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

        txtIdRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdRutaActionPerformed(evt);
            }
        });

        jLabel61.setText("IdRuta");

        javax.swing.GroupLayout jPanelMantenimientoEmpresastransporte1Layout = new javax.swing.GroupLayout(jPanelMantenimientoEmpresastransporte1);
        jPanelMantenimientoEmpresastransporte1.setLayout(jPanelMantenimientoEmpresastransporte1Layout);
        jPanelMantenimientoEmpresastransporte1Layout.setHorizontalGroup(
            jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createSequentialGroup()
                .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createSequentialGroup()
                                .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCodUnidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(txtCodSoat, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(94, 94, 94)
                                .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDniunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createSequentialGroup()
                                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxEstadoUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createSequentialGroup()
                                        .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btneliminarempresa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnmodiempresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIdRuta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel47)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelMantenimientoEmpresastransporte1Layout.setVerticalGroup(
            jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDniunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton16)
                            .addComponent(btnmodiempresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btneliminarempresa1)
                            .addComponent(jButton18)))
                    .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMantenimientoEmpresastransporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodSoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)
                            .addComponent(cbxEstadoUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

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

    private void cbxestadoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxestadoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxestadoUsuarioActionPerformed

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
      limpiarFormulario();
      mostrardatos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtapematpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapematpersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapematpersonaActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
      limpiarFormulario();
      mostrardatos();
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
          
            btnmodiempresa.setEnabled(true);
            btneliminarempresa.setEnabled(true);
        } 
    }//GEN-LAST:event_tblEmpresastransMouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        EmpresaTransporte objempresa = (EmpresaTransporte) recuperardatos();
        objempresa.insertar(objempresa);
        mostrardatos();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void cbxEstadoTranporteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEstadoTranporteItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoTranporteItemStateChanged

    private void btnmodiempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodiempresaActionPerformed
        EmpresaTransporte editado =(EmpresaTransporte) recuperardatos();
        editado.actualizar(editado, txtrucempresa.getText());
        mostrardatos();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodiempresaActionPerformed

    private void btneliminarempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarempresaActionPerformed
                new EmpresaTransporte().eliminar((EmpresaTransporte) recuperardatos());
        mostrardatos();
    }//GEN-LAST:event_btneliminarempresaActionPerformed

    private void txtcodtarjetaconsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodtarjetaconsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodtarjetaconsumoActionPerformed

    private void tblunidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblunidadesMouseClicked
        if(evt.getClickCount() == 1) {
    JTable receptor = (JTable)evt.getSource();
    // Asegúrate de tener los nombres de los elementos correctos para la clase Unidad
    txtCodUnidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
    txtDniunidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
    txtIdRuta.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
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

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        Unidades objUnidad = (Unidades) recuperardatosUnidad();
objUnidad.insertar(objUnidad);
mostrardatos();
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void btnmodiempresa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodiempresa1ActionPerformed
        // TODO add your handling code here:
        Unidades editado = (Unidades) recuperardatosUnidad();
editado.actualizar(editado, txtCodUnidad.getText());
mostrardatos();
    }//GEN-LAST:event_btnmodiempresa1ActionPerformed

    private void btneliminarempresa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarempresa1ActionPerformed
        // TODO add your handling code here:
        new Unidades().eliminar((Unidades) recuperardatosUnidad());
mostrardatos();
    }//GEN-LAST:event_btneliminarempresa1ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
      limpiarFormulario();
      mostrardatos();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Personas objpersonas = (Personas) recuperardatospersona();
        objpersonas.insertar(objpersonas);
        mostrardatos();    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Personas editado =(Personas) recuperardatospersona();
        editado.actualizar(editado, txtdnipersona.getText());
        mostrardatos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new Personas().eliminar((Personas) recuperardatospersona());
        mostrardatos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbxEstadoRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoRutaActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
new Rutas().eliminar((Rutas) recuperardatosruta());
        mostrardatos();    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
Rutas objRutas = (Rutas) recuperardatosruta();
        objRutas.insertar(objRutas);
        mostrardatos();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        Rutas editado = (Rutas)recuperardatosruta();
        editado.actualizar(editado, txtidruta.getText());
        mostrardatos();    }//GEN-LAST:event_jButton22ActionPerformed

    private void tblrutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblrutasMouseClicked
         JTable receptor = (JTable)evt.getSource();
    txtidruta.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
    txtnombreruta.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
    txtmontoruta.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
    cbxEstadoRuta.setSelectedItem(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3));
    }//GEN-LAST:event_tblrutasMouseClicked

    private void tbltarjetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltarjetasMouseClicked
        if(evt.getClickCount() == 1) {
    JTable receptor = (JTable)evt.getSource();
    txtcodtarjeta.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
    txtsaldo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
    txtdnipersonatarjeta.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
    txtfechacreacion.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),3).toString());
    txtfechacaducidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),4).toString());
    cbxEstadotarjeta.setSelectedItem(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5));
}
    }//GEN-LAST:event_tbltarjetasMouseClicked

    private void cbxEstadotarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadotarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadotarjetaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Tarjetas objTarjeta = (Tarjetas)recuperarDatosTarjeta();
    objTarjeta.insertar(objTarjeta);
    mostrardatos();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
Tarjetas editado = (Tarjetas) recuperarDatosTarjeta();
editado.actualizar(editado, txtcodtarjeta.getText());
mostrardatos();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      limpiarFormulario();
      mostrardatos();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new Tarjetas().eliminar((Tarjetas) recuperarDatosTarjeta());
mostrardatos();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txticodunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txticodunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txticodunidadActionPerformed

    private void cbxEstadoConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoConsumoActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        RegistroConsumos objconsumo = (RegistroConsumos) recuperarDatosConsumo();
        objconsumo.insertar(objconsumo);
        mostrardatos();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        RegistroRecargas objRecargas = (RegistroRecargas) recuperarDatosRecargas();
        objRecargas.insertar(objRecargas);
        mostrardatos();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    limpiarFormulario();
      mostrardatos();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tblusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblusuariosMouseClicked
        if(evt.getClickCount() == 1) {
    JTable receptor = (JTable)evt.getSource();
    txtIdUsuario.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
    txtDni.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
    txtNombreUsuario.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
    txtcontra.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),3).toString());
    cbxestadoUsuario.setSelectedItem(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4));
}
    }//GEN-LAST:event_tblusuariosMouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Usuarios editado = (Usuarios) recuperarDatosUsuario();
    editado.actualizar(editado, txtIdUsuario.getText());
    mostrardatos();
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Usuarios objUsuarios = (Usuarios) recuperarDatosUsuario();
        objUsuarios.insertar(objUsuarios);
        mostrardatos();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
new Usuarios().eliminar((Usuarios) recuperarDatosUsuario());
mostrardatos();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void txtIdRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdRutaActionPerformed

    private void txtCodUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodUnidadActionPerformed

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
    private javax.swing.JButton btneliminarempresa;
    private javax.swing.JButton btneliminarempresa1;
    private javax.swing.JButton btnmodiempresa;
    private javax.swing.JButton btnmodiempresa1;
    private javax.swing.JComboBox<String> cbxEstadoConsumo;
    private javax.swing.JComboBox<String> cbxEstadoRuta;
    private javax.swing.JComboBox<String> cbxEstadoTranporte;
    private javax.swing.JComboBox<String> cbxEstadoUnidad;
    private javax.swing.JComboBox<String> cbxEstadotarjeta;
    private javax.swing.JComboBox<String> cbxestadoUsuario;
    private javax.swing.JComboBox<String> cbxestadopersona;
    private javax.swing.JComboBox<String> cbxtipousupersona;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JPanel jPanelMantenimientoTransportistas;
    private javax.swing.JPanel jPanelModuloRecargas;
    private javax.swing.JPanel jPanelModuloRecargas1;
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
    private javax.swing.JLabel lblunidad;
    private javax.swing.JTable tblEmpresastrans;
    private javax.swing.JTable tblconsumos;
    private javax.swing.JTable tblpersonas;
    private javax.swing.JTable tblrecargas;
    private javax.swing.JTable tblrutas;
    private javax.swing.JTable tbltarjetas;
    private javax.swing.JTable tblunidades;
    private javax.swing.JTable tblusuarios;
    private javax.swing.JTextField txtCodSoat;
    private javax.swing.JTextField txtCodUnidad;
    private javax.swing.JTextField txtCodtarjetarecarga;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDniunidad;
    private javax.swing.JTextField txtIdRuta;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtMontorecarga;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtapematpersona;
    private javax.swing.JTextField txtapepatpersona;
    private javax.swing.JTextField txtcelusuario;
    private javax.swing.JTextField txtcodtarjeta;
    private javax.swing.JTextField txtcodtarjetaconsumo;
    private javax.swing.JTextField txtcolorempresa;
    private javax.swing.JTextField txtcontra;
    private javax.swing.JTextField txtdnipersona;
    private javax.swing.JTextField txtdnipersonatarjeta;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfechacaducidad;
    private javax.swing.JTextField txtfechacreacion;
    private javax.swing.JTextField txticodunidad;
    private javax.swing.JTextField txtidruta;
    private javax.swing.JTextField txtmontoruta;
    private javax.swing.JTextField txtnombreempresa;
    private javax.swing.JTextField txtnombrepersona;
    private javax.swing.JTextField txtnombreruta;
    private javax.swing.JTextField txtruc;
    private javax.swing.JTextField txtrucempresa;
    private javax.swing.JTextField txtsaldo;
    // End of variables declaration//GEN-END:variables
}
