import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class Ai extends JFrame implements ActionListener{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 33691524L;
	
	private Frame f,f2,f3;
	private JPanel p1,p2,p3,p4;
	private JLabel text1;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	ImageIcon x,o,bg;
	private int user=0;
	String [] a=new String[9];
	  Sound sound = new Sound();
	// for menu item
	
	private MenuBar mb;
	private Menu m1;
	private MenuItem mi1,mi2,mi3,mi4;
	
	
	public Ai (){
		f = new JFrame("Tic Tac Toeeee");
		f2 = new JFrame("Tic Tac Toeeee");
		
		// For input a image as background
		 try{
			    ((JFrame) f).setContentPane(new JLabel (new ImageIcon(this.getClass().getResource("bg1.png"))));

				}
			    catch(Exception e){}
		
		 //for input an image as background
		   try{
		    ((JFrame) f2).setContentPane(new JLabel(new ImageIcon(this.getClass().getResource("bg.png"))));
			}
		    catch(Exception e){}
		    
		    
		p1 = new JPanel();
		p2 = new JPanel();
		p4 = new JPanel(new BorderLayout());
		
		 b1 = new JButton("");
	   	 b1.setActionCommand("1 button");
	   	 
	   	 b2 = new JButton("");
	   	 b2.setActionCommand("2 button");
	   	 
	     b3 = new JButton(" ");
	  	 b3.setActionCommand("3 button");
	  	 
	  	 b4 = new JButton(" ");
	  	 b4.setActionCommand("4 button");
	  	 
	  	 b5 = new JButton(" ");
	  	 b5.setActionCommand("5 button");
	  	 
	  	 b6 = new JButton(" ");
	  	 b6.setActionCommand("6 button");
	  	 
	  	 b7 = new JButton(" ");
	  	 b7.setActionCommand("7 button");
	  	 
	  	 b8 = new JButton(" ");
	  	 b8.setActionCommand("8 button");
	  	 
	  	 b9 = new JButton(" ");
	  	 b9.setActionCommand("9 button");
	  	 
	  	 b10 = new JButton("E");
	  	 b10.setActionCommand("e");
	  	 
	  	 b11 = new JButton("Play");
	  	 b11.setActionCommand("d");
	  	 
	  // for menu item
	  	 mb = new MenuBar();
	   	 m1 = new Menu("Help");
	   	 
	     mi1 = new MenuItem("Play Again");
	     mi1.setActionCommand("refresh");
	     
	   	 mi2 = new MenuItem("Home");
         mi2.setActionCommand("return");
         
         mi3 = new MenuItem("Instruction");
         mi3.setActionCommand("ins");
         
         mi4 = new MenuItem("About");
         mi4.setActionCommand("abt");
	  	 
	  	 // For Image Input
	  	 
	    x = new ImageIcon(this.getClass().getResource("cross.png"));
	    o =  new ImageIcon(this.getClass().getResource("o.png"));
	
	  	 for(int i=0;i<9;i++)
	  		 {
	  			 a[i]= "_";
	  		 }
	  	 
//	  	 text1 = new JLabel("Tic-tac-toe (or Noughts and crosses, Xs and Os) is a paper-and-pencil game for two players, X and O, who take turns marking the spaces in a 3�3 grid. The player who succeeds in placing three respective marks in a horizontal, vertical, or diagonal row wins the game.");
	}
	
	public void show(){
		f.setResizable(false);
		f.setSize(480, 700);
		f.setVisible(true);
		
		f.setLayout(null);
		b11.setBounds(180, 590,150, 30);
		f.add(b11);
		
		
		
		f2.setResizable(false);
		f2.setSize(705,400);
		f2.setVisible(false);
		f2.setLayout(null);
		
	
		//sound.sound3();
		
		
		f2.setMenuBar(mb);
		m1.setFont (new Font("SansSerif" , Font .BOLD , 15)); 
		mb.add(m1);
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi4);
		
		 mi1.addActionListener(this);
		 mi1.setFont (new Font("SansSerif" , Font .BOLD , 15)); 
	   	 mi2.addActionListener(this);
	   	 mi2.setFont (new Font("SansSerif" , Font .BOLD , 15));
	     mi3.addActionListener(this);
		 mi3.setFont (new Font("SansSerif" , Font .BOLD , 15)); 
	   	 mi4.addActionListener(this);
	   	 mi4.setFont (new Font("SansSerif" , Font .BOLD , 15)); 
	   	 
	   	 
	   	 
	   	 p4.setBackground(new Color(248,107,20,20));
	   	JLabel myLabel = new JLabel("Developed by Meshu Debnath"); 
	   	p4.add(myLabel);
	   	 
	    p1.setBounds(160,40,400 ,250);
	 
	 	Color f = new Color(248,107,20);
		
	     p1.setLayout(new GridLayout(3,3));
	     p1.setBackground(new Color(248,107,20,20));
         f2.add(p1);
	     p1.add(b1);
	     p1.add(b2);
	     p1.add(b3);
	     p1.add(b4);
	     p1.add(b5);
	     p1.add(b6); 
	     p1.add(b7); 
	     p1.add(b8); 
	     p1.add(b9);
 
	    
	
	  
	 	b1.addActionListener ( this );
	   	b1.setForeground ( f ); 
	   	b1.setBackground ( Color . gray ); 
	   	b1. setFont (new Font("SansSerif" , Font .BOLD + Font .ITALIC, 50)); 
	 
		b2.addActionListener ( this );
	   	b2.setForeground ( f); 
	   	b2.setBackground ( Color . gray  ); 
	   	b2. setFont (new Font("SansSerif" , Font .BOLD + Font .ITALIC, 50)); 
	   	
	   	b3.addActionListener ( this );
	   	b3.setForeground ( f ); 
	   	b3.setBackground ( Color . gray  );
	   	b3. setFont (new Font("SansSerif" , Font .BOLD + Font .ITALIC, 50)); 
	   	
		b4.addActionListener ( this );
	   	b4.setForeground ( f ); 
	   	b4.setBackground ( Color . gray  );
	   	b4. setFont (new Font("SansSerif" , Font .BOLD + Font .ITALIC, 50)); 
	   	
	   	b5.addActionListener ( this );
	   	b5.setForeground ( Color . white ); 
	   	b5.setBackground ( Color . gray  );
	   	b5. setFont (new Font("SansSerif" , Font .BOLD + Font .ITALIC, 50)); 
	   	
		b6.addActionListener ( this );
	   	b6.setForeground (f ); 
	   	b6.setBackground ( Color . gray  );
	   	b6. setFont (new Font("SansSerif" , Font .BOLD + Font .ITALIC, 50)); 
	   	
		b7.addActionListener ( this );
	   	b7.setForeground (f ); 
	   	b7.setBackground ( Color . gray  );
	   	b7. setFont (new Font("SansSerif" , Font .BOLD + Font .ITALIC, 50)); 
	   	
		b8.addActionListener ( this );
	   	b8.setForeground (f ); 
	   	b8.setBackground ( Color . gray  );
	   	b8. setFont (new Font("SansSerif" , Font .BOLD + Font .ITALIC, 50)); 
	   	
	   	b9.addActionListener ( this );
	   	b9.setForeground (f); 
	   	b9.setBackground ( Color . gray  );
	   	b9. setFont (new Font("SansSerif" , Font .BOLD + Font .ITALIC, 50)); 
	 
	   	
	   	Color e = new Color(255,24,4);
	   	b11.addActionListener ( this );
	   	b11.setForeground ( Color . black ); 
	   	b11.setBackground (e );
	   	b11. setFont (new Font("SansSerif" , Font .BOLD + Font .ITALIC, 20));

		
	}
	

	
  
	
	public static void main(String[] args) {
	
	   Ai m = new Ai();
	   m.show();
	   
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()=="ins")
		{
			 p2.setBounds(160,40,400 ,250);
			 p2.setBackground(Color.gray);
			 
		}

		if(e.getActionCommand()=="abt")
		{
			p4.setBounds(160,40,400 ,250);
			 p4.setBackground(Color.gray);
			p1.setVisible(false);
			p2.setVisible(false);
			p4.setVisible(true);
			 
		}
		
		if(e.getActionCommand()=="refresh")
		{
			b1.setIcon(null);
			b2.setIcon(null);
			b3.setIcon(null);
			b4.setIcon(null);
			b5.setIcon(null);
			b6.setIcon(null);
			b7.setIcon(null);
			b8.setIcon(null);
			b9.setIcon(null);
			
			 for(int i=0;i<9;i++)
		  		 {
		  			 a[i] ="_";
		  		 }
			
		    
		}
		
		if(e.getActionCommand()=="return")
		{
			f2.setVisible(false);
			f.setVisible(true);
			
			b1.setIcon(null);
			b2.setIcon(null);
			b3.setIcon(null);
			b4.setIcon(null);
			b5.setIcon(null);
			b6.setIcon(null);
			b7.setIcon(null);
			b8.setIcon(null);
			b9.setIcon(null);
			
			 for(int i=0;i<9;i++)
		  		 {
		  			 a[i] = "_";
		  		 }
		}
	
		else if(e.getActionCommand()=="d")
    	{   
			f.setVisible(false);		
    		f2.setVisible(true);
    		user = 2;
    	}
		
		if(e.getActionCommand() == "1 button" && a[0] != "x" && a[0] != "o" && user == 2)
		{
			sound.sound1();
			b1.setIcon(x);
			a[0] ="x";
			this.check();
			
		}
		else if(e.getActionCommand() == "2 button" && a[1] != "x" && a[1] != "o" && user == 2)
		{
			sound.sound1();
			b2.setIcon(x);
			a[1] = "x";
			
			this.check();
			
		}
		else if(e.getActionCommand() == "3 button" && a[2] != "x" && a[2] != "o" && user == 2)
		{
			sound.sound1();
			b3.setIcon(x);
			a[2] = "x";
			
			this.check();
			
		}
		else if(e.getActionCommand() == "4 button" && a[3] != "x" && a[3] != "o" && user == 2)  // problem
		{
			sound.sound1();
			b4.setIcon(x);
			a[3] = "x";
			
			this.check();
			 
		}
		else if(e.getActionCommand() == "5 button" && a[4] != "x" && a[4] != "o" && user == 2)
		{
			sound.sound1();
			b5.setIcon(x);
			a[4] = "x";
			this.check();
		}
			
		
		
		
		else if(e.getActionCommand() == "6 button" &&a[5] != "x" && a[5] != "o" && user == 2)
		{
			sound.sound1();
			b6.setIcon(x);
			a[5] = "x";
			
			this.check();
			
		}
		else if(e.getActionCommand() == "7 button" && a[6] != "x" && a[6] != "o" && user == 2)
		{
			sound.sound1();
			b7.setIcon(x);
			a[6] ="x";
			
			this.check();
		}
		else if(e.getActionCommand() == "8 button" && a[7] != "x" && a[7] != "o" && user == 2)
		{
			sound.sound1();
			b8.setIcon(x);
			a[7] = "x";

			this.check();
		}
		else if(e.getActionCommand() == "9 button" && a[8] != "x" && a[8] != "o" && user == 2)
		{
			sound.sound1();
			b9.setIcon(x);
			a[8] = "x";		
			this.check();
		}
	
	}
	
	
	
	
	
	public int max(int x, int y) {
		if(x > y) 
			return x;
		else
			return y;
	}
	public int min(int x, int y) {
		if(x < y) 
			return x;
		else
			return y;
	}
	
	
	//checking for last node..
	
	public int terminal_node(String se[]){
		for (int i = 0; i < 9; i++) {
				if(se[i]=="_")
		           return 0;	
		}
		return 1;
	}

	public int minimax(String aw[], boolean player){
		int bestValue=0,val=0;
		
		if(terminal_node(aw) == 1 || check_win(aw) != 0)
		{
			int test = check_win(aw);
			return test;
		}
		if(player == true)
		{
			bestValue = -999;
			for (int i = 0; i < 9; i++) {
			
					if(aw[i]=="_")
			           {
						aw[i]="x";
						  val = minimax(aw,false);
						  bestValue = max( val,bestValue);
						  aw[i]="_";
			           }
			}
			return bestValue;
		}
		else
		{
			bestValue = 999;
			for (int i = 0; i < 9; i++) {
			
					if(aw[i]=="_")
			           {
						aw[i]="o";
						  val = minimax(aw,true);
						  bestValue = min(val , bestValue);
						  aw[i]="_";
			           }
				
			}
			return bestValue;
		}
	}
	
	
	
	private int check_win(String st[]) {
		if( st[0] =="x" && st[1] =="x"  && st[2] =="x" 
				|| st[3] =="x"  && st[4] =="x"  && st[5] =="x" 
				|| st[6] =="x"  && st[7] =="x"  && st[8]=="x" 
				|| st[0] =="x"  && st[3] =="x"  && st[6]=="x" 
				|| st[1] =="x"  && st[4] =="x"  && st[7] =="x" 
				|| st[2] =="x"  && st[5] =="x"  && st[8] =="x" 
				|| st[0] =="x"  && st[4] =="x"  && st[8] =="x" 
				|| st[2]=="x"  && st[4] =="x"  && st[6]=="x" )
		{
			return 10;
		}
		
		else if( st[0] =="o"  && st[1] =="o"  && st[2] =="o" 
				|| st[3] =="o"  && st[4] =="o"  && st[5] =="o" 
				|| st[6] =="o"  && st[7] =="o"  && st[8]=="o" 
				|| st[0] =="o"  && st[3] =="o"  && st[6]=="o" 
				|| st[1] =="o"  && st[4] =="o"  && st[7] =="o" 
				|| st[2] =="o"  && st[5] =="o"  && st[8] =="o" 
				|| st[0] =="o"  && st[4] =="o"  && st[8] =="o" 
				|| st[2]=="o"  && st[4] =="o"  && st[6]=="o" )
		{
			return -10;
		}
		else
			return 0;	
	}
	
	public int depth(String et[]){
		int c=0;
		for (int i = 0; i < 9; i++) {
	
				if(et[i]=="_")
		           {
					c++;
		           }
			
		}
		return c;
	}
	
	public void check(){
		String []b=new String[9];
		for (int j = 0; j < 9; j++)
		{
			b[j] = "_";
		}		
	 
	    

        for (int j = 0; j < 9; j++)
		{
			b[j] = a[j];
			
		}
		int move=-1;
		int bestValue=999,val=0;

		
		for (int i = 0; i < 9; i++) {
		
				if(b[i]=="_")
		           {
					b[i]= "o";
				    val = minimax(b,true);
				    if( val < bestValue)
				    {
				    	bestValue = val;
				    	move = i;
				    }
				   b[i] = "_";
		           }
				
		}
		if(terminal_node(a)==1)
		{
			if(check_win(a)==0)
				
			{
				 sound.sound2();
				JOptionPane.showMessageDialog( null, "Match draw ..better luck next time" , "Opps", JOptionPane.PLAIN_MESSAGE );
			}
		}
		
	      else if(check_win(a)== 10)
			{
		        sound.sound2();
				JOptionPane.showMessageDialog( null, "You Win..kemne paro Man!!!" ,"WoWWW" , JOptionPane.PLAIN_MESSAGE );
			}
		
		if(move == 0)
		{
			b1.setIcon(o);
			a[0] = "o";
		}
		else if(move == 1)
		{
			b2.setIcon(o);
			a[1] = "o";
		}
		else if(move == 2)
		{
			b3.setIcon(o);
			a[2] = "o";
		}
		else if(move == 3)
		{
			b4.setIcon(o);
			a[3] = "o";
		}
		else if(move == 4)
		{
			b5.setIcon(o);
			a[4] = "o";
		}
		else if(move == 5)
		{
			b6.setIcon(o);
			a[5] = "o";
		}
		else if(move == 6)
		{
			b7.setIcon(o);
			a[6] = "o";
		}
		else if(move == 7)
		{
			b8.setIcon(o);
			a[7] = "o";
		}
		else if(move == 8)
		{
			b9.setIcon(o);
			a[8] = "o";
		}
		
		 if(check_win(a)== -10)
			{
			    sound.sound2();
				JOptionPane.showMessageDialog( null, "You Lost ..:p!!!" , "Opps", JOptionPane.PLAIN_MESSAGE );
			}
		
	}
	
	 private class Sound{
			   
			   // Constructor
			   public void sound1() {
			   
			      try {
			         // Open an audio input stream.
			         URL url = this.getClass().getClassLoader().getResource("sound.wav");
			         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
			         // Get a sound clip resource.
			         Clip clip = AudioSystem.getClip();
			         // Open audio clip and load samples from the audio input stream.
			         clip.open(audioIn);
			         clip.start();
			      } catch (UnsupportedAudioFileException e) {
			         e.printStackTrace();
			      } catch (IOException e) {
			         e.printStackTrace();
			      } catch (LineUnavailableException e) {
			         e.printStackTrace();
			      }
			   }
			   public void sound2(){
				   try {
				         // Open an audio input stream.
				         URL url = this.getClass().getClassLoader().getResource("gameOver.wav");
				         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
				         // Get a sound clip resource.
				         Clip clip = AudioSystem.getClip();
				         // Open audio clip and load samples from the audio input stream.
				         clip.open(audioIn);
				         clip.start();
				 
				      } catch (UnsupportedAudioFileException e) {
				         e.printStackTrace();
				      } catch (IOException e) {
				         e.printStackTrace();
				      } catch (LineUnavailableException e) {
				         e.printStackTrace();
				      }
				   }
			   
			   public void sound3(){
				   try {
				         // Open an audio input stream.
				         URL url = this.getClass().getClassLoader().getResource("back.wav");
				         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
				         // Get a sound clip resource.
				         Clip clip = AudioSystem.getClip();
				         // Open audio clip and load samples from the audio input stream.
				         clip.open(audioIn);
				         clip.start();
				      
				      } catch (UnsupportedAudioFileException e) {
				         e.printStackTrace();
				      } catch (IOException e) {
				         e.printStackTrace();
				      } catch (LineUnavailableException e) {
				         e.printStackTrace();
				      }
				   }
			   
	}
}

