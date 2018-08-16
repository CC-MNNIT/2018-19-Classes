#include<bits/stdc++.h>
using namespace std;

struct chaal{
int row,column;
};
char b[4][4];
char player,comp;   //player is you and comp is your bot
int evaluate(int depth)  //This function calculates the score of board at given time
{
    int i;
    //Check if there are three consecutive O's or X's in rows
        for(i=1;i<=3;i++)
        {
            if(b[i][1]==b[i][2]&&b[i][2]==b[i][3])
            {
                if(b[i][1]==comp)
                {return 20-depth;}

                else if(b[i][1]==player)
                {return -20+depth;}
            }
        }
    //Check if there are three consecutive O's or X's in Columns
    for(i=1;i<=3;i++)
        {
                if(b[1][i]==b[2][i]&&b[2][i]==b[3][i])
            {
                if(b[1][i]==comp)
                {return 20-depth;}

                else if(b[1][i]==player)
                {return -20+depth;}
            }
        }
    //Check if there are three consecutive O's or X's in Diagonals
    if(b[1][1]==b[2][2]&&b[2][2]==b[3][3])
        {
            if(b[1][1]==comp)
            {return 20-depth;}

            else if(b[1][1]==player)
            {return -20+depth;}
        }

    if(b[1][3]==b[2][2]&&b[2][2]==b[3][1])
        {
            if(b[1][3]==comp)
            {return 20-depth;}

            else if(b[1][3]==player)
            {return -20+depth;}
        }
            return 0;

}
//Checks if there is any move left on the board
bool moveleft()
{
    int i,j;
    for(i=1;i<=3;i++)
        for(j=1;j<=3;j++)
        if(b[i][j]=='_')
        return true;
    return false;
}

int minimax(int depth,bool ismaxturn)
{
    int i,j,val;
    int score=evaluate(depth);
    if(score==20-depth)
        return score;
    if(score==-20+depth)
        return score;
    if(moveleft()==false)
        return 0;
    if(ismaxturn)
    {
        int best=-10000;
        // Iterate over all 9 positions
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=3;j++)
            {
                if(b[i][j]=='_')     //If the position is blank
                {
                    b[i][j]=comp;
                    best=max(minimax(depth+1,!ismaxturn),best); //Updates the best value
                    b[i][j]='_';
                }
                if(alpha>beta) return best;
            }
        }
        return best;
    }
    else
    {
        int best=10000;
        // Iterate over all 9 positions
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=3;j++)
            {
                if(b[i][j]=='_')    //If the position is blank
                {
                    b[i][j]=player; //set step
                    best=min(minimax(depth+1,!ismaxturn),best); //Updates the best value
                    b[i][j]='_';    //Unset step...changes board back to its original form
                }
            }
        }
        return best;
    }
}
//This function returns the best possible move to the main function
chaal findbestmove(int depth,bool ismaxturn)
{
    int i,j,val;
    struct chaal bestmove;
    //Initialization steps
    int bestval=-10000;
    bestmove.row=-1;
    bestmove.column=-1;
    for(i=1;i<=3;i++)
    {
        for(j=1;j<=3;j++)
        {
            if(b[i][j]=='_')
               {
                   b[i][j]=comp;
                   val=minimax(depth,!ismaxturn);
                   // If we found a better move ,just update bestmove with that move
                    if(val>bestval)
                    {
                        bestval=val;
                        bestmove.row=i;
                        bestmove.column=j;
                    }
                    b[i][j]='_';
               }
        }
    }
    return bestmove;
}
void print()
{
    printf("\n\n");
    printf("\t\t\t  %c  |  %c  |  %c  \n", b[1][1],b[1][2], b[1][3]);
    printf("\t\t\t--------------\n");
    printf("\t\t\t  %c  |  %c  |  %c  \n", b[2][1],b[2][2], b[2][3]);
    printf("\t\t\t--------------\n");
    printf("\t\t\t  %c  |  %c  |  %c  \n\n", b[3][1],b[3][2], b[3][3]);


}
int main()
{
    int p,i,j,r,c;
    const int INF=10000000;
    struct chaal cur_move;
    for(i=1;i<=3;i++)
        for(j=1;j<=3;j++)
        b[i][j]='_';
    printf("WELCOME TO THE GAME OF TIC-TAC-TOE\n");
    printf("PRESS 1 FOR TAKING O AND 2 FOR TAKING X\n");
    scanf("%d",&p);
    if(p==1)
        {player='O';comp='X';}
    else
        {player='X';comp='O';}
    printf("I GIVE YOU THE CHANCE OF MAKING FIRST TURN \n");
   int depth=1;
    while(moveleft())
    {
        printf("ENTER THE ROW AND COLUMN OF YOUR INPUT\n");
        cin>>r>>c;
        b[r][c]=player;
        int x=evaluate(depth);
        depth++;
        print();
        printf("\n\n");

        if(x==-20+depth)   // You have won the game
        {
            printf("CONGRATULATIONS\n");
            return 0;
        }
        cur_move=findbestmove(depth,true);

        b[cur_move.row][cur_move.column]=comp;
        print();
        x=evaluate(depth);
        printf("\n\n");
             if(x==20-depth)
        {
            printf("SORRY TO SAY BUT YOU NEED A LOT OF PRACTICE\n");
            return 0;
        }
    }

printf("IT IS A DRAW\n");
    return 0;
}
