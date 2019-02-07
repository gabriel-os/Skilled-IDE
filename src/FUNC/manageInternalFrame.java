package FUNC;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;


public class manageInternalFrame extends JFrame{
	public void addInternalFrame(JDesktopPane jd, String nome, int loc1, int loc2) {
		JInternalFrame jn = new JInternalFrame(nome, true, true, true, true);
		jn.setLayout(new FlowLayout());
		jn.setSize(300, 300);
		jd.add(new JButton("Botão"));
		jn.setLocation(loc2, loc2);
		jn.setVisible(true);
		jd.add(jn);
		jn.moveToFront();
	}
}
