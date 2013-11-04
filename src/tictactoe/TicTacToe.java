/***************************************
 *  Copyright Nick Barber 2013         *
 *  Rev 131103                         *
 ***************************************/
package tictactoe;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe implements ActionListener
{
    JFrame gameBoard;
    int width = 600;
    int height = 600;
    JButton button1;
    JButton button2;
    JButton[][] buttonArray;
    int pc = 0; //Player Count
    int cc = 0; //cat's game counter

    public static void main(String[] args)
    {
        new TicTacToe().getGoing();
    }

    public void getGoing()
    {
        gameBoard = new JFrame();
        gameBoard = new JFrame("Tic Tac Toe");
        gameBoard.setSize(width, height);
        gameBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameBoard.setLayout(new GridLayout(3, 3));
        buttonArray = new JButton[3][3];

        for (int row = 0; row < 3; row++)
        {
            for (int column = 0; column < 3; column++)
            {
                buttonArray[row][column] = new JButton(row + "/" + column);
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
        gameBoard.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        JButton clickedButton = (JButton) ae.getSource();
        System.out.println(clickedButton.getText());
        clickedButton.setFont(new Font("Bank Gothic", Font.BOLD, 96));
        pc++;
        if (!clickedButton.getText().equals("X") && !clickedButton.getText().equals("O"))//not cheating
        {
            cc++;
            if (pc % 2 == 0)
            {
                clickedButton.setText("X");
            } else
            {
                clickedButton.setText("O");
            }
        } else
        {
            JOptionPane.showMessageDialog(null, " Your a Cheater! \n Next Player's Turn.");
        }
        if (buttonArray[0][0].getText() == buttonArray[0][1].getText() && buttonArray[0][0].getText() == buttonArray[0][2].getText())
        {
            JOptionPane.showMessageDialog(null, "Winner - Player " + clickedButton.getText());
            System.exit(0);
        }
        if (buttonArray[1][0].getText() == buttonArray[1][1].getText() && buttonArray[1][0].getText() == buttonArray[1][2].getText())
        {
            JOptionPane.showMessageDialog(null, "Winner - Player " + clickedButton.getText());
            System.exit(0);
        }
        if (buttonArray[2][0].getText() == buttonArray[2][1].getText() && buttonArray[2][0].getText() == buttonArray[2][2].getText())
        {
            JOptionPane.showMessageDialog(null, "Winner - Player " + clickedButton.getText());
            System.exit(0);
        }
        if (buttonArray[0][0].getText() == buttonArray[1][0].getText() && buttonArray[0][0].getText() == buttonArray[2][0].getText())
        {
            JOptionPane.showMessageDialog(null, "Winner - Player " + clickedButton.getText());
            System.exit(0);
        }
        if (buttonArray[0][1].getText() == buttonArray[1][1].getText() && buttonArray[0][1].getText() == buttonArray[2][1].getText())
        {
            JOptionPane.showMessageDialog(null, "Winner - Player " + clickedButton.getText());
            System.exit(0);
        }
        if (buttonArray[0][2].getText() == buttonArray[1][2].getText() && buttonArray[0][2].getText() == buttonArray[2][2].getText())
        {
            JOptionPane.showMessageDialog(null, "Winner - Player " + clickedButton.getText());
            System.exit(0);
        }
        if (buttonArray[0][0].getText() == buttonArray[1][1].getText() && buttonArray[0][0].getText() == buttonArray[2][2].getText())
        {
            JOptionPane.showMessageDialog(null, "Winner - Player " + clickedButton.getText());
            System.exit(0);
        }
        if (buttonArray[0][2].getText() == buttonArray[1][1].getText() && buttonArray[0][2].getText() == buttonArray[2][0].getText())
        {
            JOptionPane.showMessageDialog(null, "Winner - Player " + clickedButton.getText());
            System.exit(0);
        }
        if (cc == 9)
        {
            JOptionPane.showMessageDialog(null, "Cat's Game!");
            System.exit(0);

        }

    }
}
