package pixelmagic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import org.opencv.core.Core;


public class MainScreen extends javax.swing.JFrame {
    BufferedImage userImage;
    String userImagePath;
    String outputImagePath;
    BufferedImage output;
    BufferedImage backup;
    BufferedImage outputPreview;
    boolean imageEdited = false;
    boolean imageSaved = false;
    boolean imageFiltered = false;
    MainScreen mainscreen;
    public MainScreen() {
        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        objectDetection = new javax.swing.JButton();
        steganographyButton = new javax.swing.JButton();
        save = new javax.swing.JButton();
        OpenButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        brightnessSlider = new javax.swing.JSlider();
        brightnessOK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sharpnessSlider = new javax.swing.JSlider();
        sharpnessOK = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        contrastSlider = new javax.swing.JSlider();
        contrastOK = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        gammaSlider = new javax.swing.JSlider();
        gammaOK = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
        redeyeRemoveButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sepiaButton = new javax.swing.JButton();
        sketchButton = new javax.swing.JButton();
        grayscaleButton = new javax.swing.JButton();
        invertedButton = new javax.swing.JButton();
        wierdnessButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        redSlider = new javax.swing.JSlider();
        redOKButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        greenSLider = new javax.swing.JSlider();
        greenOKButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        blueSlider = new javax.swing.JSlider();
        blueOKButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        allSlider = new javax.swing.JSlider();
        allOKButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        objectDetection.setText("Object Detection");
        objectDetection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objectDetectionActionPerformed(evt);
            }
        });

        steganographyButton.setText("Steganography");
        steganographyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                steganographyButtonActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        OpenButton.setText("OPEN");
        OpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Brightness");
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 140));

        brightnessOK.setText("OK");
        brightnessOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brightnessOKActionPerformed(evt);
            }
        });

        jLabel2.setText("Sharpness");

        sharpnessOK.setText("OK");
        sharpnessOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharpnessOKActionPerformed(evt);
            }
        });

        jLabel3.setText("Contrast");
        jLabel3.setMinimumSize(new java.awt.Dimension(60, 100));

        contrastOK.setText("OK");
        contrastOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrastOKActionPerformed(evt);
            }
        });

        jLabel5.setText("Gamma Correction");

        gammaOK.setText("OK");
        gammaOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gammaOKActionPerformed(evt);
            }
        });

        redeyeRemoveButton.setText("Red Eye Removal");
        redeyeRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redeyeRemoveButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("FILTERS:");

        sepiaButton.setText("Sepia");
        sepiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sepiaButtonActionPerformed(evt);
            }
        });

        sketchButton.setText("Sketch");
        sketchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sketchButtonActionPerformed(evt);
            }
        });

        grayscaleButton.setText("GrayScale");
        grayscaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grayscaleButtonActionPerformed(evt);
            }
        });

        invertedButton.setText("Inverted");
        invertedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invertedButtonActionPerformed(evt);
            }
        });

        wierdnessButton.setText("Wierdness");
        wierdnessButton.setToolTipText("");

        jLabel6.setText("RED CHANNEL");

        redOKButton.setText("OK");
        redOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redOKButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("GREEN CHANNEL");

        greenOKButton.setText("OK");
        greenOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenOKButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("BLUE CHANNEL");

        blueOKButton.setText("OK");
        blueOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueOKButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("ALL CHANNEL");

        allOKButton.setText("OK");
        allOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allOKButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(grayscaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sepiaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gammaSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gammaOK, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(invertedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sketchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wierdnessButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(contrastSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(contrastOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sharpnessSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(sharpnessOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(brightnessSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(redeyeRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(objectDetection, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(brightnessOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(redSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(greenSLider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(blueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(allSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(redOKButton, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(greenOKButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(blueOKButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(allOKButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(steganographyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(OpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(OpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(redeyeRemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(steganographyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(objectDetection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(brightnessSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(brightnessOK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sharpnessSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sharpnessOK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(contrastSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contrastOK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gammaSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gammaOK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sepiaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sketchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(grayscaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(invertedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wierdnessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(redOKButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(greenSLider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(greenOKButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(blueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(allSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(blueOKButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(allOKButton)))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void objectDetectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objectDetectionActionPerformed
        if(!imageEdited){
            output = ObjectDetection.boxing(userImage);
            imageEdited = true;
        }
        else{
            output = ObjectDetection.boxing(output);
        }
        outputPreview = Utility.resize(output, 640, 480);
        ImageIcon imageIcon = new ImageIcon(outputPreview);
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_objectDetectionActionPerformed

    private void sharpnessOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharpnessOKActionPerformed
        if(!imageEdited){
            output = Sharpeness.adjust(userImage, sharpnessSlider.getValue());
            imageEdited = true;
        }
        else{

            output = Sharpeness.adjust(output, sharpnessSlider.getValue());
        }
        outputPreview = Utility.resize(output, 640, 480);
        ImageIcon imageIcon = new ImageIcon(outputPreview);
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_sharpnessOKActionPerformed

    private void brightnessOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brightnessOKActionPerformed
        if(!imageEdited){
            output = Brightness.adjust(userImage, brightnessSlider.getValue());
            imageEdited = true;
        }
        else{
            output = Brightness.adjust(output, brightnessSlider.getValue());
        }
        outputPreview = Utility.resize(output, 640, 480);
        ImageIcon imageIcon = new ImageIcon(outputPreview);
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_brightnessOKActionPerformed

    private void OpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
      int rVal = chooser.showOpenDialog(this);
      if (rVal == JFileChooser.APPROVE_OPTION) {
          File image = chooser.getSelectedFile();
          userImagePath = image.getAbsolutePath();
          userImage = Utility.readImage(userImagePath);
          BufferedImage resizedImage = Utility.resize(userImage, 640, 480);
          ImageIcon imageIcon = new ImageIcon(resizedImage);
          imageLabel.setIcon(imageIcon);
          imageEdited = false;
          imageFiltered = false;
        
      }
      if (rVal == JFileChooser.CANCEL_OPTION) {
          
      }
    }//GEN-LAST:event_OpenButtonActionPerformed

    private void contrastOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrastOKActionPerformed
        if(!imageEdited){
            output = Contrast.adjust(userImage, contrastSlider.getValue());
            imageEdited = true;
        }
        else{
            output = Contrast.adjust(output, contrastSlider.getValue());
        }
        outputPreview = Utility.resize(output, 640, 480);
        ImageIcon imageIcon = new ImageIcon(outputPreview);
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_contrastOKActionPerformed

    private void gammaOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gammaOKActionPerformed
            if(!imageEdited){
            output = Gamma.adjust2(userImage, gammaSlider.getValue());
            imageEdited = true;
        }
        else
            output = Gamma.adjust2(output, gammaSlider.getValue());
        outputPreview = Utility.resize(output, 640, 480);
        ImageIcon imageIcon = new ImageIcon(outputPreview);
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_gammaOKActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        JFileChooser chooser = new JFileChooser();
       int rVal = chooser.showSaveDialog(this);
       if(rVal == JFileChooser.APPROVE_OPTION )
        try{
            File outputImage = chooser.getSelectedFile();
            ImageIO.write(output, "png", outputImage);
            imageSaved = true;
       }
       catch(IOException e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_saveActionPerformed

    private void steganographyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_steganographyButtonActionPerformed
        this.hide();
        SteganographyUI steganographyui = new SteganographyUI();
        steganographyui.show();
    }//GEN-LAST:event_steganographyButtonActionPerformed

    private void redeyeRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redeyeRemoveButtonActionPerformed
        if(!imageEdited){
            output = FaceDetection.removeRedEye(userImage);
            imageEdited = true;
        }
        else{
            output = FaceDetection.removeRedEye(output);
        }
        outputPreview = Utility.resize(output, 640, 480);
        ImageIcon imageIcon = new ImageIcon(outputPreview);
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_redeyeRemoveButtonActionPerformed

    private void sepiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepiaButtonActionPerformed
        if(!imageEdited && !imageFiltered){
            backup = userImage;
            output = Filters.sepia(userImage, 25);
            imageEdited = true;
            imageFiltered = true;
        }
        else if(!imageFiltered){
            backup = output;
            output = Filters.sepia(output, 25);
            imageFiltered = true;
        }
        else{
            output = Filters.sepia(backup, 25);
        }
        outputPreview = Utility.resize(output, 640, 480);
        ImageIcon imageIcon = new ImageIcon(outputPreview);
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_sepiaButtonActionPerformed

    private void sketchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sketchButtonActionPerformed
        if(!imageEdited && !imageFiltered){
            backup = userImage;
            output = Filters.sketch(userImage);
            imageEdited = true;
            imageFiltered = true;
        }
        else if(!imageFiltered){
            backup = output;
            output = Filters.sketch(output);
            imageFiltered = true;
        }
        else{
            output = Filters.sketch(backup);
        }
        outputPreview = Utility.resize(output, 640, 480);
        ImageIcon imageIcon = new ImageIcon(outputPreview);
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_sketchButtonActionPerformed

    private void grayscaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grayscaleButtonActionPerformed
        if(!imageEdited && !imageFiltered){
            backup = userImage;
            output = Filters.grayscale(userImage);
            imageEdited = true;
            imageFiltered = true;
        }
        else if(!imageFiltered){
            backup = output;
            output = Filters.grayscale(output);
            imageFiltered = true;
        }
        else{
            output = Filters.grayscale(backup);
        }
        outputPreview = Utility.resize(output, 640, 480);
        ImageIcon imageIcon = new ImageIcon(outputPreview);
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_grayscaleButtonActionPerformed

    private void invertedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invertedButtonActionPerformed
        if(!imageEdited && !imageFiltered){
            backup = userImage;
            output = Filters.inverted(userImage);
            imageEdited = true;
            imageFiltered = true;
        }
        else if(!imageFiltered){
            backup = output;
            output = Filters.inverted(output);
            imageFiltered = true;
        }
        else{
            output = Filters.inverted(backup);
        }
        outputPreview = Utility.resize(output, 640, 480);
        ImageIcon imageIcon = new ImageIcon(outputPreview);
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_invertedButtonActionPerformed

    private void redOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redOKButtonActionPerformed
        if(!imageEdited){
            output = Saturation.redSaturation(userImage, redSlider.getValue());
            imageEdited = true;
        }
        else{
            output = Saturation.redSaturation(output, redSlider.getValue());
        }
        outputPreview = Utility.resize(output, 640, 480);
        ImageIcon imageIcon = new ImageIcon(outputPreview);
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_redOKButtonActionPerformed

    private void greenOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenOKButtonActionPerformed
        if(!imageEdited){
            output = Saturation.greenSaturation(userImage, greenSlider.getValue());
            imageEdited = true;
        }
        else{
            output = Saturation.greenSaturation(output, greenSlider.getValue());
        }
        outputPreview = Utility.resize(output, 640, 480);
        ImageIcon imageIcon = new ImageIcon(outputPreview);
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_greenOKButtonActionPerformed

    private void blueOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueOKButtonActionPerformed
        if(!imageEdited){
            output = Saturation.blueSaturation(userImage, blueSlider.getValue());
            imageEdited = true;
        }
        else{
            output = Saturation.blueSaturation(output, blueSlider.getValue());
        }
        outputPreview = Utility.resize(output, 640, 480);
        ImageIcon imageIcon = new ImageIcon(outputPreview);
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_blueOKButtonActionPerformed

    private void allOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allOKButtonActionPerformed
        if(!imageEdited){
            output = Saturation.allSaturation(userImage, allSlider.getValue());
            imageEdited = true;
        }
        else{
            output = Saturation.allSaturation(output, allSlider.getValue());
        }
        outputPreview = Utility.resize(output, 640, 480);
        ImageIcon imageIcon = new ImageIcon(outputPreview);
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_allOKButtonActionPerformed
    public static void main(String args[]) {
         
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OpenButton;
    private javax.swing.JButton allOKButton;
    private javax.swing.JSlider allSlider;
    private javax.swing.JButton blueOKButton;
    private javax.swing.JSlider blueSlider;
    private javax.swing.JButton brightnessOK;
    private javax.swing.JSlider brightnessSlider;
    private javax.swing.JButton contrastOK;
    private javax.swing.JSlider contrastSlider;
    private javax.swing.JButton gammaOK;
    private javax.swing.JSlider gammaSlider;
    private javax.swing.JButton grayscaleButton;
    private javax.swing.JButton greenOKButton;
    private javax.swing.JSlider greenSLider;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton invertedButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton objectDetection;
    private javax.swing.JButton redOKButton;
    private javax.swing.JSlider redSlider;
    private javax.swing.JButton redeyeRemoveButton;
    private javax.swing.JButton save;
    private javax.swing.JButton sepiaButton;
    private javax.swing.JButton sharpnessOK;
    private javax.swing.JSlider sharpnessSlider;
    private javax.swing.JButton sketchButton;
    private javax.swing.JButton steganographyButton;
    private javax.swing.JButton wierdnessButton;
    // End of variables declaration//GEN-END:variables
}
