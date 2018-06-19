/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Marcio Pedro Schiehl
 */
public class Exercicio01 implements InterfaceExercicio01{
private JFrame jFrame;
private JLabel jLabelNome,jLabelIdade,jLabelRaca,jLabelApelido,jLabelPreco,
        jLabelDescricao;
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
       jFrame.setSize(660,440);
       jFrame.setLayout(null);
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
    }

    @Override
    public void instaciarComponentes() {
       jLabelApelido = new JLabel("Apelido");
       jLabelDescricao= new JLabel("Descrição");
        jLabelIdade= new JLabel("Idade");
        jLabelNome= new JLabel("Nome");
        jLabelRaca= new JLabel("Ração");
        jLabelPreco = new JLabel("Preço");
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10,10);
        jLabelIdade.setLocation(400,10);
        jLabelRaca.setLocation(10,110);
        jLabelApelido.setLocation(200,110);
        jLabelPreco.setLocation(400,110);
        jLabelDescricao.setLocation(10,200);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(70,20);
        jLabelIdade.setSize(70,20);
        jLabelRaca.setSize(70,20);
        jLabelApelido.setSize(70,20);
        jLabelPreco.setSize(70,20);
        jLabelDescricao.setSize(70,20);
    }
    
}
