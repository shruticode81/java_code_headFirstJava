//Implementation of QuizCard player code 

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class QuizCardPlayer{
	private JTextArea display;
	private JTextArea answer;
	private ArrayList<QuizCard> cardList;
	private QuizCard currentCard;
	private int currentCardIndex;
	private JFrame frame;
	private JButton nextButton;
	private boolean isShowAnswer; //flag to keep a check on whether to display answer

	public static void main(String[] args){
		QuizCardPlayer reader = new QuizCardPlayer();
		reader.go();
	}
	public void go(){
		//building gui
		frame = new JFrame("Quiz Card Player");
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif",FONT.BOLD,24);

		display = new JTextArea(10,20);
		display.setFont(bigFont);
		
		display.setLineWrap(true);
		display.setEditable(false); // set the textfield uneditable

		JScrollPane qScroller = new JScrollPane(display);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		nextButton = new JButton("show question");
		mainPanel.add(qScroller);
		mainPanel.add(nextButton);
		nextButton.addActionListener(new NextCardListener());

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem loadMenuItem = new JmenuItem("Load card set");
		loadMenuItem.addActionListener(new OpenMenuListener());
		fileMenu.add(loadMenuItem);
		menuBar.add(fileMenu);
		frame.setJMenuBar(menuBar); // setting the menubar created into the frame
		frame.getContentPane().add(BorderLayout.CENTER,mainPanel); //setting the mainpanel 
		frame.setSize(640,500);
		frame.setVision(true);
	}//close go
	public class NextCardListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			if(isShowAnswer){
				//show the answer because they have seen the question
				display.setText(currentCard.getAnswer());
				nextButton.setText("Next Card");
				isShowAnswer = false;
			}else{
				//show the next qusetion
				if(currentCardIndex<cardList.size()){
					showNextCard();
				}else{
					//there are no more cards
					display.setText("That was last card");
					nextButton.setEnabled(false); // setenabled is to disable the button so that it can't be selected

				}
			}
		}
	} 


	public class OpenMenuListener implements ActionListener{
		public void actionPerformed(ActionEvent ev ){
			JFileChooser fileOpen = new JFileChooser(); //bring up the file dialog box and let them navigate to and choose the file to open.
			fileOpen.showOpenDialog(frame);
			loadFile(fileOpen.getSelectedFile()); // loadfile gets the file as arugment which is selected by user.
		}
	}
	private void loadFile(File file){
		cardList = new ArrayList<QuizCard>();
		try{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line=reader.readLine())!=null){ //read a line at a time and pass it to makecard method until all the is reas in the file choosen
				makeCard(line);
			}
			reader.close();
		}catch(Exception ex){
			System.out.println("couldn't read the card file ");
			ex.printStackTrace();
		}
	//now time to start by showing the first card from the choosen file
		showNextCard();
	}
	private void makeCard(String lineToParse){
		String[] result = lineToParse.split("/"); //makecard takes the line and split it into 2 token question and answer are split and store in the array
		QuizCard card = new QuizCard(result[0],result[1]);
		cardList.add(card);
		System.out.println("made a card");
	}

	private void showNextCard(){
		currentCard = cardList.get(currentCardIndex);
		currentCardIndex++;
		display.setText(currentCard.getQuestion());
		nextButton.setText("show answer");
		isShowAnswer = true;
	}
}//close of class