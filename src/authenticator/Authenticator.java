package authenticator;

import javax.swing.JOptionPane;

public class Authenticator {

	public static void main(String[] args) {

		String username = JOptionPane.showInputDialog("Username:");

		if (username != null) {
			String password = JOptionPane.showInputDialog("Password:");

			if (password != null) {
				if 	(
						(username.equals("bburd") && password.equals("swordfish")) ||
						(username.equals("hritter") && password.equals("preakston")) ||
						(username.equals("pfoster") && password.equals("logmeinplease"))
					)
				{
					JOptionPane.showMessageDialog(null, "You're in.");
				} else {
					JOptionPane.showMessageDialog(null, "You're suspicious.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Not enough information.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Not enough information.");
		}
	}
}