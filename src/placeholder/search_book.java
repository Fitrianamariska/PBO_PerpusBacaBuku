/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package placeholder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.*;

/**
 *
 * @author User
 */
public class search_book extends JTextField {
    private String placeholder = "  Cari Buku...";
    private Image icon = null;
    
    public search_book() {
        initListener();
        setOpaque(false);
        setForeground(Color.BLACK);
        setCaretColor(Color.black);
        setHorizontalAlignment(LEFT);
    }
    
    public search_book(String text) {
        initListener();
    }
    
    public search_book(int columns) {
        initListener();
    }
    
    public search_book(String text, int columns) {
        super(text, columns);
        initListener();
    }
    
    public search_book(Document doc, String text, int columns) {
        super(doc, text, columns);
        initListener();
    }

    private void initListener() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                repaint();
            }
        });
    }
    
    public String getPlaceholder() {
        return placeholder;
    }
    
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setColor(getBackground());
        g2.fillRect(0,0,getWidth(),getHeight());
        super.paintComponent(g2);
        g2.dispose();
        super.paintComponent(g);
        if (getText().trim().equals("")) {
            Font font = getFont().deriveFont(Font.PLAIN).deriveFont(Font.PLAIN);
            Graphics2D g2d = (Graphics2D)g;
            FontMetrics fontMetrics = g2d.getFontMetrics(font);
            
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
            g2d.setColor(Color.GRAY);
            g2d.setFont(font);
            java.awt.geom.Rectangle2D rect = fontMetrics.getStringBounds(placeholder, g2d);
            int textHeight = (int)rect.getHeight();
            g2d.drawString(placeholder, 1, textHeight+4);
        }
    }
}
