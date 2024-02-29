
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class Operation extends javax.swing.JFrame {
static int[]count=new int[1];
    private String directoryPath;
     static String name="";
             static Map<Character, Integer> characterFrequency = new HashMap<>();
               public Operation(String directoryPath) {
        initComponents();
        this.directoryPath = directoryPath;
         checkTestFiles();
        // Do other initialization if needed
    }
;   public Operation(int count,String name){
           initComponents();
       this.count[0]=count;
       this.name=name;
       updateCharacterFrequency(name);
        
    }
    public static int getcount(){
        return count[0];
    }
    public static String getname(){
        return name;
    }
   
public static Map<Character, Integer> getCharacterFrequency() {
        return characterFrequency;
    }

    // ... (existing code)

     private final char characterFrequencyLock=' ';

    public synchronized void updateCharacterFrequency(String text) {
        
        try {
            // Clear previous character frequency
            characterFrequency.clear();

            // Update character frequency for the new text
            for (char c : text.toCharArray()) {
                characterFrequency.put(c, characterFrequency.getOrDefault(c, 0) + 1);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
  
    
    String []names=new String[50];
    File[]files=new File[50];
    int index=0,flag=0;
    
   
    public void  extractedtextfiles(File filename){
   
          if (filename!= null) {
                if (filename.isFile() && filename.getName().toLowerCase().endsWith(".txt")) {
                    names[index]=filename.getName();
                    index=index+1;
                    files[flag]=filename;
                    flag++;
                    
                       //System.out.println(filename.getName());
                       
                 }
                
                
          
                
            } else {
                System.out.println("No files found in the directory.");
               
            }
       
        
    
}
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select the Text file");

        jLabel2.setText("character frequency");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Word count ");

        jTextField2.setEditable(false);
        jTextField2.setColumns(5);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jButton1.setText("DIsplay the output");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Display the text");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(647, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(223, 223, 223)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(240, Short.MAX_VALUE)))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Select the text file");

        pack();
    }// </editor-fold>//GEN-END:initComponents
   String selectedItem="GUI";
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        selectedItem = (String) jComboBox1.getSelectedItem();
        
        if(jComboBox1.getSelectedIndex()>=0){
          Thread fileThread = new Thread(new FileProcessor(files[ jComboBox1.getSelectedIndex()],selectedItem));
          fileThread.start();
          System.out.println("selected item index "+ jComboBox1.getSelectedIndex());
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jTextField1.setText(String.valueOf(getcount())); 
jTextField2.setText(String.valueOf(getname().toString().replace(".", "\n"))); 
jTextField3.setText(getCharacterFrequency().toString());// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
setVisible(false);
        NewJFrame obj3=new NewJFrame();
obj3.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
 public void checkTestFiles(){
        
          if ( directoryPath!= null) {
        File file = new File( directoryPath);

        if (file.exists() && file.isDirectory()) {
            String[] file_lists = file.list();
    if (file_lists != null) {
          
                    if(selectedItem!=null){
         for (String sub1 : file_lists) {
                    File subfile = new File(file, sub1);
                    extractedtextfiles(subfile);   
                  
              }
                        
                    }
                    
                    jComboBox1.removeAllItems();
                    for (String name : names) {
                        if (name != null) {
                            jComboBox1.addItem(name);
                        }
                    }
       
//                 else {
//                    System.out.println("No files found in the directory.");
//                }
    } else {
      
                              System.out.println("No files found in the directory.");}
        } else {
                    System.out.println("Invalid directory path or directory does not exist.");}
    } else {
        System.out.println("Please enter a valid directory path.");
   }

}
 public void updateTextField(String text) {
        jTextField1.setText(text);
    }
 public void DisplayText(String Text){
jTextField2.setText(Text);

}
}

   


class FileProcessor implements Runnable {
    private File file;
    private String selectedItem;
    int index=0;
      int count=1;
    String[]itemList=new String[50];
    public FileProcessor(File file,String item) {
        this.file = file;
        this.selectedItem=item;
        itemList[index]=file.getName();
        index++;
        System.out.println("Selected item is  "+selectedItem);
    }
 
    

    @Override
  
   public void run() {
       
        System.out.println("Processing file: " + file.getName());

        // Read the content of the file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
           StringBuilder concatenatedLine = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                  concatenatedLine.append(line+"\n");
                 for(int i=0;i<line.length()-1;i++){
             if(line.charAt(i)==' '&&line.charAt(i+1)!=' '){
                 count++; 
             }   
            }
               
        }
            
           Operation obh=new Operation(count,concatenatedLine.toString());
      SwingUtilities.invokeLater(() -> {
                obh.updateTextField(String.valueOf(count));
                obh.DisplayText(concatenatedLine.toString());
            });
    
       
        } catch (IOException e) {
              Thread.currentThread().interrupt(); 
            e.printStackTrace();
        }

        System.out.println(count); // TODO: Add additional processing based on the file content
    }
  
    
}
