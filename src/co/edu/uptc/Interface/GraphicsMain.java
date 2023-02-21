package co.edu.uptc.Interface;

import co.edu.uptc.Logic.LinkedDouble;
import co.edu.uptc.Logic.Node;
import co.edu.uptc.Model.VideoBeam;
import org.w3c.dom.xpath.XPathNamespace;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class GraphicsMain {
    JFrame frame;
    JPanel panel;
    JButton buttonCreate, buttonRead, buttonUpdate, buttonDelete;
    JLabel jlId, jlBrand, jlmodel, jlSize, jlAmbientLight, jlAutoFocus;
    JTextField tfId, tfBrand, tfModel, tfSize;
    JComboBox CBAmbientLigth, CBAutoFocus;
    Vector<Boolean> vector = new Vector<Boolean>();

    JRadioButton radioButtonAddFirst;
    JRadioButton radioButtonAddLast ;
    JRadioButton radioButtonAddBeforeTo;
    JRadioButton radioButtonAddAfterTo;
    JRadioButton radioButtonFindNode;
    JRadioButton radioButtonGetList;
    JRadioButton radioButtonGetsize;
    JRadioButton radioButtonGetObjetc;
    ButtonGroup buttonGroup ;

    LinkedDouble<VideoBeam> ld = new LinkedDouble<>((o1, o2)-> Integer.compare(o1.getId(), o2.getId()));

    public GraphicsMain() {
        initComponents();
        vector();
        actionButtonCreate();
        actionButtonRead();;
        actionButtonUpdate();
        actionButtonDelete();

    }
    public void vector(){
        vector.add(false);
        vector.add(true);
    }

    public void initComponents() {
        frame = new JFrame();
        panel = new JPanel();

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
        CBAmbientLigth= new JComboBox(vector);
        CBAutoFocus = new JComboBox(vector);

        buttonCreate = new JButton("Crear");
        buttonRead = new JButton("Leer");
        buttonUpdate = new JButton("Actualizar");
        buttonDelete = new JButton("Eliminar");


        frame.setVisible(true);
        frame.setSize(600, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        panel.setBounds(5, 5, 575, 450);
        panel.setBackground(Color.decode("#9C9C9C"));
        panel.setLayout(null);

        jlId.setBounds(30,50, 100,30);
        tfId.setBounds(150, 50, 120,30);

        jlBrand.setBounds(30,90,100,30 );
        tfBrand.setBounds(150, 90, 120,30);

        jlmodel.setBounds(30,130, 100,30);
        tfModel.setBounds(150, 130, 120,30);

        jlSize.setBounds(30, 170, 100, 30);
        tfSize.setBounds(150, 170, 120, 30);

        jlAmbientLight.setBounds(30, 210, 100,30);
        CBAmbientLigth.setBounds(150, 210, 120,30);

        jlAutoFocus.setBounds(30, 250, 100, 30 );
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
        radioButtonAddAfterTo.setBounds(440,90, 100, 30);
        radioButtonAddAfterTo.setBackground(Color.decode("#9C9C9C"));
        radioButtonAddAfterTo.setFocusable(false);

        radioButtonFindNode = new JRadioButton("Find Node", false);
        radioButtonFindNode.setBounds(330,130,100,30);
        radioButtonFindNode.setBackground(Color.decode("#9C9C9C"));
        radioButtonFindNode.setFocusable(false);

        radioButtonGetList = new JRadioButton("Get List", false);
        radioButtonGetList.setBounds(440, 130, 100, 30);
        radioButtonGetList.setBackground(Color.decode("#9C9C9C"));
        radioButtonGetList.setFocusable(false);

        radioButtonGetsize = new JRadioButton("Get Size", false);
        radioButtonGetsize.setBounds(330, 170, 100, 30);
        radioButtonGetsize.setBackground(Color.decode("#9C9C9C"));
        radioButtonGetsize.setFocusable(false);

        radioButtonGetObjetc = new JRadioButton("Get Object", false);
        radioButtonGetObjetc.setBounds(440, 170, 100, 30);
        radioButtonGetObjetc.setBackground(Color.decode("#9C9C9C"));
        radioButtonGetObjetc.setFocusable(false);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButtonAddFirst);
        buttonGroup.add(radioButtonAddLast);
        buttonGroup.add(radioButtonAddBeforeTo);
        buttonGroup.add(radioButtonAddAfterTo);
        buttonGroup.add(radioButtonFindNode);
        buttonGroup.add(radioButtonGetList);
        buttonGroup.add(radioButtonGetsize);
        buttonGroup.add(radioButtonGetObjetc);


        buttonCreate.setBounds(30, 400, 100, 30);
        buttonRead.setBounds(140, 400, 100,30);
        buttonUpdate.setBounds(250, 400, 100, 30);
        buttonDelete.setBounds(360, 400, 100, 30);




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
        panel.add(radioButtonFindNode);
        panel.add(radioButtonGetList);
        panel.add(radioButtonGetsize);
        panel.add(radioButtonGetObjetc);
        panel.add(buttonCreate);
        panel.add(buttonRead);
        panel.add(buttonUpdate);
        panel.add(buttonDelete);
    }
    int id ;
    String brand;
    String model ;
    int size ;
    boolean autoFocus;
    boolean ambientLigth ;
    //Accion boton de crear
    public void Create(ActionEvent e) {
        try {
            id = Integer.parseInt(tfId.getText());
            brand = tfBrand.getText();
            model = tfModel.getText();
            size = Integer.parseInt(tfSize.getText());
            ambientLigth = (boolean) CBAmbientLigth.getSelectedItem();
            autoFocus = (boolean) CBAutoFocus.getSelectedItem();

            if (id != 0 && brand != null && model != null && size != 0){
                ld.addNodeFirst(new VideoBeam(id, brand, model, size, ambientLigth,autoFocus));
                JOptionPane.showMessageDialog(null, "Agregado");
            }else{
                JOptionPane.showMessageDialog(null, "Los campos estan vacios !!!");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public void actionButtonCreate() {
        buttonCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Create(e);
            }
        });
    }

    //accion del boton Leer
    public void Read(ActionEvent e) {
        System.out.println(ld.getLinkedList(true));
        System.out.println("tamaño: " + ld.getSize());
        System.out.println(ld.findNode(new VideoBeam(12, null, null, 0, false , false)));

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
        id = Integer.parseInt(tfId.getText());
        brand = tfBrand.getText();
        model = tfModel.getText();
        size = Integer.parseInt(tfSize.getText());
        ambientLigth = (boolean) CBAmbientLigth.getSelectedItem();
        autoFocus = (boolean) CBAutoFocus.getSelectedItem();

        ld.addNodeBeforeTo(ld.findNode(new VideoBeam(id,brand, model,size,ambientLigth,autoFocus)),new VideoBeam(id, brand, model, size, ambientLigth, autoFocus));
    }

    public void actionButtonDelete() {
        buttonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(e);
            }
        });
    }
}
