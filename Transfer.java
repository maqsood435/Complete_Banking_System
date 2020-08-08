import java.sql.*;
import javax.swing.*;
import java.awt.*;
class Transfer
{
	JFrame f6;
	JLabel l1 = new JLabel(new ImageIcon("C:\\Users\\Maqsood alam\\Desktop\\deposit.jpg"));
	
	JLabel test,ent_des_actno,date,actno,custno,prevbal,dstnacno,transfer;
	JTextField ent_des_actnot,datet,actnot,custnot,prevbalt,dstnact,transfert;
	JButton savetransact,generatedet,availblty;
	//JComboBox transactmode;			
	Transfer()
	{
		f6=new JFrame("Transfer Window");
		l1.setBounds(0,0,800,700);
		f6.add(l1);
					
		test=new JLabel("Transfer Window");
		ent_des_actno=new JLabel("Entered Desired Account Number");
		date=new JLabel("Date");
		actno=new JLabel("Account Number");
		custno=new JLabel("Customer Number");
		prevbal=new JLabel("Previous Balance");
		dstnacno=new JLabel("Destination A/C Number");
		transfer=new JLabel("Transfer Amount");
		
		ent_des_actnot=new JTextField();
		datet=new JTextField();
		actnot=new JTextField();
		custnot=new JTextField();
		prevbalt=new JTextField();
		dstnact=new JTextField();
		transfert=new JTextField();
		
		test.setBounds(280,40,300,60);
		Font fn=new Font("Arial",Font.BOLD,25);			//set font
		test.setFont(fn);
		test.setForeground(Color.blue);		

		
		ent_des_actno.setBounds(280,100,200,20);
		date.setBounds(280,160,100,20);
		actno.setBounds(280,190,100,20);
		custno.setBounds(280,220,150,20);
		prevbal.setBounds(280,250,100,20);
		dstnacno.setBounds(280,280,150,20);
		transfer.setBounds(280,310,100,20);
		
		ent_des_actnot.setBounds(500,100,110,20);
		datet.setBounds(420,160,110,20);
		actnot.setBounds(420,190,110,20);
		custnot.setBounds(420,220,110,20);
		prevbalt.setBounds(420,250,110,20);
		dstnact.setBounds(420,280,110,20);
		transfert.setBounds(420,310,110,20);

		savetransact=new JButton("Save Transaction");
		savetransact.setBounds(400,350,200,20);
		generatedet=new JButton("Generate Details");
		generatedet.setBounds(630,100,150,20);
		availblty=new JButton("Availability");
		availblty.setBounds(550,280,150,20);
		
		
		/*String transmode[]={"Cash","Cheque"};
		transactmode=new JComboBox(transmode);
		transactmode.setBounds(420,280,110,20);*/
		
		l1.add(availblty);
		l1.add(availblty);
		
		l1.add(savetransact);
		l1.add(transfer);
		l1.add(generatedet);		
		l1.add(test);
		l1.add(ent_des_actno);
		l1.add(date);
		l1.add(actno);
		l1.add(custno);
		l1.add(prevbal);
		l1.add(dstnacno);
		//f6.add(deposit);

		l1.add(ent_des_actnot);
		l1.add(datet);
		l1.add(actnot);
		l1.add(custnot);
		l1.add(prevbalt);
		l1.add(transfert);
		l1.add(dstnact);
		
		//f6.getContentPane().setBackground(Color.yellow);		//set the background colour of page


		
			
		f6.setBounds(200,10,800,700);
		f6.setLayout(null);
		f6.setVisible(true);
		
	}
	public static void main(String [] args)
	{
		Transfer tr=new Transfer();
		
	}
}		
