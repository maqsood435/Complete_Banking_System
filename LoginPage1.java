import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.sql.*;
class LoginPage1 implements ActionListener
{
			
	JFrame f;
	JLabel l1 = new JLabel(new ImageIcon("C:\\Users\\Maqsood alam\\Desktop\\atm.jfif"));
			
	JLabel username,pwd,test;
	JPasswordField pwdt;
	JTextField usernamet;
	JButton signin,refresh,exit;

		LoginPage1()
		{
			f=new JFrame("Login Page");
			l1.setBounds(0,0,600,483);
			f.add(l1);
			test=new JLabel("Admin Login");
			Font fn=new Font("Arial",Font.BOLD,25);//for set the font
			test.setFont(fn);
			test.setForeground(Color.blue);	
			test.setBounds(220,60,380,60);	
			username=new JLabel("Enter User Name");
			pwd=new JLabel("Enter Password");
			usernamet=new JTextField();
			pwdt=new JPasswordField();
			signin=new JButton("Sigin");
			refresh=new JButton("Refresh");
			exit=new JButton("Exit");
			Font fn1=new Font("Arial",Font.BOLD,17);//for set the font
			username.setFont(fn1);
			pwd.setFont(fn1);
			usernamet.setFont(fn1);
			pwdt.setFont(fn1);
			signin.setFont(fn1);
			refresh.setFont(fn1);
			exit.setFont(fn1);
			username.setBounds(150,210,200,20);
			pwd.setBounds(150,250,200,20);
			usernamet.setBounds(300,210,150,20);
			pwdt.setBounds(300,250,150,20);
			signin.setBounds(150,290,120,20);
			refresh.setBounds(300,290,120,20);
			exit.setBounds(430,290,120,20);
			l1.add(username);
			l1.add(pwd);
			l1.add(usernamet);
			l1.add(pwdt);
			l1.add(signin);
			l1.add(refresh);
			l1.add(exit);
			l1.add(test);

			username.setForeground(Color.WHITE);
			pwd.setForeground(Color.WHITE);

	
			signin.addActionListener(this);
			exit.addActionListener(this);
			
			f.setBounds(200,10,600,483);
			f.setLayout(null);
			f.setVisible(true);
		}
			
				public void actionPerformed(ActionEvent e) 
				{ 
 					if(e.getSource()==signin) 
					{ 
						showData(); 
						HomePage hp=new HomePage(); 
					}
					else if(e.getSource()==exit)
					{
						f.dispose();
					}
				}
		
				public void showData() 
				{
					String usernm = usernamet.getText(); 
					String password=pwdt.getText();
					try 
					{
						Class.forName("com.mysql.jdbc.Driver"); 
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tycs", "root", "123");  
						PreparedStatement ps = con.prepareStatement("select User_Name,Password from login where User_Name=? and Password=?");
						ps.setString(1,usernm);
						ps.setString(2,password);
					
						ResultSet rs = ps.executeQuery();
						
						if (rs.next()) 
						{
							 JOptionPane.showMessageDialog(signin, "You have successfully logged in");
						}
						else 
						{ 
							JOptionPane.showMessageDialog(signin,"sorry incorrect ussername and password.."); 
						}
					} 	  
				catch(Exception e)
				{
					System.out.println(e);
				}
						
		
			}
 
public static void main(String [] args)
	{
		LoginPage1 lp=new LoginPage1();
	}

}
			
						
			
		
	
	