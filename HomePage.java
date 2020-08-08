import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class HomePage implements ActionListener
{

		JFrame f2;
		JLabel l2 = new JLabel(new ImageIcon("C:\\Users\\Maqsood alam\\Desktop\\Homepage3.jpg"));

		JMenu custact,transact,viewinformtn,adminpanel;
		JMenuItem newact,updtact,search,remact,deposit,withdraw,balancetransfer,transtnhist,listofallcustm,crtnewadmin,chngpwd,exit;
		
		HomePage()
		{
			JFrame f1=new JFrame("Menu Page");
			l2.setBounds(0,0,800,700);
			JMenuBar mb=new JMenuBar();

			custact=new JMenu("Customer Account");

			newact=new JMenuItem("New Account");
			updtact=new JMenuItem("Update Account");
			search=new JMenuItem("Search");
			remact=new JMenuItem("Remove Account");
			
			custact.add(newact);
			custact.add(updtact);
			custact.add(search);
			custact.add(remact);
			
			mb.add(custact);
			
			transact=new JMenu("Transaction");

			deposit=new JMenuItem("Deposit");
			withdraw=new JMenuItem("Withdraw");
			balancetransfer=new JMenuItem("Blanace Transfer");
			
			transact.add(deposit);
			transact.add(withdraw);
			transact.add(balancetransfer);
		
			mb.add(transact);
		
			viewinformtn=new JMenu("View Information");
			
			transtnhist=new JMenuItem("Transaction History");
			listofallcustm=new JMenuItem("List Of All Customer");
			viewinformtn.add(transtnhist);
			viewinformtn.add(listofallcustm);

			mb.add(viewinformtn);
			
			adminpanel=new JMenu("Admin Panel");

			crtnewadmin=new JMenuItem("Create New Admin");
			chngpwd=new JMenuItem("Change Password");
			exit=new JMenuItem("Exit"); 	
			mb.add(viewinformtn);

			adminpanel.add(crtnewadmin);
			adminpanel.add(chngpwd);
			adminpanel.add(exit);
			
			mb.add(adminpanel);
				
			newact.addActionListener(this);	
			updtact.addActionListener(this);
			deposit.addActionListener(this);
			withdraw.addActionListener(this);
			crtnewadmin.addActionListener(this);
			balancetransfer.addActionListener(this);	
			f1.setJMenuBar(mb);
			f1.setBounds(200,10,800,700);
			f1.setLayout(null);
			f1.setVisible(true);
			f1.add(l2);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==newact)
			{
		
				NewAccount nb1=new NewAccount();	//here we are create the new account of object from another class		
			}
			else if(e.getSource()==updtact)
			{
				UpdateAccount updac=new UpdateAccount();
			}
			else if(e.getSource()==deposit)
			{
				Deposit dp=new Deposit();	
			}
			else if(e.getSource()==withdraw)
			{
				Withdraw_Test wd=new Withdraw_Test();
			}
			else if(e.getSource()==crtnewadmin)
			{
				AdminTest adt=new AdminTest();
			}
			else if(e.getSource()==balancetransfer)
			{
				Transfer trn=new Transfer();
			}
		}
		
	public static void main(String [] args)
	{
		new HomePage();
	}
}	
			
			
			
			
		
		
		