import java.sql.*;
import javax.swing.*;				
import java.awt.*;
import java.awt.event.*;
class UpdateAccount
{
		JFrame f4;
		JLabel l1 = new JLabel(new ImageIcon("C:\\Users\\Maqsood alam\\Desktop\\newaccount1.jfif"));
		JLabel test,curdate,acctno,custnm,dob,phoneno,ocptn,panno,adharno,fulladd,gender,maritualstatus,anicm,nmoffstnom,crrtblce;
		JTextField testt,curdatet,acctnot,custnmt,dobt,phonenot,ocptnt,pannot,adharnot,fulladdt,anicmt,nmoffstnomt,crrtblcet;
		JComboBox Gender,maritualstatus1;
		JButton saveinfo,retrieveinfo;					
	UpdateAccount()
	{
		f4=new JFrame("UpdateAccount");
		l1.setBounds(0,0,800,800);
		f4.add(l1);

		test=new JLabel("Update Account Information");
		curdate=new JLabel("Current Date");
		acctno=new JLabel("Enter Customer's Account Number");
		custnm=new JLabel("Customer Name");
		dob=new JLabel("Date Of Birth");
		phoneno=new JLabel("Phone No");
		ocptn=new JLabel("Occupation");
		panno=new JLabel("Pan No");
		adharno=new JLabel("Adhar No");
		fulladd=new JLabel("Full Address");

		curdatet=new JTextField();
		acctnot=new JTextField();
		custnmt=new JTextField();
		dobt=new JTextField();
		phonenot=new JTextField();
		ocptnt=new JTextField();
		pannot=new JTextField();
		adharnot=new JTextField();
		fulladdt=new JTextField();

		Font fn=new Font("Arial",Font.BOLD,25);			
		test.setFont(fn);
		test.setBounds(200,55,350,20);

		acctno.setBounds(180,100,250,20);
		curdate.setBounds(100,160,100,20);
		custnm.setBounds(100,190,100,20);
		dob.setBounds(100,220,100,20);
		phoneno.setBounds(100,250,100,20);
		ocptn.setBounds(100,280,100,20);
		panno.setBounds(100,310,100,20);
		adharno.setBounds(100,340,100,20);
		fulladd.setBounds(100,370,100,20);

		acctnot.setBounds(400,100,110,20);
		curdatet.setBounds(250,160,110,20);
		custnmt.setBounds(250,190,110,20);
		dobt.setBounds(250,220,110,20);
		phonenot.setBounds(250,250,110,20);
		ocptnt.setBounds(250,280,110,20);
		pannot.setBounds(250,310,110,20);
		adharnot.setBounds(250,340,110,20);
		fulladdt.setBounds(250,370,110,20);

		gender=new JLabel("Gender");
		
		maritualstatus=new JLabel("Maritual Status");

		String gen[]={"Male", "Female"};
		Gender=new JComboBox(gen);

		String maritual[]={"Maried","Unmaried"};
		maritualstatus1=new JComboBox(maritual);
		
		gender.setBounds(380,190,100,20);
		Gender.setBounds(500,190,100,20);
		maritualstatus.setBounds(380,220,100,20);
		maritualstatus1.setBounds(500,220,100,20);
			
		anicm=new JLabel("Anual Income");					
		nmoffstnom=new JLabel("Name Of First Nominee");
		crrtblce=new JLabel("Current Balance");
		
		anicmt=new JTextField();	
		nmoffstnomt=new JTextField();
		crrtblcet=new JTextField();
					
		anicm.setBounds(380,250,150,20);			
		nmoffstnom.setBounds(380,280,150,20);
		crrtblce.setBounds(380,310,150,20);
		
		anicmt.setBounds(550,250,150,20);
		nmoffstnomt.setBounds(550,280,150,20);
		crrtblcet.setBounds(550,310,150,20);
		l1.add(anicm);
		l1.add(nmoffstnom);
		l1.add(crrtblce);
		l1.add(anicmt);
		l1.add(nmoffstnomt);
		l1.add(crrtblcet);
		
		saveinfo=new JButton("Save inforamtion >>>");
		saveinfo.setBounds(450,340,250,20);
		l1.add(saveinfo);
		
		retrieveinfo=new JButton("Retrieve Information");
		retrieveinfo.setBounds(550,100,150,20);
		f4.add(retrieveinfo);			
			
		l1.add(gender);
		l1.add(Gender);
		l1.add(maritualstatus);
		l1.add(maritualstatus1);
		l1.add(curdate);
		l1.add(acctno);
		l1.add(custnm);
		l1.add(dob);
		l1.add(phoneno);
		l1.add(ocptn);
		l1.add(panno);
		l1.add(adharno);
		l1.add(fulladd);
		l1.add(curdatet);
		l1.add(acctnot);
		l1.add(custnmt);
		l1.add(dobt);
		l1.add(phonenot);
		l1.add(ocptnt);
		l1.add(pannot);
		l1.add(adharnot);
		l1.add(fulladdt);		
		l1.add(test);

		f4.setBounds(200,10,800,800);
		f4.setLayout(null);
		f4.setVisible(true);
		
	}
		/*public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==saveinfo)
			{
				storeData();
 				
			}
		
		}
		public void storeData()										//JTextFieldtestt,curdatet,acctnot,custnmt,dobt,phonenot,ocptnt,pannot,adharnot,fulladdt,anicmt,nmoffstnomt,crrtblcet;
							//JRadioButton male,female,maried,unmaried;
							//ButtonGroup bg;
								//JComboBox Gender,maritualstatus1;
		{
			int x = 0;   
			String s1 = curdatet.getText();   
			String s2= acctnot.getText(); 
			String s3=custnmt.getText(); 
			String s4 = dobt.getText(); 
			String s5 = phonenot.getText();  
			String s6 = ocptnt.getText();  
			String s7 = pannot.getText();  
			String s8=adharnot.getText(); 
			String s9=fulladdt.getText(); 
			String s10=anicmt.getText(); 
			String s11=nmoffstnomt.getText(); 
			String s12=crrtblcet.getText(); 


			try 
			{ 
				Class.forName("com.mysql.jdbc.Driver");    
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tycs","root","123");
				PreparedStatement ps = con.prepareStatement("insert into NewAccount values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");   
				ps.setString(1, s1);   
				ps.setString(2, s2); 
				ps.setString(3, s3);  
				ps.setString(4, s4); 
				ps.setString(5, s5); 
				ps.setString(6, s6); 
				ps.setString(7, s7); 
				ps.setString(8, s8); 
				ps.setString(9, s9); 
				ps.setString(10, Gender.getSelectedItem().toString()); 
				ps.setString(11, maritualstatus1.getSelectedItem().toString()); 
				ps.setString(12, s10);
				ps.setString(13,s11);
				ps.setString(14, s12);
			
				//ps.executeUpdate(); 
				ResultSet rs = ps.executeQuery();   //x++; 
				if(rs.next()) 
				{ 
					JOptionPane.showMessageDialog(saveinfo, "Data Saved Successfully"); 
			        }
				
			}
			catch(Exception ex)
			 { 
				System.out.println(ex); 
			 } 
		}*/
			
		
				



		public static void main(String [] args)
	{
	 	UpdateAccount updtact=new UpdateAccount();
				
	}
}