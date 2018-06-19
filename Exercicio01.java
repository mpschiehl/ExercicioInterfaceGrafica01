/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Marcio Pedro Schiehl
 */
public class Exercicio01 implements InterfaceExercicio01{
private JFrame jFrame;
private JLabel jLabelNome,jLabelIdade,jLabelRaca,
        jLabelApelido,jLabelPreco,jLabelDescricao;
private JTextArea jTextAreaNome, jTextAreaIdade,jTextAreaRaca,
        jTextAreaApelido,jTextAreaPreco,jTextAreaDescricao;
    public Exercicio01(){
     geralTela();
     instaciarComponentes();
     adicionarComponentes();
     gerarLocalizacoes();
     gerarDimensoes();
     jFrame.setVisible(true);
    }
    @Override
    public void geralTela() {
       jFrame = new JFrame("Exercicio 01");
       jFrame.setSize(620,440);
       jFrame.setLayout(null);
       jFrame.getContentPane().setBackground(Color.decode("#ecefce"));
       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jFrame.setLocationRelativeTo(null);
        
    }

    @Override
    public void adicionarComponentes() {
       jFrame.add(jLabelApelido);
       jFrame.add(jLabelDescricao);
       jFrame.add(jLabelIdade);
       jFrame.add(jLabelNome);
       jFrame.add(jLabelPreco);
       jFrame.add(jLabelRaca);
       jFrame.add(jTextAreaApelido);
       jFrame.add(jTextAreaIdade);
       jFrame.add(jTextAreaNome);
       jFrame.add(jTextAreaPreco);
       jFrame.add(jTextAreaRaca);
       jFrame.add(jTextAreaDescricao);
    }

    @Override
    public void instaciarComponentes() {
       jLabelApelido = new JLabel("Apelido");
       jLabelDescricao= new JLabel("Descrição");
        jLabelIdade= new JLabel("Idade");
        jLabelNome= new JLabel("Nome");
        jLabelRaca= new JLabel("Ração");
        jLabelPreco = new JLabel("Preço");
        jTextAreaApelido = new JTextArea();
        jTextAreaIdade = new JTextArea();
        jTextAreaNome = new JTextArea();
        jTextAreaPreco = new JTextArea();
        jTextAreaRaca = new JTextArea();
        jTextAreaRaca = new JTextArea();
        jTextAreaDescricao = new JTextArea();
        
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
        jTextAreaNome.setLocation(10,30);
        jTextAreaIdade.setLocation(400,30);
        jTextAreaRaca.setLocation(10,70);
        jTextAreaApelido.setLocation(200,70);
        jTextAreaPreco.setLocation(400,70);
        jTextAreaDescricao.setLocation(10,220);
    
    }

    @Override
    public void gerarDimensoes() {
        //dimensoes das labels
        jLabelNome.setSize(70,20);
        jLabelIdade.setSize(70,20);
        jLabelRaca.setSize(70,20);
        jLabelApelido.setSize(70,20);
        jLabelPreco.setSize(70,20);
        jLabelDescricao.setSize(70,20);
        //dimensões TextArea
        jTextAreaNome.setSize(340,20);
        jTextAreaIdade.setSize(190,20);
        jTextAreaRaca.setSize(140,20);
        jTextAreaApelido.setSize(150,20);
        jTextAreaPreco.setSize(190,20);
        jTextAreaDescricao.setSize(580,88);
    }
    
}
