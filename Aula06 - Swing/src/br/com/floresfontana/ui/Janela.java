package br.com.floresfontana.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * @author Daniel Flores Fontana
 */
public class Janela extends JFrame {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    private JPanel fundo;

    public Janela() {

	super.setTitle("Aplicação Exemplo");

	super.setSize(WIDTH, HEIGHT);
	super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	super.setResizable(false);
	super.setVisible(true);

	centralizar();

	fundo = new JPanel(new BorderLayout());

	fundo.add(criarMenu(), BorderLayout.PAGE_START);
	fundo.add(criarAbas(), BorderLayout.CENTER);

	add(fundo);

	super.revalidate();
	super.repaint();

    }

    private JTabbedPane criarAbas() {

	JTabbedPane abas = new JTabbedPane();

	abas.addTab("Calculadora", new JPanel());
	abas.addTab("Configurações", new JPanel());

	return abas;
    }

    private JMenuBar criarMenu() {

	JMenuBar menu = new JMenuBar();

	JMenu item1 = new JMenu("Arquivo");
	JMenu item2 = new JMenu("Ajuda");

	JMenuItem subItem1 = new JMenuItem("Sair");
	JMenuItem subItem2 = new JMenuItem("Sobre");

	item1.add(subItem1);
	item2.add(subItem2);

	subItem1.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
		System.exit(HIDE_ON_CLOSE);
	    }
	});

	subItem2.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,
			"Daniel Flores Fontana\nDesenvolvimento de Software\n(54) 9156.1837 | daniel@floresfontana.com.br");
	    }
	});

	menu.add(item1);
	menu.add(item2);

	return menu;
    }

    private void centralizar() {

	Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

	int positionTop = (screen.width - WIDTH) / 2;
	int positionLeft = (screen.height - HEIGHT) / 2;

	super.setLocation(positionTop, positionLeft);

    }

}
