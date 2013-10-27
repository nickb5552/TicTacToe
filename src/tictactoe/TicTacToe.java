package tictactoe;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToe implements ActionListener
{
    JFrame gameBoard;
    int width = 600;
    int height = 600;
    JButton button1;
    JButton button2;
    JButton[][] buttonArray;

    public static void main(String[] args)
    {
        new TicTacToe().getGoing();
    }

    public void getGoing()
    {
        gameBoard = new JFrame();
        gameBoard = new JFrame("Tic Tac Toe");
        gameBoard.setVisible(true);
        gameBoard.setSize(width, height);
        gameBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameBoard.setLayout(new GridLayout(3, 3));
        buttonArray = new JButton[3][3];
        for (int row = 0; row < 3; row++)
        {
            for (int column = 0; column < 3; column++)
            {
                buttonArray[row][column] = new JButton(row + "/" + column);;
                buttonArray[row][column].addActionListener(this);
            }
        }
        
        for (int row = 0; row < 3; row++)
        {
            for (int column = 0; column < 3; column++)
            {
                gameBoard.add(buttonArray[row][column]);
            }
        }
    }
    
               
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        System.out.println("Push Me " + ae);
    }
}
