/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Marcio Pedro Schiehl
 */
public class Exercicio01 implements InterfaceExercicio01{
private JFrame jFrame;
private JLabel jLabelNome,jLabelIdade,jLabelRaca,
        jLabelApelido,jLabelPreco,jLabelDescricao;
private JTextArea jTextAreaDescricao;
private JTextField jTextFieldNome, jTextFieldIdade,jTextFieldRaca,
        jTextFieldApelido,jTextFieldPreco;
private JComboBox jComboBoxRaca;
private JButton jButtonSalvar,jButtonCancelar;
private JRadioButton jRadioButtonVivo, jRadioButtonMorto,
         jRadioButtonRacao,jRadioButtonCome;
private JCheckBox jCheckBoxAdestrado, jCheckBoxVacinado,jCheckBoxCastrado,
        jCheckBoxTemPedigree;
public Exercicio01(){
     geralTela();
     instaciarComponentes();
     adicionarComponentes();
     gerarLocalizacoes();
     gerarDimensoes();
     configurarComBoBox();
     estilizarRadioECheckBox();
     jFrame.setVisible(true);
    }
    @Override
    public void geralTela() {
       jFrame = new JFrame("Exercicio 01");
       jFrame.setSize(620,440);
       jFrame.setLayout(null);
       jFrame.getContentPane().setBackground(Color.decode("#ced2db"));
       jFrame.setResizable(false);
       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jFrame.setLocationRelativeTo(null);
        
    }

    @Override
    public void adicionarComponentes() {
       jFrame.add(jButtonSalvar);
       jFrame.add(jButtonCancelar);
       jFrame.add(jLabelApelido);
       jFrame.add(jLabelDescricao);
       jFrame.add(jLabelIdade);
       jFrame.add(jLabelNome);
       jFrame.add(jLabelPreco);
       jFrame.add(jLabelRaca);
       jFrame.add(jTextFieldApelido);
       jFrame.add(jTextFieldIdade);
       jFrame.add(jTextFieldNome);
       jFrame.add(jTextFieldPreco);
       jFrame.add(jComboBoxRaca);
       jFrame.add(jTextAreaDescricao);
       jFrame.add(jRadioButtonVivo);
       jFrame.add(jRadioButtonMorto);
       jFrame.add(jRadioButtonRacao);
       jFrame.add(jRadioButtonCome);
       jFrame.add(jCheckBoxAdestrado);
       jFrame.add(jCheckBoxCastrado);
       jFrame.add(jCheckBoxTemPedigree);
       jFrame.add(jComboBoxRaca);
       jFrame.add(jCheckBoxVacinado);
    }

    @Override
    public void instaciarComponentes() {
       jLabelApelido = new JLabel("Apelido");
       jLabelDescricao= new JLabel("Descrição");
        jLabelIdade= new JLabel("Idade");
        jLabelNome= new JLabel("Nome");
        jLabelRaca= new JLabel("Raça");
        jLabelPreco = new JLabel("Preço");
        jTextFieldApelido = new JTextField();
        jTextFieldIdade = new JTextField();
        jTextFieldNome = new JTextField();
        jTextFieldPreco = new JTextField();
        jTextFieldRaca = new JTextField();
        jTextFieldRaca = new JTextField();
        jTextAreaDescricao = new JTextArea();
        jComboBoxRaca = new JComboBox();
        jButtonSalvar = new JButton("Salvar");
        jButtonCancelar = new JButton("Cancelar");
        jRadioButtonVivo = new JRadioButton("Vivo");
        jRadioButtonCome = new JRadioButton("Come Almoços, Janta");
        jRadioButtonMorto = new JRadioButton("Morto");
        jRadioButtonRacao = new JRadioButton("Ração");
        jCheckBoxAdestrado = new JCheckBox("Adestrado");
        jCheckBoxCastrado = new JCheckBox("Castrado");
        jCheckBoxTemPedigree= new JCheckBox("Tem Pedigree");
        jCheckBoxVacinado = new JCheckBox("Vacinado");
        
    }
    public void estilizarRadioECheckBox(){
        jRadioButtonVivo.setContentAreaFilled(false);
        jRadioButtonMorto.setContentAreaFilled(false);
        jRadioButtonRacao.setContentAreaFilled(false);
        jRadioButtonCome.setContentAreaFilled(false);
        jCheckBoxAdestrado.setContentAreaFilled(false);
        jCheckBoxVacinado.setContentAreaFilled(false);
        jCheckBoxCastrado.setContentAreaFilled(false);
        jCheckBoxTemPedigree.setContentAreaFilled(false);
    }

