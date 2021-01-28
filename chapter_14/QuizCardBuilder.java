//creating a class quizcardbuilder for making and saving a set of e-flashcards i.e making questions and saving them wth their solution.

import java.util.*;
import java.io.*;
import java.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizCardBuilder{
	private JFrame frame;
	private JTextArea question;
	private JTextArea answer;
	private ArrayList<QuizCard> cardList; // arraylist of type quizcard the list elements the card 
	public static void main(String[] args){
		QuizCardBuilder gui = new QuizCardBuilder();
		gui.go();
	}
	public void go(){
		frame = new JFrame();
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif",Font.BOLD,24); // bigfont obj createa font
		question = new JTextArea(6,20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(bigFont);

		JScrollPane qScroller = new JScrollPane(question); // adding the textarea into scroll
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); //Set only vertical scroll
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		
		answer = new JTextArea(6,20);
		answer.setLine(true);
		answer.setWrapStyleWord(true);
		answer.setFont(bigFont);
		
		JScrollPane aScroller = new JScrollPane(answer);
		aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); //Set only vertical scroll
		aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton nextButton = new JButton("Next Card");
		
		cardList = new ArrayList<QuizCard>();

		JLabel qLabel = new JLabel("Question:");
		JLabel aLabel = new JLabel("Answer:"); // creating label for answer text bar

		mainPanel.add(qLabel);
		mainPanel.add(qScroller);
		mainPanel.add(aLabel);
		mainPanel.add(aScroller);
		mainPanel.add(nextButton);
		nextButton.addActionListener(new NextCardListener());
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File"); 
		JMenuItem newMenuItem = new JMenuItem("New");
		JMenuItem saveMenuItem = new JMenuItem("Save");

		newMenuItem.addActionListener(new NewMenuListener());
		saveMenuItem.addActionListener(new SaveMenuListener());
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		menuBar.add(fileMenu);
		frame.setJMenuBar(menuBar); // setting menubar in the frame
		frame.getContentPane().add(BorderLayout.CENTER,mainPanel); //fixing the mainpanel at center
		frame.setSize(500,600);
		frame.setVisible(true);
		
	}
	public class NewCardListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){ //ev contain all info about event button
			QuizCard card  = new QuizCard(question.getText(),answer.getText()); //callng quzcard constructor
			cardList.add(card);//addng the card info into the arraylst
			clearCard();//removng the card ,, clearing the textarea
		}
	}
	public class SaveMenuListener implements ActionListener{ //it save whole set of question of card
		public void actionPerformed(ActionEvent ev){
			QuizCard card = new QuizCard(question.getText(),answer.getText());
			cardList.add(card);
			JFileChooser fileSave = new JFileChooser();
			fileSave.showSaveDialog(frame);
			saveFile(fileSave.getSelectedFile());
		}
	}
	public class NewMenuListener implements ActionListener{
		public void  actionPerformed(ActionEvent ev){
			cardList.clear(); //maing a fresh set so clearout arraylist n clear the textarea 
			clearCard();
		}
	}
	public void clearCard(){
		question.setText("");
		answer.setText("");
		question.requestFocus();
	}
	private void saveFile(File file){
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));

			for(QuizCard card:cardList){
				writer.write(card.getQuestion() +"/");
				writer.write(card.getAnswer() + "\n");
			}
		writer.close();
		}catch(IOException ex){
			System.out.println("couldn't write the cardlist out");
			ex.printStackTrace();
		}

	}

} 