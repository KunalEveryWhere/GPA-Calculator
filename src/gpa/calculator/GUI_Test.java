/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa.calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javafx.scene.layout.Border;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.ScrollPaneConstants;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
import javax.swing.border.EmptyBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Kunal Prasad
 */
public class GUI_Test extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Test
     */
    public GUI_Test() {
        initComponents();
        recreate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 810, 490));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, -1, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Calculate_Grade();
        Calculate_Credit();
        Post_GPA();
    }//GEN-LAST:event_jButton1ActionPerformed
   
     
     ArrayList <JScrollPane> sp_semester_panel_scrollpane = new ArrayList <JScrollPane> ();
     ArrayList <JPanel> panel_semester_panel = new ArrayList <JPanel> ();
     ArrayList <JLabel> label_semester_panel_title = new ArrayList <JLabel> ();
     ArrayList <JLabel> label_course_name = new ArrayList <JLabel> ();
     ArrayList <JLabel> label_grade = new ArrayList <JLabel> ();
     ArrayList <JLabel> label_credit = new ArrayList <JLabel> ();
     ArrayList <JLabel> label_result = new ArrayList <JLabel> ();
     ArrayList <JTextField> tf_course_name = new ArrayList <JTextField> ();
     ArrayList <JTextField> tf_grade = new ArrayList <JTextField> ();
     ArrayList <JTextField> tf_credit = new ArrayList <JTextField> ();
     ArrayList <JButton> button_add_course = new ArrayList <JButton> ();
     ArrayList <JButton> button_remove_course = new ArrayList <JButton> ();
     ArrayList <JButton> button_add_semester = new ArrayList <JButton> ();
     ArrayList <JButton> button_calculate_gpa = new ArrayList <JButton> ();
     int semester_counter = -1;
     int textfield_counter = -1;
     int positionY_prevoius_coursename_textfield = 0;
     boolean initial_flag = true;
     private void recreate ()
     {
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(new EmptyBorder(0, 0, 0, 0));
        
        JPanel panel = new JPanel ();
        panel.setBackground(new Color(236, 252, 255, 95));
        panel.setLayout(new AbsoluteLayout());
        
        JLabel head_title = new JLabel();
        head_title.setFont(new Font ("Google Sans Medium", 0, 18));
        head_title.setText("Semester " + (semester_counter + 2));
        
        JLabel result = new JLabel();
        result.setForeground(new java.awt.Color(62, 100, 255));
        result.setFont(new Font ("Google Sans Medium", 1, 36));
        result.setText("1.00");
        
        JLabel gpa = new JLabel();
        gpa.setFont(new Font ("Google Sans", 0, 18));
        gpa.setText("GPA");
        
        JLabel courses = new JLabel();
        courses.setFont(new Font ("Google Sans", 0, 12));
        courses.setText("Courses");
        
        JButton add_course = new JButton();
        add_course.setFont(new Font("Google Sans Medium", 0, 12));
        add_course.setText("+");
        add_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Courses (panel);
            }
        });
        
        JButton remove_course = new JButton();
        remove_course.setFont(new Font("Google Sans Medium", 0, 12));
        remove_course.setText("-");
        remove_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_Courses (panel);
            }
        });
        
        JButton calculate_gpa = new JButton();
        calculate_gpa.setFont(new Font("Google Sans Medium", 0, 14));
        calculate_gpa.setText("Calculate");
        calculate_gpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate_Grade();
                Calculate_Credit();
                Post_GPA();
            }
        });
        
        if( initial_flag )
        {
           for(int i = 0; i<4; i++)
           {
               positionY_prevoius_coursename_textfield = (30*i);
               
               JTextField course_name = new JTextField();
               JTextField grade = new JTextField();
               JTextField credit = new JTextField();
               
               course_name.setFont(new java.awt.Font("Google Sans", 0, 12));
               grade.setFont(new java.awt.Font("Google Sans", 0, 12));
               credit.setFont(new java.awt.Font("Google Sans", 0, 12));
               
               course_name.setBorder(new EmptyBorder(0, 0, 0, 0));
               grade.setBorder(new EmptyBorder(0, 0, 0, 0));
               credit.setBorder(new EmptyBorder(0, 0, 0, 0));
               
               panel.add(course_name, new AbsoluteConstraints (10, 50 + (positionY_prevoius_coursename_textfield), 210, 30));
               panel.add(grade, new AbsoluteConstraints (220, 50 + (positionY_prevoius_coursename_textfield), 70, 30));
               panel.add(credit, new AbsoluteConstraints (290, 50 + (positionY_prevoius_coursename_textfield), 80, 30));         
               
               tf_course_name.add(course_name);
               tf_grade.add(grade);
               tf_credit.add(credit);
               
               ++textfield_counter;
               System.out.println("Y :"+ positionY_prevoius_coursename_textfield);
               
               revalidate();
               repaint();
           }
           initial_flag = false;
        }
        
        panel.add(head_title, new AbsoluteConstraints (10, 10, -1, -1));
        panel.add(result, new AbsoluteConstraints (480, 40, -1, -1));
        panel.add(gpa, new AbsoluteConstraints (520, 80, -1, -1));
        panel.add(add_course, new AbsoluteConstraints (530, 130, -1, -1));
        panel.add(remove_course, new AbsoluteConstraints (445, 130, -1, -1));
        panel.add(courses, new AbsoluteConstraints ( 480, 137, -1, -1));
        panel.add(calculate_gpa, new AbsoluteConstraints ( 445, 165, 120, 35));
        
        scroll.setViewportView ( panel );
        scroll.getViewport().setScrollMode(JViewport.SIMPLE_SCROLL_MODE);
        
        //getContentPane().add( scroll,new AbsoluteConstraints (30, 120, 580, 220));
        //jPanel1.add(scroll,new AbsoluteConstraints (30, 120, 580, 220));
        //getContentPane().add( panel,new AbsoluteConstraints (30, 120, 580, 220));
        jPanel1.add(scroll, new AbsoluteConstraints (30, 120, 580, 220));
        //jPanel1.add(scroll);
        
        
        sp_semester_panel_scrollpane.add(scroll);
        panel_semester_panel.add(panel);
        label_semester_panel_title.add(head_title);
        label_result.add(result);
        button_add_course.add(add_course);
        button_remove_course.add(remove_course);
        
        ++semester_counter;
        
        
        JLabel jlabel_header_picture = new JLabel();
        jlabel_header_picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/undraw_cloud_docs_p4ob.png"))); // NOI18N
        jPanel1.add(jlabel_header_picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 500, -1));
        
        
        
        
        panel.setVisible(true);
        scroll.setVisible(true);
        pack();
        revalidate();
        repaint();
     }
     private void Add_Courses (JPanel panel)
     {
        JTextField course_name = new JTextField();
        JTextField grade = new JTextField();
        JTextField credit = new JTextField();
               
        course_name.setFont(new java.awt.Font("Google Sans", 0, 12));
        grade.setFont(new java.awt.Font("Google Sans", 0, 12));
        credit.setFont(new java.awt.Font("Google Sans", 0, 12));
               
        course_name.setBorder(new EmptyBorder(0, 0, 0, 0));
        grade.setBorder(new EmptyBorder(0, 0, 0, 0));
        credit.setBorder(new EmptyBorder(0, 0, 0, 0));
        
        positionY_prevoius_coursename_textfield = positionY_prevoius_coursename_textfield + 30;
               
        panel.add(course_name, new AbsoluteConstraints (10, 50 + (positionY_prevoius_coursename_textfield), 210, 30));
        panel.add(grade, new AbsoluteConstraints (220, 50 + (positionY_prevoius_coursename_textfield), 70, 30));
        panel.add(credit, new AbsoluteConstraints (290, 50 + (positionY_prevoius_coursename_textfield), 80, 30));         
               
               tf_course_name.add(course_name);
               tf_grade.add(grade);
               tf_credit.add(credit);
               
               ++textfield_counter;
               System.out.println("Y :"+ positionY_prevoius_coursename_textfield);
               
               revalidate();
               repaint();
     }
     private void Remove_Courses (JPanel panel)
     {
         if(tf_course_name.size() > 1)
         {
            System.out.println("tf_course_name size :"+ tf_course_name.size());
            
            //(tf_course_name.get(tf_course_name.size() - 1)).setVisible(false);
            panel.remove((tf_course_name.get(tf_course_name.size() - 1)));
            tf_course_name.remove(tf_course_name.size() - 1);
            
            //(tf_grade.get(tf_grade.size() - 1)).setVisible(false);
            panel.remove(tf_grade.get(tf_grade.size() - 1));
            tf_grade.remove(tf_grade.size() - 1);
            
            //(tf_credit.get(tf_credit.size() - 1)).setVisible(false);
            panel.remove((tf_credit.get(tf_credit.size() - 1)));
            tf_credit.remove(tf_credit.size() - 1);
            
            positionY_prevoius_coursename_textfield = positionY_prevoius_coursename_textfield - 30;
            
            --textfield_counter;
         
            revalidate();
            repaint();
         }
     }
     String grade[];
     private void Calculate_Grade ()
     {
         int size = tf_grade.size();
         grade = new String [size];
         for(int i = 0; i < size; i++)
         {
             //if((tf_grade.get(i)).getText().equalsIgnoreCase("") == false)
                grade[i] = (tf_grade.get(i)).getText();
             //else
              //   --i;
         }
     }
     int credit[];
     private void Calculate_Credit ()
     {
         int size = tf_credit.size();
         credit = new int [size];
         for(int i = 0; i < size; i++)
         {
             credit[i] = Integer.valueOf((tf_credit.get(i)).getText());
         }
     }
     void Post_GPA ()
     {
         GPA_Calculator_Back_End app = new GPA_Calculator_Back_End();
         double result = app.GPA_Calculator(grade, credit);
         (label_result.get(0)).setText(""+result);
         revalidate();
         repaint();
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
            java.util.logging.Logger.getLogger(GUI_Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Test().setVisible(true);
            }
        });
        
        
        /*GUI_Test z = new GUI_Test();
        z.recreate();*/
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
