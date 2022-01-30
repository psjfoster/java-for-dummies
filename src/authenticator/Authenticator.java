package authenticator;

import javax.swing.JOptionPane;

public class Authenticator {

	public static void main(String[] args) {
		String username = JOptionPane.showInputDialog("Username:");
		String password = JOptionPane.showInputDialog("Password:");
		
		username = username.toLowerCase();
		
		if (
				username != null && password != null &&
				(
						(username.equals("bburd") && password.equals("swordfish")) ||
						(username.equals("hritter") && password.equals("preakston")) ||
						(username.equals("pfoster") && password.equals("logmeinplease"))
				)
			)
		{
			JOptionPane.showMessageDialog(null, "You're in.");
		} else {
			JOptionPane.showMessageDialog(null, "You're suspicious.");
		}

	}

}
