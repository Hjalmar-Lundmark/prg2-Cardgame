# Card Game
Character have different roles and stats. The different rolls should impact the stats, 
with warriors having great strength, Mage having high Magic, etc. 

### How does Combat work?
The one who initializes the combat(runs the playAgainst code) attacks first with its signature stat 
against the opponent's health(HP), if it's higher or equal the attacking character wins. 
If it is lower than the health, the opponent counterattacks with its highest stat against your HP, 
killing you if it's higher or equal. If both are alive after the both attacks, the game will end in a draw.