    @Override
    public void gerarLocalizacoes() {
        //Localização das Labels 
        jLabelNome.setLocation(10,10);
        jLabelIdade.setLocation(400,10);
        jLabelRaca.setLocation(10,50);
        jLabelApelido.setLocation(200,50);
        jLabelPreco.setLocation(400,50);
        jLabelDescricao.setLocation(10,200);
        //Localização das TextArea
        jTextFieldNome.setLocation(10,30);
        jTextFieldIdade.setLocation(400,30);
        jTextFieldApelido.setLocation(200,70);
        jTextFieldPreco.setLocation(400,70);
        jTextAreaDescricao.setLocation(10,220);
        //localizacao do Combobox
        jComboBoxRaca.setLocation(10,70);
        //localização JButton
        jButtonSalvar.setLocation(320,320);
        jButtonCancelar.setLocation(460,320);
        //Localização JRadionButton
        jRadioButtonVivo.setLocation(10,120);
        jRadioButtonMorto.setLocation(10,150);
        jRadioButtonRacao.setLocation(80,120);
        jRadioButtonCome.setLocation(80,150);
        //localização JCheckBox
        jCheckBoxAdestrado.setLocation(280, 120);
        jCheckBoxVacinado.setLocation(280,150);
        jCheckBoxCastrado.setLocation(400,120);
        jCheckBoxTemPedigree.setLocation(400,150);
        
        
    }

    @Override
    public void gerarDimensoes() {
        //dimensoes das labels
        jLabelNome.setSize(70,20);
        jLabelIdade.setSize(70,20);
        jLabelApelido.setSize(70,20);
        jLabelPreco.setSize(70,20);
        jLabelRaca.setSize(70,20);
        jLabelDescricao.setSize(70,20);
        //dimensões TextArea
        jTextFieldNome.setSize(340,20);
        jTextFieldIdade.setSize(190,20);
        jTextFieldApelido.setSize(150,20);
        jTextFieldPreco.setSize(190,20);
        jTextAreaDescricao.setSize(580,88);
        jComboBoxRaca.setSize(140,20);
        jButtonSalvar.setSize(130,60);
        jButtonCancelar.setSize(130,60);
        //Tamanho JRadionButton
        jRadioButtonCome.setSize(150,20);
        jRadioButtonMorto.setSize(70,20);
        jRadioButtonRacao.setSize(70,20);
        jRadioButtonVivo.setSize(70,20);
        //tamanho JcheckBox
        jCheckBoxAdestrado.setSize(90,20);
        jCheckBoxCastrado.setSize(90,20);
        jCheckBoxTemPedigree.setSize(120,20);
        jCheckBoxVacinado.setSize(90,20);
              
    }

    @Override
    public void configurarComBoBox() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(
			new Object[]{
				"Affenpinscher",  "Afghan Kuchi","Afghan Hound",
                            "Africanis","Aidi","Airedale Terrier","Akbash",
                            "Akita Inu","Akita Americano","Alapaha Blue Blood Bulldog",
                            "Alaskan Klee Kai","Alaunt","American Bully (cão)",
                            "American pit bull terrier","American Staffordshire Terrier",
                            "Anglo-francês da pequena Vénerie","Appenzeller Sennenhund",
                            "Ariége","Armant","Azawakh","Bakharwal","Bandog","Barbet",
                            "Barbudo","Basenji","Basset Artesiano Normando",
                            "Basset Azul da Gasconha","Basset de Artois"
			}
		);

		jComboBoxRaca.setModel(modelo);
		jComboBoxRaca.setSelectedIndex(-1);
    }
    
}
