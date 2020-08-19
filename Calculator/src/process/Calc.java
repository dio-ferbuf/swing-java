package process;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Locale;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

public class Calc extends javax.swing.JFrame {
    double num1 = 0.0;
    double num2 = 0.0;
    StringBuffer numMoveOperation = new StringBuffer(""); // penampil di lblOperation
    StringBuffer numMoveOperation2 = new StringBuffer(""); // penampil di lblShowOperation
    StringBuffer step = new StringBuffer("");    
    int move = 0; // penanda terjadinya operasi > 2 bilangan
    int choose = 0; // penanda operasi pipolondo yang dilakukan. Di operasi =
    int stepp = 1; // penanda pnl+/
    int steppDot = 1;
    char cekThreeBil;
    String operation [] = {"+","-","X","/"};        
    FormatTextAngka numFmt = new FormatTextAngka();
    
    
    public Calc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblOpreation = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblShowOpreation = new javax.swing.JLabel();
        pnlExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        pnlEight = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        pnlSeven = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        pnlNine = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pnlFive = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        pnlFour = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pnlSix = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        pnlTwo = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        pnlOne = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnlThree = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        pnlDivision = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnlMultiplication = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnlSubtraction = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlC = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlCE = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlBackspace = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlAddition = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pnlEqual = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        pnlDot = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        pnlZero = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        pnlPlusMinus = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlBackground1.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(131, 150, 250));

        lblOpreation.setBackground(new java.awt.Color(131, 187, 148));
        lblOpreation.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        lblOpreation.setForeground(new java.awt.Color(255, 255, 255));
        lblOpreation.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblOpreation.setText("0");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Calculator");

        lblShowOpreation.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblShowOpreation.setForeground(new java.awt.Color(255, 255, 255));
        lblShowOpreation.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblShowOpreation.setText("-");

        pnlExit.setBackground(new java.awt.Color(131, 150, 250));
        pnlExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlExitMouseClicked(evt);
            }
        });
        pnlExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        //java.net.URL url = ClassLoader.getSystemResource("/src/main/java/Images/icons8_Multiply_35px.png");
        //Toolkit kit = Toolkit.getDefaultToolkit();
        //Image img = kit.createImage(url);
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Multiply_35px.png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });
        pnlExit.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 34));

        pnlEight.setBackground(new java.awt.Color(131, 150, 250));
        pnlEight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlEightMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlEightMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlEightMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlEightMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlEightMouseReleased(evt);
            }
        });
        pnlEight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("8");
        pnlEight.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 30, 40));

        pnlSeven.setBackground(new java.awt.Color(131, 150, 250));
        pnlSeven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSevenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSevenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSevenMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlSevenMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlSevenMouseReleased(evt);
            }
        });
        pnlSeven.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("7");
        pnlSeven.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 30, 40));

        pnlNine.setBackground(new java.awt.Color(131, 150, 250));
        pnlNine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNineMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlNineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlNineMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlNineMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlNineMouseReleased(evt);
            }
        });
        pnlNine.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("9");
        pnlNine.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 30, 40));

        pnlFive.setBackground(new java.awt.Color(131, 150, 250));
        pnlFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlFiveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlFiveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlFiveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlFiveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlFiveMouseReleased(evt);
            }
        });
        pnlFive.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("5");
        pnlFive.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 30, 40));

        pnlFour.setBackground(new java.awt.Color(131, 150, 250));
        pnlFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlFourMouseClicked1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlFourMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlFourMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlFourMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlFourMouseReleased(evt);
            }
        });
        pnlFour.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("4");
        pnlFour.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 30, 40));

        pnlSix.setBackground(new java.awt.Color(131, 150, 250));
        pnlSix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSixMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSixMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSixMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlSixMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlSixMouseReleased(evt);
            }
        });
        pnlSix.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("6");
        pnlSix.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 30, 40));

        pnlTwo.setBackground(new java.awt.Color(131, 150, 250));
        pnlTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTwoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlTwoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlTwoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTwoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlTwoMouseReleased(evt);
            }
        });
        pnlTwo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("2");
        pnlTwo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 40, 40));

        pnlOne.setBackground(new java.awt.Color(131, 150, 250));
        pnlOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlOneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlOneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlOneMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlOneMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlOneMouseReleased(evt);
            }
        });
        pnlOne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("1");
        pnlOne.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 30, 40));

        pnlThree.setBackground(new java.awt.Color(131, 150, 250));
        pnlThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlThreeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlThreeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlThreeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlThreeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlThreeMouseReleased(evt);
            }
        });
        pnlThree.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("3");
        pnlThree.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 40, 40));

        pnlDivision.setBackground(new java.awt.Color(131, 150, 250));
        pnlDivision.setToolTipText("Division");
        pnlDivision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDivisionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlDivisionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDivisionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDivisionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlDivisionMouseReleased(evt);
            }
        });
        pnlDivision.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Droid Sans Mono", 1, 48)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Divide_50px_3.png"))); // NOI18N
        pnlDivision.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 40));

        pnlMultiplication.setBackground(new java.awt.Color(131, 150, 250));
        pnlMultiplication.setToolTipText("Multiplication");
        pnlMultiplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMultiplicationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlMultiplicationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlMultiplicationMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMultiplicationMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlMultiplicationMouseReleased(evt);
            }
        });
        pnlMultiplication.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Droid Sans Mono", 1, 48)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Multiply_50px_1.png"))); // NOI18N
        pnlMultiplication.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 40));

        pnlSubtraction.setBackground(new java.awt.Color(131, 150, 250));
        pnlSubtraction.setToolTipText("Subtraction");
        pnlSubtraction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSubtractionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSubtractionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSubtractionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlSubtractionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlSubtractionMouseReleased(evt);
            }
        });
        pnlSubtraction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_50px.png"))); // NOI18N
        jLabel5.setText("\n");
        pnlSubtraction.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, 40));

        pnlC.setBackground(new java.awt.Color(131, 150, 250));
        pnlC.setToolTipText("Clear");
        pnlC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlCMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlCMouseReleased(evt);
            }
        });
        pnlC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("C");
        pnlC.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 40, 40));

        pnlCE.setBackground(new java.awt.Color(131, 150, 250));
        pnlCE.setMinimumSize(new java.awt.Dimension(120, 60));
        pnlCE.setPreferredSize(new java.awt.Dimension(120, 60));
        pnlCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCEMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlCEMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlCEMouseReleased(evt);
            }
        });
        pnlCE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CE");
        pnlCE.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 60, 40));

        pnlBackspace.setBackground(new java.awt.Color(131, 150, 250));
        pnlBackspace.setToolTipText("Backspace");
        pnlBackspace.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlBackspaceMouseMoved(evt);
            }
        });
        pnlBackspace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBackspaceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBackspaceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBackspaceMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlBackspaceMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlBackspaceMouseReleased(evt);
            }
        });
        pnlBackspace.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Droid Sans Mono", 1, 48)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Clear_Symbol_50px_2.png"))); // NOI18N
        pnlBackspace.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 40));

        pnlAddition.setBackground(new java.awt.Color(131, 150, 250));
        pnlAddition.setToolTipText("Addition");
        pnlAddition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAdditionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAdditionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAdditionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlAdditionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlAdditionMouseReleased(evt);
            }
        });
        pnlAddition.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Plus_Math_50px_4.png"))); // NOI18N
        pnlAddition.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, 40));

        pnlEqual.setBackground(new java.awt.Color(131, 150, 250));
        pnlEqual.setToolTipText("Equal");
        pnlEqual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlEqualMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlEqualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlEqualMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlEqualMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlEqualMouseReleased(evt);
            }
        });
        pnlEqual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Equal_Sign_50px_1.png"))); // NOI18N
        pnlEqual.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, 40));

        pnlDot.setBackground(new java.awt.Color(131, 150, 250));
        pnlDot.setToolTipText("Dot");
        pnlDot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlDotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDotMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDotMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlDotMouseReleased(evt);
            }
        });
        pnlDot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(".");
        pnlDot.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 30, 40));

        pnlZero.setBackground(new java.awt.Color(131, 150, 250));
        pnlZero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlZeroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlZeroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlZeroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlZeroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlZeroMouseReleased(evt);
            }
        });
        pnlZero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("0");
        pnlZero.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 30, 40));

        pnlPlusMinus.setBackground(new java.awt.Color(131, 150, 250));
        pnlPlusMinus.setToolTipText("Plus/Minus");
        pnlPlusMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPlusMinusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlPlusMinusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlPlusMinusMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPlusMinusMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlPlusMinusMouseReleased(evt);
            }
        });
        pnlPlusMinus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Droid Sans Mono", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Plus_Minus_50px_1.png"))); // NOI18N
        pnlPlusMinus.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pnlC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pnlBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pnlDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlOne, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(pnlThree, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(pnlMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlFour, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlFive, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(pnlSix, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addComponent(pnlAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(pnlNine, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlEight, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(pnlSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pnlZero, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pnlDot, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pnlEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblShowOpreation, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOpreation, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 12, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addComponent(pnlExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(lblShowOpreation)
                .addGap(12, 12, 12)
                .addComponent(lblOpreation, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlC, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOne, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlThree, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlFive, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSix, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlNine, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEight, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlZero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDot, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlBackground1.add(jPanel1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void pergantianOperationLbh2(String operation){        
        switch(cekThreeBil){
            case '+':
                inputUserOperationAndShowToLblShowOperation2(operation, 1);
                num1 = num1 + num2;                                
                break;
            case '-':
                inputUserOperationAndShowToLblShowOperation2(operation, 2);
                num1 = num1 - num2;                                
                break;
            case '*':
                inputUserOperationAndShowToLblShowOperation2(operation, 3);
                num1 = num1 * num2;                                
                break;
            case '/':
                inputUserOperationAndShowToLblShowOperation2(operation, 4);
                num1 = num1 / num2;                                
                break;                
        }
     }
    private void inputUserAndShowToLblShowOperation(String a){        
        numMoveOperation.append(a);
        numMoveOperation2.append(a);
        lblOpreation.setText(numMoveOperation2.toString());
        lblShowOpreation.setText(numMoveOperation.toString());        
    }
    // menghitung operasi 2 bilangan
    private void inputUserOperationAndShowToLblShowOperation(String a, int chooser) {
        num1 = Double.valueOf(lblOpreation.getText().trim());
        numMoveOperation2 = new StringBuffer("");
        numMoveOperation.append(" " + a + " ");
        step.append(" "+a+" "); // save untuk length pengurang
                
        lblShowOpreation.setText(numMoveOperation.toString());
        
        choose = chooser;
    }
    // menghitung operasi > 2 bilangan
    private void inputUserOperationAndShowToLblShowOperation2(String a, int chooser) {
        num2 = Double.valueOf(lblOpreation.getText().trim());
        numMoveOperation2 = new StringBuffer("");
        numMoveOperation.append(" " + a + " ");

        lblShowOpreation.setText(numMoveOperation.toString());
        
        
        choose = chooser;
    }
    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        pnlExit.setBackground(new Color(187, 70, 32));
        int i = JOptionPane.showConfirmDialog(null, "Are you sure you got out?", "Notice", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_lblExitMouseClicked

    private void pnlCEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCEMouseExited
        pnlCE.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlCEMouseExited

    private void pnlCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCEMouseClicked
        pnlCE.setBackground(new Color(214, 234, 21)); // dark yellow
        if (!lblOpreation.getText().equals("0")) {            
            String a = lblOpreation.getText().trim();

            numMoveOperation2 = new StringBuffer(""); // langsung bawah aja
        
            if (!lblShowOpreation.getText().contains("+") && !lblShowOpreation.getText().contains("-") &&
                    !lblShowOpreation.getText().contains("X") && !lblShowOpreation.getText().contains("/")) {
                lblShowOpreation.setText("-");
                numMoveOperation.replace(numMoveOperation.length() - a.length(),
                        numMoveOperation.length(), "");
            }else{
                numMoveOperation.replace(numMoveOperation.length() - a.length(),
                        numMoveOperation.length(), "");

                lblShowOpreation.setText(numMoveOperation.toString());;;
            }
            lblOpreation.setText("0");
        }else{
           lblOpreation.setText("0");
           
        }
    }//GEN-LAST:event_pnlCEMouseClicked

    private void pnlCEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCEMouseEntered
        pnlCE.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlCEMouseEntered

    private void pnlCEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCEMouseReleased
        pnlCE.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlCEMouseReleased

    private void pnlCEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCEMousePressed
        pnlCE.setBackground(new Color(222, 243, 17)); // jernih yellow
        
    }//GEN-LAST:event_pnlCEMousePressed

    private void pnlCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCMouseClicked
        pnlC.setBackground(new Color(214, 234, 21)); // dark yellow
        num1 = 0.0;
        num2 = 0.0;        
        numMoveOperation = new StringBuffer("");
        numMoveOperation2 = new StringBuffer("");
        lblOpreation.setText("0");
        lblShowOpreation.setText("-");
        move = 0;
        cekThreeBil = ' ';
    }//GEN-LAST:event_pnlCMouseClicked

    private void pnlCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCMouseEntered
        pnlC.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlCMouseEntered

    private void pnlCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCMouseExited
        pnlC.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlCMouseExited

    private void pnlCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCMousePressed
        pnlC.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlCMousePressed

    private void pnlCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCMouseReleased
        pnlC.setBackground(new Color(214, 234, 21)); // dark yellow
        //pnlC.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlCMouseReleased

    private void pnlBackspaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackspaceMouseClicked
        pnlBackspace.setBackground(new Color(214, 234, 21)); // dark yellow     
        
        if(!lblOpreation.getText().equals("0")){
            StringBuilder bc = new StringBuilder(lblOpreation.getText());
            bc.deleteCharAt(bc.length() -1 );
            //numMoveOperation.deleteCharAt(bc.length() - 1);
            lblOpreation.setText(bc.toString());


            numMoveOperation.deleteCharAt(numMoveOperation.length() - 1);
            //numMoveOperation2.deleteCharAt(bcc.length() - 1);
            lblShowOpreation.setText(numMoveOperation.toString());

    //        int a = lblOpreation.getText().length();
    //        lblOpreation.setText(numMoveOperation.toString());
    //        
    //        int b = lblShowOpreation.getText().length();
    //        lblShowOpreation.setText(numMoveOperation2.toString());

            if (lblOpreation.getText().length() == 0) {            
                numMoveOperation2 = new StringBuffer("");
                lblOpreation.setText("0");            
            }
            if (lblShowOpreation.getText().length() == 0) {
                numMoveOperation = new StringBuffer("");
                lblShowOpreation.setText("-");
            }
        
        }
    }//GEN-LAST:event_pnlBackspaceMouseClicked

    private void pnlBackspaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackspaceMouseEntered
        pnlBackspace.setBackground(new Color(214, 234, 21)); // dark yellow        
    }//GEN-LAST:event_pnlBackspaceMouseEntered

    private void pnlBackspaceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackspaceMouseExited
        pnlBackspace.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlBackspaceMouseExited

    private void pnlBackspaceMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackspaceMouseMoved
                
    }//GEN-LAST:event_pnlBackspaceMouseMoved

    private void pnlBackspaceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackspaceMousePressed
        pnlBackspace.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlBackspaceMousePressed

    private void pnlBackspaceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackspaceMouseReleased
        pnlBackspace.setBackground(new Color(214, 234, 21)); // dark yellow        
    }//GEN-LAST:event_pnlBackspaceMouseReleased

    private void pnlDivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDivisionMouseClicked
        pnlDivision.setBackground(new Color(214, 234, 21)); // dark yellow        
        
        if (move > 0) {            
            pergantianOperationLbh2(operation[3]);            
            lblOpreation.setText(numFmt.formatText(num1));
        }else inputUserOperationAndShowToLblShowOperation("/", 4);
        
        cekThreeBil = '/';        
        move++;
    }//GEN-LAST:event_pnlDivisionMouseClicked

    private void pnlDivisionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDivisionMouseEntered
        pnlDivision.setBackground(new Color(214, 234, 21)); // dark yellow        
    }//GEN-LAST:event_pnlDivisionMouseEntered

    private void pnlDivisionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDivisionMouseExited
        pnlDivision.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlDivisionMouseExited

    private void pnlDivisionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDivisionMousePressed
        pnlDivision.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlDivisionMousePressed

    private void pnlDivisionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDivisionMouseReleased
        pnlDivision.setBackground(new Color(214, 234, 21)); // dark yellow        
    }//GEN-LAST:event_pnlDivisionMouseReleased

    private void pnlExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExitMouseClicked
        
    }//GEN-LAST:event_pnlExitMouseClicked

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        pnlExit.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_lblExitMouseExited

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        pnlExit.setBackground(new Color(240, 70, 15));
    }//GEN-LAST:event_lblExitMouseEntered

    private void pnlOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOneMouseClicked
        pnlOne.setBackground(new Color(214, 234, 21)); // dark yellow        
        if (!(lblOpreation.getText().length() == 20)) {
            inputUserAndShowToLblShowOperation("1");
        }
    }//GEN-LAST:event_pnlOneMouseClicked

    private void pnlTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTwoMouseClicked
        pnlTwo.setBackground(new Color(214, 234, 21)); // dark yellow        
        if (!(lblOpreation.getText().length() == 20)) {
            inputUserAndShowToLblShowOperation("2");
        }
    }//GEN-LAST:event_pnlTwoMouseClicked

    private void pnlThreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThreeMouseClicked
        pnlThree.setBackground(new Color(214, 234, 21)); // dark yellow        
        if (!(lblOpreation.getText().length() == 20)) {
            inputUserAndShowToLblShowOperation("3");
        }
    }//GEN-LAST:event_pnlThreeMouseClicked

    private void pnlFourMouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFourMouseClicked1
        pnlFour.setBackground(new Color(214, 234, 21)); // dark yellow        
        if (!(lblOpreation.getText().length() == 20)) {
            inputUserAndShowToLblShowOperation("4");
        }
    }//GEN-LAST:event_pnlFourMouseClicked1

    private void pnlFiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFiveMouseClicked
        pnlFive.setBackground(new Color(214, 234, 21)); // dark yellow        
        if (!(lblOpreation.getText().length() == 20)) {
            inputUserAndShowToLblShowOperation("5");
        }
    }//GEN-LAST:event_pnlFiveMouseClicked

    private void pnlSixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSixMouseClicked
        pnlSix.setBackground(new Color(214, 234, 21)); // dark yellow        
        if (!(lblOpreation.getText().length() == 20)) {
            inputUserAndShowToLblShowOperation("6");
        }
    }//GEN-LAST:event_pnlSixMouseClicked

    private void pnlSevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSevenMouseClicked
        pnlSeven.setBackground(new Color(214, 234, 21)); // dark yellow        
        if (!(lblOpreation.getText().length() == 20)) {
            inputUserAndShowToLblShowOperation("7");
        }
    }//GEN-LAST:event_pnlSevenMouseClicked

    private void pnlEightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEightMouseClicked
        pnlEight.setBackground(new Color(214, 234, 21)); // dark yellow        
        if (!(lblOpreation.getText().length() == 20)) {
            inputUserAndShowToLblShowOperation("8");
        }
    }//GEN-LAST:event_pnlEightMouseClicked

    private void pnlNineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNineMouseClicked
        pnlNine.setBackground(new Color(214, 234, 21)); // dark yellow        
        if (!(lblOpreation.getText().length() == 20)) {
            inputUserAndShowToLblShowOperation("9");
        }
    }//GEN-LAST:event_pnlNineMouseClicked

    private void pnlZeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlZeroMouseClicked
        pnlZero.setBackground(new Color(214, 234, 21)); // dark yellow        
        if (!(lblOpreation.getText().length() == 20)) {
            inputUserAndShowToLblShowOperation("0");
        }
    }//GEN-LAST:event_pnlZeroMouseClicked

    private void pnlEqualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEqualMouseClicked
        pnlEqual.setBackground(new Color(214, 234, 21)); // dark yellow        
        
        num2 = Double.parseDouble(lblOpreation.getText().trim());
        
        numMoveOperation = new StringBuffer("");
        numMoveOperation2 = new StringBuffer("");
        
        switch(choose){
            case 1:
                pergantianOperationLbh2(operation[0]);                
                lblOpreation.setText(numFmt.formatText(num1));                                
                lblShowOpreation.setText("-");
                break;
            case 2:
                pergantianOperationLbh2(operation[1]);                
                lblOpreation.setText(numFmt.formatText(num1));                                
                lblShowOpreation.setText("-");
                break;
            case 3:
                pergantianOperationLbh2(operation[2]);                
                lblOpreation.setText(numFmt.formatText(num1));                
                lblShowOpreation.setText("-");
                break;
            case 4:
                pergantianOperationLbh2(operation[3]);                
                lblOpreation.setText(numFmt.formatText(num1));                
                lblShowOpreation.setText("-");
                break;
            default: 
                JOptionPane.showMessageDialog(null, "An error occurred/n Input again!", "Alert",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_pnlEqualMouseClicked

    private void pnlMultiplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMultiplicationMouseClicked
        pnlMultiplication.setBackground(new Color(214, 234, 21)); // dark yellow        
        
        if (move > 0) {
            pergantianOperationLbh2(operation[2]);                                                                                    
            lblOpreation.setText(numFmt.formatText(num1));
        } else {
            inputUserOperationAndShowToLblShowOperation("X", 3);
        }
        cekThreeBil = '*';
        move++;
    }//GEN-LAST:event_pnlMultiplicationMouseClicked

    private void pnlAdditionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdditionMouseClicked
        pnlAddition.setBackground(new Color(214, 234, 21)); // dark yellow        
        
        if (move > 0) {
            pergantianOperationLbh2(operation[0]);            
            lblOpreation.setText(numFmt.formatText(num1));
        } else {
            inputUserOperationAndShowToLblShowOperation("+", 1);
        }
        cekThreeBil = '+';
        move++;
    }//GEN-LAST:event_pnlAdditionMouseClicked

    private void pnlSubtractionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSubtractionMouseClicked
        pnlSubtraction.setBackground(new Color(214, 234, 21)); // dark yellow        
        
        if (move > 0) {
            pergantianOperationLbh2(operation[1]);            
            lblOpreation.setText(numFmt.formatText(num1));
        } else {
            inputUserOperationAndShowToLblShowOperation("-", 2);
        }
        cekThreeBil = '-';
        move++;
    }//GEN-LAST:event_pnlSubtractionMouseClicked

    private void pnlPlusMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPlusMinusMouseClicked
        pnlPlusMinus.setBackground(new Color(214, 234, 21)); // dark yellow        
        if (stepp == 1) {
            // menampilkan +/- di lblOperation
            numMoveOperation2.insert(0, "-");            
            lblOpreation.setText(numMoveOperation2.toString());
            // menampilkan +/- di lblShowOperation
            numMoveOperation.insert(0, "-");
            lblShowOpreation.setText(numMoveOperation.toString());
            
            stepp++;
        }else{
            int strEnd = lblShowOpreation.getText().length() - lblOpreation.getText().length();
            numMoveOperation.replace( strEnd, strEnd + 1, "");
            lblShowOpreation.setText(numMoveOperation.toString());
            
            lblShowOpreation.setText(numMoveOperation.toString());
            numMoveOperation2.replace(0, 1, "");                        
            lblOpreation.setText(numMoveOperation2.toString().trim());
                        
            stepp--;
        }        
    }//GEN-LAST:event_pnlPlusMinusMouseClicked

    private void pnlDotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDotMouseClicked
        pnlDot.setBackground(new Color(214, 234, 21)); // dark yellow        
        if (steppDot == 1) {
            // menampilkan . di lblOperation
            numMoveOperation2.append(".");
            lblOpreation.setText(numMoveOperation2.toString());
            // menampilkan . di lblShowOperation
            numMoveOperation.append(".");
            lblShowOpreation.setText(numMoveOperation.toString());

            steppDot++;
        } else {
            
            numMoveOperation.replace(lblOpreation.getText().length() - 1,
                    lblOpreation.getText().length(), "");
            lblShowOpreation.setText(numMoveOperation.toString());

            lblShowOpreation.setText(numMoveOperation.toString());
            numMoveOperation2.replace(lblOpreation.getText().length() - 1,
                    lblOpreation.getText().length(), "");
            lblOpreation.setText(numMoveOperation2.toString().trim());
            
            steppDot--;
        }
    }//GEN-LAST:event_pnlDotMouseClicked

    private void pnlMultiplicationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMultiplicationMouseEntered
        pnlMultiplication.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlMultiplicationMouseEntered

    private void pnlMultiplicationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMultiplicationMouseExited
        pnlMultiplication.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlMultiplicationMouseExited

    private void pnlThreeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThreeMouseExited
        pnlThree.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlThreeMouseExited

    private void pnlTwoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTwoMouseExited
        pnlTwo.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlTwoMouseExited

    private void pnlOneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOneMouseExited
        pnlOne.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlOneMouseExited

    private void pnlFourMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFourMouseExited
        pnlFour.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlFourMouseExited

    private void pnlFiveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFiveMouseExited
        pnlFive.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlFiveMouseExited

    private void pnlSixMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSixMouseExited
        pnlSix.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlSixMouseExited

    private void pnlAdditionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdditionMouseExited
        pnlAddition.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlAdditionMouseExited

    private void pnlSubtractionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSubtractionMouseExited
        pnlSubtraction.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlSubtractionMouseExited

    private void pnlNineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNineMouseExited
        pnlNine.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlNineMouseExited

    private void pnlEightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEightMouseExited
        pnlEight.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlEightMouseExited

    private void pnlSevenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSevenMouseExited
        pnlSeven.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlSevenMouseExited

    private void pnlEqualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEqualMouseExited
        pnlEqual.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlEqualMouseExited

    private void pnlDotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDotMouseExited
        pnlDot.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlDotMouseExited

    private void pnlZeroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlZeroMouseExited
        pnlZero.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlZeroMouseExited

    private void pnlPlusMinusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPlusMinusMouseExited
        pnlPlusMinus.setBackground(new Color(131, 150, 250));// semula
    }//GEN-LAST:event_pnlPlusMinusMouseExited

    private void pnlThreeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThreeMouseEntered
        pnlThree.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlThreeMouseEntered

    private void pnlTwoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTwoMouseEntered
        pnlTwo.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlTwoMouseEntered

    private void pnlOneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOneMouseEntered
        pnlOne.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlOneMouseEntered

    private void pnlFourMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFourMouseEntered
        pnlFour.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlFourMouseEntered

    private void pnlFiveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFiveMouseEntered
        pnlFive.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlFiveMouseEntered

    private void pnlSixMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSixMouseEntered
        pnlSix.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlSixMouseEntered

    private void pnlAdditionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdditionMouseEntered
        pnlAddition.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlAdditionMouseEntered

    private void pnlSubtractionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSubtractionMouseEntered
        pnlSubtraction.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlSubtractionMouseEntered

    private void pnlNineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNineMouseEntered
        pnlNine.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlNineMouseEntered

    private void pnlEightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEightMouseEntered
        pnlEight.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlEightMouseEntered

    private void pnlSevenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSevenMouseEntered
        pnlSeven.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlSevenMouseEntered

    private void pnlEqualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEqualMouseEntered
        pnlEqual.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlEqualMouseEntered

    private void pnlDotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDotMouseEntered
        pnlDot.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlDotMouseEntered

    private void pnlZeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlZeroMouseEntered
        pnlZero.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlZeroMouseEntered

    private void pnlPlusMinusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPlusMinusMouseEntered
        pnlPlusMinus.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlPlusMinusMouseEntered

    private void pnlMultiplicationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMultiplicationMouseReleased
        pnlMultiplication.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlMultiplicationMouseReleased

    private void pnlThreeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThreeMouseReleased
        pnlThree.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlThreeMouseReleased

    private void pnlTwoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTwoMouseReleased
        pnlTwo.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlTwoMouseReleased

    private void pnlOneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOneMouseReleased
        pnlOne.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlOneMouseReleased

    private void pnlFourMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFourMouseReleased
        pnlFour.setBackground(new Color(214, 234, 21)); // dark yello
    }//GEN-LAST:event_pnlFourMouseReleased

    private void pnlFiveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFiveMouseReleased
        pnlFive.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlFiveMouseReleased

    private void pnlSixMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSixMouseReleased
        pnlSix.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlSixMouseReleased

    private void pnlAdditionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdditionMouseReleased
        pnlAddition.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlAdditionMouseReleased

    private void pnlSubtractionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSubtractionMouseReleased
        pnlSubtraction.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlSubtractionMouseReleased

    private void pnlNineMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNineMouseReleased
        pnlNine.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlNineMouseReleased

    private void pnlEightMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEightMouseReleased
        pnlEight.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlEightMouseReleased

    private void pnlSevenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSevenMouseReleased
        pnlSeven.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlSevenMouseReleased

    private void pnlPlusMinusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPlusMinusMouseReleased
        pnlPlusMinus.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlPlusMinusMouseReleased

    private void pnlZeroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlZeroMouseReleased
        pnlZero.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlZeroMouseReleased

    private void pnlDotMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDotMouseReleased
        pnlDot.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlDotMouseReleased

    private void pnlEqualMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEqualMouseReleased
        pnlEqual.setBackground(new Color(214, 234, 21)); // dark yellow
    }//GEN-LAST:event_pnlEqualMouseReleased

    private void pnlMultiplicationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMultiplicationMousePressed
        pnlMultiplication.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlMultiplicationMousePressed

    private void pnlThreeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThreeMousePressed
        pnlThree.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlThreeMousePressed

    private void pnlTwoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTwoMousePressed
        pnlTwo.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlTwoMousePressed

    private void pnlOneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOneMousePressed
        pnlOne.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlOneMousePressed

    private void pnlFourMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFourMousePressed
        pnlFour.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlFourMousePressed

    private void pnlFiveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFiveMousePressed
        pnlFive.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlFiveMousePressed

    private void pnlSixMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSixMousePressed
        pnlSix.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlSixMousePressed

    private void pnlAdditionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdditionMousePressed
        pnlAddition.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlAdditionMousePressed

    private void pnlSubtractionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSubtractionMousePressed
        pnlSubtraction.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlSubtractionMousePressed

    private void pnlNineMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNineMousePressed
        pnlNine.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlNineMousePressed

    private void pnlEightMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEightMousePressed
        pnlEight.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlEightMousePressed

    private void pnlSevenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSevenMousePressed
        pnlSeven.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlSevenMousePressed

    private void pnlEqualMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEqualMousePressed
        pnlEqual.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlEqualMousePressed

    private void pnlDotMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDotMousePressed
        pnlDot.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlDotMousePressed

    private void pnlZeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlZeroMousePressed
        pnlZero.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlZeroMousePressed

    private void pnlPlusMinusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPlusMinusMousePressed
        pnlPlusMinus.setBackground(new Color(222, 243, 17)); // jernih yellow
    }//GEN-LAST:event_pnlPlusMinusMousePressed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblOpreation;
    private javax.swing.JLabel lblShowOpreation;
    private javax.swing.JPanel pnlAddition;
    private javax.swing.JPanel pnlBackground1;
    private javax.swing.JPanel pnlBackspace;
    private javax.swing.JPanel pnlC;
    private javax.swing.JPanel pnlCE;
    private javax.swing.JPanel pnlDivision;
    private javax.swing.JPanel pnlDot;
    private javax.swing.JPanel pnlEight;
    private javax.swing.JPanel pnlEqual;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlFive;
    private javax.swing.JPanel pnlFour;
    private javax.swing.JPanel pnlMultiplication;
    private javax.swing.JPanel pnlNine;
    private javax.swing.JPanel pnlOne;
    private javax.swing.JPanel pnlPlusMinus;
    private javax.swing.JPanel pnlSeven;
    private javax.swing.JPanel pnlSix;
    private javax.swing.JPanel pnlSubtraction;
    private javax.swing.JPanel pnlThree;
    private javax.swing.JPanel pnlTwo;
    private javax.swing.JPanel pnlZero;
    // End of variables declaration//GEN-END:variables
}
