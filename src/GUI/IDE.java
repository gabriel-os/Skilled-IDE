package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import FUNC.manageInternalFrame;

class createJDesktopPane extends JFrame {
	
	public manageInternalFrame o = new manageInternalFrame();
	private JDesktopPane jd = new JDesktopPane();
	private JMenuBar menu = new JMenuBar();
	private int internalCount = 0; 

	createJDesktopPane() {
		setTitle("Teste");
		setSize(700, 400);
		setVisible(true);
		add(jd);
		setJMenuBar(menu);
		JMenu fileMenu = new JMenu("Arquivo");
		JMenu editMenu = new JMenu("Editar");
		menu.add(fileMenu);
		menu.add(editMenu);
		
		
		fileMenu.add(createMenuItem("Novo", KeyEvent.VK_N, event -> newFile()));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private JMenuItem createMenuItem(String name, int shorcut, ActionListener actionListener) {
		JMenuItem item = new JMenuItem(name, shorcut);
		item.addActionListener(actionListener);
		return item;
	}
	private void newFile() {
		o.addInternalFrame(jd, "Sem Titulo " + internalCount, 30+(30*internalCount), 30+(30*internalCount));
		internalCount = internalCount + 1;
	}
}

public class IDE {

	public static void main(String[] args) {
		createJDesktopPane jn = new createJDesktopPane();

	}

}
