/*
 * JFontChooserDialog.java
 *
 * Created on January 3, 2007, 10:23 AM
 */

package com.sun.example.mvc.utilities;

import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.font.TextAttribute;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.DefaultListModel;

/**
 *
 * @author  Robert Eckstein
 */
public class JFontChooserDialog extends javax.swing.JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7718720219693501318L;

	private Font selectedFont;
    
    protected String[] fontNames;
    protected String fontSizes[] = { "8", "10", "11", "12", "14", "16", "18",
      "20", "24", "30", "36", "40", "48", "60", "72" };  
    protected String fontStyles[] = { "Normal", "Bold", "Italic", "Bold and Italic" };
    
    protected DefaultListModel fontNameListModel;
    protected DefaultListModel fontStyleListModel;
    protected DefaultListModel fontSizeListModel;
    
    /** Creates new form JFontChooserDialog */
    public JFontChooserDialog(Frame parent) {
        
        super(parent);
        initDialog();
        
    }
    
    public JFontChooserDialog(Dialog parent) {
        
        super(parent);
        initDialog();
        
    }
    
    private void initDialog() {
        
        setModal(true);
        setTitle("Choose Font");
        
        Toolkit.getDefaultToolkit();
        fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().
            getAvailableFontFamilyNames();
        
        //  Create the font list
        
        fontNameListModel = new DefaultListModel();
        
        for (int i = 0; i < fontNames.length; i++)
            fontNameListModel.addElement(fontNames[i]);

        //  Create the style list
        
        fontStyleListModel = new DefaultListModel();  
        
        for (int i = 0; i < fontStyles.length; i++)
            fontStyleListModel.addElement(fontStyles[i]);               
        
        //  Create the size list
        
        fontSizeListModel = new DefaultListModel();  
                
        for (int i = 0; i < fontSizes.length; i++)
            fontSizeListModel.addElement(fontSizes[i]);
        
        initComponents();
    }

    public Font getSelectedFont() {
        return selectedFont;
    }

    public void setSelectedFont(Font f) {
    
        selectedFont = f;
        
        resetDialogToSelectedFont();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        fontStyleScrollPane = new javax.swing.JScrollPane();
        fontStyleList = new javax.swing.JList();
        fontNameScrollPane = new javax.swing.JScrollPane();
        fontNameList = new javax.swing.JList();
        fontSizeScrollPane = new javax.swing.JScrollPane();
        fontSizeList = new javax.swing.JList();
        fontNameLabel = new javax.swing.JLabel();
        fontStyleLabel = new javax.swing.JLabel();
        fontSizeLabel = new javax.swing.JLabel();
        spacer = new javax.swing.JLabel();
        textAttributesLabel = new javax.swing.JLabel();
        textAttributesLeftPanel = new javax.swing.JPanel();
        thinUnderlineRadioButton = new javax.swing.JRadioButton();
        thickUnderlineRadioButton = new javax.swing.JRadioButton();
        noUnderlineRadioButton = new javax.swing.JRadioButton();
        standardUnderlineRadioButton = new javax.swing.JRadioButton();
        textAttributesRightPanel = new javax.swing.JPanel();
        strikethroughCheckBox = new javax.swing.JCheckBox();
        subscriptRadioButton = new javax.swing.JRadioButton();
        superscriptRadioButton = new javax.swing.JRadioButton();
        noSubOrSuperRadioButton = new javax.swing.JRadioButton();
        sampleTextPanel = new javax.swing.JPanel();
        sampleTextLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        fontNameTextField = new javax.swing.JTextField();
        fontStyleTextField = new javax.swing.JTextField();
        fontSizeTextField = new javax.swing.JTextField();
        textAttributesCenterPanel = new javax.swing.JPanel();
        dashedUnderlineRadioButton = new javax.swing.JRadioButton();
        dottedUnderlineRadioButton = new javax.swing.JRadioButton();
        grayUnderlineRadioButton = new javax.swing.JRadioButton();
        kerningCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        fontStyleList.setModel(fontStyleListModel);
        fontStyleList.setSelectedIndex(0);
        fontStyleList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                fontStyleListValueChanged(evt);
            }
        });

        fontStyleScrollPane.setViewportView(fontStyleList);

        fontNameList.setModel(fontNameListModel);
        fontNameList.setSelectedIndex(0);
        fontNameList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                fontNameListValueChanged(evt);
            }
        });

        fontNameScrollPane.setViewportView(fontNameList);

        fontSizeList.setModel(fontSizeListModel);
        fontSizeList.setSelectedIndex(0);
        fontSizeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                fontSizeListValueChanged(evt);
            }
        });

        fontSizeScrollPane.setViewportView(fontSizeList);

        fontNameLabel.setText("Font:");

        fontStyleLabel.setText("Style:");

        fontSizeLabel.setText("Size:");

        spacer.setText("   ");

        textAttributesLabel.setText("Text Attributes:");

        buttonGroup1.add(thinUnderlineRadioButton);
        thinUnderlineRadioButton.setText("Underline (Thin)");
        thinUnderlineRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        thinUnderlineRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        thinUnderlineRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thinUnderlineRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(thickUnderlineRadioButton);
        thickUnderlineRadioButton.setText("Underline (Thick)");
        thickUnderlineRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        thickUnderlineRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        thickUnderlineRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thickUnderlineRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(noUnderlineRadioButton);
        noUnderlineRadioButton.setSelected(true);
        noUnderlineRadioButton.setText("No Underline");
        noUnderlineRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        noUnderlineRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        noUnderlineRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noUnderlineRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(standardUnderlineRadioButton);
        standardUnderlineRadioButton.setText("Underline");
        standardUnderlineRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        standardUnderlineRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        standardUnderlineRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardUnderlineRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout textAttributesLeftPanelLayout = new javax.swing.GroupLayout(textAttributesLeftPanel);
        textAttributesLeftPanel.setLayout(textAttributesLeftPanelLayout);
        textAttributesLeftPanelLayout.setHorizontalGroup(
            textAttributesLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textAttributesLeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(textAttributesLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thinUnderlineRadioButton)
                    .addComponent(thickUnderlineRadioButton)
                    .addComponent(noUnderlineRadioButton)
                    .addComponent(standardUnderlineRadioButton))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        textAttributesLeftPanelLayout.setVerticalGroup(
            textAttributesLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textAttributesLeftPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(noUnderlineRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(standardUnderlineRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thinUnderlineRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thickUnderlineRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        strikethroughCheckBox.setText("Strikethrough");
        strikethroughCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        strikethroughCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        strikethroughCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strikethroughCheckBoxActionPerformed(evt);
            }
        });

        buttonGroup2.add(subscriptRadioButton);
        subscriptRadioButton.setText("Subscript");
        subscriptRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        subscriptRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        subscriptRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subscriptRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(superscriptRadioButton);
        superscriptRadioButton.setText("Superscript");
        superscriptRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        superscriptRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        superscriptRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superscriptRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(noSubOrSuperRadioButton);
        noSubOrSuperRadioButton.setSelected(true);
        noSubOrSuperRadioButton.setText("Normal");
        noSubOrSuperRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        noSubOrSuperRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        noSubOrSuperRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSubOrSuperRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout textAttributesRightPanelLayout = new javax.swing.GroupLayout(textAttributesRightPanel);
        textAttributesRightPanel.setLayout(textAttributesRightPanelLayout);
        textAttributesRightPanelLayout.setHorizontalGroup(
            textAttributesRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textAttributesRightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(textAttributesRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(strikethroughCheckBox)
                    .addComponent(subscriptRadioButton)
                    .addComponent(noSubOrSuperRadioButton)
                    .addComponent(superscriptRadioButton))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        textAttributesRightPanelLayout.setVerticalGroup(
            textAttributesRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textAttributesRightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(strikethroughCheckBox)
                .addGap(27, 27, 27)
                .addComponent(noSubOrSuperRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subscriptRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(superscriptRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sampleTextPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Preview"));
        sampleTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sampleTextLabel.setText("Sample Text");

        javax.swing.GroupLayout sampleTextPanelLayout = new javax.swing.GroupLayout(sampleTextPanel);
        sampleTextPanel.setLayout(sampleTextPanelLayout);
        sampleTextPanelLayout.setHorizontalGroup(
            sampleTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sampleTextLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );
        sampleTextPanelLayout.setVerticalGroup(
            sampleTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sampleTextLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        fontNameTextField.setEditable(false);

        fontStyleTextField.setEditable(false);

        fontSizeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontSizeTextFieldActionPerformed(evt);
            }
        });

        buttonGroup1.add(dashedUnderlineRadioButton);
        dashedUnderlineRadioButton.setText("Underline (Dashed)");
        dashedUnderlineRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        dashedUnderlineRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        dashedUnderlineRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashedUnderlineRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(dottedUnderlineRadioButton);
        dottedUnderlineRadioButton.setText("Underline (Dotted)");
        dottedUnderlineRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        dottedUnderlineRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        dottedUnderlineRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dottedUnderlineRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(grayUnderlineRadioButton);
        grayUnderlineRadioButton.setText("Underline (Gray)");
        grayUnderlineRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        grayUnderlineRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        grayUnderlineRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grayUnderlineRadioButtonActionPerformed(evt);
            }
        });

        kerningCheckBox.setText("Kerning");
        kerningCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        kerningCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        kerningCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kerningCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout textAttributesCenterPanelLayout = new javax.swing.GroupLayout(textAttributesCenterPanel);
        textAttributesCenterPanel.setLayout(textAttributesCenterPanelLayout);
        textAttributesCenterPanelLayout.setHorizontalGroup(
            textAttributesCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textAttributesCenterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(textAttributesCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashedUnderlineRadioButton)
                    .addComponent(dottedUnderlineRadioButton)
                    .addComponent(grayUnderlineRadioButton)
                    .addComponent(kerningCheckBox))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        textAttributesCenterPanelLayout.setVerticalGroup(
            textAttributesCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textAttributesCenterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kerningCheckBox)
                .addGap(25, 25, 25)
                .addComponent(dashedUnderlineRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dottedUnderlineRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grayUnderlineRadioButton)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sampleTextPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spacer, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAttributesLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textAttributesLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fontNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fontNameScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(fontNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fontStyleTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(fontStyleLabel)
                                    .addComponent(fontStyleScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fontSizeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE))
                                    .addComponent(fontSizeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(fontSizeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(textAttributesCenterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAttributesRightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontNameLabel)
                    .addComponent(fontStyleLabel)
                    .addComponent(fontSizeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fontStyleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fontSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fontStyleScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fontNameScrollPane, 0, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spacer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAttributesLabel))
                    .addComponent(fontSizeScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAttributesCenterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textAttributesRightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textAttributesLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sampleTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fontSizeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontSizeTextFieldActionPerformed
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);
    }//GEN-LAST:event_fontSizeTextFieldActionPerformed

    private void grayUnderlineRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grayUnderlineRadioButtonActionPerformed
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);
    }//GEN-LAST:event_grayUnderlineRadioButtonActionPerformed

    private void dottedUnderlineRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dottedUnderlineRadioButtonActionPerformed
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);
    }//GEN-LAST:event_dottedUnderlineRadioButtonActionPerformed

    private void dashedUnderlineRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashedUnderlineRadioButtonActionPerformed
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);
    }//GEN-LAST:event_dashedUnderlineRadioButtonActionPerformed

    private void standardUnderlineRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardUnderlineRadioButtonActionPerformed
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);
    }//GEN-LAST:event_standardUnderlineRadioButtonActionPerformed

    private void noSubOrSuperRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSubOrSuperRadioButtonActionPerformed
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);
    }//GEN-LAST:event_noSubOrSuperRadioButtonActionPerformed

    private void noUnderlineRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noUnderlineRadioButtonActionPerformed
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);
    }//GEN-LAST:event_noUnderlineRadioButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        selectedFont = null;
        setVisible(false);       
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        setVisible(false);       
    }//GEN-LAST:event_okButtonActionPerformed

    private void superscriptRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superscriptRadioButtonActionPerformed
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);
    }//GEN-LAST:event_superscriptRadioButtonActionPerformed

    private void subscriptRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subscriptRadioButtonActionPerformed
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);
    }//GEN-LAST:event_subscriptRadioButtonActionPerformed

    private void strikethroughCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strikethroughCheckBoxActionPerformed
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);
    }//GEN-LAST:event_strikethroughCheckBoxActionPerformed

    private void thickUnderlineRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thickUnderlineRadioButtonActionPerformed
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);
    }//GEN-LAST:event_thickUnderlineRadioButtonActionPerformed

    private void thinUnderlineRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thinUnderlineRadioButtonActionPerformed
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);
    }//GEN-LAST:event_thinUnderlineRadioButtonActionPerformed

    private void kerningCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kerningCheckBoxActionPerformed
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);
    }//GEN-LAST:event_kerningCheckBoxActionPerformed

    private void fontSizeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fontSizeListValueChanged
        fontSizeTextField.setText(fontSizeList.getSelectedValue().toString());
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);        
    }//GEN-LAST:event_fontSizeListValueChanged

    private void fontStyleListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fontStyleListValueChanged
        fontStyleTextField.setText(fontStyleList.getSelectedValue().toString());
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);       
    }//GEN-LAST:event_fontStyleListValueChanged

    private void fontNameListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fontNameListValueChanged
        fontNameTextField.setText(fontNameList.getSelectedValue().toString());
        selectedFont = createFontFromDialog();
        sampleTextLabel.setFont(selectedFont);       
    }//GEN-LAST:event_fontNameListValueChanged

    private void resetDialogToSelectedFont() {
                
        String family = selectedFont.getFamily();
        
        String size = ""+selectedFont.getSize();
        if (!fontSizeListModel.contains(size))
            fontSizeListModel.addElement(size);
        
        int style = 0;
        if (selectedFont.isBold())
            style += 1;
        if (selectedFont.isItalic())
            style += 2;
        
        Map<TextAttribute, ?> map = selectedFont.getAttributes();

        //  Now reset everything
        
        if (TextAttribute.KERNING_ON.equals(map.get(TextAttribute.KERNING))) {
            kerningCheckBox.setSelected(true);
        }
        
        if (TextAttribute.STRIKETHROUGH_ON.equals(map.get(TextAttribute.STRIKETHROUGH))) {
            strikethroughCheckBox.setSelected(true);
        }
        
        if (TextAttribute.SUPERSCRIPT_SUB.equals(map.get(TextAttribute.SUPERSCRIPT))) {
            subscriptRadioButton.setSelected(true);
        } else if (TextAttribute.SUPERSCRIPT_SUPER.equals(map.get(TextAttribute.SUPERSCRIPT))) {
            superscriptRadioButton.setSelected(true);
        } else {
            noSubOrSuperRadioButton.setSelected(true);
        }

        if (TextAttribute.UNDERLINE_LOW_ONE_PIXEL.equals(map.get(TextAttribute.UNDERLINE))) {
            thinUnderlineRadioButton.setSelected(true);
        } else if (TextAttribute.UNDERLINE_LOW_TWO_PIXEL.equals(map.get(TextAttribute.UNDERLINE))) {
            thickUnderlineRadioButton.setSelected(true);
        } else if (TextAttribute.UNDERLINE_ON.equals(map.get(TextAttribute.UNDERLINE))) {
            standardUnderlineRadioButton.setSelected(true);
        } else if (TextAttribute.UNDERLINE_LOW_DASHED.equals(map.get(TextAttribute.UNDERLINE))) {
            dashedUnderlineRadioButton.setSelected(true);
        } else if (TextAttribute.UNDERLINE_LOW_DOTTED.equals(map.get(TextAttribute.UNDERLINE))) {
            dottedUnderlineRadioButton.setSelected(true);
        } else if (TextAttribute.UNDERLINE_LOW_GRAY.equals(map.get(TextAttribute.UNDERLINE))) {
            grayUnderlineRadioButton.setSelected(true);
        } else {
            noUnderlineRadioButton.setSelected(true);
        }
        
        fontNameList.setSelectedValue(family, true);
        fontStyleList.setSelectedIndex(style);
        fontSizeList.setSelectedValue(size, true);
        
    }
    
    private Font createFontFromDialog() {
        
        String fontFamilyName = (String)fontNameList.getSelectedValue();
        int fontStyle = fontStyleList.getSelectedIndex();
        int fontSize = Integer.parseInt((String)fontSizeList.getSelectedValue());
        
        String fontSizeText = fontSizeTextField.getText();
        if (!fontSizeText.equals(""))
            fontSize = Integer.parseInt(fontSizeText);
        
        Map<TextAttribute, Object> map = new Hashtable<TextAttribute, Object>();
        
        if (kerningCheckBox.isSelected())
            map.put(TextAttribute.KERNING, TextAttribute.KERNING_ON);
        
        if (standardUnderlineRadioButton.isSelected())
            map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        if (thinUnderlineRadioButton.isSelected())
            map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_LOW_ONE_PIXEL);
        if (thickUnderlineRadioButton.isSelected())
            map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_LOW_TWO_PIXEL);
        if (dashedUnderlineRadioButton.isSelected())
            map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_LOW_DASHED);
        if (dottedUnderlineRadioButton.isSelected())
            map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_LOW_DOTTED);
        if (grayUnderlineRadioButton.isSelected())
            map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_LOW_GRAY);

        if (superscriptRadioButton.isSelected())
            map.put(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUPER);            
        if (subscriptRadioButton.isSelected())
            map.put(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUB); 
        
        if (strikethroughCheckBox.isSelected())
            map.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
        
        Font newFont = new Font(fontFamilyName, fontStyle, fontSize);
        newFont = newFont.deriveFont(map);
        
        return newFont;
        
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFontChooserDialog((Frame)null).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButton dashedUnderlineRadioButton;
    private javax.swing.JRadioButton dottedUnderlineRadioButton;
    private javax.swing.JLabel fontNameLabel;
    private javax.swing.JList fontNameList;
    private javax.swing.JScrollPane fontNameScrollPane;
    private javax.swing.JTextField fontNameTextField;
    private javax.swing.JLabel fontSizeLabel;
    private javax.swing.JList fontSizeList;
    private javax.swing.JScrollPane fontSizeScrollPane;
    private javax.swing.JTextField fontSizeTextField;
    private javax.swing.JLabel fontStyleLabel;
    private javax.swing.JList fontStyleList;
    private javax.swing.JScrollPane fontStyleScrollPane;
    private javax.swing.JTextField fontStyleTextField;
    private javax.swing.JRadioButton grayUnderlineRadioButton;
    private javax.swing.JCheckBox kerningCheckBox;
    private javax.swing.JRadioButton noSubOrSuperRadioButton;
    private javax.swing.JRadioButton noUnderlineRadioButton;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel sampleTextLabel;
    private javax.swing.JPanel sampleTextPanel;
    private javax.swing.JLabel spacer;
    private javax.swing.JRadioButton standardUnderlineRadioButton;
    private javax.swing.JCheckBox strikethroughCheckBox;
    private javax.swing.JRadioButton subscriptRadioButton;
    private javax.swing.JRadioButton superscriptRadioButton;
    private javax.swing.JPanel textAttributesCenterPanel;
    private javax.swing.JLabel textAttributesLabel;
    private javax.swing.JPanel textAttributesLeftPanel;
    private javax.swing.JPanel textAttributesRightPanel;
    private javax.swing.JRadioButton thickUnderlineRadioButton;
    private javax.swing.JRadioButton thinUnderlineRadioButton;
    // End of variables declaration//GEN-END:variables
    
}