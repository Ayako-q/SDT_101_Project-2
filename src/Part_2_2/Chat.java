package Part_2_2;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;


// Chat is a class that handles logic and user interaction with the program

class Chat
{
    Scanner scan = new Scanner(System.in);
    User newUser = new User();
    public Chat(){
        scene();
        boolean exit = false;
        /*while(!exit) {
            scene();
            int answ;
            try
            {
                answ = scan.nextInt();
                if (answ == 1) {
                    newUser.createUser();
                } else if (answ == 2) {
                    newUser.messages.showMessages();
                } else if (answ == 3) {
                    newUser.sendText();
                } else if (answ == 4) {
                    newUser.sendContact();}

                else if (answ == 6) {
                    newUser.messages.exportChat();}
                // 7 coming soon
                else if (answ == 8) {
                    newUser.exportUsers();}
                else if (answ == 9) {
                    newUser.importUsersFromFile();
                } else if (answ == 0) {
                    System.out.println("\n\u001B[31m====Finishing your session====\u001B[0m\n");
                    exit = true;
                } else {
                    System.out.println("\n\u001B[31m====Thats not the proper answer====\u001B[0m\n");
                }
            } catch (Exception e) {
                System.out.println("\n\u001B[31m====Thats not the proper answer====\u001B[0m\n");
                throw new RuntimeException(e);
            }
        }*/
    }

    //
    public void scene()
    {
        JFrame mainWindow = new JFrame();
        mainWindow.setSize(800, 600);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GridLayout gridLayout = new GridLayout(4, 2);
        panel.setLayout(gridLayout);

        // Adding buttons with functionality (they call local functions of User class)

        JButton userCreate = new JButton("Create new user");
        userCreate.addActionListener(a ->
                newUser.createUser(JOptionPane.showInputDialog(panel, "Enter new users name").toString(),
                        JOptionPane.showInputDialog(panel, "Enter new users password").toString(), panel)
        );

        JButton showChat = new JButton("Show messages");
        showChat.addActionListener(a -> newUser.messages.showMessages());

        JButton sendMessage = new JButton("Send a new message");
        sendMessage.addActionListener(a -> newUser.sendText());

        JButton sendContact = new JButton("Send a contact message");
        sendContact.addActionListener(a -> newUser.sendContact());

        JButton exportChat = new JButton("Chat export");
        exportChat.addActionListener(a -> newUser.messages.exportChat());

        JButton exportUsers = new JButton("Users export");
        exportUsers.addActionListener(a -> newUser.exportUsers());

        JButton usersImport = new JButton("Users import");
        usersImport.addActionListener(a -> newUser.importUsersFromFile());

        JButton exit = new JButton("Exit");
        exit.addActionListener(a -> System.exit(1));

        // addings those buttons to the scene
        panel.add(userCreate);
        panel.add(showChat);
        panel.add(sendMessage);
        panel.add(sendContact);
        panel.add(exportChat);
        panel.add(exportUsers);
        panel.add(usersImport);
        panel.add(exit);

        // adding scene to the main window
        mainWindow.add(panel);
        // Setting main window visible
        mainWindow.setVisible(true);
        /*System.out.println("""
        \n\u001B[33m
        Hi, this is your chat! What would you like to do?
        1. Create user
        2. Show my chats
        3. Text message
        4. Contact message
        -
        6. Chats export
        7. Chats import
        8. Users export
        9. Users import
        0. Exit
        \u001B[0m
        """);*/
    }
    public void chatWindow()
    {
        // creating a new frame
        JFrame chatFrame = new JFrame();
        chatFrame.setSize(300, 800);
        chatFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        BorderLayout board = new BorderLayout();


    }
}
