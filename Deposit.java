import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Deposit implements ActionListener
{
	JFrame f5;
	JLabel l1 = new JLabel(new ImageIcon("C:\\Users\\Maqsood alam\\Desktop\\deposit.jpg"));
	JLabel test,ent_des_actno,date,actno,custno,prevbal,tranmode,deposit;
	JTextField ent_des_actnot,datet,actnot,custnot,prevbalt,depositt;
	JButton savetransact,generatedet;
	JComboBox transactmode;			
	Deposit()
	{
		f5=new JFrame("Deposit Window");	
		l1.setBounds(0,0,800,768);
		f5.add(l1);
			
		test=new JLabel("Deposit Window");
		ent_des_actno=new JLabel("Entered Desired Account Number");
		date=new JLabel("Date");
		actno=new JLabel("Account Number");
		custno=new JLabel("Customer Number");
		prevbal=new JLabel("Previous Balance");
		tranmode=new JLabel("Transaction Mode");
		deposit=new JLabel("Deposit Amount");
		
		ent_des_actnot=new JTextField();
		datet=new JTextField();
		actnot=new JTextField();
		custnot=new JTextField();
		prevbalt=new JTextField();
		//tranmodet=new JTextField();
		depositt=new JTextField();
				
		test.setBounds(250,40,300,60);
		Font fn=new Font("Arial",Font.BOLD,25);			//set font
		test.setFont(fn);
		test.setForeground(Color.blue);		


		ent_des_actno.setBounds(280,100,200,20);
		date.setBounds(280,160,100,20);
		actno.setBounds(280,190,100,20);
		custno.setBounds(280,220,150,20);
		prevbal.setBounds(280,250,100,20);
		tranmode.setBounds(280,280,150,20);
		deposit.setBounds(280,310,100,20);
		
		ent_des_actnot.setBounds(480,100,110,20);
		datet.setBounds(420,160,110,20);
		actnot.setBounds(420,190,110,20);
		custnot.setBounds(420,220,110,20);
		prevbalt.setBounds(420,250,110,20);
		//transactmodet.setBounds(420,280,110,20);
		depositt.setBounds(420,310,110,20);

		savetransact=new JButton("Save Transaction");
		savetransact.setBounds(400,350,200,20);
		generatedet=new JButton("Generate Details");
		generatedet.setBounds(600,100,180,20);
		
		String transmode[]={"Cash","Cheque"};
		transactmode=new JComboBox(transmode);
		transactmode.setBounds(420,280,110,20);
		
		l1.add(savetransact);
		l1.add(transactmode);
		l1.add(generatedet);		
		l1.add(test);
		l1.add(ent_des_actno);
		l1.add(date);
		l1.add(actno);
		l1.add(custno);
		l1.add(prevbal);
		l1.add(tranmode);
		l1.add(deposit);

		l1.add(ent_des_actnot);
		l1.add(datet);
		l1.add(actnot);
		l1.add(custnot);
		l1.add(prevbalt);
		//f5.add(tranmodet);
		l1.add(depositt);
		
		//f5.getContentPane().setBackground(Color.pink);		//set the background colour of page

		
			
		f5.setBounds(200,10,800,768);
		f5.setLayout(null);
		f5.setVisible(true);
		
		generatedet.addActionListener(this);	
		savetransact.addActionListener(this);	
		
	}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==generatedet)
			{
				String str=ent_des_actnot.getText();
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/tycs", "root", "123");
					String sql="select * from newaccount where Account_No='"+str+"'";
					PreparedStatement ps = con.prepareStatement(sql);
					ResultSet rs = ps.executeQuery(sql);	
					
					if(rs.next())
					{
				
						while(rs.next())	//datet,actnot,custnot,prevbalt,depositt;
						{
							datet.setText(rs.getString("CurrentDate"));
							actnot.setText(rs.getString("Account_No"));
							custnot.setText(rs.getString("Customer_Name"));
							prevbalt.setText(rs.getString("currentBalance"));
						}
							JOptionPane.showMessageDialog(generatedet, "Account no is correct");//here we set the action on btn
					}
					else
					{
						JOptionPane.showMessageDialog(generatedet, "Account no does not exist, please enter correct Account no");	
					}
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
			if(e.getSource()==savetransact)
			{
				int x=0;
				String dep=depositt.getText();
				int dep1=Integer.valueOf(dep);
				//System.out.println(dep1);

				try{
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/tycs", "root", "123");
				String sql="update newaccount set currentBalance=currentBalance + 140 where account_No=1234321";
				PreparedStatement ps = con.prepareStatement(sql);
				//ps.setInt(1,dep1)
				//ResultSet rs = ps.executeQuery(sql);	
				ps.executeUpdate();
				x++;
				if(x>0)
					{
							JOptionPane.showMessageDialog(savetransact,"Data Saved Successfully");
					}
				}
				catch(Exception ex1)
				{
					System.out.println(ex1);
				}				
			}
		}
		
public static void main(String [] args)
	{
		Deposit dp=new Deposit();
		
	}
}		
