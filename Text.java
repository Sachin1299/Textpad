/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package text;

import static com.sun.org.apache.bcel.internal.Repository.instanceOf;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.TextComponent;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Desk
 */
public class Text extends javax.swing.JFrame {

    /**
     * Creates new form Text
     */
    public Text() {
        initComponents();
    }
public String filename="Sachin";
Clipboard clipboard=getToolkit().getSystemClipboard();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextPane();
        SearchText = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        javax.swing.JMenuBar MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Cut = new javax.swing.JMenuItem();
        Copy = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TextPad");
        setBackground(java.awt.SystemColor.activeCaption);
        setFont(new java.awt.Font("Aparajita", 1, 10)); // NOI18N
        setForeground(java.awt.SystemColor.activeCaption);

        textArea.setBackground(new java.awt.Color(240, 240, 240));
        textArea.setDisabledTextColor(new java.awt.Color(255, 102, 102));
        textArea.setMinimumSize(new java.awt.Dimension(4, 19));
        jScrollPane1.setViewportView(textArea);

        SearchText.setBackground(new java.awt.Color(216, 226, 237));

        Search.setBackground(java.awt.SystemColor.activeCaption);
        Search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Search.setText("Search");
        Search.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Search.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Search.setIconTextGap(0);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        MenuBar.setBackground(java.awt.SystemColor.activeCaption);
        MenuBar.setForeground(java.awt.SystemColor.controlDkShadow);
        MenuBar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuBar.setSelectionModel(null);

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        jMenu1.add(New);

        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu1.add(Open);

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jMenu1.add(Save);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        MenuBar.add(jMenu1);

        jMenu2.setBackground(java.awt.SystemColor.activeCaption);
        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        Cut.setText("Cut");
        Cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutActionPerformed(evt);
            }
        });
        jMenu2.add(Cut);

        Copy.setText("Copy");
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });
        jMenu2.add(Copy);

        Paste.setText("Paste");
        Paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteActionPerformed(evt);
            }
        });
        jMenu2.add(Paste);

        MenuBar.add(jMenu2);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SearchText, javax.swing.GroupLayout.DEFAULT_SIZE, 1276, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Search))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
         FileDialog fd=new FileDialog(Text.this,"Open File",FileDialog.LOAD);
         fd.setVisible(true);
         
         if(fd.getFile()!=null)
         {
             BufferedReader br=null;
             try {
                 filename=fd.getDirectory()+fd.getFile();
                 setTitle(filename);
                 br = new BufferedReader(new FileReader(filename));
                 StringBuilder sb=new StringBuilder();
                 
                 String line=null;
                 while((line=br.readLine())!=null)
                 {
                     sb.append(line + "\n");
                     textArea.setText(sb.toString());
                     
                 }
                  br.close();
             } catch (Exception ex) {
                 System.out.print(ex.getMessage());
             
             }
         }
    }//GEN-LAST:event_OpenActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
       textArea.setText(" ");
       setTitle("New File");// TODO add your handling code here:
    }//GEN-LAST:event_NewActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
 FileDialog fd=new FileDialog(Text.this,"save file",FileDialog.SAVE);
         fd.setVisible(true);
         
         if(fd.getFile()!=null)
         {
             filename=fd.getDirectory()+fd.getFile();
             setTitle(filename);
         }
         try {
             FileWriter fw=new FileWriter(filename);
             fw.write(textArea.getText());
             setTitle(filename);
             fw.close();
         } catch (Exception ex) {
             System.out.println("Exception :"+ex.getMessage());
         }        // TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

    private void CutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutActionPerformed
StringSelection cutSelection=new StringSelection(textArea.getSelectedText());
clipboard.setContents(cutSelection, cutSelection);
//jTextPane.replaceRange("", jTextPane.getSelectionStart(),jTextPane.getSelectionEnd());
textArea.replaceSelection("");

// TODO add your handling code here:
    }//GEN-LAST:event_CutActionPerformed

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed
StringSelection copySelection=new StringSelection(textArea.getSelectedText());
clipboard.setContents(copySelection, copySelection);
// TODO add your handling code here:
    }//GEN-LAST:event_CopyActionPerformed

    private void PasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteActionPerformed
    Transferable paste=clipboard.getContents(Text.this);
    String sel;
        try {
            sel = (String)paste.getTransferData(DataFlavor.stringFlavor);
           // jTextPane.replaceRange(sel,jTextPane.getSelectionStart() , jTextPane.getSelectionEnd());
           textArea.replaceSelection(sel);
        } catch (UnsupportedFlavorException ex) {
            Logger.getLogger(Text.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Text.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_PasteActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
       searchTextArea(textArea,SearchText.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    
    

   
    

    class myHighlighter extends DefaultHighlighter.DefaultHighlightPainter
    {

        public myHighlighter(Color c) {
            super(c);
        }
        
    }
    
    DefaultHighlighter.DefaultHighlightPainter highlighter=new myHighlighter(Color.yellow);
    public void removeHighlight(JTextComponent textComp)
    {
        Highlighter removeHighlighter=textComp.getHighlighter();
        Highlighter.Highlight[] remove=removeHighlighter.getHighlights();
        
        for(int i=0;i<remove.length;i++)
        {
            if(remove[i].getPainter() instanceof myHighlighter)
            {
              removeHighlighter.removeHighlight(remove[i]);
            }
        }
    }
    public void searchTextArea(JTextComponent textCom,String textString)
    {
        try {
            Highlighter hilight=textCom.getHighlighter();
            Document doc=textCom.getDocument();
            String text=doc.getText(0, doc.getLength());
            
            int pos=0;
            while((pos=text.toUpperCase().indexOf(textString.toUpperCase(),pos))>0)
            {
                hilight.addHighlight(pos, pos+textString.length(), highlighter);
                pos+=textString.length();
            }
        } catch (BadLocationException ex) {
            Logger.getLogger(Text.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Text().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Copy;
    private javax.swing.JMenuItem Cut;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem New;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Paste;
    private javax.swing.JMenuItem Save;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchText;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane textArea;
    // End of variables declaration//GEN-END:variables
}
