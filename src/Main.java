void main()
{
    Scanner in = new Scanner(System.in);
    String playA = "";
    String playB ="";
    String playAgain = "";
    boolean done = false;
    boolean playing = true;

    do
    {
        do
        {
            IO.print("PLayer A enter your RPS Move [RPSrps]: ");
            playA = in.nextLine();

            if (playA.matches("[RPSrps]")) {
                IO.println("Got player A move " + playA);
                done = true;
            } else // Illegal value not R P or S
            {
                IO.println("You must enter [RPSrps] not " + playA);
            }
        } while (!done);

        done = false;
        do {
            IO.print("PLayer B enter your RPS Move [RPSrps]: ");
            playB = in.nextLine();

            if (playB.matches("[RPSrps]")) {
                IO.println("Got player B move " + playA);
                done = true;
            } else // Illegal value not R P or S
            {
                IO.println("You must enter [RPSrps] not " + playB);
            }
        } while (!done);

        // Got the values for playerA and playerB  now show game results
        // Code here to show the results of the game

        if(playA.equalsIgnoreCase(playB))
            IO.println(playA + " vs " + playB + " it's a Tie!");
        else if(playA.equalsIgnoreCase("R") )
        {
            if (playB.equalsIgnoreCase("p"))
                IO.println(playA + " vs " + playB + " Paper covers Rock, Player B wins!");
            else // playB must be Scissors
                IO.println(playA + " vs " + playB + " Rock Breaks Scissors, Player A wins!");
        }
        else if(playA.equalsIgnoreCase("P"))
        {
            if (playB.equalsIgnoreCase("R"))
                IO.println(playA + " vs " + playB + " Paper covers Rock, Player A wins!");
            else // playB must be Scissors
                IO.println(playA + " vs " + playB + " Scissors cuts Paper, Player B wins!");
        }
        else // playA is scissors
        {
            if(playB.equalsIgnoreCase("R"))
                IO.println(playA + " vs " + playB + " Rock breaks scissors, Player B wins!");
            else // playB must be Paper
                IO.println(playA + " vs " + playB + " Scissors cuts Paper, Player A wins!");
        }


        IO.print("Do you want to play again [YN]: ");
        playAgain = in.nextLine();

        if(playAgain.equalsIgnoreCase("Y"))
            playing = true;
        else
            playing = false;

    }while(playing);
}