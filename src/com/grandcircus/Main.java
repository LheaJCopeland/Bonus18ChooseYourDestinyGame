package com.grandcircus;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String game;
        String nickname;
        String important;
        String money;
        String happy;
        String love;
        String vice;
        String self;
        String regret;
        String sad;
        String parents;
        String others;
        String death;

        int a = 0;
        int b = 0;
        int c = 0;
        int destiny = 0;


        System.out.println("Welcome to Choose Your Own Destiny!");
        System.out.println(" ");
        System.out.println("Would you like to play along?");

        Scanner input = new Scanner(System.in);
        game = input.nextLine();
        if (game.equalsIgnoreCase("Yes") || game.equalsIgnoreCase ("y")){
            System.out.println("Great! What's your nickname?");
            nickname = input.nextLine();
            System.out.println("Hi " + nickname + ". Let's choose your destiny!");
            System.out.println(" ");

            System.out.println("For the rest of this game. Type a, b or c.");
            System.out.println("So, " + nickname +". What is most important to you?");
            System.out.println("a. Being rich. b. Being happy. Or c. Being in love.");
            important = input.nextLine();

            if (important.equalsIgnoreCase("a")){
                System.out.println("There's nothing wrong with having a little money!");
                System.out.println(" ");
                System.out.println(nickname + " would you rather");
                System.out.println("a. Make 7 figures working 90 hours a week and live alone. b. Make 6 figures working 50 hours a week doing something you hate. c. Make less than 100k working your dream job.");
                money = input.nextLine();
                a = 1;

                if (money.equalsIgnoreCase("a")){
                    System.out.println("Show me the money!");
                    System.out.println(" ");
                    System.out.println("What's your biggest vice?");
                    System.out.println("a. I'm selfish. b. I don't stand up for myself c. I give in to peer pressure");
                    vice = input.nextLine();
                    b = 10;

                    switch (vice.toLowerCase()){
                        case "a":
                            System.out.println("Selfish? I never would have guessed!");
                            c = 1;
                            break;
                        case "b":
                        case "c":
                            System.out.println("I understand. We can work on that together.");
                            c = 100;
                            break;
                    }


                }else if (money.equalsIgnoreCase("b")){
                    System.out.println("Sometimes we do what we don't want to do now, so we can do what we do want to do later...");
                    System.out.println(" ");
                    System.out.println("If you could change one thing about yourself, what would it be?");
                    System.out.println("a. I wish I had more money. b. I wish I had more time. c. I wish I looked different.");
                    self = input.nextLine();
                    b = 100;

                    switch (self.toLowerCase()){
                        case "a":
                        case "b":
                            System.out.println("Don't we all!");
                            c = 10;
                            break;
                        case "c":
                            System.out.println("Well, I think you're beautiful!");
                            c = 100;
                            break;

                    }

                }else {
                    System.out.println("If you do what you love, the money will follow... right?");
                    System.out.println(" ");
                    System.out.println("What's your biggest regret?");
                    System.out.println("a. In the past I've cheated. b. Once, I stole something that wasn't mine. c. I used to lie. ");
                    regret = input.nextLine();
                    b = 500;
                    c = 100;

                    switch (regret.toLowerCase()){
                        case "a":
                            System.out.println("Your secret is safe with me.");
                            break;
                        case "b":
                            System.out.println("I won't tell anybody. I promise");
                            break;
                        case "c":
                            System.out.println("Just a little white lie, right?");
                    }



                }


            }else if (important.equalsIgnoreCase("b")){
                System.out.println("Agreed! Who wants to be miserable?");
                System.out.println(" ");
                System.out.println(nickname + " what makes you happy?");
                System.out.println("a. Shopping b. Spending time with your best friend c. Drinking! Or d. Reading a great book");
                happy = input.nextLine();
                a = 10;

                switch (happy.toLowerCase()){
                    case "a":
                        System.out.println("Nothing wrong with a little retail therapy!");
                        b = 5;
                        break;
                    case "b":
                    case "d":
                        System.out.println("Me, too!");
                        b = 100;
                        break;
                    case "c":
                        System.out.println("As long as you have a designated driver, it's okay!");
                        b = 10;
                        break;
                }

                System.out.println(" ");
                System.out.println("What do you do when you're sad?");
                System.out.println("a. I cry b. I curse someone out. c. I get a headache.");
                sad = input.nextLine();

                switch (sad.toLowerCase()){
                    case "a":
                        System.out.println("You can lean on me...");
                        c = 100;
                        break;
                    case "b":
                        System.out.println("Whoa! Watch out!");
                        c = 1;
                        break;
                    case "c":
                        System.out.println("Have you tried herbal tea?");
                        c = 10;
                        break;
                }

            }else{
                System.out.println("Awwww! How sweet. There's nothing like being in love.");
                System.out.println(" ");
                System.out.println(nickname + " would you rather...");
                System.out.println("a. Meet your soulmate at the age of 16 and be divorced by 26. b. Never meet your soulmate, never fall in love but have a decent marriage for 50 years. c.Fall madly in love with your soulmate who you never fight with...5 years before you die.");
                love = input.nextLine();
                a = 100;

                switch (love.toLowerCase()){
                    case "a":
                        System.out.println("Better to have loved and lost, eh?");
                        System.out.println(" ");
                        System.out.println("Were your parents married?");
                        System.out.println("a. Yes, happily. b. For awhile before the divorce. c. Nope, never");
                        parents = input.nextLine();
                        b = 100;

                        if (parents.equalsIgnoreCase("a")){
                        System.out.println("They say folks who have married parents have better success in marriage...");
                        c = 500;
                    }else {
                        System.out.println("No worries. I'm sure this has made you a stronger person.");
                        c = 100;
                    }

                        break;
                    case "b":
                        System.out.println("Better safe than sorry.");
                        System.out.println(" ");
                        System.out.println("Do you care what others think of you?");
                        System.out.println("a. Yes, it keeps me up at night. b. I couldn't care less.");
                        others = input.nextLine();
                        b = 1;

                        if (others.equalsIgnoreCase("a")){
                        System.out.println("Everyone thinks about other people's opinion some of the time...");
                        c = 100;
                    }else {
                        System.out.println("Bravo!");
                        c = 500;
                    }
                        break;
                    case "c":
                        System.out.println("Oh how I wish love could last forever!");
                        System.out.println(" ");
                        System.out.println("Are you scared to die?");
                        System.out.println("a. Terrified. b. I don't want to die; but when it happens, it happens. c. Sounds strange, but I look forward to going to heaven.");
                        death = input.nextLine();
                        b = 500;

                        switch (death.toLowerCase()){
                            case "a":
                                System.out.println("Yes, you and everybody else in the world!");
                                c = 10;
                                break;
                            case "b":
                                System.out.println("It's good to be at peace with it.");
                                c = 500;
                                break;
                            case "c":
                                System.out.println("There's nothing wrong with that!");
                                c = 500;
                                break;
                        }
                        break;
                }

            }

            destiny = a + b + c;
            if (destiny  < 100){
                System.out.println("Your destiny is to be a mogul.");
                System.out.println(" ");
                System.out.println("You are destined to be a success. Just wait. Your enemies secretly admire you and your friends and family wish they had more time with you. You were always the top of your class; you always succeed at what you do. Sometimes you can be a little bit harsh when others don't measure up to your standards. Go gentle on others; go gentle on yourself. Congratulations in advanced.");

            }else if ( destiny >= 100 && destiny < 500 ){
                System.out.println("Your destiny is to be an influencer.");
                System.out.println(" ");
                System.out.println("When you were in middle school you were voted class president; when you were in high school, you were voted most likely to succeed. You have maxed out on your 5,000 friend limit on Facebook and 70,000 people follow your tweets. Your friends go to you for advice on their marriages while your coworkers consider you a mentor in their career. You are an influencer.... you just can't help it.");

            }else {
                System.out.println("You are destined to be a saint.");
                System.out.println(" ");
                System.out.println("You know what balance is. You work when it is time to work; you relax when it is time to relax. You love all people equally; you treat all people fairly. You've never had an enemy in your life. You like money but you are not driven by it. You love success, but failure does not stop you. You have always been mature for your age. You are a giving spouse, a reliable employee, a trustworthy friend and a positive influence on the world. You always have something positive to say and every family, community, organization and company is made better by your presence.");


            }

        } //This closes the would you like to play along if
        else {
            System.out.println("Awww. Better luck next time.");
        }

    }
}
