package co.edu.uptc.Interface;

import co.edu.uptc.Logic.LinkedDouble;
import co.edu.uptc.Model.VideoBeam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class GraphicsMain {
    JFrame frame, frame1;
    JPanel panel, panel1;
    JButton buttonAccept, buttonRead, buttonUpdate, buttonDelete, buttonLogin;
    JLabel jlId, jlBrand, jlmodel, jlSize, jlAmbientLight, jlAutoFocus, jlUptc, jlCarreer, jlSubject, jlStudent;
    JTextField tfId, tfBrand, tfModel, tfSize;
    JComboBox CBAmbientLigth, CBAutoFocus;
    Vector<Boolean> vector = new Vector<Boolean>();

    JRadioButton radioButtonAddFirst;
    JRadioButton radioButtonAddLast;
    JRadioButton radioButtonAddBeforeTo;
    JRadioButton radioButtonAddAfterTo;
    JRadioButton radioButtonFindInfo;
    JRadioButton radioButtonGetList;
    JRadioButton radioButtonGetsize;
    JRadioButton radioButtonGetObjetc;
    ButtonGroup buttonGroup;

    LinkedDouble<VideoBeam> ld = new LinkedDouble<>((o1, o2) -> Integer.compare(o1.getId(), o2.getId()));
    int id;
    String brand;
    String model;
    int size;
    boolean autoFocus;
    boolean ambientLigth;

    public GraphicsMain() {
        initComponents();
        vector();
        actionButtonAccept();
        actionButtonRead();
        actionButtonLogin();
        actionButtonUpdate();
        actionButtonDelete();
        actionJRadioBtn();

    }

    public void vector() {
        vector.add(false);
        vector.add(true);
    }

    public void initComponents() {
        frame = new JFrame();
        frame1 = new JFrame();
        panel1 = new JPanel();
        panel = new JPanel();

        frame1.setVisible(true);
        frame1.setSize(400, 180);
        frame1.setResizable(false);
        panel1.setBounds(3, 3, 375, 225);
        panel1.setBackground(Color.decode("#C4C4C4"));

        jlUptc = new JLabel("UNIVERSIDAD PEDAGÓGICA Y TECNOLÓGICA DE COLOMBIA");
        jlCarreer = new JLabel("INGENIERÍA DE SISTEMAS Y COMPUTACIÓN         ");
        jlSubject = new JLabel("       PROGRAMACIÓN III                ");
        jlStudent = new JLabel("YORMAN ALEXANDER CARRILLO MARTINEZ                  ");
        buttonLogin = new JButton("INGRESAR");
        buttonLogin.setBackground(Color.decode("#F33030"));
        buttonLogin.setFocusable(false);


        frame1.add(panel1);
        panel1.add(jlUptc);
        panel1.add(jlCarreer);
        panel1.add(jlSubject);
        panel1.add(jlStudent);
        panel1.add(buttonLogin);

        jlId = new JLabel("Id");
        jlBrand = new JLabel("Marca");
        jlmodel = new JLabel("Modelo");
        jlSize = new JLabel("Tamaño");
        jlAmbientLight = new JLabel("Luz Ambiente");
        jlAutoFocus = new JLabel("Foco Automatica");

        tfId = new JTextField();
        tfBrand = new JTextField();
        tfModel = new JTextField();
        tfSize = new JTextField();
        CBAmbientLigth = new JComboBox(vector);
        CBAutoFocus = new JComboBox(vector);

        buttonAccept = new JButton("Crear");
        buttonAccept.setBackground(Color.decode("#D1D1D1"));
        buttonRead = new JButton("Leer");
        buttonRead.setBackground(Color.decode("#D1D1D1"));
        buttonUpdate = new JButton("Actualizar");
        buttonDelete = new JButton("Eliminar");
        buttonDelete.setBackground(Color.decode("#B01405"));


        frame.setVisible(false);
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        panel.setBounds(5, 5, 575, 350);
        panel.setBackground(Color.decode("#9C9C9C"));
        panel.setLayout(null);

        jlId.setBounds(30, 50, 100, 30);
        tfId.setBounds(150, 50, 120, 30);

        jlBrand.setBounds(30, 90, 100, 30);
        tfBrand.setBounds(150, 90, 120, 30);

        jlmodel.setBounds(30, 130, 100, 30);
        tfModel.setBounds(150, 130, 120, 30);

        jlSize.setBounds(30, 170, 100, 30);
        tfSize.setBounds(150, 170, 120, 30);

        jlAmbientLight.setBounds(30, 210, 100, 30);
        CBAmbientLigth.setBounds(150, 210, 120, 30);

        jlAutoFocus.setBounds(30, 250, 100, 30);
        CBAutoFocus.setBounds(150, 250, 120, 30);

        radioButtonAddFirst = new JRadioButton("Add First", false);
        radioButtonAddFirst.setBounds(330, 50, 100, 30);
        radioButtonAddFirst.setBackground(Color.decode("#9C9C9C"));
        radioButtonAddFirst.setFocusable(false);

        radioButtonAddLast = new JRadioButton("Add Last", false);
        radioButtonAddLast.setBounds(440, 50, 100, 30);
        radioButtonAddLast.setBackground(Color.decode("#9C9C9C"));
        radioButtonAddLast.setFocusable(false);

        radioButtonAddBeforeTo = new JRadioButton("Add Before To", false);
        radioButtonAddBeforeTo.setBounds(330, 90, 100, 30);
        radioButtonAddBeforeTo.setBackground(Color.decode("#9C9C9C"));
        radioButtonAddBeforeTo.setFocusable(false);

        radioButtonAddAfterTo = new JRadioButton("Add Afer To", false);
        radioButtonAddAfterTo.setBounds(440, 90, 100, 30);
        radioButtonAddAfterTo.setBackground(Color.decode("#9C9C9C"));
        radioButtonAddAfterTo.setFocusable(false);

        radioButtonFindInfo = new JRadioButton("Find Info", false);
        radioButtonFindInfo.setBounds(330, 180, 100, 30);
        radioButtonFindInfo.setBackground(Color.decode("#9C9C9C"));
        radioButtonFindInfo.setFocusable(false);

        radioButtonGetList = new JRadioButton("Get List", false);
        radioButtonGetList.setBounds(440, 180, 100, 30);
        radioButtonGetList.setBackground(Color.decode("#9C9C9C"));
        radioButtonGetList.setFocusable(false);

        radioButtonGetsize = new JRadioButton("Get Size", false);
        radioButtonGetsize.setBounds(330, 220, 100, 30);
        radioButtonGetsize.setBackground(Color.decode("#9C9C9C"));
        radioButtonGetsize.setFocusable(false);

        radioButtonGetObjetc = new JRadioButton("Get Object", false);
        radioButtonGetObjetc.setBounds(440, 220, 100, 30);
        radioButtonGetObjetc.setBackground(Color.decode("#9C9C9C"));
        radioButtonGetObjetc.setFocusable(false);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButtonAddFirst);
        buttonGroup.add(radioButtonAddLast);
        buttonGroup.add(radioButtonAddBeforeTo);
        buttonGroup.add(radioButtonAddAfterTo);
        buttonGroup.add(radioButtonFindInfo);
        buttonGroup.add(radioButtonGetList);
        buttonGroup.add(radioButtonGetsize);
        buttonGroup.add(radioButtonGetObjetc);


        buttonAccept.setBounds(370, 130, 130, 40);
        buttonAccept.setEnabled(false);
        buttonRead.setBounds(370, 260, 130, 40);
        buttonRead.setEnabled(false);
        buttonUpdate.setBounds(30, 310, 100, 30);
        buttonDelete.setBounds(140, 310, 100, 30);


        frame.add(panel);
        panel.add(jlId);
        panel.add(tfId);
        panel.add(jlBrand);
        panel.add(tfBrand);
        panel.add(jlmodel);
        panel.add(tfModel);
        panel.add(jlSize);
        panel.add(tfSize);
        panel.add(jlAmbientLight);
        panel.add(CBAmbientLigth);
        panel.add(jlAutoFocus);
        panel.add(CBAutoFocus);
        panel.add(radioButtonAddFirst);
        panel.add(radioButtonAddLast);
        panel.add(radioButtonAddBeforeTo);
        panel.add(radioButtonAddAfterTo);
        panel.add(radioButtonFindInfo);
        panel.add(radioButtonGetList);
        panel.add(radioButtonGetsize);
        panel.add(radioButtonGetObjetc);
        panel.add(buttonAccept);
        panel.add(buttonRead);
        panel.add(buttonUpdate);
        panel.add(buttonDelete);
    }



    //Accion boton de crear
    public void Accept(ActionEvent e) {

        try {
            id = Integer.parseInt(tfId.getText());
            brand = tfBrand.getText();
            model = tfModel.getText();
            size = Integer.parseInt(tfSize.getText());
            ambientLigth = (boolean) CBAmbientLigth.getSelectedItem();
            autoFocus = (boolean) CBAutoFocus.getSelectedItem();
            if (id != 0 && brand != null && model != null && size != 0 && radioButtonAddFirst.isSelected()) {
                ld.addNodeFirst(new VideoBeam(id, brand, model, size, ambientLigth, autoFocus));
                JOptionPane.showMessageDialog(null, "Agregado al inicio.");
                cleanTxt();
            } else if (id != 0 && brand != null && model != null && size != 0 && radioButtonAddLast.isSelected()) {
                ld.addNodeLast(new VideoBeam(id, brand, model, size, ambientLigth, autoFocus));
                JOptionPane.showMessageDialog(null, "Agregado al final.");
                cleanTxt();
            } else if (id != 0 && brand != null && model != null && size != 0 && radioButtonAddBeforeTo.isSelected()) {
                int idAux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de referencia para insertar antes de."));
                ld.addNodeBeforeTo(ld.findNode(new VideoBeam(idAux, null, null, 0, false, false)), new VideoBeam(id, brand, model, size, ambientLigth, autoFocus));
                JOptionPane.showMessageDialog(null, "Agregado antes del id " + idAux);
                cleanTxt();
            } else if (id != 0 && brand != null && model != null && size != 0 && radioButtonAddAfterTo.isSelected()) {
                int idAux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de referencia para insertar después de."));
                ld.addNodeAfterTo(ld.findNode(new VideoBeam(idAux, null, null, 0, false, false)), new VideoBeam(id, brand, model, size, ambientLigth, autoFocus));
                JOptionPane.showMessageDialog(null, "Agregado después del id " + idAux);
                cleanTxt();
            } else {
                JOptionPane.showMessageDialog(null, "Los campos están vacíos. !!!");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Los campos no son validos.");
        }

    }

    public void actionButtonAccept() {
        buttonAccept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Accept(e);
            }
        });
    }

    //accion del boton Leer
    public void Read(ActionEvent e) {
        try {
            if (radioButtonFindInfo.isSelected()) {
                buttonAccept.setEnabled(true);
                int idAux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id para la información."));
                System.out.println(ld.findInfo(new VideoBeam(idAux, null, null, 0, false, false)));
                JOptionPane.showMessageDialog(null, ld.findInfo(new VideoBeam(idAux, null, null, 0, false, false)));

            } else if (radioButtonGetList.isSelected()) {
                System.out.println(ld.getLinkedList(false));
                if (ld.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "La lista esta vacia.");
                } else {
                    for (int i = 0; i < ld.getLinkedList(false).size(); i++) {
                        JOptionPane.showMessageDialog(null, ld.getLinkedList(false).get(i));
                    }
                }

            } else if (radioButtonGetsize.isSelected()) {
                JOptionPane.showMessageDialog(null, "El tamaño es de: " + ld.getSize());
            } else if (radioButtonGetObjetc.isSelected()) {
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice del arreglo a mostrar."));
                JOptionPane.showMessageDialog(null, ld.getObject(pos));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void actionButtonRead() {
        buttonRead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Read(e);
            }
        });
    }

    //Accion boton actualizar
    public void update(ActionEvent e) {
        id = Integer.parseInt(tfId.getText());
        brand = tfBrand.getText();
        model = tfModel.getText();
        size = Integer.parseInt(tfSize.getText());
        ambientLigth = (boolean) CBAmbientLigth.getSelectedItem();
        autoFocus = (boolean) CBAutoFocus.getSelectedItem();

        ld.addNodeBeforeTo(ld.findNode(new VideoBeam(id, brand, model, size, ambientLigth, autoFocus)), new VideoBeam(id, brand, model, size, ambientLigth, autoFocus));

    }

    public void actionButtonUpdate() {
        buttonUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update(e);
            }
        });
    }

    //Accion del boton eliminar
    public void delete(ActionEvent e) {
        if (ld.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia.");
        } else {
            int idDelete = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id del objeto a eliminar."));
            System.out.println(ld.deleteNode(ld.findNode(new VideoBeam(idDelete, null, null, 0, false, false))));

        }

    }

    public void actionButtonDelete() {
        buttonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(e);
            }
        });
    }

    public void actionJRadioBtn() {
        radioButtonFindInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateJRadioBtn(e);
            }
        });
        radioButtonGetList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateJRadioBtn(e);
            }
        });
        radioButtonGetObjetc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateJRadioBtn(e);
            }
        });
        radioButtonGetsize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateJRadioBtn(e);
            }
        });
        radioButtonAddLast.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateJRadioBtn(e);
            }
        });
        radioButtonAddAfterTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateJRadioBtn(e);
            }
        });
        radioButtonAddBeforeTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateJRadioBtn(e);
            }
        });
        radioButtonAddFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateJRadioBtn(e);
            }
        });

    }

    // Metodo para validar seleccion de de radioButton
    public void validateJRadioBtn(ActionEvent e) {
        if (radioButtonFindInfo.isSelected() || radioButtonGetsize.isSelected() || radioButtonGetObjetc.isSelected() || radioButtonGetList.isSelected()) {
            tfBrand.setEditable(false);
            tfId.setEditable(false);
            tfModel.setEditable(false);
            tfSize.setEditable(false);
            buttonAccept.setEnabled(false);
            CBAutoFocus.setEnabled(false);
            CBAmbientLigth.setEnabled(false);
            buttonRead.setEnabled(true);

        } else {
            tfBrand.setEditable(true);
            tfId.setEditable(true);
            tfModel.setEditable(true);
            tfSize.setEditable(true);
            buttonAccept.setEnabled(true);
            CBAutoFocus.setEnabled(true);
            CBAmbientLigth.setEnabled(true);
            buttonRead.setEnabled(false);
        }

    }

    public void cleanTxt() {
        tfId.setText("");
        tfBrand.setText("");
        tfModel.setText("");
        tfSize.setText("");
    }

    public void login(ActionEvent e) {
        frame.setVisible(true);
        frame1.setVisible(false);
    }

    public void actionButtonLogin() {
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login(e);
            }
        });
    }
}
