package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
/*from  w ww.j  a va2s  .c om*/
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.TabSet;
import javax.swing.text.TabStop;

public class Main {
  public static void main(String args[]) throws BadLocationException {
    JFrame jf = new JFrame("Skilled IDE");
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container cp = jf.getContentPane();
    JTextPane pane = new JTextPane();
    SimpleAttributeSet set = new SimpleAttributeSet();
    
    
    TabStop[] tabs = new TabStop[2];
    tabs[0] = new TabStop(10, TabStop.ALIGN_RIGHT, TabStop.LEAD_NONE);
    tabs[1] = new TabStop(25, TabStop.ALIGN_LEFT, TabStop.LEAD_NONE);
    TabSet tabset = new TabSet(tabs);

    StyleContext sc = StyleContext.getDefaultStyleContext();
    AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY,
        StyleConstants.TabSet, tabset);
    pane.setParagraphAttributes(aset, false);

  

    
    pane.setText("java2s.com ");


    Document doc = pane.getStyledDocument();
    doc.insertString(doc.getLength(), "Swing ", set);

    set = new SimpleAttributeSet();
    StyleConstants.setFontSize(set, 24);

    doc.insertString(doc.getLength(), "Tutorial", set);

    JScrollPane scrollPane = new JScrollPane(pane);
    cp.add(scrollPane, BorderLayout.CENTER);

    jf.setSize(400, 300);
    jf.setVisible(true);
  }
}