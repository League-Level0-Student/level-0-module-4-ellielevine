package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
String score = JOptionPane.showInputDialog("What was your test score?");
double scoreInt = Double.parseDouble(score);
if (scoreInt>=85.0) {
	JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
}
else if (scoreInt>=65.0) {
		JOptionPane.showMessageDialog(null, "You can do better next time, but still good job");
	}
else {
	JOptionPane.showMessageDialog(null, "Study harder next time!");
}
}
}

