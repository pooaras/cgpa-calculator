import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class cgpacalc {
    public static int grade(String ch){
        int x=0;
        if (ch.equals("o")||ch.equals("O"))
          x= 10;
        else if(ch.equals("a+")||ch.equals("A+"))
          x= 9;
        else if(ch.equals("a")||ch.equals("A"))
          x= 8;
        else if(ch.equals("b+")||ch.equals("B+"))
         x= 7;
        else if(ch.equals("b")||ch.equals("B"))
          x= 6;
        else if(ch.equals("ra")||ch.equals("RA"))
          x= 0;
        else System.out.println("enter a valid grade!!!...");
        return x;
        } 
    cgpacalc(){
        JFrame f1=new JFrame("cgpa calculator");
        JPanel p=new JPanel();
        JPanel o=new JPanel();
        
		JLabel l=new JLabel("Choose your semester below...!");
		JButton b=new JButton("click ok");
        String semarray[]= {"Semester 1","Semester 2","Semester 3","Semester 4","Semester 5","Semester 6","Semester 7","Semester 8"};   
		JComboBox<String> box=new JComboBox<>(semarray);
		   
        f1.setLayout(null);
        p.setLayout(null);
        o.setLayout(null);
        //f1.setLocationRelativeTo(null);
        p.setBackground(new Color(211,211,211));
        o.setBackground(new Color(100,100,0));
        p.setBounds(0,0,200,700);
        o.setBounds(0,0,1000,1000);
        l.setBounds(10,-200,200,500);
        p.add(l);
        b.setBounds(58,110,78,20);
        box.setBounds(50,68,100,20);
        p.add(box);
        p.add(b);
        f1.add(o);
        o.add(p);


        String Gradearray[]= {"O","A+","A","B+","B","RA"};

       //semester 1 panel
 JPanel p1=new JPanel();
 p1.setLayout(null);
 p1.setBackground(Color.yellow);
 p1.setBounds(200,0,800,700);
 JButton sem1_b1=new JButton("CALCULATE YOUR CGPA HERE!!!");
 JLabel sem1_l1=new JLabel("Enter your grade in HS8151-Communicative English:");
 JLabel sem1_l2=new JLabel("Enter your grade in MA8151-Engineering Mathematics:");
 JLabel sem1_l3=new JLabel("Enter your grade in PH8151-Engineering Physics:");
 JLabel sem1_l4=new JLabel("Enter your grade in CY8151-Engineering Chemistry:");
 JLabel sem1_l5=new JLabel("Enter your grade in GE8151-Problem Solving and python programming:");
 JLabel sem1_l6=new JLabel("Enter your grade in GE8152-Engineering Graphics :");
 JLabel sem1_l7=new JLabel("Enter your grade in GE8161-Problem Solving and python programming laboratory:");
 JLabel sem1_l8=new JLabel("Enter your grade in BS8161-Physics and Chemistry:");
 JLabel sem1_l10=new JLabel();
         
 
 JComboBox<String> sem1_box1=new JComboBox<>(Gradearray);
 JComboBox<String> sem1_box2=new JComboBox<>(Gradearray);
 JComboBox<String> sem1_box3=new JComboBox<>(Gradearray);
 JComboBox<String> sem1_box4=new JComboBox<>(Gradearray);
 JComboBox<String> sem1_box5=new JComboBox<>(Gradearray);
 JComboBox<String> sem1_box6=new JComboBox<>(Gradearray);
 JComboBox<String> sem1_box7=new JComboBox<>(Gradearray);
 JComboBox<String> sem1_box8=new JComboBox<>(Gradearray);
 
 
 sem1_box1.setBounds(400,100,90,50);
 sem1_box2.setBounds(400,150,90,50);
 sem1_box3.setBounds(400,200,90,50);
 sem1_box4.setBounds(400,250,90,50);
 sem1_box5.setBounds(400,300,90,50);
 sem1_box6.setBounds(400,350,90,50);
 sem1_box7.setBounds(400,400,90,50);
 sem1_box8.setBounds(400,450,90,50);
 sem1_b1.setBounds(60,550,250,30);
         
 sem1_l1.setBounds(20,100,500,50);
 sem1_l2.setBounds(20,150,500,50);
 sem1_l3.setBounds(20,200,500,50);
 sem1_l4.setBounds(20,250,500,50);
 sem1_l5.setBounds(20,300,500,50);
 sem1_l6.setBounds(20,350,500,50);
 sem1_l7.setBounds(20,400,500,50);
 sem1_l8.setBounds(20,450,500,50);
 sem1_l10.setBounds(20,600,500,30);
 sem1_b1.addActionListener(new ActionListener()
 {
   public void actionPerformed(ActionEvent ae)
   { 
        String sem1_eng=""+sem1_box1.getItemAt(sem1_box1.getSelectedIndex());
        int sem1_eng1=grade(sem1_eng);
        String sem1_mat=""+sem1_box2.getItemAt(sem1_box2.getSelectedIndex());
        int sem1_mat1=grade(sem1_mat);
        String sem1_phy=""+sem1_box3.getItemAt(sem1_box3.getSelectedIndex());
        int sem1_phy1=grade(sem1_phy);
        String sem1_chem=""+sem1_box4.getItemAt(sem1_box4.getSelectedIndex());
        int sem1_chem1=grade(sem1_chem);
        String sem1_pspp=""+sem1_box5.getItemAt(sem1_box5.getSelectedIndex());
        int sem1_pspp1=grade(sem1_pspp);
        String sem1_eg=""+sem1_box6.getItemAt(sem1_box6.getSelectedIndex());
        int sem1_eg1=grade(sem1_eg);
        String sem1_pspplab=""+sem1_box7.getItemAt(sem1_box7.getSelectedIndex());
        int sem1_pspplab1=grade(sem1_pspplab);
        String sem1_phychemlab=""+sem1_box8.getItemAt(sem1_box8.getSelectedIndex());
        int sem1_phychemlab1=grade(sem1_phychemlab);
        
        Float sum=(float)((sem1_eng1*4)+(sem1_mat1*4)+(sem1_phy1*3)+(sem1_chem1*3)+(sem1_pspp1*3)+(sem1_eg1*4)+(sem1_phychemlab1*2)+(sem1_pspplab1*2))/25;
        
 sem1_l10.setText("your gpa of semester 1 is :"+String.valueOf(sum));
 
    }
 }); 
 p1.add(sem1_box1);
 p1.add(sem1_box2);
 p1.add(sem1_box3);
 p1.add(sem1_box4);
 p1.add(sem1_box5);
 p1.add(sem1_box6);
 p1.add(sem1_box7);
 p1.add(sem1_box8);
 p1.add(sem1_l1);
 p1.add(sem1_l2);
 p1.add(sem1_l3);
 p1.add(sem1_l4);
 p1.add(sem1_l5);
 p1.add(sem1_l6);
 p1.add(sem1_l7);
 p1.add(sem1_l8);
 p1.add(sem1_b1);
 p1.add(sem1_l10);

//semester 1 panel ends

             //semester 2 panel
     JPanel p2=new JPanel();
     p2.setLayout(null);
     p2.setBackground(Color.yellow);
     p2.setBounds(200,0,800,700);
     JButton sem2_b1=new JButton("CALCULATE YOUR CGPA HERE!!!");
     JLabel sem2_l1=new JLabel("Enter your grade in HS8251-Technical English:");
     JLabel sem2_l2=new JLabel("Enter your grade in MA8251-Engineering Mathematics 2:");
     JLabel sem2_l3=new JLabel("Enter your grade in PH8252-Physics for information Science:");
     JLabel sem2_l4=new JLabel("Enter your grade in BE8255-Basic Electrical,Electronics and Measurement Engineering :");
     JLabel sem2_l5=new JLabel("Enter your grade in GE8291-Environmental Science and Engineering:");
     JLabel sem2_l6=new JLabel("Enter your grade in CS8251-Programming in C:");
     JLabel sem2_l7=new JLabel("Enter your grade in GE8261-Engineering Practices laboratory:");
     JLabel sem2_l8=new JLabel("Enter your grade in CS8261-C Programming Laboratory:");
     JLabel sem2_l10=new JLabel();
             
     
     JComboBox<String> sem2_box1=new JComboBox<>(Gradearray);
     JComboBox<String> sem2_box2=new JComboBox<>(Gradearray);
     JComboBox<String> sem2_box3=new JComboBox<>(Gradearray);
     JComboBox<String> sem2_box4=new JComboBox<>(Gradearray);
     JComboBox<String> sem2_box5=new JComboBox<>(Gradearray);
     JComboBox<String> sem2_box6=new JComboBox<>(Gradearray);
     JComboBox<String> sem2_box7=new JComboBox<>(Gradearray);
     JComboBox<String> sem2_box8=new JComboBox<>(Gradearray);
     
     
     sem2_box1.setBounds(400,100,90,50);
     sem2_box2.setBounds(400,150,90,50);
     sem2_box3.setBounds(400,200,90,50);
     sem2_box4.setBounds(400,250,90,50);
     sem2_box5.setBounds(400,300,90,50);
     sem2_box6.setBounds(400,350,90,50);
     sem2_box7.setBounds(400,400,90,50);
     sem2_box8.setBounds(400,450,90,50);
     sem2_b1.setBounds(60,550,250,30);
             
     sem2_l1.setBounds(20,100,500,50);
     sem2_l2.setBounds(20,150,500,50);
     sem2_l3.setBounds(20,200,500,50);
     sem2_l4.setBounds(20,250,500,50);
     sem2_l5.setBounds(20,300,500,50);
     sem2_l6.setBounds(20,350,500,50);
     sem2_l7.setBounds(20,400,500,50);
     sem2_l8.setBounds(20,450,500,50);
     sem2_l10.setBounds(20,600,500,30);
     sem2_b1.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent ae)
       { 
            String sem2_eng=""+sem2_box1.getItemAt(sem2_box1.getSelectedIndex());
            int sem2_eng1=grade(sem2_eng);
            String sem2_mat=""+sem2_box2.getItemAt(sem2_box2.getSelectedIndex());
            int sem2_mat1=grade(sem2_mat);
            String sem2_phy=""+sem2_box3.getItemAt(sem2_box3.getSelectedIndex());
            int sem2_phy1=grade(sem2_phy);
            String sem2_beeme=""+sem2_box4.getItemAt(sem2_box4.getSelectedIndex());
            int sem2_beeme1=grade(sem2_beeme);
            String sem2_ese=""+sem2_box5.getItemAt(sem2_box5.getSelectedIndex());
            int sem2_ese2=grade(sem2_ese);
            String sem2_pc=""+sem2_box6.getItemAt(sem2_box6.getSelectedIndex());
            int sem2_pc1=grade(sem2_pc);
            String sem2_Eplab=""+sem2_box7.getItemAt(sem2_box7.getSelectedIndex());
            int sem2_Eplab1=grade(sem2_Eplab);
            String sem2_Cplab=""+sem2_box8.getItemAt(sem2_box8.getSelectedIndex());
            int sem2_Cplab1=grade(sem2_Cplab);
            
            Float sum=(float)((sem2_eng1*4)+(sem2_mat1*4)+(sem2_phy1*3)+(sem2_beeme1*3)+(sem2_ese2*3)+(sem2_pc1*3)+(sem2_Eplab1*2)+(sem2_Cplab1*2))/25;
            
     sem2_l10.setText("your gpa of semester 2 is :"+String.valueOf(sum));
     
        }
     }); 
     p2.add(sem2_box1);
     p2.add(sem2_box2);
     p2.add(sem2_box3);
     p2.add(sem2_box4);
     p2.add(sem2_box5);
     p2.add(sem2_box6);
     p2.add(sem2_box7);
     p2.add(sem2_box8);
     p2.add(sem2_l1);
     p2.add(sem2_l2);
     p2.add(sem2_l3);
     p2.add(sem2_l4);
     p2.add(sem2_l5);
     p2.add(sem2_l6);
     p2.add(sem2_l7);
     p2.add(sem2_l8);
     p2.add(sem2_b1);
     p2.add(sem2_l10);
    
    //semester 2 panel ends
    
    
    

        //semester 3 panel
        JPanel p3=new JPanel();
        p3.setLayout(null);
        p3.setBackground(Color.yellow);
        p3.setBounds(200,0,800,700);
        JButton sem3_b1=new JButton("CALCULATE YOUR CGPA HERE!!!");
        JLabel sem3_l1=new JLabel("Enter your grade in MA8351-Discrete Mathematics:");
        JLabel sem3_l2=new JLabel("Enter your grade in CS8351-Digital principal & system design:");
        JLabel sem3_l3=new JLabel("Enter your grade in CS8391-Data Sructures:");
        JLabel sem3_l4=new JLabel("Enter your grade in CS8392-Object oriented programming:");
        JLabel sem3_l5=new JLabel("Enter your grade in EC8395-Communication engineering:");
        JLabel sem3_l6=new JLabel("Enter your grade in CS8381-Data Structures laboratory :");
        JLabel sem3_l7=new JLabel("Enter your grade in CS8383-Object oriented laboratory:");
        JLabel sem3_l8=new JLabel("Enter your grade in CS8382-Digital Systems laboratory:");
        JLabel sem3_l9=new JLabel("Enter your grade in HS8381-Interpersonal skills");
        JLabel sem3_l10=new JLabel();
                
        
        JComboBox<String> sem3_box1=new JComboBox<>(Gradearray);
        JComboBox<String> sem3_box2=new JComboBox<>(Gradearray);
        JComboBox<String> sem3_box3=new JComboBox<>(Gradearray);
        JComboBox<String> sem3_box4=new JComboBox<>(Gradearray);
        JComboBox<String> sem3_box5=new JComboBox<>(Gradearray);
        JComboBox<String> sem3_box6=new JComboBox<>(Gradearray);
        JComboBox<String> sem3_box7=new JComboBox<>(Gradearray);
        JComboBox<String> sem3_box8=new JComboBox<>(Gradearray);
        JComboBox<String> sem3_box9=new JComboBox<>(Gradearray);
        
        sem3_box1.setBounds(400,100,90,50);
        sem3_box2.setBounds(400,150,90,50);
        sem3_box3.setBounds(400,200,90,50);
        sem3_box4.setBounds(400,250,90,50);
        sem3_box5.setBounds(400,300,90,50);
        sem3_box6.setBounds(400,350,90,50);
        sem3_box7.setBounds(400,400,90,50);
        sem3_box8.setBounds(400,450,90,50);
        sem3_box9.setBounds(400,500,90,50);
        sem3_b1.setBounds(60,550,250,30);
                
        sem3_l1.setBounds(20,100,500,50);
        sem3_l2.setBounds(20,150,500,50);
        sem3_l3.setBounds(20,200,500,50);
        sem3_l4.setBounds(20,250,500,50);
        sem3_l5.setBounds(20,300,500,50);
        sem3_l6.setBounds(20,350,500,50);
        sem3_l7.setBounds(20,400,500,50);
        sem3_l8.setBounds(20,450,500,50);
        sem3_l9.setBounds(20,500,500,50);
        sem3_l10.setBounds(20,600,500,30);
        sem3_b1.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent ae)
          { 
               String mat=""+sem3_box1.getItemAt(sem3_box1.getSelectedIndex());
               int mat1=grade(mat);
               String dpsd=""+sem3_box2.getItemAt(sem3_box2.getSelectedIndex());
               int dpsd1=grade(dpsd);
               String ds=""+sem3_box3.getItemAt(sem3_box3.getSelectedIndex());
               int ds1=grade(ds);
               String oops=""+sem3_box4.getItemAt(sem3_box4.getSelectedIndex());
               int oops1=grade(oops);
               String ce=""+sem3_box5.getItemAt(sem3_box5.getSelectedIndex());
               int ce1=grade(ce);
               String dsl=""+sem3_box6.getItemAt(sem3_box6.getSelectedIndex());
               int dsl1=grade(dsl);
               String oopslab=""+sem3_box7.getItemAt(sem3_box7.getSelectedIndex());
               int oopslab1=grade(oopslab);
               String dlab=""+sem3_box8.getItemAt(sem3_box8.getSelectedIndex());
               int dlab1=grade(dlab);
               String eng=""+sem3_box9.getItemAt(sem3_box9.getSelectedIndex());
               int eng1=grade(eng);
               Float sum=(float)((mat1*4)+(dpsd1*4)+(ds1*3)+(oops1*3)+(ce1*3)+(dsl1*2)+(dlab1*2)+(eng1*1)+(oopslab1*2))/24;
               
        sem3_l10.setText("your gpa of semester 3 is :"+String.valueOf(sum));
        
           }
        }); 
        p3.add(sem3_box1);
        p3.add(sem3_box2);
        p3.add(sem3_box3);
        p3.add(sem3_box4);
        p3.add(sem3_box5);
        p3.add(sem3_box6);
        p3.add(sem3_box7);
        p3.add(sem3_box8);
        p3.add(sem3_box9);
        p3.add(sem3_l1);
        p3.add(sem3_l2);
        p3.add(sem3_l3);
        p3.add(sem3_l4);
        p3.add(sem3_l5);
        p3.add(sem3_l6);
        p3.add(sem3_l7);
        p3.add(sem3_l8);
        p3.add(sem3_l9);
        p3.add(sem3_b1);
        p3.add(sem3_l10);
        
      
       //semester 3 panel ends



        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(900,720);
        f1.setVisible(true);
        b.addActionListener(new ActionListener()
	         {
                  	public void actionPerformed(ActionEvent ae)
                	{
	        	
	        		String sem=""+box.getItemAt(box.getSelectedIndex());
             
              switch (sem) { 
                case "Semester 1":
                     o.removeAll();
                     o.add(p);
                     o.add(p1);
                     f1.setContentPane(o);
                     break;

               case "Semester 2":
                     o.removeAll();
                     o.add(p);
                     o.add(p2);
                     f1.setContentPane(o);
                     break;
                
                case "Semester 3":
                   o.removeAll();
                   o.add(p);
                   o.add(p3);
                   f1.setContentPane(o);
                   break;

                default:
                  JOptionPane.showMessageDialog(f1,"sorry...currently 1,2 & 3rd semester only available...please ask pooaraz to update...????");
                  break;
              }
	        	
	        	}
	         }); 
		
    }
    public static void semester3(){
            
        
    }
 
    public static void main(String[] args)
    {
    new cgpacalc();
    }
}

