import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserOption
	{
		public static void main(String[] args)
			{
				String[] images = {"Arch", "Butterfly", "Snowman", "Water", "Beach"};
				JFrame frame = new JFrame();
				String choice = (String) JOptionPane.showInputDialog(frame, "Which Image Would You Like To Use?", "Images Options", JOptionPane.QUESTION_MESSAGE,null,images,images[0]);
				switch (choice)
				{
					case "Arch":
					{
						Picture pic = new Picture("arch.jpg");
						pic.explore();
						break;
					}
					case "Butterfly":
							{
								Picture pic = new Picture("butterfly1.jpg");
								pic.explore();
								break;
							}
					case "Snowman":
							{
								Picture pic = new Picture("snowman.jpg");
								pic.explore();
								break;
							}
					case "Water":
							{
								Picture pic = new Picture("water.jpg");
								pic.explore();
								break;
							}
					case "Beach":
							{
								Picture pic = new Picture("beach.jpg");
								pic.explore();
								break;
							}
					
				}
			}

	}
