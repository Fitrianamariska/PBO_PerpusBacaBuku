/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placeholder;

import javax.swing.text.*;

/**
 *
 * @author User
 */
public class limit extends PlainDocument {
    private int max;
    
    public limit(int max) {
        super();
        this.max = max;
    }
    
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) {
            return;
        }
        if ((getLength() + str.length()) <= max) {
            super.insertString(offset, str, attr);
        }
    }
}
